package com.liuming.eshop.mapper.couponMapper;

import com.liuming.eshop.entity.couponEntity.Coupon;
import com.liuming.eshop.entity.couponEntity.CouponExample;
import java.util.List;
import java.util.Map;

import com.liuming.eshop.utils.DataResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CouponMapper {
    int countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(String couponId);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    List<Coupon> selectByExampleWithBLOBs(CouponExample example);

    List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKey(String couponId);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExampleWithBLOBs(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKeyWithBLOBs(Coupon record);

    int updateByPrimaryKey(Coupon record);

    List<Coupon> findCoupon(@Param("map") Map map);
}