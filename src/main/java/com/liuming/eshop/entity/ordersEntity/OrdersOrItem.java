package com.liuming.eshop.entity.ordersEntity;

import com.liuming.eshop.entity.itemEntity.Item;
import lombok.Data;

import java.util.Date;

/**
 * @Description 
 * @ClassName OrdersOrItem
 * @Author 鲸落
 * @date 2020.04.17 11:52
 */
@Data
public class OrdersOrItem {
    private Orders orders;

    private Item items;
}
