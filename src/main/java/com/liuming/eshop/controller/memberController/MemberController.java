package com.liuming.eshop.controller.memberController;

import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.service.memberService.MemberService;
import com.liuming.eshop.utils.DataResult;
import com.sun.xml.internal.bind.v2.TODO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 会员
 * @ClassName MemberController
 * @Author 鲸落
 * @date 2019.12.12 15:00
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberService memberService;

    /**
     * @Description 新增会员
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.14 09:26
     */
    @RequestMapping("/addMember")
    public DataResult addMember(Member member){
        if (StringUtils.isNotBlank(member.getPreMemberId()) && StringUtils.isNotBlank(member.getPreMemberName()) && StringUtils.isNotBlank(member.getPreMemberPhone()) && StringUtils.isNotBlank(member.getPreMemberLevelId()) && StringUtils.isNotBlank(member.getPreMemberLevelName())){
            //上级信息必须有
            if (StringUtils.isNotBlank(member.getMemberLevelId()) && StringUtils.isNotBlank(member.getMemberLevelName())){
                //会员等级信息获取失败
                if (StringUtils.isNotBlank(member.getMemberName()) && member.getMemberType() != null && StringUtils.isNotBlank(member.getMemberWechatName()) && StringUtils.isNotBlank(member.getMemberWechatOpenId())){
                    return memberService.addMember(member);
                } else {
                    return DataResult.build(500,"会员个人信息获取失败");
                }
            } else {
                return DataResult.build(500,"会员等级获取信息失败");
            }
        } else {
            return DataResult.build(500,"上级信息获取失败，请重试");
        }
    }

    /**
     * @Description 查询会员
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.14 10:55
     */
    @RequestMapping("/findMember")
    public DataResult findMember(Member member){
        return memberService.findMember(member);
    }

    @RequestMapping("/importExportMember")
    public DataResult importExportMember(){
        // TODO: 2019/12/14 导入导出会员还没有做
        return null;
    }
}
