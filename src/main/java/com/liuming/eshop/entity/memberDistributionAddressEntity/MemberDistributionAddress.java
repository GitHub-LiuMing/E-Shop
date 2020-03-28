package com.liuming.eshop.entity.memberDistributionAddressEntity;

import java.util.Date;

public class MemberDistributionAddress {
    private String memberDistributionAddressId;

    private String memberId;

    private String consignee;

    private String phone;

    private Integer provinceCode;

    private String provinceName;

    private Integer cityCode;

    private String cityName;

    private Integer districtCode;

    private String districtName;

    private String detailedAddress;

    private Integer defaultAddressStatus;

    private Integer memberDistributionAddressStatus;

    private Date memberDistributionAddressCreatedDate;

    private Date memberDistributionAddressUpdatedDate;

    public String getMemberDistributionAddressId() {
        return memberDistributionAddressId;
    }

    public void setMemberDistributionAddressId(String memberDistributionAddressId) {
        this.memberDistributionAddressId = memberDistributionAddressId == null ? null : memberDistributionAddressId.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    public Integer getDefaultAddressStatus() {
        return defaultAddressStatus;
    }

    public void setDefaultAddressStatus(Integer defaultAddressStatus) {
        this.defaultAddressStatus = defaultAddressStatus;
    }

    public Integer getMemberDistributionAddressStatus() {
        return memberDistributionAddressStatus;
    }

    public void setMemberDistributionAddressStatus(Integer memberDistributionAddressStatus) {
        this.memberDistributionAddressStatus = memberDistributionAddressStatus;
    }

    public Date getMemberDistributionAddressCreatedDate() {
        return memberDistributionAddressCreatedDate;
    }

    public void setMemberDistributionAddressCreatedDate(Date memberDistributionAddressCreatedDate) {
        this.memberDistributionAddressCreatedDate = memberDistributionAddressCreatedDate;
    }

    public Date getMemberDistributionAddressUpdatedDate() {
        return memberDistributionAddressUpdatedDate;
    }

    public void setMemberDistributionAddressUpdatedDate(Date memberDistributionAddressUpdatedDate) {
        this.memberDistributionAddressUpdatedDate = memberDistributionAddressUpdatedDate;
    }
}