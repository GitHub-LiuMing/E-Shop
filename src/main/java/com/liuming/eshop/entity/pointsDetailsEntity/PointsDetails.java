package com.liuming.eshop.entity.pointsDetailsEntity;

import lombok.Data;

import java.util.Date;

@Data
public class PointsDetails {
    private String pointsDetailsId;

    private String userId;

    private String wechatName;

    private String phone;

    private Integer beforeModifyPoints;

    private Integer modifyPoints;

    private Integer afterModifyPoints;

    private Integer pointsDetailsType;

    private String pointsDetailsDetails;

    private Integer pointsDetailsStatus;

    private String remark;

    private Date pointsDetailsCreatedDate;

    private Date pointsDetailsUpdatedDate;
}