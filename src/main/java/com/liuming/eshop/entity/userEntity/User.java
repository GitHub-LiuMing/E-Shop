package com.liuming.eshop.entity.userEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userId;

    private String userName;

    private Integer userType;

    private Integer gender;

    private Date birthdate;

    private String idNo;

    private String wechatName;

    private String wechatOpenId;

    private String phone;

    private String headPortraitUrl;

    private String password;

    private String province;

    private String city;

    private String district;

    private String addressDesc;

    private Integer certification;

    private Integer status;

    private Date createdDate;

    private Date updatedDate;

    private Date deletedDate;
}