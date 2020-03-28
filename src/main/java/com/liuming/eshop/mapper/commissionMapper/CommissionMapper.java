package com.liuming.eshop.mapper.commissionMapper;

import com.liuming.eshop.entity.commissionEntity.Commission;
import com.liuming.eshop.entity.commissionEntity.CommissionExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommissionMapper {
    int countByExample(CommissionExample example);

    int deleteByExample(CommissionExample example);

    int deleteByPrimaryKey(String commissionId);

    int insert(Commission record);

    int insertSelective(Commission record);

    List<Commission> selectByExample(CommissionExample example);

    Commission selectByPrimaryKey(String commissionId);

    int updateByExampleSelective(@Param("record") Commission record, @Param("example") CommissionExample example);

    int updateByExample(@Param("record") Commission record, @Param("example") CommissionExample example);

    int updateByPrimaryKeySelective(Commission record);

    int updateByPrimaryKey(Commission record);

    List<Commission> findCommission(@Param("map") Map map);
}