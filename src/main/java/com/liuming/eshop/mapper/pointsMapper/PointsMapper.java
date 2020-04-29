package com.liuming.eshop.mapper.pointsMapper;

import com.liuming.eshop.entity.pointsEntity.Points;
import com.liuming.eshop.entity.pointsEntity.PointsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PointsMapper {
    int countByExample(PointsExample example);

    int deleteByExample(PointsExample example);

    int deleteByPrimaryKey(String pointsId);

    int insert(Points record);

    int insertSelective(Points record);

    List<Points> selectByExample(PointsExample example);

    Points selectByPrimaryKey(String pointsId);

    int updateByExampleSelective(@Param("record") Points record, @Param("example") PointsExample example);

    int updateByExample(@Param("record") Points record, @Param("example") PointsExample example);

    int updateByPrimaryKeySelective(Points record);

    int updateByPrimaryKey(Points record);

    List<Points> findPointsDetailsByidAndtoDays(@Param("format") String format);

    List<Points> findPoints();
}