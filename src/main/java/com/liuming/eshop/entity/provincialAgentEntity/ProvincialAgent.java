package com.liuming.eshop.entity.provincialAgentEntity;

import lombok.Data;

import java.util.Date;

@Data
public class ProvincialAgent {
    private String provincialAgentId;

    private String provincialAgentName;

    private Integer provinceCode;

    private String memberId;

    private String memberName;

    private Integer provincialAgentStatus;

    private Date provincialAgentCreatedDate;

    private Date provincialAgentUpdatedDate;
}