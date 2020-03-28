package com.liuming.eshop.service.payService.impl;

import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.service.payService.PayService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.stereotype.Service;
import com.liuming.eshop.mapper.ordersMapper.OrdersMapper;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description
 * @ClassName PayServiceImpl
 * @Author 鲸落
 * @date 2020.01.14 16:30
 */
@Service
public class PayServiceImpl implements PayService {
    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public DataResult toPay(String ordersId) {
        Orders orders = new Orders();
        orders.setOrdersId(ordersId);
        orders.setPayType(1);
        orders.setOrdersUpdateDate(new Date());
        int i = ordersMapper.updateByPrimaryKeySelective(orders);
        if (i > 0){
            orders.setOrdersStatus(2);
            int i1 = ordersMapper.updateByPrimaryKeySelective(orders);
            if (i1 > 0){
                return DataResult.build(200,"支付成功");
            } else {
                return DataResult.build(500,"支付成功，但是订单状态异常，请联系管理员进行处理，否则将影响到您后续的业务");
            }
        } else {
            return DataResult.build(500,"支付失败");
        }
    }
}
