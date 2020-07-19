package com.liuming.eshop.controller.couponController;

import com.liuming.eshop.entity.couponEntity.Coupon;
import com.liuming.eshop.service.couponService.CouponService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 优惠券
 * @ClassName CouponController
 * @Author 鲸落
 * @date 2020.01.04 14:37
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Resource
    private CouponService couponService;

    /**
     * @Description 新增优惠券
     * @param coupon
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.06 14:55
     */
    @RequestMapping("/addCoupon")
    public DataResult addCoupon(Coupon coupon){
        if (StringUtils.isNotBlank(coupon.getCouponName())
                && coupon.getCouponNum() != null
                && coupon.getCouponStartTime() != null
                && coupon.getCouponEndTime() != null){
            return couponService.addCoupon(coupon);
        } else {
            return DataResult.build(500,"优惠券名称、优惠券数量、生效时间、结束时间不得为空");
        }
    }

    /**
     * @Description 查询优惠券
     * @param coupon
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.06 17:20
     */
    @RequestMapping("/findCoupon")
    public DataResult findCoupon(Coupon coupon){
        return couponService.findCoupon(coupon);
    }

    @RequestMapping("/updateCoupon")
    public DataResult updateCoupon(Coupon coupon){
        if (StringUtils.isNotBlank(coupon.getCouponId())){
            return couponService.updateCoupon(coupon);
        } else {
            return DataResult.build(500,"优惠券ID不得为空");
        }
    }
}
