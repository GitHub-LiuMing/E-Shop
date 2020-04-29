package com.liuming.eshop.entity.ordersEntity;

import lombok.Data;

@Data
public class OrdersWithBLOBs extends Orders {
    private String ordersDesc;

    private String memberComment;

    private String businessReply;
}