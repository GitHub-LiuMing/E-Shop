package com.liuming.eshop.mapper.memberMapper;

import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.entity.memberEntity.MemberExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    List<Member> findMember(@Param("map") Map map);

    int updateMemberPassword(@Param("map") Map map);

    Member findMemberByOpenId(@Param("openId") String openId);

    int updateMember(@Param("map") Map map);
}