package com.liuming.eshop.service.memberService.impl;

import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.service.memberService.MemberService;
import com.liuming.eshop.utils.BCrypt;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

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
        if (i > 0) {
            return DataResult.build(200, "会员加入成功");
        } else {
            return DataResult.build(500, "会员加入失败，请重试");
        }
    }

    @Override
    public DataResult findMember(Member member) {
        Map map = new HashMap();
        map.put("memberId", member.getMemberId());
        map.put("memberName", member.getMemberName());
        map.put("memberType", member.getMemberType());
        map.put("memberGender", member.getMemberGender());
        map.put("memberBirthdate", member.getMemberBirthdate());
        map.put("memberIdNo", member.getMemberIdNo());
        map.put("memberWechatOpenId", member.getMemberWechatOpenId());
        map.put("memberWechatName", member.getMemberWechatName());
        map.put("memberPhone", member.getMemberPhone());
        map.put("memberHeadPortraitUrl", member.getMemberHeadPortraitUrl());
        //密码不能用作解析数据，无法加密和解密，所以该接口无法对密码这个参数进行查询
        //map.put("memberPassword",BCrypt.checkpw(member.getMemberPassword()));
        map.put("memberSalt", member.getMemberSalt());
        map.put("memberProvinceCode", member.getMemberProvinceCode());
        map.put("memberProvinceName", member.getMemberProvinceName());
        map.put("memberCityCode", member.getMemberCityCode());
        map.put("memberCityName", member.getMemberCityName());
        map.put("memberDistrictCode", member.getMemberDistrictCode());
        map.put("memberDistrictName", member.getMemberDistrictName());
        map.put("memberAddressDesc", member.getMemberAddressDesc());
        map.put("memberCertification", member.getMemberCertification());
        map.put("memberStatus", member.getMemberStatus());
        map.put("preMemberId", member.getPreMemberId());
        map.put("preMemberName", member.getPreMemberName());
        map.put("preMemberPhone", member.getPreMemberPhone());
        map.put("memberCreatedDate", member.getMemberCreatedDate());
        map.put("memberUpdatedDate", member.getMemberUpdatedDate());
        List<Member> memberList = memberMapper.findMember(map);
        return DataResult.ok(memberList);
    }

    @Override
    public DataResult login(Member member) {
        member.setMemberId(IDUtils.getId());
        member.setMemberPassword(BCrypt.hashpw(member.getMemberPassword(), BCrypt.gensalt()));
        member.setMemberCreatedDate(new Date());
        member.setMemberUpdatedDate(new Date());
        member.setMemberProvinceCode(27);
        member.setMemberProvinceName("陕西省");
        member.setMemberCityCode(309);
        member.setMemberCityName("西安市");
        member.setMemberDistrictCode(2492);
        member.setMemberDistrictName("雁塔区");
        member.setPreMemberId("123");
        int i = memberMapper.insertSelective(member);
        if (i > 0) {
            return DataResult.build(200, "会员加入成功");
        } else {
            return DataResult.build(500, "会员加入失败，请重试");
        }
    }

    @Override
    public DataResult findMemberPassword(Member member) {
        Map map = new HashMap();
        map.put("memberPhone", member.getMemberPhone());
        List<Member> memberList = memberMapper.findMember(map);
        if (memberList.size() > 0) {
            return DataResult.ok(memberList);
            /*boolean checkpw = BCrypt.checkpw(member.getMemberPassword(), memberList.get(0).getMemberPassword());
            if (checkpw){
                return DataResult.ok(memberList);
            } else {
                return DataResult.build(500,"该会员信息不符");
            }*/
        } else {
            return DataResult.build(500, "该用户不存在");
        }
    }

    @Override
    public DataResult updateMemberPassword(Member member) {
        Map map = new HashMap();
        map.put("memberPhone", member.getMemberPhone());
        map.put("memberPassword", BCrypt.hashpw(member.getMemberPassword(), BCrypt.gensalt()));
        int i = memberMapper.updateMemberPassword(map);
        if (i > 0) {
            return DataResult.build(200, "密码更新成功");
        } else {
            return DataResult.build(500, "密码更新失败，请重试");
        }
    }

    @Override
    public DataResult updateMember(Member member) {
        Map map = new HashMap();
        map.put("memberId", member.getMemberId());
        map.put("memberType", member.getMemberType());
        map.put("memberStatus", member.getMemberStatus());
        map.put("memberUpdatedDate", new Date());
        int i = memberMapper.updateMember(map);
        if (i > 0) {
            return DataResult.build(200, "会员信息更新成功");
        } else {
            return DataResult.build(500, "会员信息更新失败，请重试");
        }
    }

    @Override
    public DataResult findMemberById1(String memberId) {
        Map map = new HashMap();
        map.put("preMemberId",memberId);
        List<Member> member = memberMapper.findMember(map);
        return DataResult.ok(member);
    }

    @Override
    public DataResult findMemberById2(String memberId) {
        List<Member> memberList = new ArrayList<>();
        Map map = new HashMap();
        map.put("preMemberId",memberId);
        List<Member> member = memberMapper.findMember(map);
        if (member.size() > 0){
            for (Member member1 : member) {
                map.put("preMemberId",member1.getMemberId());
                List<Member> member2 = memberMapper.findMember(map);
                if (member2.size() > 0){
                    for (int i = 0; i < member2.size(); i++) {
                        memberList.add(member2.get(i));
                    }
                }
            }
        }
        return DataResult.ok(memberList);
    }
}
