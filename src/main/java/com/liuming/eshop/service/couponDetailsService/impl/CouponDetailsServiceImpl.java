package com.liuming.eshop.service.couponDetailsService.impl;

import com.liuming.eshop.entity.couponDetailsEntity.CouponDetails;
import com.liuming.eshop.mapper.couponDetailsMapper.CouponDetailsMapper;
import com.liuming.eshop.service.couponDetailsService.CouponDetailsService;
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
 * @ClassName CouponDetailsServiceImpl
 * @Author 鲸落
 * @date 2020.01.13 16:49
 */
@Service
public class CouponDetailsServiceImpl implements CouponDetailsService {
    @Resource
    private CouponDetailsMapper couponDetailsMapper;

    @Override
    public DataResult addCouponDetails(CouponDetails couponDetails) {
        couponDetails.setCouponDetailsId(IDUtils.getId());
        couponDetails.setCouponDetailsCreateDate(new Date());
        couponDetails.setCouponDetailsUpdateDate(new Date());
        int i = couponDetailsMapper.insertSelective(couponDetails);
        if (i > 0){
            return DataResult.build(200,"优惠券新增成功");
        } else {
            return DataResult.build(500,"优惠券新增失败");
        }
    }

    @Override
    public DataResult findCouponDetails(CouponDetails couponDetails) {
        Map map = new HashMap();
        map.put("couponDetailsId",couponDetails.getCouponDetailsId());
        map.put("couponId",couponDetails.getCouponId());
        map.put("memberId",couponDetails.getMemberId());
        map.put("couponStartTime",couponDetails.getCouponStartTime());
        map.put("couponEndTime",couponDetails.getCouponEndTime());
        map.put("couponDetailsStatus",couponDetails.getCouponDetailsStatus());
        map.put("couponDetailsCreateDate",couponDetails.getCouponDetailsCreateDate());
        map.put("couponDetailsUpdateDate",couponDetails.getCouponDetailsUpdateDate());
        List<CouponDetails> couponDetailsList = couponDetailsMapper.findCouponDetails(map);
        return DataResult.ok(couponDetailsList);
    }

    @Override
    public DataResult updateCouponDetails(CouponDetails couponDetails) {
        couponDetails.setCouponDetailsUpdateDate(new Date());
        int i = couponDetailsMapper.updateByPrimaryKeySelective(couponDetails);
        if (i > 0){
            return DataResult.build(200,"优惠券详情更新成功");
        } else {
            return DataResult.build(500,"优惠券详情更新失败");
        }
    }
}
