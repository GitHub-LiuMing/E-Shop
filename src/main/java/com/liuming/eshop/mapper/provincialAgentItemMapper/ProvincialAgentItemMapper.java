package com.liuming.eshop.mapper.provincialAgentItemMapper;

import com.liuming.eshop.entity.provincialAgentItemEntity.ProvincialAgentItem;
import com.liuming.eshop.entity.provincialAgentItemEntity.ProvincialAgentItemExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProvincialAgentItemMapper {
    int countByExample(ProvincialAgentItemExample example);

    int deleteByExample(ProvincialAgentItemExample example);

    int deleteByPrimaryKey(String provincialAgentItemId);

    int insert(ProvincialAgentItem record);

    int insertSelective(ProvincialAgentItem record);

    List<ProvincialAgentItem> selectByExampleWithBLOBs(ProvincialAgentItemExample example);

    List<ProvincialAgentItem> selectByExample(ProvincialAgentItemExample example);

    ProvincialAgentItem selectByPrimaryKey(String provincialAgentItemId);

    int updateByExampleSelective(@Param("record") ProvincialAgentItem record, @Param("example") ProvincialAgentItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ProvincialAgentItem record, @Param("example") ProvincialAgentItemExample example);

    int updateByExample(@Param("record") ProvincialAgentItem record, @Param("example") ProvincialAgentItemExample example);

    int updateByPrimaryKeySelective(ProvincialAgentItem record);

    int updateByPrimaryKeyWithBLOBs(ProvincialAgentItem record);

    int updateByPrimaryKey(ProvincialAgentItem record);

    List<ProvincialAgentItem> findProvincialAgentItem(@Param("map") Map map);

    int updateProvincialAgentItem(@Param("map") Map map);
}