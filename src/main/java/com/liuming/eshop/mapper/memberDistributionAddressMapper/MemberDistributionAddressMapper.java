package com.liuming.eshop.mapper.memberDistributionAddressMapper;

import com.liuming.eshop.entity.memberDistributionAddressEntity.MemberDistributionAddress;
import com.liuming.eshop.entity.memberDistributionAddressEntity.MemberDistributionAddressExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberDistributionAddressMapper {
    int countByExample(MemberDistributionAddressExample example);

    int deleteByExample(MemberDistributionAddressExample example);

    int deleteByPrimaryKey(String memberDistributionAddressId);

    int insert(MemberDistributionAddress record);

    int insertSelective(MemberDistributionAddress record);

    List<MemberDistributionAddress> selectByExample(MemberDistributionAddressExample example);

    MemberDistributionAddress selectByPrimaryKey(String memberDistributionAddressId);

    int updateByExampleSelective(@Param("record") MemberDistributionAddress record, @Param("example") MemberDistributionAddressExample example);

    int updateByExample(@Param("record") MemberDistributionAddress record, @Param("example") MemberDistributionAddressExample example);

    int updateByPrimaryKeySelective(MemberDistributionAddress record);

    int updateByPrimaryKey(MemberDistributionAddress record);

    List<MemberDistributionAddress> findMemberDistributionAddress(@Param("map") Map map);

    int updateDefaultAddressStatusByMemberId(String memberId);
}