package com.liuming.eshop.entity.changeEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Change {
    private String changeId;

    private String memberId;

    private Double changePrice;

    private Integer changeType;

    private Integer changeStatus;

    private Date changeCreateDate;

    private Date changeUpdateDate;
}