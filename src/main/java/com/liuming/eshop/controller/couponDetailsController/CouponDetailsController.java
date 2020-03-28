package com.liuming.eshop.controller.couponDetailsController;

import com.liuming.eshop.entity.couponDetailsEntity.CouponDetails;
import com.liuming.eshop.service.couponDetailsService.CouponDetailsService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 优惠券详情
 * @ClassName CouponDetailsController
 * @Author 鲸落
 * @date 2020.01.13 16:48
 */
@RestController
@RequestMapping("/couponDetails")
public class CouponDetailsController {
    @Resource
    private CouponDetailsService couponDetailsService;

    @RequestMapping("/addCouponDetails")
    public DataResult addCouponDetails(CouponDetails couponDetails){
        /**
         * @Description 新增优惠劵
         * @param couponDetails
         * @return com.liuming.eshop.utils.DataResult
         * @Author 鲸落
         * @Date 2020.01.13 16:51
         */
        if (StringUtils.isNotBlank(couponDetails.getCouponId()) && StringUtils.isNotBlank(couponDetails.getMemberId())){
            return couponDetailsService.addCouponDetails(couponDetails);
        } else {
            return DataResult.build(500,"优惠券ID和会员ID不得为空");
        }
    }

    /**
     * @Description 查询优惠券详情
     * @param couponDetails
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.13 17:04
     */
    @RequestMapping("/findCouponDetails")
    public DataResult findCouponDetails(CouponDetails couponDetails){
        return couponDetailsService.findCouponDetails(couponDetails);
    }

    /**
     * @Description 更新优惠券详情
     * @param couponDetails
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.13 17:10
     */
    @RequestMapping("/updateCouponDetails")
    public DataResult updateCouponDetails(CouponDetails couponDetails){
        if (StringUtils.isNotBlank(couponDetails.getCouponDetailsId())){
            return couponDetailsService.updateCouponDetails(couponDetails);
        } else {
            return DataResult.build(500,"优惠券详情ID不得为空");
        }
    }
}
