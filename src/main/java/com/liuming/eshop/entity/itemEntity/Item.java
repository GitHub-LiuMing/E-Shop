package com.liuming.eshop.entity.itemEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Item {
    private String itemId;

    private String itemName;

    private String classifyId;

    private String classifyName;

    private String commissionId;

    private String logisticsTemplateId;

    private Double itemOriginalPrice;

    private Double itemPresentPrice;

    private String itemUrl;

    private Integer stockNum;

    private Integer salesNum;

    private Integer memberDiscountedStatus;

    private Double memberDiscounted;

    private Integer notMemberDiscountedStatus;

    private Double notMemberDiscounted;

    private Integer gmsxjf;

    private Integer mrxg;

    private Integer mrmtxg;

    private Integer sfsyyhq;

    private Integer itemStatus;

    private Integer itemType;

    private Date itemCreatedDate;

    private Date itemUpdatedDate;

    private String itemDesc;
}