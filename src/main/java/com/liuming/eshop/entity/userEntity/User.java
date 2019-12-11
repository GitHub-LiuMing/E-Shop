package com.liuming.eshop.entity.userEntity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String userId;

    private String userName;

    private String userPassword;

    private String userHeadImgUrl;

    private Integer userType;

    private Integer userStatus;

    private Date userCreateDate;

    private Date userUpdateDate;
}