package com.liuming.eshop.entity.classifyEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Classify {
    private String classifyId;

    private String classifyName;

    private String classifyUrl;

    private Integer classifyStatus;

    private Date classifyCreateDate;

    private Date classifyUpdateDate;

    private String classifyDesc;
}