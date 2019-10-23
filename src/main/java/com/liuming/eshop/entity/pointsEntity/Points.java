package com.liuming.eshop.entity.pointsEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Points {
    private String pointsId;

    private Integer pointsRegulation;

    private Integer points;

    private Integer pointsStatus;

    private Date pointsCreatedDate;

    private Date pointsUpdatedDate;
}