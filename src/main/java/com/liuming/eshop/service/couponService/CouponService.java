package com.liuming.eshop.service.couponService;

import com.liuming.eshop.entity.couponEntity.Coupon;
import com.liuming.eshop.utils.DataResult;

public interface CouponService {
    DataResult addCoupon(Coupon coupon);

    DataResult findCoupon(Coupon coupon);

    DataResult updateCoupon(Coupon coupon);
}
