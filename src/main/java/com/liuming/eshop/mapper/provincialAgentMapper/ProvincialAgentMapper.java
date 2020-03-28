package com.liuming.eshop.mapper.provincialAgentMapper;

import com.liuming.eshop.entity.provincialAgentEntity.ProvincialAgent;
import com.liuming.eshop.entity.provincialAgentEntity.ProvincialAgentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProvincialAgentMapper {
    int countByExample(ProvincialAgentExample example);

    int deleteByExample(ProvincialAgentExample example);

    int deleteByPrimaryKey(String provincialAgentId);

    int insert(ProvincialAgent record);

    int insertSelective(ProvincialAgent record);

    List<ProvincialAgent> selectByExample(ProvincialAgentExample example);

    ProvincialAgent selectByPrimaryKey(String provincialAgentId);

    int updateByExampleSelective(@Param("record") ProvincialAgent record, @Param("example") ProvincialAgentExample example);

    int updateByExample(@Param("record") ProvincialAgent record, @Param("example") ProvincialAgentExample example);

    int updateByPrimaryKeySelective(ProvincialAgent record);

    int updateByPrimaryKey(ProvincialAgent record);

    List<ProvincialAgent> findProvincialAgent(@Param("map") Map map);
}