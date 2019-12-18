package com.liuming.eshop.service.provincialAgentItemService;

import com.liuming.eshop.entity.provincialAgentItemEntity.ProvincialAgentItem;
import com.liuming.eshop.utils.DataResult;

public interface ProvincialAgentItemService {
    DataResult addProvincialAgentItem(ProvincialAgentItem provincialAgentItem);

    DataResult findProvincialAgentItem(int pageNum, int pageSize, ProvincialAgentItem provincialAgentItem);
}
