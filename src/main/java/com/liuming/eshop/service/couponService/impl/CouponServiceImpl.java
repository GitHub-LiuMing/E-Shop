package com.liuming.eshop.service.couponService.impl;

import com.liuming.eshop.entity.couponEntity.Coupon;
import com.liuming.eshop.mapper.couponMapper.CouponMapper;
import com.liuming.eshop.service.couponService.CouponService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName CouponServiceImpl
 * @Author 鲸落
 * @date 2020.01.04 14:37
 */
@Service
public class CouponServiceImpl implements CouponService {
    @Resource
    private CouponMapper couponMapper;

    @Override
    public DataResult addCoupon(Coupon coupon) {
        coupon.setCouponId(IDUtils.getId());
        coupon.setCouponCreateDate(new Date());
        coupon.setCouponUpdateDate(new Date());
        int i = couponMapper.insertSelective(coupon);
        if (i > 0){
            return DataResult.build(200,"优惠券新增成功");
        } else {
            return DataResult.build(500,"优惠券新增失败");
        }
    }

    @Override
    public DataResult findCoupon(Coupon coupon) {
        Map map = new HashMap();
        map.put("couponId",coupon.getCouponId());
        map.put("couponName",coupon.getCouponName());
        map.put("zdje",coupon.getCouponZdje());
        map.put("yhzk",coupon.getCouponYhzk());
        map.put("memberLevel",coupon.getMemberLevel());
        map.put("ordersPrice",coupon.getOrdersPrice());
        map.put("couponNum",coupon.getCouponNum());
        map.put("item",coupon.getItem());
        map.put("startTime",coupon.getCouponStartTime());
        map.put("endTime",coupon.getCouponEndTime());
        map.put("couponStatus",coupon.getCouponStatus());
        map.put("couponCreateDate",coupon.getCouponCreateDate());
        map.put("couponUpdateDate",coupon.getCouponUpdateDate());
        map.put("couponDesc",coupon.getCouponDesc());
        List<Coupon> couponList = couponMapper.findCoupon(map);
        return DataResult.ok(couponList);
    }

    @Override
    public DataResult updateCoupon(Coupon coupon) {
        coupon.setCouponUpdateDate(new Date());
        int i = couponMapper.updateByPrimaryKeySelective(coupon);
        if (i > 0){
            return DataResult.build(200,"优惠券更新成功");
        } else {
            return DataResult.build(500,"优惠券更新失败，请重试");
        }
    }
}
