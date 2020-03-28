package com.liuming.eshop.service.couponDetailsService;

import com.liuming.eshop.entity.couponDetailsEntity.CouponDetails;
import com.liuming.eshop.utils.DataResult;

public interface CouponDetailsService {
    DataResult addCouponDetails(CouponDetails couponDetails);

    DataResult findCouponDetails(CouponDetails couponDetails);

    DataResult updateCouponDetails(CouponDetails couponDetails);
}
