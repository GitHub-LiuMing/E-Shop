package com.liuming.eshop.mapper.memberLevelMapper;

import com.liuming.eshop.entity.memberLevelEntity.MemberLevel;
import com.liuming.eshop.entity.memberLevelEntity.MemberLevelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MemberLevelMapper {
    int countByExample(MemberLevelExample example);

    int deleteByExample(MemberLevelExample example);

    int deleteByPrimaryKey(String memberLevelId);

    int insert(MemberLevel record);

    int insertSelective(MemberLevel record);

    List<MemberLevel> selectByExample(MemberLevelExample example);

    MemberLevel selectByPrimaryKey(String memberLevelId);

    int updateByExampleSelective(@Param("record") MemberLevel record, @Param("example") MemberLevelExample example);

    int updateByExample(@Param("record") MemberLevel record, @Param("example") MemberLevelExample example);

    int updateByPrimaryKeySelective(MemberLevel record);

    int updateByPrimaryKey(MemberLevel record);

    List<MemberLevel> findMemberLevelAll();
}