package com.liuming.eshop.entity.ordersEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Orders {
    private String ordersId;

    private String itemId;

    private String memberId;

    private String commissionId;

    private String couponDetailsId;

    private Double unitPrice;

    private Integer itemNum;

    private Double totalPrice;

    private String detailedAddress;

    private String consignee;

    private String phone;

    private String courierNumber;

    private String courierServicesCompany;

    private String memberCommentUrl;

    private Integer sfsyyhq;

    private Integer payType;

    private Integer payResul;

    private Double payPrice;

    private Integer ordersStatus;

    private Integer ordersType;

    private Date ordersCreateDate;

    private Date ordersUpdateDate;
}