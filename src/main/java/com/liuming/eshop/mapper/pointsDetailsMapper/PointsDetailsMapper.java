package com.liuming.eshop.mapper.pointsDetailsMapper;

import com.liuming.eshop.entity.pointsDetailsEntity.PointsDetails;
import com.liuming.eshop.entity.pointsDetailsEntity.PointsDetailsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PointsDetailsMapper {
    int countByExample(PointsDetailsExample example);

    int deleteByExample(PointsDetailsExample example);

    int deleteByPrimaryKey(String pointsDetailsId);

    int insert(PointsDetails record);

    int insertSelective(PointsDetails record);

    List<PointsDetails> selectByExample(PointsDetailsExample example);

    PointsDetails selectByPrimaryKey(String pointsDetailsId);

    int updateByExampleSelective(@Param("record") PointsDetails record, @Param("example") PointsDetailsExample example);

    int updateByExample(@Param("record") PointsDetails record, @Param("example") PointsDetailsExample example);

    int updateByPrimaryKeySelective(PointsDetails record);

    int updateByPrimaryKey(PointsDetails record);

    PointsDetails findPointsDetailsDescLimit1(@Param("map") Map pointsDetailsDescLimit1Map);

    List<PointsDetails> findPointsDetails(@Param("map") Map map);
}