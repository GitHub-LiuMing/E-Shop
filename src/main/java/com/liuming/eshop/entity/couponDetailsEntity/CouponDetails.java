package com.liuming.eshop.entity.couponDetailsEntity;

import lombok.Data;

import java.util.Date;

@Data
public class CouponDetails {
    private String couponDetailsId;

    private String couponId;

    private String memberId;

    private Date couponStartTime;

    private Date couponEndTime;

    private Integer couponDetailsStatus;

    private Date couponDetailsCreateDate;

    private Date couponDetailsUpdateDate;
}