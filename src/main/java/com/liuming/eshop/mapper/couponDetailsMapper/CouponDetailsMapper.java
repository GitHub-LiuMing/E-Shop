package com.liuming.eshop.mapper.couponDetailsMapper;

import com.liuming.eshop.entity.couponDetailsEntity.CouponDetails;
import com.liuming.eshop.entity.couponDetailsEntity.CouponDetailsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CouponDetailsMapper {
    int countByExample(CouponDetailsExample example);

    int deleteByExample(CouponDetailsExample example);

    int deleteByPrimaryKey(String couponDetailsId);

    int insert(CouponDetails record);

    int insertSelective(CouponDetails record);

    List<CouponDetails> selectByExample(CouponDetailsExample example);

    CouponDetails selectByPrimaryKey(String couponDetailsId);

    int updateByExampleSelective(@Param("record") CouponDetails record, @Param("example") CouponDetailsExample example);

    int updateByExample(@Param("record") CouponDetails record, @Param("example") CouponDetailsExample example);

    int updateByPrimaryKeySelective(CouponDetails record);

    int updateByPrimaryKey(CouponDetails record);

    List<CouponDetails> findCouponDetails(@Param("map") Map map);
}