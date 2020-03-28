package com.liuming.eshop.entity.memberDistributionAddressEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDistributionAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberDistributionAddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMemberDistributionAddressIdIsNull() {
            addCriterion("member_distribution_address_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdIsNotNull() {
            addCriterion("member_distribution_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdEqualTo(String value) {
            addCriterion("member_distribution_address_id =", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdNotEqualTo(String value) {
            addCriterion("member_distribution_address_id <>", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdGreaterThan(String value) {
            addCriterion("member_distribution_address_id >", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_distribution_address_id >=", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdLessThan(String value) {
            addCriterion("member_distribution_address_id <", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdLessThanOrEqualTo(String value) {
            addCriterion("member_distribution_address_id <=", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdLike(String value) {
            addCriterion("member_distribution_address_id like", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdNotLike(String value) {
            addCriterion("member_distribution_address_id not like", value, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdIn(List<String> values) {
            addCriterion("member_distribution_address_id in", values, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdNotIn(List<String> values) {
            addCriterion("member_distribution_address_id not in", values, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdBetween(String value1, String value2) {
            addCriterion("member_distribution_address_id between", value1, value2, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressIdNotBetween(String value1, String value2) {
            addCriterion("member_distribution_address_id not between", value1, value2, "memberDistributionAddressId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(Integer value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(Integer value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(Integer value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(Integer value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<Integer> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<Integer> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(Integer value1, Integer value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(Integer value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(Integer value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(Integer value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(Integer value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<Integer> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<Integer> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(Integer value1, Integer value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNull() {
            addCriterion("district_code is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNotNull() {
            addCriterion("district_code is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeEqualTo(Integer value) {
            addCriterion("district_code =", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotEqualTo(Integer value) {
            addCriterion("district_code <>", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThan(Integer value) {
            addCriterion("district_code >", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_code >=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThan(Integer value) {
            addCriterion("district_code <", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThanOrEqualTo(Integer value) {
            addCriterion("district_code <=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIn(List<Integer> values) {
            addCriterion("district_code in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotIn(List<Integer> values) {
            addCriterion("district_code not in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeBetween(Integer value1, Integer value2) {
            addCriterion("district_code between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("district_code not between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNull() {
            addCriterion("district_name is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNotNull() {
            addCriterion("district_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameEqualTo(String value) {
            addCriterion("district_name =", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotEqualTo(String value) {
            addCriterion("district_name <>", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThan(String value) {
            addCriterion("district_name >", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("district_name >=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThan(String value) {
            addCriterion("district_name <", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("district_name <=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLike(String value) {
            addCriterion("district_name like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotLike(String value) {
            addCriterion("district_name not like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIn(List<String> values) {
            addCriterion("district_name in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotIn(List<String> values) {
            addCriterion("district_name not in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameBetween(String value1, String value2) {
            addCriterion("district_name between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotBetween(String value1, String value2) {
            addCriterion("district_name not between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNull() {
            addCriterion("detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("detailed_address =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("detailed_address <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("detailed_address >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_address >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("detailed_address <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("detailed_address <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("detailed_address like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("detailed_address not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("detailed_address in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("detailed_address not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("detailed_address between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("detailed_address not between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusIsNull() {
            addCriterion("default_address_status is null");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusIsNotNull() {
            addCriterion("default_address_status is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusEqualTo(Integer value) {
            addCriterion("default_address_status =", value, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusNotEqualTo(Integer value) {
            addCriterion("default_address_status <>", value, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusGreaterThan(Integer value) {
            addCriterion("default_address_status >", value, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_address_status >=", value, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusLessThan(Integer value) {
            addCriterion("default_address_status <", value, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusLessThanOrEqualTo(Integer value) {
            addCriterion("default_address_status <=", value, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusIn(List<Integer> values) {
            addCriterion("default_address_status in", values, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusNotIn(List<Integer> values) {
            addCriterion("default_address_status not in", values, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusBetween(Integer value1, Integer value2) {
            addCriterion("default_address_status between", value1, value2, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultAddressStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("default_address_status not between", value1, value2, "defaultAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusIsNull() {
            addCriterion("member_distribution_address_status is null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusIsNotNull() {
            addCriterion("member_distribution_address_status is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusEqualTo(Integer value) {
            addCriterion("member_distribution_address_status =", value, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusNotEqualTo(Integer value) {
            addCriterion("member_distribution_address_status <>", value, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusGreaterThan(Integer value) {
            addCriterion("member_distribution_address_status >", value, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_distribution_address_status >=", value, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusLessThan(Integer value) {
            addCriterion("member_distribution_address_status <", value, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusLessThanOrEqualTo(Integer value) {
            addCriterion("member_distribution_address_status <=", value, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusIn(List<Integer> values) {
            addCriterion("member_distribution_address_status in", values, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusNotIn(List<Integer> values) {
            addCriterion("member_distribution_address_status not in", values, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusBetween(Integer value1, Integer value2) {
            addCriterion("member_distribution_address_status between", value1, value2, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("member_distribution_address_status not between", value1, value2, "memberDistributionAddressStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateIsNull() {
            addCriterion("member_distribution_address_created_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateIsNotNull() {
            addCriterion("member_distribution_address_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateEqualTo(Date value) {
            addCriterion("member_distribution_address_created_date =", value, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateNotEqualTo(Date value) {
            addCriterion("member_distribution_address_created_date <>", value, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateGreaterThan(Date value) {
            addCriterion("member_distribution_address_created_date >", value, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_distribution_address_created_date >=", value, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateLessThan(Date value) {
            addCriterion("member_distribution_address_created_date <", value, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("member_distribution_address_created_date <=", value, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateIn(List<Date> values) {
            addCriterion("member_distribution_address_created_date in", values, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateNotIn(List<Date> values) {
            addCriterion("member_distribution_address_created_date not in", values, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateBetween(Date value1, Date value2) {
            addCriterion("member_distribution_address_created_date between", value1, value2, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("member_distribution_address_created_date not between", value1, value2, "memberDistributionAddressCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateIsNull() {
            addCriterion("member_distribution_address_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateIsNotNull() {
            addCriterion("member_distribution_address_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateEqualTo(Date value) {
            addCriterion("member_distribution_address_updated_date =", value, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateNotEqualTo(Date value) {
            addCriterion("member_distribution_address_updated_date <>", value, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateGreaterThan(Date value) {
            addCriterion("member_distribution_address_updated_date >", value, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_distribution_address_updated_date >=", value, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateLessThan(Date value) {
            addCriterion("member_distribution_address_updated_date <", value, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("member_distribution_address_updated_date <=", value, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateIn(List<Date> values) {
            addCriterion("member_distribution_address_updated_date in", values, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateNotIn(List<Date> values) {
            addCriterion("member_distribution_address_updated_date not in", values, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("member_distribution_address_updated_date between", value1, value2, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberDistributionAddressUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("member_distribution_address_updated_date not between", value1, value2, "memberDistributionAddressUpdatedDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}