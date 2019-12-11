package com.liuming.eshop.entity.memberLevelEntity;

import java.util.Date;

public class MemberLevel {
    private String memberLevelId;

    private String memberLevelName;

    private Integer memberLevelTransactionsLimit;

    private String memberLevelItem;

    private Integer memberLevelItemRule;

    private Double memberLevelDiscount;

    private Double memberLevelPoints;

    private Integer memberLevelStatus;

    private Date memberLevelCreatedDate;

    private Date memberLevelUpdatedDate;

    private Date memberLevelDeletedDate;

    public String getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(String memberLevelId) {
        this.memberLevelId = memberLevelId == null ? null : memberLevelId.trim();
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
    }

    public Integer getMemberLevelTransactionsLimit() {
        return memberLevelTransactionsLimit;
    }

    public void setMemberLevelTransactionsLimit(Integer memberLevelTransactionsLimit) {
        this.memberLevelTransactionsLimit = memberLevelTransactionsLimit;
    }

    public String getMemberLevelItem() {
        return memberLevelItem;
    }

    public void setMemberLevelItem(String memberLevelItem) {
        this.memberLevelItem = memberLevelItem == null ? null : memberLevelItem.trim();
    }

    public Integer getMemberLevelItemRule() {
        return memberLevelItemRule;
    }

    public void setMemberLevelItemRule(Integer memberLevelItemRule) {
        this.memberLevelItemRule = memberLevelItemRule;
    }

    public Double getMemberLevelDiscount() {
        return memberLevelDiscount;
    }

    public void setMemberLevelDiscount(Double memberLevelDiscount) {
        this.memberLevelDiscount = memberLevelDiscount;
    }

    public Double getMemberLevelPoints() {
        return memberLevelPoints;
    }

    public void setMemberLevelPoints(Double memberLevelPoints) {
        this.memberLevelPoints = memberLevelPoints;
    }

    public Integer getMemberLevelStatus() {
        return memberLevelStatus;
    }

    public void setMemberLevelStatus(Integer memberLevelStatus) {
        this.memberLevelStatus = memberLevelStatus;
    }

    public Date getMemberLevelCreatedDate() {
        return memberLevelCreatedDate;
    }

    public void setMemberLevelCreatedDate(Date memberLevelCreatedDate) {
        this.memberLevelCreatedDate = memberLevelCreatedDate;
    }

    public Date getMemberLevelUpdatedDate() {
        return memberLevelUpdatedDate;
    }

    public void setMemberLevelUpdatedDate(Date memberLevelUpdatedDate) {
        this.memberLevelUpdatedDate = memberLevelUpdatedDate;
    }

    public Date getMemberLevelDeletedDate() {
        return memberLevelDeletedDate;
    }

    public void setMemberLevelDeletedDate(Date memberLevelDeletedDate) {
        this.memberLevelDeletedDate = memberLevelDeletedDate;
    }
}