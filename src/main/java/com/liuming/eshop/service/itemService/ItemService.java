package com.liuming.eshop.service.itemService;

import com.liuming.eshop.entity.itemEntity.Item;
import com.liuming.eshop.utils.DataResult;

public interface ItemService {
    DataResult addItem(Item item);

    DataResult findItem(int pageNum, int pageSize, Item item);
}
