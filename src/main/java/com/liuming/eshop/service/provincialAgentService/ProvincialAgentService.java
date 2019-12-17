package com.liuming.eshop.service.provincialAgentService;

import com.liuming.eshop.entity.provincialAgentEntity.ProvincialAgent;
import com.liuming.eshop.utils.DataResult;

public interface ProvincialAgentService {
    DataResult addProvincialAgent(ProvincialAgent provincialAgent);

    DataResult findProvincialAgent(ProvincialAgent provincialAgent);
}
