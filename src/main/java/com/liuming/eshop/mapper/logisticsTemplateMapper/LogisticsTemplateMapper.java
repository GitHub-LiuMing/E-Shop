package com.liuming.eshop.mapper.logisticsTemplateMapper;

import com.liuming.eshop.entity.logisticsTemplateEntity.LogisticsTemplate;
import com.liuming.eshop.entity.logisticsTemplateEntity.LogisticsTemplateExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogisticsTemplateMapper {
    int countByExample(LogisticsTemplateExample example);

    int deleteByExample(LogisticsTemplateExample example);

    int deleteByPrimaryKey(String logisticsTemplateId);

    int insert(LogisticsTemplate record);

    int insertSelective(LogisticsTemplate record);

    List<LogisticsTemplate> selectByExample(LogisticsTemplateExample example);

    LogisticsTemplate selectByPrimaryKey(String logisticsTemplateId);

    int updateByExampleSelective(@Param("record") LogisticsTemplate record, @Param("example") LogisticsTemplateExample example);

    int updateByExample(@Param("record") LogisticsTemplate record, @Param("example") LogisticsTemplateExample example);

    int updateByPrimaryKeySelective(LogisticsTemplate record);

    int updateByPrimaryKey(LogisticsTemplate record);

    List<LogisticsTemplate> findLogisticsTemplate(@Param("map") Map map);
}