package com.liuming.eshop.service.itemService;

import com.liuming.eshop.utils.DataResult;

public interface ItemService {
    DataResult findItemAll(int pageNum, int pageSize);
}
