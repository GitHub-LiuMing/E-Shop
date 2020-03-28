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

    private String memberDistributionAddressId;

    private Double unitPrice;

    private Integer itemNum;

    private Double totalPrice;

    private Integer sfsyyhq;

    private Integer payType;

    private Integer payResul;

    private Double payPrice;

    private Date gmtCreated;

    private Date gmtPayment;

    private Date gmtRefund;

    private Integer ordersStatus;

    private Date ordersCreateDate;

    private Date ordersUpdateDate;

    private String ordersDesc;
}