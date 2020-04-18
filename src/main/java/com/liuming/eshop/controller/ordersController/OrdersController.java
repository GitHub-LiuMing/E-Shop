package com.liuming.eshop.controller.ordersController;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.service.ordersService.OrdersService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.payUtils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpRequest;
import org.apache.http.client.utils.HttpClientUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

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
        if (StringUtils.isNotBlank(orders.getItemId()) && StringUtils.isNotBlank(orders.getMemberId()) && StringUtils.isNotBlank(orders.getCommissionId()) && orders.getItemNum() != null) {
            return ordersService.addOrders(orders);
        } else {
            return DataResult.build(500, "商品ID、会员ID、佣金ID不得为空");
        }
    }

    /**
     * @Description 添加积分兑换商品订单
     * @param orders
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.04.15 10:08
     */
    @RequestMapping("/addOrdersByPoints")
    public DataResult addOrdersByPoints(Orders orders){
        if (StringUtils.isNotBlank(orders.getItemId()) && StringUtils.isNotBlank(orders.getMemberId()) && StringUtils.isNotBlank(orders.getCommissionId()) && orders.getItemNum() != null) {
            return ordersService.addOrdersByPoints(orders);
        } else {
            return DataResult.build(500, "商品ID、会员ID、佣金ID不得为空");
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

    /**
     * @Description 调用快递100查询快递信息
     * @param com
     * @param num
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.04.17 11:50
     */
    @RequestMapping("/findCourier")
    public DataResult findCourier(String com, String num) throws Exception {
        String customer = "8582FDD72894805968ED1108CA9B65A0";
        String key = "sZsvbvYv4318";

        String param = "{\"com\":\"" + com + "\",\"num\":\"" + num + "\"}";
        String sign = MD5Util.MD5Encode(param + key + customer, "").toUpperCase();
        Map params = new HashMap();
        params.put("param", param);
        params.put("sign", sign);
        params.put("customer", customer);
        HttpConfig config = HttpConfig.custom().url("https://poll.kuaidi100.com/poll/query.do").map(params);
        String resp = HttpClientUtil.post(config);
        return DataResult.ok(resp);
    }
}
