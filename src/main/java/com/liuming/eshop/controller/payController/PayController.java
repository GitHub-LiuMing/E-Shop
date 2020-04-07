package com.liuming.eshop.controller.payController;

import com.ijpay.core.enums.SignType;
import com.ijpay.core.kit.*;
import com.ijpay.wxpay.WxPayApi;
import com.ijpay.wxpay.model.*;
import com.liuming.eshop.entity.changeEntity.Change;
import com.liuming.eshop.entity.classifyEntity.Classify;
import com.liuming.eshop.entity.commissionEntity.Commission;
import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.mapper.changeMapper.ChangeMapper;
import com.liuming.eshop.mapper.classifyMapper.ClassifyMapper;
import com.liuming.eshop.mapper.commissionMapper.CommissionMapper;
import com.liuming.eshop.mapper.itemMapper.ItemMapper;
import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.service.ordersService.OrdersService;
import com.liuming.eshop.mapper.ordersMapper.OrdersMapper;
import com.liuming.eshop.service.payService.PayService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import com.liuming.eshop.utils.payUtils.*;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;

/**
 * @Description 支付
 * @ClassName PayController
 * @Author 鲸落
 * @date 2020.01.14 16:29
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    @Resource
    private PayService payService;

    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private MemberMapper memberMapper;

    @Resource
    private ChangeMapper changeMapper;

    @Resource
    private ItemMapper itemMapper;

    @Resource
    private CommissionMapper commissionMapper;

    @RequestMapping("/toPay")
    public DataResult toPay(String ordersId){
        if (StringUtils.isNotBlank(ordersId)){
            return payService.toPay(ordersId);
        } else {
            return DataResult.build(500,"订单ID不得为空");
        }
    }

    /**
     * 去支付
     */
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    @ResponseBody
    public DataResult findTransactionRecord(HttpServletRequest request, String ordersId,
                                            String openId) throws Exception {
        //查询订单
        Orders orders = ordersMapper.findOrdersId(ordersId);
        if (orders != null) {
            System.out.println(orders.getTotalPrice());
            // 拿到合计金额 格式化合计金额
            int total_fee = BigDecimal.valueOf(orders.getTotalPrice()).multiply(new BigDecimal(100)).intValue();

            System.out.println(total_fee);
            // 微信返回参数组
            Map<String, String> unifiedorder = unifiedorder(request, ordersId, total_fee, openId);
            //UnifiedorderResult unifiedorderResult = unifiedorder(bonusPoints.getBonusPointsId(), total_fee, openId);
            System.out.println(unifiedorder);
            return DataResult.ok(unifiedorder);
        } else {
            return DataResult.build(500,"订单不存在");
        }
    }

    /**
     * 发起支付
     *
     * @param out_trade_no
     * @param total_fee
     * @param openId
     * @return
     */
    private static Map<String, String> unifiedorder(HttpServletRequest request, String out_trade_no
            , int total_fee, String openId) throws Exception {
        Map<String, String> result = new HashMap();
        String nonce_str = RandomStringGenerator.getRandomStringByLength(32);
        TreeMap<String, String> packageParams = new TreeMap<>();
        packageParams.put("appid", Configure.getAppID().trim());
        packageParams.put("mch_id", Configure.getMch_id());
        packageParams.put("nonce_str", nonce_str);
        packageParams.put("body", "支付购买服务");
        packageParams.put("out_trade_no", out_trade_no);//商户订单号,自己的订单ID
        packageParams.put("total_fee", String.valueOf(total_fee) + "");//支付金额，这边需要转成字符串类型，否则后面的签名会失败
//			String.valueOf((int)Math.ceil(Double.valueOf(orderForm.getPayPrice())*100))
        packageParams.put("spbill_create_ip", IPAdrressUtils.getIPAdrress(request));//获取IP地址
        packageParams.put("notify_url", Configure.getNotify_url());//支付成功后的回调地址
        packageParams.put("trade_type", "JSAPI");//支付方式
        packageParams.put("openid", openId);
        String sign =
                WXPayUtil.generateSignature(packageParams, Configure.getKey());
        packageParams.put("sign", sign);

        WXPayUtil w = new WXPayUtil();
        Map<String, String> resp = w.unifiedOrder(packageParams, Configure.getKey(), 500, 500);
        JSONObject jsonObject = JSONObject.fromObject(resp);
        System.out.println(jsonObject);
        String packages = "prepay_id=" + jsonObject.get("prepay_id");
        SortedMap<String, String> finalpackage = new TreeMap<String, String>();
        finalpackage.put("appId", Configure.getAppID());
        finalpackage.put("timeStamp", nonce_str);
        finalpackage.put("nonceStr", nonce_str);
        finalpackage.put("package", packages);
        finalpackage.put("signType", "MD5");
        String paySign = WXPayUtil.generateSignature(finalpackage, Configure.getKey());
        finalpackage.put("paySign", paySign);

        result = finalpackage;
        return result;
    }

    /**
     * 微信支付回调
     *
     * @param //request
     */
    @RequestMapping(value = "/wx_notify_url")
    public void notifyWeixinPayment(HttpServletRequest request, HttpServletResponse response) {
        try {
            System.out.println("----[接收到微信回调success]----");

            BufferedReader reader = request.getReader();
            String line = "";
            StringBuffer inputString = new StringBuffer();
            try {
                PrintWriter writer = response.getWriter();
                while ((line = reader.readLine()) != null) {
                    inputString.append(line);
                }
                if (reader != null) {
                    reader.close();
                }
                System.out.println("----[微信回调]接收到的报文---" + inputString.toString());
                if (!StringUtils.isEmpty(inputString.toString())) {
                    String json = XmlJsonUtil.xml2JSON(inputString.toString());
                    WXPayResult wxPayResult = JsonUtils.jsonToPojo(json, WXPayResult.class);
                    System.out.println(JsonUtils.objectToJson(wxPayResult));
                    if (wxPayResult.getReturn_code().toLowerCase().contains("SUCCESS".toLowerCase())) {
//						 logger.info("微信支付成功了");
                        System.out.println("微信支付成功了");
                        SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
                        parameters.put("appid", wxPayResult.getAppid());
                        parameters.put("attach", wxPayResult.getAttach());
                        parameters.put("bank_type", wxPayResult.getBank_type());
                        parameters.put("cash_fee", wxPayResult.getCash_fee());
                        parameters.put("fee_type", wxPayResult.getFee_type());
                        parameters.put("is_subscribe", wxPayResult.getIs_subscribe());
                        parameters.put("mch_id", wxPayResult.getMch_id());
                        parameters.put("nonce_str", wxPayResult.getNonce_str());
                        parameters.put("openid", wxPayResult.getOpenid());
                        parameters.put("out_trade_no", wxPayResult.getOut_trade_no());
                        parameters.put("result_code", wxPayResult.getResult_code());
                        parameters.put("return_code", wxPayResult.getReturn_code());
                        parameters.put("time_end", wxPayResult.getTime_end());
                        parameters.put("total_fee", wxPayResult.getTotal_fee());
                        parameters.put("trade_type", wxPayResult.getTrade_type());
                        parameters.put("transaction_id", wxPayResult.getTransaction_id());

                        System.out.println("------111-------");

                        //查询订单
                        Orders orders = ordersMapper.findOrdersId(wxPayResult.getOut_trade_no());

                        System.out.println("Cash_fee: " + wxPayResult.getCash_fee());
                        System.out.println("orders: " + orders);
                        if (orders != null){
                            //判断得到的金额和查询的金额是否相同，查询的金额是分为单位
                            if (wxPayResult.getCash_fee() == orders.getTotalPrice().doubleValue() * 100) {

                                System.out.println("----------订单校验成功----------");
                                //修改订单的支付参数
                                orders.setPayType(0);
                                orders.setPayPrice((double)wxPayResult.getCash_fee()/100);
                                orders.setOrdersStatus(2);//订单状态 0-取消订单 1-待付款 2-已完成 3-退换货
                                orders.setPayResul(1);//支付结果 0-待支付 1-支付成功 2-支付失败
                                orders.setOrdersUpdateDate(new Date());

                                int i = ordersMapper.updateByPrimaryKeySelective(orders);

                                if (i >= 1){
                                    //TODO: 支付成功以后，要按照商品的佣金ID查询商品佣金分配情况，将分配后的金额存入对应会员的零钱表中
                                    /**
                                     * 根据orders查询item，根据item中的分类ID进行区分，只有会员和高级会员有佣金分配，其他的直接结束支付流程
                                     */
                                    Item item = itemMapper.selectByPrimaryKey(orders.getItemId());
                                    //当购买的商品属于自购专区、会员专区和高级会员专区的时候，查询该商品的佣金ID
                                    Commission commission = commissionMapper.selectByPrimaryKey(item.getCommissionId());
                                    //根据订单查询会员身份
                                    Member member = memberMapper.selectByPrimaryKey(orders.getMemberId());//得到当前购买人的会员类型和上级会员ID
                                    //上级身份标识
                                    int memberType;
                                    //上级
                                    Member preMember;
                                    //根据购买人会员身份查询上级会员

                                    //判断依据：1.判断我买的产品,2.判断我上级的身份，3.判断我的身份例如：我购买了39.9，我的上级是高级会员，并且我的等级是高级会员，我的上级得到直推8，我得到复购8
                                    // 我是代理，我的上级是高级会员，我购买了39.9，那么我上级得到的直推奖是8块，我会得到复购的8
                                    if (StringUtils.equals(item.getClassifyId(),"2")){
                                        //自购分配佣金的逻辑
                                    } else if(StringUtils.equals(item.getClassifyId(),"3")){
                                        //会员专区分配佣金的逻辑
                                        //判断我上级的身份
                                        preMember = memberMapper.selectByPrimaryKey(member.getPreMemberId());
                                        if (preMember.getMemberType() == 5){
                                            //上级是会员39.9等级,分配对应佣金4
                                            Change change = new Change();
                                            change.setChangeId(IDUtils.getId());
                                            change.setMemberId(preMember.getMemberId());
                                            change.setChangePrice(commission.getHyHyZtPrice());
                                            change.setChangeType(1);
                                            change.setChangeStatus(1);
                                            change.setChangeCreateDate(new Date());
                                            change.setChangeUpdateDate(new Date());
                                            changeMapper.insertSelective(change);
                                        } else if(preMember.getMemberType() == 4 || preMember.getMemberType() == 3 || preMember.getMemberType() == 2){
                                            //上级是高级会员399等级,分配对应佣金8,并且去查询复购情况,如果符合复购条件,给购买人零钱增加8
                                            Change change = new Change();
                                            change.setChangeId(IDUtils.getId());
                                            change.setMemberId(preMember.getMemberId());
                                            change.setChangePrice(commission.getGjHyZtPrice());
                                            change.setChangeType(1);
                                            change.setChangeStatus(1);
                                            change.setChangeCreateDate(new Date());
                                            change.setChangeUpdateDate(new Date());
                                            changeMapper.insertSelective(change);
                                            //查询购买人是否符合复购,如果符合复购给购买人零钱增加8
                                            //orders in itemId,memberId,ordersStatus=2
                                            Map map = new HashMap();
                                            map.put("itemId",item.getItemId());
                                            map.put("memberId",member.getMemberId());
                                            map.put("ordersStatus",2);
                                            List<Orders> orders1 = ordersMapper.findOrders(map);
                                            if (orders1.size() > 1){
                                                //购买人有复购,给购买人增加零钱8
                                                Change change1 = new Change();
                                                change1.setChangeId(IDUtils.getId());
                                                change1.setMemberId(member.getMemberId());
                                                change1.setChangePrice(commission.getGjHyFgPrice());
                                                change1.setChangeType(1);
                                                change1.setChangeStatus(1);
                                                change1.setChangeCreateDate(new Date());
                                                change1.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(change);
                                            }
                                        } else if(preMember.getMemberType() == 1){
                                            //上级是代理商3999等级,分配对应佣金12,并且去查询复购情况,如果符合复购条件,给购买人零钱增加12
                                            Change change = new Change();
                                            change.setChangeId(IDUtils.getId());
                                            change.setMemberId(preMember.getMemberId());
                                            change.setChangePrice(commission.getDlHyZtPrice());
                                            change.setChangeType(1);
                                            change.setChangeStatus(1);
                                            change.setChangeCreateDate(new Date());
                                            change.setChangeUpdateDate(new Date());
                                            changeMapper.insertSelective(change);
                                            //查询购买人是否符合复购,如果符合复购给购买人零钱增加8
                                            //orders in itemId,memberId,ordersStatus=2
                                            Map map = new HashMap();
                                            map.put("itemId",item.getItemId());
                                            map.put("memberId",member.getMemberId());
                                            map.put("ordersStatus",2);
                                            List<Orders> orders1 = ordersMapper.findOrders(map);
                                            if (orders1.size() > 1 && member.getMemberType() == 4){
                                                //购买人有复购,给购买人增加零钱8
                                                Change gjHyFg = new Change();
                                                gjHyFg.setChangeId(IDUtils.getId());
                                                gjHyFg.setMemberId(member.getMemberId());
                                                gjHyFg.setChangePrice(commission.getGjHyFgPrice());
                                                gjHyFg.setChangeType(1);
                                                gjHyFg.setChangeStatus(1);
                                                gjHyFg.setChangeCreateDate(new Date());
                                                gjHyFg.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(gjHyFg);
                                            } else if(orders1.size() > 1 && member.getMemberType() == 3){
                                                //购买人有复购,给购买人增加零钱8
                                                Change vipHyFg = new Change();
                                                vipHyFg.setChangeId(IDUtils.getId());
                                                vipHyFg.setMemberId(member.getMemberId());
                                                vipHyFg.setChangePrice(commission.getVipHyFgPrice());
                                                vipHyFg.setChangeType(1);
                                                vipHyFg.setChangeStatus(1);
                                                vipHyFg.setChangeCreateDate(new Date());
                                                vipHyFg.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(vipHyFg);
                                            } else if(orders1.size() > 1 && member.getMemberType() == 2){
                                                //购买人有复购,给购买人增加零钱8
                                                Change zzHyFg = new Change();
                                                zzHyFg.setChangeId(IDUtils.getId());
                                                zzHyFg.setMemberId(member.getMemberId());
                                                zzHyFg.setChangePrice(commission.getZzHyFgPrice());
                                                zzHyFg.setChangeType(1);
                                                zzHyFg.setChangeStatus(1);
                                                zzHyFg.setChangeCreateDate(new Date());
                                                zzHyFg.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(zzHyFg);
                                            } else if(orders1.size() > 1 && member.getMemberType() == 1){
                                                //购买人有复购,给购买人增加零钱8
                                                Change dlHyFg = new Change();
                                                dlHyFg.setChangeId(IDUtils.getId());
                                                dlHyFg.setMemberId(member.getMemberId());
                                                dlHyFg.setChangePrice(commission.getDlHyFgPrice());
                                                dlHyFg.setChangeType(1);
                                                dlHyFg.setChangeStatus(1);
                                                dlHyFg.setChangeCreateDate(new Date());
                                                dlHyFg.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(dlHyFg);
                                            }
                                        }
                                    } else if(StringUtils.equals(item.getClassifyId(),"4")){
                                        //高级会员专区分配佣金的逻辑
                                        //判断我上级的身份
                                        preMember = memberMapper.selectByPrimaryKey(member.getPreMemberId());
                                        //判断商品ID是否是3999,3999属于代理商,其他的属于高级会员
                                        if(StringUtils.equals(orders.getItemId(),"3999")){
                                            //判断商品ID是否是3999,3999属于代理商,其他的属于高级会员
                                        } else {
                                            if (preMember.getMemberType() == 5){
                                                //上级是会员39.9等级,分配对应佣金75
                                                Change change = new Change();
                                                change.setChangeId(IDUtils.getId());
                                                change.setMemberId(preMember.getMemberId());
                                                change.setChangePrice(commission.getHyGjZtPrice());
                                                change.setChangeType(1);
                                                change.setChangeStatus(1);
                                                change.setChangeCreateDate(new Date());
                                                change.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(change);
                                            } else if(preMember.getMemberType() == 4){
                                                //上级是高级会员399等级,分配对应佣金150
                                                Change change = new Change();
                                                change.setChangeId(IDUtils.getId());
                                                change.setMemberId(preMember.getMemberId());
                                                change.setChangePrice(commission.getGjGjZtPrice());
                                                change.setChangeType(1);
                                                change.setChangeStatus(1);
                                                change.setChangeCreateDate(new Date());
                                                change.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(change);
                                            } else if(preMember.getMemberType() == 3){
                                                //上级是高级会员399等级,分配对应佣金170
                                                Change change = new Change();
                                                change.setChangeId(IDUtils.getId());
                                                change.setMemberId(preMember.getMemberId());
                                                change.setChangePrice(commission.getVipGjZtPrice());
                                                change.setChangeType(1);
                                                change.setChangeStatus(1);
                                                change.setChangeCreateDate(new Date());
                                                change.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(change);
                                            } else if(preMember.getMemberType() == 2){
                                                //上级是高级会员399等级,分配对应佣金200
                                                Change change = new Change();
                                                change.setChangeId(IDUtils.getId());
                                                change.setMemberId(preMember.getMemberId());
                                                change.setChangePrice(commission.getZzGjZtPrice());
                                                change.setChangeType(1);
                                                change.setChangeStatus(1);
                                                change.setChangeCreateDate(new Date());
                                                change.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(change);
                                            } else if(preMember.getMemberType() == 1){
                                                //上级是代理商3999等级,分配对应佣金200
                                                Change change = new Change();
                                                change.setChangeId(IDUtils.getId());
                                                change.setMemberId(preMember.getMemberId());
                                                change.setChangePrice(commission.getDlGjZtPrice());
                                                change.setChangeType(1);
                                                change.setChangeStatus(1);
                                                change.setChangeCreateDate(new Date());
                                                change.setChangeUpdateDate(new Date());
                                                changeMapper.insertSelective(change);
                                            }
                                        }
                                    } else {
                                        writer.write(setXml("SUCCESS", "OK"));
                                        System.out.println("------------支付成功-------------");
                                    }
                                } else {
                                    writer.write(setXml("FAIL", "Update data timeout"));
                                    System.out.println("----------- 更新数据失败,请重试-------------");
                                }
                            } else {
                                writer.write(setXml("FAIL", "Different amounts"));
                            }
                        } else {
                            writer.write(setXml("FAIL", "No results returned by OrdersID"));
                        }
                    } else {
                        writer.write(setXml("FAIL", wxPayResult.getReturn_msg()));
                        System.out.println("---------微信支付返回Fail----------" + wxPayResult.getReturn_msg());
                    }
                    if (writer != null) {
                        writer.close();
                    }
                } else {
                    writer.write(setXml("FAIL", "No results returned by WeChat"));
                    System.out.println("----------------未获得到微信返回的结果------------------");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String setXml(String return_code, String return_msg) {
        return "<xml><return_code><![CDATA[" + return_code + "]]></return_code><return_msg><![CDATA[" + return_msg
                + "]]></return_msg></xml>";
    }

    /**
     * 企业付款到零钱
     */
    @RequestMapping(value = "/transfer", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public DataResult transfer(HttpServletRequest request, @RequestParam("openId") String openId, @RequestParam("reUserName") String reUserName,
            @RequestParam("changePrice") double changePrice) {
        //提现功能开始前期的业务逻辑判断
        if (1.00 <= changePrice && changePrice <= 5000.00){
            //通过openid查询用户信息，得到的用户数据查询零钱表，再判断零钱中的余额是否大于等于用户准备提现的金额changePrice
            Member member = memberMapper.findMemberByOpenId(openId);
            if (member != null){
                //查询该会员的零钱信息
                List<Change> changeList = changeMapper.findChangeByMemberId(member.getMemberId());
                if (changeList.size() > 0){
                    //待提现 = 已收入 - 已提现
                    double dtx = 0.00;
                    double ysr = 0.00;
                    double ytx = 0.00;

                    //直接通过数据库查询到相应数据
                    ysr = changeMapper.findChangeByMemberIdAndType(member.getMemberId(), 0);
                    ytx = changeMapper.findChangeByMemberIdAndType(member.getMemberId(), 2);

                    BigDecimal bysr = new BigDecimal(Double.toString(ysr));
                    BigDecimal bytx = new BigDecimal(Double.toString(ytx));
                    dtx = bysr.subtract(bytx).doubleValue();
                    if (changePrice <= dtx){
                        //提现功能 开始
                        String ip = IPAdrressUtils.getIPAdrress(request);
                        //TODO：强制设置IP为本地IP（上线前需要注释掉）
                        if (StringUtils.isBlank(ip)) {
                            ip = "127.0.0.1";
                        }

                        String nonce_str = RandomStringGenerator.getRandomStringByLength(32);
                        Map<String, String> params = TransferModel.builder()
                                .mch_appid(Configure.getAppID().trim())
                                .mchid(Configure.getMch_id())
                                .nonce_str(nonce_str)
                                .partner_trade_no(WxPayKit.generateStr())
                                .openid(openId)
                                .check_name("FORCE_CHECK")
                                .re_user_name(reUserName)
                                .amount((int)(changePrice * 100) + "")
                                .desc("提现")
                                .spbill_create_ip(ip)
                                .build()
                                .createSign(Configure.getKey(), SignType.MD5, false);

                        String path = ClientCustomSSL.class.getClassLoader().getResource("apiclient_cert.p12").getPath();
                        // 提现
                        String transfers = WxPayApi.transfers(params, path, Configure.getMch_id());
                        //log.info("提现结果:" + transfers);
                        System.out.println("提现结果:" + transfers);
                        Map<String, String> map = WxPayKit.xmlToMap(transfers);
                        String returnCode = map.get("return_code");
                        String resultCode = map.get("result_code");
                        if (WxPayKit.codeIsOk(returnCode) && WxPayKit.codeIsOk(resultCode)) {
                            // 提现成功
                            System.out.println("提现成功");
                            //提现成功以后的项目逻辑代码
                            Change change = new Change();
                            change.setChangeId(IDUtils.getId());
                            change.setMemberId(member.getMemberId());
                            change.setChangePrice(changePrice);
                            change.setChangeType(2);
                            change.setChangeStatus(1);
                            change.setChangeCreateDate(new Date());
                            change.setChangeUpdateDate(new Date());
                            int i = changeMapper.insertSelective(change);
                            if(i > 0){
                                return DataResult.ok();
                            } else {
                                return DataResult.build(500,"提现失败，请联系客服");
                            }
                        } else {
                            // 提现失败
                            System.out.println("提现失败");
                        }
                        return DataResult.ok(transfers);
                        //提现功能 结束
                    } else {
                        return DataResult.build(500,"您的待提现金额为：" + dtx + "，请准确输入");
                    }
                } else {
                    return DataResult.build(500,"您的可提现金额不足");
                }
            } else {
                return DataResult.build(500,"会员不存在");
            }
        } else {
            return DataResult.build(500,"您输入的提现金额超过微信官方许可范围，请根据页面提示金额进行提现");
        }
    }

    public static void main(String[] args) {
    }
}
