package com.liuming.eshop.entity.districtEntity;

import lombok.Data;

import java.util.Date;

@Data
public class District {
    private Integer districtId;

    private String cityCode;

    private String districtCode;

    private String districtName;

    private String shortName;

    private String lng;

    private String lat;

    private Integer sort;

    private Date gmtCreate;

    private Date gmtModified;

    private String memo;

    private Integer dataState;
}