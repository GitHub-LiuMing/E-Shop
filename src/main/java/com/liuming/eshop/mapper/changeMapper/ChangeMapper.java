package com.liuming.eshop.mapper.changeMapper;

import com.liuming.eshop.entity.changeEntity.Change;
import com.liuming.eshop.entity.changeEntity.ChangeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChangeMapper {
    int countByExample(ChangeExample example);

    int deleteByExample(ChangeExample example);

    int deleteByPrimaryKey(String changeId);

    int insert(Change record);

    int insertSelective(Change record);

    List<Change> selectByExample(ChangeExample example);

    Change selectByPrimaryKey(String changeId);

    int updateByExampleSelective(@Param("record") Change record, @Param("example") ChangeExample example);

    int updateByExample(@Param("record") Change record, @Param("example") ChangeExample example);

    int updateByPrimaryKeySelective(Change record);

    int updateByPrimaryKey(Change record);

    List<Change> findChange(@Param("map") Map map);
}