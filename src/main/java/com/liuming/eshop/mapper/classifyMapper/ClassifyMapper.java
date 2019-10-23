package com.liuming.eshop.mapper.classifyMapper;

import com.liuming.eshop.entity.classifyEntity.Classify;
import com.liuming.eshop.entity.classifyEntity.ClassifyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ClassifyMapper {
    int countByExample(ClassifyExample example);

    int deleteByExample(ClassifyExample example);

    int deleteByPrimaryKey(String classifyId);

    int insert(Classify record);

    int insertSelective(Classify record);

    List<Classify> selectByExampleWithBLOBs(ClassifyExample example);

    List<Classify> selectByExample(ClassifyExample example);

    Classify selectByPrimaryKey(String classifyId);

    int updateByExampleSelective(@Param("record") Classify record, @Param("example") ClassifyExample example);

    int updateByExampleWithBLOBs(@Param("record") Classify record, @Param("example") ClassifyExample example);

    int updateByExample(@Param("record") Classify record, @Param("example") ClassifyExample example);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKeyWithBLOBs(Classify record);

    int updateByPrimaryKey(Classify record);

    List<Classify> findClassify();
}