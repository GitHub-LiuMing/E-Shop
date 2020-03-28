package com.liuming.eshop.controller.ordersController;

import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.service.ordersService.OrdersService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 订单
 * @ClassName OrdersController
 * @Author 鲸落
 * @date 2020.01.07 15:17
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    /**
     * @Description 新增订单
     * @param orders
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.07 15:58
     */
    @RequestMapping("/addOrders")
    public DataResult addOrders(Orders orders) {
        if (StringUtils.isNotBlank(orders.getItemId()) && StringUtils.isNotBlank(orders.getMemberId()) && StringUtils.isNotBlank(orders.getCommissionId()) && StringUtils.isNotBlank(orders.getMemberDistributionAddressId()) && orders.getItemNum() != null) {
            return ordersService.addOrders(orders);
        } else {
            return DataResult.build(500, "商品ID、会员ID、佣金ID、会员配送地址管理ID不得为空");
        }
    }

    /**
     * @Description 查询订单
     * @param orders
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.13 15:24
     */
    @RequestMapping("/findOrders")
    public DataResult findOrders(Orders orders){
        return ordersService.findOrders(orders);
    }

    @RequestMapping("/updateOrders")
    public DataResult updateOrders(Orders orders){
        if (StringUtils.isNotBlank(orders.getOrdersId())){
            return ordersService.updateOrders(orders);
        } else {
            return DataResult.build(500,"订单ID不得为空");
        }
    }
}
