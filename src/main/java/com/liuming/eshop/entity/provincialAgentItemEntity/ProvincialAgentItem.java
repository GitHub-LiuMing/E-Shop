package com.liuming.eshop.entity.provincialAgentItemEntity;

import lombok.Data;

import java.util.Date;

@Data
public class ProvincialAgentItem {
    private String provincialAgentItemId;

    private String provincialAgentId;

    private String provincialAgentName;

    private String itemId;

    private String itemName;

    private String classifyId;

    private String classifyName;

    private Double provincialAgentItemOriginalPrice;

    private Double provincialAgentItemPresentPrice;

    private String provincialAgentItemUrl;

    private Integer stockNum;

    private Integer salesNum;

    private Integer provincialAgentItemStatus;

    private Integer provincialAgentItemType;

    private Date provincialAgentItemCreatedDate;

    private Date provincialAgentItemUpdatedDate;

    private String provincialAgentItemDesc;
}