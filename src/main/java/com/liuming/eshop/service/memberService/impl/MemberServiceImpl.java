package com.liuming.eshop.service.memberService.impl;

import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.service.memberService.MemberService;
import com.liuming.eshop.utils.BCrypt;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName MemberServiceImpl
 * @Author 鲸落
 * @date 2019.12.12 15:01
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    @Override
    public DataResult addMember(Member member) {
        member.setMemberId(IDUtils.getId());
        member.setMemberPassword(BCrypt.hashpw(member.getMemberPassword(), BCrypt.gensalt()));
        member.setMemberCreatedDate(new Date());
        member.setMemberUpdatedDate(new Date());
        int i = memberMapper.insertSelective(member);
        if (i > 0){
            return DataResult.build(200,"会员加入成功");
        } else {
            return DataResult.build(500,"会员加入失败，请重试");
        }
    }

    @Override
    public DataResult findMember(Member member) {
        Map map = new HashMap();
        map.put("memberId",member.getMemberId());
        map.put("memberLevelId",member.getMemberLevelId());
        map.put("memberLevelName",member.getMemberLevelName());
        map.put("memberName",member.getMemberName());
        map.put("memberType",member.getMemberType());
        map.put("memberGender",member.getMemberGender());
        map.put("memberBirthdate",member.getMemberBirthdate());
        map.put("memberIdNo",member.getMemberIdNo());
        map.put("memberWechatOpenId",member.getMemberWechatOpenId());
        map.put("memberWechatName",member.getMemberWechatName());
        map.put("memberPhone",member.getMemberPhone());
        map.put("memberHeadPortraitUrl",member.getMemberHeadPortraitUrl());
        map.put("memberPassword",member.getMemberPassword());
        map.put("memberSalt",member.getMemberSalt());
        map.put("memberProvince",member.getMemberProvince());
        map.put("memberCity",member.getMemberCity());
        map.put("memberDistrict",member.getMemberDistrict());
        map.put("memberAddressDesc",member.getMemberAddressDesc());
        map.put("memberCertification",member.getMemberCertification());
        map.put("memberStatus",member.getMemberStatus());
        map.put("preMemberId",member.getPreMemberId());
        map.put("preMemberName",member.getPreMemberName());
        map.put("preMemberPhone",member.getPreMemberPhone());
        map.put("preMemberLevelId",member.getPreMemberLevelId());
        map.put("preMemberLevelName",member.getPreMemberLevelName());
        map.put("memberCreatedDate",member.getMemberCreatedDate());
        map.put("memberUpdatedDate",member.getMemberUpdatedDate());
        List<Member> memberList = memberMapper.findMember(map);
        return DataResult.ok(memberList);
    }
}
