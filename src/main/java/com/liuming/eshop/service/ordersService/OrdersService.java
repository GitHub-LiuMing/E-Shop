package com.liuming.eshop.service.ordersService;

import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.utils.DataResult;

public interface OrdersService {
    DataResult addOrders(Orders orders);

    DataResult findOrders(Orders orders);

    DataResult updateOrders(Orders orders);
}
