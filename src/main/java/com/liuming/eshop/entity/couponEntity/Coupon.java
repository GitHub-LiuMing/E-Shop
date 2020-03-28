package com.liuming.eshop.entity.couponEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Coupon {
    private String couponId;

    private String couponName;

    private Double couponZdje;

    private Double couponYhzk;

    private String memberLevel;

    private Double ordersPrice;

    private Integer couponNum;

    private String item;

    private Date couponStartTime;

    private Date couponEndTime;

    private Integer couponStatus;

    private Date couponCreateDate;

    private Date couponUpdateDate;

    private String couponDesc;
}