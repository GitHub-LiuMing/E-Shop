package com.liuming.eshop.entity.memberEntity;

import com.lkx.util.Excel;
import lombok.Data;

import java.util.Date;

@Data
public class Member {
    @Excel(title = "会员ID")
    private String memberId;

    private String memberLevelId;

    private String memberLevelName;

    @Excel(title = "会员名")
    private String memberName;

    @Excel(title = "会员类型 0-省代 1-代理商 （3999） 2-至尊会员 （直推3名VIP会员） 3-VIP会员 （推荐10名高级会员） 4-高级会员 （399） 5-会员（39.9） 6-普通会员（没有任何支付）")
    private Integer memberType;

    private Integer memberGender;

    private Date memberBirthdate;

    private String memberIdNo;

    @Excel(title = "微信号")
    private String memberWechatOpenId;

    @Excel(title = "微信名称")
    private String memberWechatName;

    @Excel(title = "手机号码")
    private String memberPhone;

    private String memberHeadPortraitUrl;

    private String memberPassword;

    private String memberSalt;

    private Integer memberProvinceCode;

    private String memberProvinceName;

    private Integer memberCityCode;

    private String memberCityName;

    private Integer memberDistrictCode;

    private String memberDistrictName;

    private String memberAddressDesc;

    private Integer memberCertification;

    private Integer memberStatus;

    @Excel(title = "上级会员ID")
    private String preMemberId;

    private String preMemberName;

    private String preMemberPhone;

    private String preMemberLevelId;

    private String preMemberLevelName;

    @Excel(title = "创建时间")
    private Date memberCreatedDate;

    private Date memberUpdatedDate;
}