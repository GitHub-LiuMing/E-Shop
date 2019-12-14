package com.liuming.eshop.entity.memberEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private String memberId;

    private String memberLevelId;

    private String memberLevelName;

    private String memberName;

    private Integer memberType;

    private Integer memberGender;

    private Date memberBirthdate;

    private String memberIdNo;

    private String memberWechatOpenId;

    private String memberWechatName;

    private String memberPhone;

    private String memberHeadPortraitUrl;

    private String memberPassword;

    private String memberSalt;

    private String memberProvince;

    private String memberCity;

    private String memberDistrict;

    private String memberAddressDesc;

    private Integer memberCertification;

    private Integer memberStatus;

    private String preMemberId;

    private String preMemberName;

    private String preMemberPhone;

    private String preMemberLevelId;

    private String preMemberLevelName;

    private Date memberCreatedDate;

    private Date memberUpdatedDate;
}