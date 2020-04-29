package com.liuming.eshop.service.ordersService;

import com.liuming.eshop.entity.ordersEntity.OrdersWithBLOBs;
import com.liuming.eshop.utils.DataResult;

public interface OrdersService {
    DataResult addOrders(OrdersWithBLOBs orders);

    DataResult findOrders(OrdersWithBLOBs orders);

    DataResult addOrdersByPoints(OrdersWithBLOBs orders);

    DataResult updateOrders(OrdersWithBLOBs orders);
}
