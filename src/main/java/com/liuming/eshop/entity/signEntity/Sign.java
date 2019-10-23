package com.liuming.eshop.entity.signEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Sign {
    private String signId;

    private Integer signRegulation;

    private Integer signPoints;

    private Integer signStatus;

    private Date signCreatedDate;

    private Date signUpdatedDate;
}