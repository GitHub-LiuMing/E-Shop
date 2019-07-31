package com.liuming.eshop.entity.cityEntity;

import lombok.Data;

import java.util.Date;

@Data
public class City {
    private Integer cityId;

    private String provinceCode;

    private String cityCode;

    private String cityName;

    private String shortName;

    private String lng;

    private String lat;

    private Integer sort;

    private Date gmtCreate;

    private Date gmtModified;

    private String memo;

    private Integer dataState;
}