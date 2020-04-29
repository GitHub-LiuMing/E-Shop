package com.liuming.eshop.entity.ordersEntity;

import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.entity.memberEntity.Member;
import lombok.Data;

/**
 * @Description 
 * @ClassName OrdersOrItemOrMember
 * @Author 鲸落
 * @date 2020.04.26 10:27
 */
@Data
public class OrdersOrItemOrMember {
    private OrdersWithBLOBs orders;

    private Item items;

    private Member member;
}
