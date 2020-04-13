package com.liuming.eshop.entity.userEntity;

import com.lkx.util.Excel;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    @Excel(title = "ID")
    private String userId;

    @Excel(title = "姓名")
    private String userName;

    @Excel(title = "密码")
    private String userPassword;

    private String userHeadImgUrl;

    private Integer userType;

    private Integer userStatus;

    @Excel(title = "新增时间")
    private Date userCreateDate;

    @Excel(title = "修改时间")
    private Date userUpdateDate;
}