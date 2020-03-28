package com.liuming.eshop.service.logisticsTemplateService;

import com.liuming.eshop.entity.logisticsTemplateEntity.LogisticsTemplate;
import com.liuming.eshop.utils.DataResult;

public interface LogisticsTemplateService {
    DataResult addLogisticsTemplate(LogisticsTemplate logisticsTemplate);

    DataResult findLogisticsTemplate(LogisticsTemplate logisticsTemplate);

    DataResult updateLogisticsTemplate(LogisticsTemplate logisticsTemplate);
}
