package com.liuming.eshop.service.ordersService.impl;

import com.liuming.eshop.entity.couponDetailsEntity.CouponDetails;
import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.entity.logisticsTemplateEntity.LogisticsTemplate;
import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.mapper.commissionMapper.CommissionMapper;
import com.liuming.eshop.mapper.couponDetailsMapper.CouponDetailsMapper;
import com.liuming.eshop.mapper.couponMapper.CouponMapper;
import com.liuming.eshop.mapper.itemMapper.ItemMapper;
import com.liuming.eshop.mapper.logisticsTemplateMapper.LogisticsTemplateMapper;
import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.mapper.ordersMapper.OrdersMapper;
import com.liuming.eshop.service.ordersService.OrdersService;
import com.liuming.eshop.utils.CheckObjectIsNullUtils;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @ClassName OrdersServiceImpl
 * @Author 鲸落
 * @date 2020.01.07 15:17
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private ItemMapper itemMapper;

    @Resource
    private LogisticsTemplateMapper logisticsTemplateMapper;

    @Resource
    private MemberMapper memberMapper;

    @Resource
    private CommissionMapper commissionMapper;

    @Resource
    private CouponMapper couponMapper;

    @Resource
    private CouponDetailsMapper couponDetailsMapper;

    @Override
    public DataResult addOrders(Orders orders) {
        /**
         * 先对是否使用优惠券进行判断
         * 如果使用优惠券，就通过优惠券ID查询该用户是否有未使用的优惠券优惠券相关信息
         *
         * 查询会员ID对应的会员信息是否正常
         * 查询商品ID对应的商品信息是否正常
         * 查询会员配送地址管理ID对应的信息是否正常
         *
         * 总价 = 商品单价 * 商品数量
         *
         * 商品单价 = 通过查询商品ID得到的商品单价
         *
         * 订单状态默认是1-正常
         *
         * 支付类型、结果、交易相关的三个时间点，都是在支付完成以后通过订单ID找到该订单以后进行的操作，在新增订单这步不对支付相关的内容做任何操作
         */
        CheckObjectIsNullUtils checkObjectIsNullUtils = new CheckObjectIsNullUtils();
        Map map;
        Integer logisticsTotalPrice;
        double totalPrice;
        if (orders.getSfsyyhq() != null && orders.getSfsyyhq() == 1 && StringUtils.isNotBlank(orders.getCouponDetailsId()) && StringUtils.isNotBlank(orders.getMemberId())) {
            //是否使用优惠券不等于null，并且等于1会按照勾选使用优惠券，并且优惠券ID不得为空，否则按照没有勾选优惠券的订单进行处理
            //查询优惠券ID是否存在
            map = new HashMap();
            map.put("couponDetailsId", orders.getCouponDetailsId());
            map.put("memberId", orders.getMemberId());
            map.put("couponDetailsStatus", 0);
            List<CouponDetails> couponDetailsList = couponDetailsMapper.findCouponDetails(map);
            if (couponDetailsList.size() > 0) {
                //优惠券存在并且可用
                //判断会员是否存在
                Member member = memberMapper.selectByPrimaryKey(orders.getMemberId());
                if (!checkObjectIsNullUtils.objCheckIsNull(member)) {
                    if (member.getMemberStatus() == 1) {
                        //判断商品是否存在
                        //判断省ID，通过省ID得到省代，通过省代查询省代商品中是否有符合的商品信息
                        map = new HashMap();
                        //查询商品总库
                        Item item = itemMapper.selectByPrimaryKey(orders.getItemId());
                        orders.setCommissionId(item.getCommissionId());
                        //查询该商品的物流模板，通过物流模板，将对应的物流资费加到订单总价中
                        LogisticsTemplate logisticsTemplate = logisticsTemplateMapper.selectByPrimaryKey(item.getLogisticsTemplateId());

                        if (logisticsTemplate.getLogisticsType() == 1 && logisticsTemplate.getLogisticsMode() == 2){
                            //获取配置的运费信息
                            /**
                             * 三种情况
                             * 1. 当物流件数 = 0时，总价 = 物流费用 * 购买数量
                             * 2. 当物流件数 > 购买数量时，总价 = 物流费用 * 购买数量
                             * 3. 当物流件数 <= 购买数量时，总价 = 购买数量（物流费用为0，相当于包邮）
                             */
                            if (logisticsTemplate.getLogisticsNumber() == 0) {
                                //当物流件数 = 0时，物流总价 = 物流费用 * 购买数量
                                logisticsTotalPrice = logisticsTemplate.getLogisticsCost() * orders.getItemNum();
                                //订单总价 = 物流总价 + 单价 * 数量
                                totalPrice = logisticsTotalPrice + (orders.getUnitPrice() * orders.getItemNum());
                                orders.setTotalPrice(totalPrice);
                                orders.setOrdersId(IDUtils.getId());
                                //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                                orders.setOrdersStatus(1);
                                orders.setOrdersCreateDate(new Date());
                                orders.setOrdersUpdateDate(new Date());
                                int i = ordersMapper.insertSelective(orders);
                                if (i > 0) {
                                    return DataResult.ok(orders.getItemId());
                                } else {
                                    return DataResult.build(500, "新增订单失败");
                                }
                            } else if (logisticsTemplate.getLogisticsNumber() > orders.getItemNum()) {
                                //当物流件数 > 购买数量时，物流总价 = 物流费用 * 购买数量
                                logisticsTotalPrice = logisticsTemplate.getLogisticsCost() * orders.getItemNum();
                                //订单总价 = 物流总价 + 单价 * 数量
                                totalPrice = logisticsTotalPrice + (orders.getUnitPrice() * orders.getItemNum());
                                orders.setTotalPrice(totalPrice);
                                orders.setOrdersId(IDUtils.getId());
                                //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                                orders.setOrdersStatus(1);
                                orders.setOrdersCreateDate(new Date());
                                orders.setOrdersUpdateDate(new Date());
                                int i = ordersMapper.insertSelective(orders);
                                if (i > 0) {
                                    return DataResult.ok(orders.getItemId());
                                } else {
                                    return DataResult.build(500, "新增订单失败");
                                }
                            } else if (logisticsTemplate.getLogisticsNumber() <= orders.getItemNum()) {
                                //当物流件数 <= 购买数量时，物流总价 = 购买数量（物流费用为0，相当于包邮）
                                logisticsTotalPrice = 0;
                                //订单总价 = 物流总价 + 单价 * 数量
                                totalPrice = logisticsTotalPrice + (orders.getUnitPrice() * orders.getItemNum());
                                orders.setTotalPrice(totalPrice);
                                orders.setOrdersId(IDUtils.getId());
                                //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                                orders.setOrdersStatus(1);
                                orders.setOrdersCreateDate(new Date());
                                orders.setOrdersUpdateDate(new Date());
                                int i = ordersMapper.insertSelective(orders);
                                if (i > 0) {
                                    return DataResult.ok(orders.getOrdersId());
                                } else {
                                    return DataResult.build(500, "新增订单失败");
                                }
                            } else {
                                return DataResult.build(500, "兄台，你这波操作有点迷啊，要不你退出系统以后，重新再上线购买试一下？");
                            }
                        } else if(logisticsTemplate.getLogisticsType() == 1 && logisticsTemplate.getLogisticsMode() == 1){
                            //包邮免运费（直接将商品、会员等相关信息新增到订单表中）
                            orders.setOrdersId(IDUtils.getId());
                            //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                            orders.setOrdersStatus(1);
                            orders.setOrdersCreateDate(new Date());
                            orders.setOrdersUpdateDate(new Date());
                            int i = ordersMapper.insertSelective(orders);
                            if (i > 0) {
                                return DataResult.ok(orders.getOrdersId());
                            } else {
                                return DataResult.build(500, "新增订单失败");
                            }
                        } else {
                            //自提（直接将商品、会员等相关信息新增到订单表中）
                            orders.setOrdersId(IDUtils.getId());
                            //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                            orders.setOrdersStatus(1);
                            orders.setOrdersCreateDate(new Date());
                            orders.setOrdersUpdateDate(new Date());
                            int i = ordersMapper.insertSelective(orders);
                            if (i > 0) {
                                return DataResult.ok(orders.getOrdersId());
                            } else {
                                return DataResult.build(500, "新增订单失败");
                            }
                        }
                    } else {
                        return DataResult.build(500, "会员状态错误，请联系管理员");
                    }
                } else {
                    return DataResult.build(500, "会员不存在");
                }
            } else {
                return DataResult.build(500, "优惠券状态信息错误，请重试");
            }
        } else {
            //优惠券不存在或者不可用
            //判断会员是否存在
            Member member = memberMapper.selectByPrimaryKey(orders.getMemberId());
            if (!checkObjectIsNullUtils.objCheckIsNull(member)) {
                if (member.getMemberStatus() == 1) {
                    //判断商品是否存在
                    //判断省ID，通过省ID得到省代，通过省代查询省代商品中是否有符合的商品信息
                        /*map = new HashMap();
                        map.put("provincialAgentId", provincialAgentList.get(0).getProvincialAgentId());
                        map.put("itemId", orders.getItemId());
                        map.put("provincialAgentItemStatus", 1);
                        List<ProvincialAgentItem> provincialAgentItemList = provincialAgentItemMapper.findProvincialAgentItem(map);*/
                    //查询商品总库
                    Item item = itemMapper.selectByPrimaryKey(orders.getItemId());
                    orders.setCommissionId(item.getCommissionId());
                    //查询该商品的物流模板，通过物流模板，将对应的物流资费加到订单总价中
                    LogisticsTemplate logisticsTemplate = logisticsTemplateMapper.selectByPrimaryKey(item.getLogisticsTemplateId());

                    if (logisticsTemplate.getLogisticsType() == 1 && logisticsTemplate.getLogisticsMode() == 2){
                        //获取配置的运费信息
                        /**
                         * 三种情况
                         * 1. 当物流件数 = 0时，总价 = 物流费用 * 购买数量
                         * 2. 当物流件数 > 购买数量时，总价 = 物流费用 * 购买数量
                         * 3. 当物流件数 <= 购买数量时，总价 = 购买数量（物流费用为0，相当于包邮）
                         */
                        if (logisticsTemplate.getLogisticsNumber() == 0) {
                            //当物流件数 = 0时，物流总价 = 物流费用 * 购买数量
                            logisticsTotalPrice = logisticsTemplate.getLogisticsCost() * orders.getItemNum();
                            //订单总价 = 物流总价 + 单价 * 数量
                            totalPrice = logisticsTotalPrice + (orders.getUnitPrice() * orders.getItemNum());
                            orders.setTotalPrice(totalPrice);
                            orders.setOrdersId(IDUtils.getId());
                            //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                            orders.setOrdersStatus(1);
                            orders.setOrdersCreateDate(new Date());
                            orders.setOrdersUpdateDate(new Date());
                            int i = ordersMapper.insertSelective(orders);
                            if (i > 0) {
                                return DataResult.ok(orders.getOrdersId());
                            } else {
                                return DataResult.build(500, "新增订单失败");
                            }
                        } else if (logisticsTemplate.getLogisticsNumber() > orders.getItemNum()) {
                            //当物流件数 > 购买数量时，物流总价 = 物流费用 * 购买数量
                            logisticsTotalPrice = logisticsTemplate.getLogisticsCost() * orders.getItemNum();
                            //订单总价 = 物流总价 + 单价 * 数量
                            totalPrice = logisticsTotalPrice + (orders.getUnitPrice() * orders.getItemNum());
                            orders.setTotalPrice(totalPrice);
                            orders.setOrdersId(IDUtils.getId());
                            //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                            orders.setOrdersStatus(1);
                            orders.setOrdersCreateDate(new Date());
                            orders.setOrdersUpdateDate(new Date());
                            int i = ordersMapper.insertSelective(orders);
                            if (i > 0) {
                                return DataResult.ok(orders.getOrdersId());
                            } else {
                                return DataResult.build(500, "新增订单失败");
                            }
                        } else if (logisticsTemplate.getLogisticsNumber() <= orders.getItemNum()) {
                            //当物流件数 <= 购买数量时，物流总价 = 购买数量（物流费用为0，相当于包邮）
                            logisticsTotalPrice = 0;
                            //订单总价 = 物流总价 + 单价 * 数量
                            totalPrice = logisticsTotalPrice + (orders.getUnitPrice() * orders.getItemNum());
                            orders.setTotalPrice(totalPrice);
                            orders.setOrdersId(IDUtils.getId());
                            //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                            orders.setOrdersStatus(1);
                            orders.setOrdersCreateDate(new Date());
                            orders.setOrdersUpdateDate(new Date());
                            int i = ordersMapper.insertSelective(orders);
                            if (i > 0) {
                                return DataResult.ok(orders.getOrdersId());
                            } else {
                                return DataResult.build(500, "新增订单失败");
                            }
                        } else {
                            return DataResult.build(500, "兄台，你这波操作有点迷啊，要不你退出系统以后，重新再上线购买试一下？");
                        }
                    } else if(logisticsTemplate.getLogisticsType() == 1 && logisticsTemplate.getLogisticsMode() == 1){
                        totalPrice = orders.getUnitPrice() * orders.getItemNum();
                        orders.setTotalPrice(totalPrice);
                        //包邮免运费（直接将商品、会员等相关信息新增到订单表中）
                        orders.setOrdersId(IDUtils.getId());
                        //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                        orders.setOrdersStatus(1);
                        orders.setOrdersCreateDate(new Date());
                        orders.setOrdersUpdateDate(new Date());
                        int i = ordersMapper.insertSelective(orders);
                        if (i > 0) {
                            return DataResult.ok(orders.getOrdersId());
                        } else {
                            return DataResult.build(500, "新增订单失败");
                        }
                    } else {
                        totalPrice = orders.getUnitPrice() * orders.getItemNum();
                        orders.setTotalPrice(totalPrice);
                        //自提（直接将商品、会员等相关信息新增到订单表中）
                        orders.setOrdersId(IDUtils.getId());
                        //订单状态 0-取消订单 1-待付款 2-待发货 3-完成 4-退换货
                        orders.setOrdersStatus(1);
                        orders.setOrdersCreateDate(new Date());
                        orders.setOrdersUpdateDate(new Date());
                        int i = ordersMapper.insertSelective(orders);
                        if (i > 0) {
                            return DataResult.ok(orders.getOrdersId());
                        } else {
                            return DataResult.build(500, "新增订单失败");
                        }
                    }
                } else {
                    return DataResult.build(500, "会员状态错误，请联系管理员");
                }
            } else {
                return DataResult.build(500, "会员不存在");
            }
        }
    }

    @Override
    public DataResult findOrders(Orders orders) {
        Map map = new HashMap();
        map.put("ordersId",orders.getOrdersId());
        map.put("itemId",orders.getItemId());
        map.put("memberId",orders.getMemberId());
        map.put("commissionId",orders.getCommissionId());
        map.put("couponDetailsId",orders.getCouponDetailsId());
        map.put("unitPrice",orders.getUnitPrice());
        map.put("itemNum",orders.getItemNum());
        map.put("totalPrice",orders.getTotalPrice());
        map.put("detailedAddress",orders.getDetailedAddress());
        map.put("consignee",orders.getConsignee());
        map.put("phone",orders.getPhone());
        map.put("sfsyyhq",orders.getSfsyyhq());
        map.put("payType",orders.getPayType());
        map.put("payResul",orders.getPayResul());
        map.put("payPrice",orders.getPayPrice());
        map.put("ordersStatus",orders.getOrdersStatus());
        map.put("ordersCreateDate",orders.getOrdersCreateDate());
        map.put("ordersUpdateDate",orders.getOrdersUpdateDate());
        map.put("ordersDesc",orders.getOrdersDesc());
        List<Orders> ordersList = ordersMapper.findOrders(map);
        return DataResult.ok(ordersList);
    }

    @Override
    public DataResult updateOrders(Orders orders) {
        int i = ordersMapper.updateByPrimaryKeySelective(orders);
        if (i > 0){
            return DataResult.build(200,"订单更新成功");
        } else {
            return DataResult.build(500,"订单更新失败，请重试");
        }
    }

    public static void main(String[] args) {
        /*CheckObjectIsNullUtils checkObjectIsNullUtils = new CheckObjectIsNullUtils();
        CouponDetails couponDetails = new CouponDetails();
        if (!checkObjectIsNullUtils.objCheckIsNull(couponDetails)) {
            System.out.println("上面");
        } else {
            System.out.println("下面");
        }*/

        double d = 3.01;
        Integer i = 2;
        d = d + i;
        System.out.println(d);
    }
}
