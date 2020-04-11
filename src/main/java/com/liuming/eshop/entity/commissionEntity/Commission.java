package com.liuming.eshop.entity.commissionEntity;

import lombok.Data;

import java.util.Date;

@Data
public class Commission {
    private String commissionId;

    private String commissionName;

    private Double hyHyZtPrice;

    private Double hyGjZtPrice;

    private Double hyDlZtPrice;

    private Double gjHyZtPrice;

    private Double gjHyTdPrice;

    private Double gjHyFgPrice;

    private Double gjGjZtPrice;

    private Double gjGjJtPrice;

    private Double gjDlZtPrice;

    private Double gjDlJtPrice;

    private Double vipHyZtPrice;

    private Double vipHyTdPrice;

    private Double vipHyFgPrice;

    private Double vipGjZtPrice;

    private Double vipGjJtPrice;

    private Double vipGjTdPrice;

    private Double vipDlZtPrice;

    private Double vipDlJtPrice;

    private Double zzHyZtPrice;

    private Double zzHyTdPrice;

    private Double zzHyFgPrice;

    private Double zzGjZtPrice;

    private Double zzGjJtPrice;

    private Double zzGjTdPrice;

    private Double zzGjPjPrice;

    private Double zzDlZtPrice;

    private Double zzDlJtPrice;

    private Double dlHyZtPrice;

    private Double dlHyTdPrice;

    private Double dlHyFgPrice;

    private Double dlGjZtPrice;

    private Double dlGjJtPrice;

    private Double dlDlZtPrice;

    private Double dlDlJtPrice;

    private Integer commissionStatus;

    private Date commissionCreatedDate;

    private Date commissionUpdatedDate;
}