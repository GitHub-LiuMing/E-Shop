package com.liuming.eshop.entity.logisticsTemplateEntity;

import lombok.Data;

import java.util.Date;

@Data
public class LogisticsTemplate {
    private String logisticsTemplateId;

    private String logisticsTemplateName;

    private Integer logisticsType;

    private Integer logisticsMode;

    private Integer logisticsNumber;

    private Integer logisticsCost;

    private Integer logisticsTemplateStatus;

    private Date logisticsTemplateCreatedDate;

    private Date logisticsTemplateUpdatedDate;
}