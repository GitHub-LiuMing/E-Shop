package com.liuming.eshop.entity.memberEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Integer value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Integer value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Integer value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Integer value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Integer> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Integer> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberGenderIsNull() {
            addCriterion("member_gender is null");
            return (Criteria) this;
        }

        public Criteria andMemberGenderIsNotNull() {
            addCriterion("member_gender is not null");
            return (Criteria) this;
        }

        public Criteria andMemberGenderEqualTo(Integer value) {
            addCriterion("member_gender =", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderNotEqualTo(Integer value) {
            addCriterion("member_gender <>", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderGreaterThan(Integer value) {
            addCriterion("member_gender >", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_gender >=", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderLessThan(Integer value) {
            addCriterion("member_gender <", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderLessThanOrEqualTo(Integer value) {
            addCriterion("member_gender <=", value, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderIn(List<Integer> values) {
            addCriterion("member_gender in", values, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderNotIn(List<Integer> values) {
            addCriterion("member_gender not in", values, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderBetween(Integer value1, Integer value2) {
            addCriterion("member_gender between", value1, value2, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("member_gender not between", value1, value2, "memberGender");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateIsNull() {
            addCriterion("member_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateIsNotNull() {
            addCriterion("member_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthdate =", value, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthdate <>", value, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("member_birthdate >", value, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthdate >=", value, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("member_birthdate <", value, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthdate <=", value, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("member_birthdate in", values, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("member_birthdate not in", values, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_birthdate between", value1, value2, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_birthdate not between", value1, value2, "memberBirthdate");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoIsNull() {
            addCriterion("member_id_no is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoIsNotNull() {
            addCriterion("member_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoEqualTo(String value) {
            addCriterion("member_id_no =", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoNotEqualTo(String value) {
            addCriterion("member_id_no <>", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoGreaterThan(String value) {
            addCriterion("member_id_no >", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_no >=", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoLessThan(String value) {
            addCriterion("member_id_no <", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoLessThanOrEqualTo(String value) {
            addCriterion("member_id_no <=", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoLike(String value) {
            addCriterion("member_id_no like", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoNotLike(String value) {
            addCriterion("member_id_no not like", value, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoIn(List<String> values) {
            addCriterion("member_id_no in", values, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoNotIn(List<String> values) {
            addCriterion("member_id_no not in", values, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoBetween(String value1, String value2) {
            addCriterion("member_id_no between", value1, value2, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberIdNoNotBetween(String value1, String value2) {
            addCriterion("member_id_no not between", value1, value2, "memberIdNo");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdIsNull() {
            addCriterion("member_wechat_open_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdIsNotNull() {
            addCriterion("member_wechat_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdEqualTo(String value) {
            addCriterion("member_wechat_open_id =", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdNotEqualTo(String value) {
            addCriterion("member_wechat_open_id <>", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdGreaterThan(String value) {
            addCriterion("member_wechat_open_id >", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_wechat_open_id >=", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdLessThan(String value) {
            addCriterion("member_wechat_open_id <", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdLessThanOrEqualTo(String value) {
            addCriterion("member_wechat_open_id <=", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdLike(String value) {
            addCriterion("member_wechat_open_id like", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdNotLike(String value) {
            addCriterion("member_wechat_open_id not like", value, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdIn(List<String> values) {
            addCriterion("member_wechat_open_id in", values, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdNotIn(List<String> values) {
            addCriterion("member_wechat_open_id not in", values, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdBetween(String value1, String value2) {
            addCriterion("member_wechat_open_id between", value1, value2, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatOpenIdNotBetween(String value1, String value2) {
            addCriterion("member_wechat_open_id not between", value1, value2, "memberWechatOpenId");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameIsNull() {
            addCriterion("member_wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameIsNotNull() {
            addCriterion("member_wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameEqualTo(String value) {
            addCriterion("member_wechat_name =", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameNotEqualTo(String value) {
            addCriterion("member_wechat_name <>", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameGreaterThan(String value) {
            addCriterion("member_wechat_name >", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_wechat_name >=", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameLessThan(String value) {
            addCriterion("member_wechat_name <", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameLessThanOrEqualTo(String value) {
            addCriterion("member_wechat_name <=", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameLike(String value) {
            addCriterion("member_wechat_name like", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameNotLike(String value) {
            addCriterion("member_wechat_name not like", value, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameIn(List<String> values) {
            addCriterion("member_wechat_name in", values, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameNotIn(List<String> values) {
            addCriterion("member_wechat_name not in", values, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameBetween(String value1, String value2) {
            addCriterion("member_wechat_name between", value1, value2, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberWechatNameNotBetween(String value1, String value2) {
            addCriterion("member_wechat_name not between", value1, value2, "memberWechatName");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIsNull() {
            addCriterion("member_phone is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIsNotNull() {
            addCriterion("member_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneEqualTo(String value) {
            addCriterion("member_phone =", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotEqualTo(String value) {
            addCriterion("member_phone <>", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneGreaterThan(String value) {
            addCriterion("member_phone >", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("member_phone >=", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLessThan(String value) {
            addCriterion("member_phone <", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLessThanOrEqualTo(String value) {
            addCriterion("member_phone <=", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLike(String value) {
            addCriterion("member_phone like", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotLike(String value) {
            addCriterion("member_phone not like", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIn(List<String> values) {
            addCriterion("member_phone in", values, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotIn(List<String> values) {
            addCriterion("member_phone not in", values, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneBetween(String value1, String value2) {
            addCriterion("member_phone between", value1, value2, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotBetween(String value1, String value2) {
            addCriterion("member_phone not between", value1, value2, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlIsNull() {
            addCriterion("member_head_portrait_url is null");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlIsNotNull() {
            addCriterion("member_head_portrait_url is not null");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlEqualTo(String value) {
            addCriterion("member_head_portrait_url =", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlNotEqualTo(String value) {
            addCriterion("member_head_portrait_url <>", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlGreaterThan(String value) {
            addCriterion("member_head_portrait_url >", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("member_head_portrait_url >=", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlLessThan(String value) {
            addCriterion("member_head_portrait_url <", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlLessThanOrEqualTo(String value) {
            addCriterion("member_head_portrait_url <=", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlLike(String value) {
            addCriterion("member_head_portrait_url like", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlNotLike(String value) {
            addCriterion("member_head_portrait_url not like", value, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlIn(List<String> values) {
            addCriterion("member_head_portrait_url in", values, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlNotIn(List<String> values) {
            addCriterion("member_head_portrait_url not in", values, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlBetween(String value1, String value2) {
            addCriterion("member_head_portrait_url between", value1, value2, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberHeadPortraitUrlNotBetween(String value1, String value2) {
            addCriterion("member_head_portrait_url not between", value1, value2, "memberHeadPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("member_password is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("member_password is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("member_password =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("member_password <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("member_password >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("member_password >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("member_password <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("member_password <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("member_password like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("member_password not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("member_password in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("member_password not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("member_password between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("member_password not between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberSaltIsNull() {
            addCriterion("member_salt is null");
            return (Criteria) this;
        }

        public Criteria andMemberSaltIsNotNull() {
            addCriterion("member_salt is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSaltEqualTo(String value) {
            addCriterion("member_salt =", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltNotEqualTo(String value) {
            addCriterion("member_salt <>", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltGreaterThan(String value) {
            addCriterion("member_salt >", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltGreaterThanOrEqualTo(String value) {
            addCriterion("member_salt >=", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltLessThan(String value) {
            addCriterion("member_salt <", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltLessThanOrEqualTo(String value) {
            addCriterion("member_salt <=", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltLike(String value) {
            addCriterion("member_salt like", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltNotLike(String value) {
            addCriterion("member_salt not like", value, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltIn(List<String> values) {
            addCriterion("member_salt in", values, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltNotIn(List<String> values) {
            addCriterion("member_salt not in", values, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltBetween(String value1, String value2) {
            addCriterion("member_salt between", value1, value2, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberSaltNotBetween(String value1, String value2) {
            addCriterion("member_salt not between", value1, value2, "memberSalt");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeIsNull() {
            addCriterion("member_province_code is null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeIsNotNull() {
            addCriterion("member_province_code is not null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeEqualTo(Integer value) {
            addCriterion("member_province_code =", value, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeNotEqualTo(Integer value) {
            addCriterion("member_province_code <>", value, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeGreaterThan(Integer value) {
            addCriterion("member_province_code >", value, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_province_code >=", value, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeLessThan(Integer value) {
            addCriterion("member_province_code <", value, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("member_province_code <=", value, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeIn(List<Integer> values) {
            addCriterion("member_province_code in", values, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeNotIn(List<Integer> values) {
            addCriterion("member_province_code not in", values, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeBetween(Integer value1, Integer value2) {
            addCriterion("member_province_code between", value1, value2, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_province_code not between", value1, value2, "memberProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameIsNull() {
            addCriterion("member_province_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameIsNotNull() {
            addCriterion("member_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameEqualTo(String value) {
            addCriterion("member_province_name =", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameNotEqualTo(String value) {
            addCriterion("member_province_name <>", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameGreaterThan(String value) {
            addCriterion("member_province_name >", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_province_name >=", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameLessThan(String value) {
            addCriterion("member_province_name <", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("member_province_name <=", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameLike(String value) {
            addCriterion("member_province_name like", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameNotLike(String value) {
            addCriterion("member_province_name not like", value, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameIn(List<String> values) {
            addCriterion("member_province_name in", values, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameNotIn(List<String> values) {
            addCriterion("member_province_name not in", values, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameBetween(String value1, String value2) {
            addCriterion("member_province_name between", value1, value2, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberProvinceNameNotBetween(String value1, String value2) {
            addCriterion("member_province_name not between", value1, value2, "memberProvinceName");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeIsNull() {
            addCriterion("member_city_code is null");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeIsNotNull() {
            addCriterion("member_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeEqualTo(Integer value) {
            addCriterion("member_city_code =", value, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeNotEqualTo(Integer value) {
            addCriterion("member_city_code <>", value, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeGreaterThan(Integer value) {
            addCriterion("member_city_code >", value, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_city_code >=", value, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeLessThan(Integer value) {
            addCriterion("member_city_code <", value, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("member_city_code <=", value, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeIn(List<Integer> values) {
            addCriterion("member_city_code in", values, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeNotIn(List<Integer> values) {
            addCriterion("member_city_code not in", values, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeBetween(Integer value1, Integer value2) {
            addCriterion("member_city_code between", value1, value2, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_city_code not between", value1, value2, "memberCityCode");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameIsNull() {
            addCriterion("member_city_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameIsNotNull() {
            addCriterion("member_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameEqualTo(String value) {
            addCriterion("member_city_name =", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameNotEqualTo(String value) {
            addCriterion("member_city_name <>", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameGreaterThan(String value) {
            addCriterion("member_city_name >", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_city_name >=", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameLessThan(String value) {
            addCriterion("member_city_name <", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameLessThanOrEqualTo(String value) {
            addCriterion("member_city_name <=", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameLike(String value) {
            addCriterion("member_city_name like", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameNotLike(String value) {
            addCriterion("member_city_name not like", value, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameIn(List<String> values) {
            addCriterion("member_city_name in", values, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameNotIn(List<String> values) {
            addCriterion("member_city_name not in", values, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameBetween(String value1, String value2) {
            addCriterion("member_city_name between", value1, value2, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberCityNameNotBetween(String value1, String value2) {
            addCriterion("member_city_name not between", value1, value2, "memberCityName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeIsNull() {
            addCriterion("member_district_code is null");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeIsNotNull() {
            addCriterion("member_district_code is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeEqualTo(Integer value) {
            addCriterion("member_district_code =", value, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeNotEqualTo(Integer value) {
            addCriterion("member_district_code <>", value, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeGreaterThan(Integer value) {
            addCriterion("member_district_code >", value, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_district_code >=", value, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeLessThan(Integer value) {
            addCriterion("member_district_code <", value, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeLessThanOrEqualTo(Integer value) {
            addCriterion("member_district_code <=", value, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeIn(List<Integer> values) {
            addCriterion("member_district_code in", values, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeNotIn(List<Integer> values) {
            addCriterion("member_district_code not in", values, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeBetween(Integer value1, Integer value2) {
            addCriterion("member_district_code between", value1, value2, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_district_code not between", value1, value2, "memberDistrictCode");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameIsNull() {
            addCriterion("member_district_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameIsNotNull() {
            addCriterion("member_district_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameEqualTo(String value) {
            addCriterion("member_district_name =", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameNotEqualTo(String value) {
            addCriterion("member_district_name <>", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameGreaterThan(String value) {
            addCriterion("member_district_name >", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_district_name >=", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameLessThan(String value) {
            addCriterion("member_district_name <", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("member_district_name <=", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameLike(String value) {
            addCriterion("member_district_name like", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameNotLike(String value) {
            addCriterion("member_district_name not like", value, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameIn(List<String> values) {
            addCriterion("member_district_name in", values, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameNotIn(List<String> values) {
            addCriterion("member_district_name not in", values, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameBetween(String value1, String value2) {
            addCriterion("member_district_name between", value1, value2, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberDistrictNameNotBetween(String value1, String value2) {
            addCriterion("member_district_name not between", value1, value2, "memberDistrictName");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescIsNull() {
            addCriterion("member_address_desc is null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescIsNotNull() {
            addCriterion("member_address_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescEqualTo(String value) {
            addCriterion("member_address_desc =", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescNotEqualTo(String value) {
            addCriterion("member_address_desc <>", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescGreaterThan(String value) {
            addCriterion("member_address_desc >", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescGreaterThanOrEqualTo(String value) {
            addCriterion("member_address_desc >=", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescLessThan(String value) {
            addCriterion("member_address_desc <", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescLessThanOrEqualTo(String value) {
            addCriterion("member_address_desc <=", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescLike(String value) {
            addCriterion("member_address_desc like", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescNotLike(String value) {
            addCriterion("member_address_desc not like", value, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescIn(List<String> values) {
            addCriterion("member_address_desc in", values, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescNotIn(List<String> values) {
            addCriterion("member_address_desc not in", values, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescBetween(String value1, String value2) {
            addCriterion("member_address_desc between", value1, value2, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberAddressDescNotBetween(String value1, String value2) {
            addCriterion("member_address_desc not between", value1, value2, "memberAddressDesc");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationIsNull() {
            addCriterion("member_certification is null");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationIsNotNull() {
            addCriterion("member_certification is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationEqualTo(Integer value) {
            addCriterion("member_certification =", value, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationNotEqualTo(Integer value) {
            addCriterion("member_certification <>", value, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationGreaterThan(Integer value) {
            addCriterion("member_certification >", value, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_certification >=", value, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationLessThan(Integer value) {
            addCriterion("member_certification <", value, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationLessThanOrEqualTo(Integer value) {
            addCriterion("member_certification <=", value, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationIn(List<Integer> values) {
            addCriterion("member_certification in", values, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationNotIn(List<Integer> values) {
            addCriterion("member_certification not in", values, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationBetween(Integer value1, Integer value2) {
            addCriterion("member_certification between", value1, value2, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberCertificationNotBetween(Integer value1, Integer value2) {
            addCriterion("member_certification not between", value1, value2, "memberCertification");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIsNull() {
            addCriterion("member_status is null");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIsNotNull() {
            addCriterion("member_status is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStatusEqualTo(Integer value) {
            addCriterion("member_status =", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotEqualTo(Integer value) {
            addCriterion("member_status <>", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusGreaterThan(Integer value) {
            addCriterion("member_status >", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_status >=", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusLessThan(Integer value) {
            addCriterion("member_status <", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusLessThanOrEqualTo(Integer value) {
            addCriterion("member_status <=", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIn(List<Integer> values) {
            addCriterion("member_status in", values, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotIn(List<Integer> values) {
            addCriterion("member_status not in", values, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusBetween(Integer value1, Integer value2) {
            addCriterion("member_status between", value1, value2, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("member_status not between", value1, value2, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdIsNull() {
            addCriterion("pre_member_id is null");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdIsNotNull() {
            addCriterion("pre_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdEqualTo(String value) {
            addCriterion("pre_member_id =", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotEqualTo(String value) {
            addCriterion("pre_member_id <>", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdGreaterThan(String value) {
            addCriterion("pre_member_id >", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("pre_member_id >=", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdLessThan(String value) {
            addCriterion("pre_member_id <", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdLessThanOrEqualTo(String value) {
            addCriterion("pre_member_id <=", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdLike(String value) {
            addCriterion("pre_member_id like", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotLike(String value) {
            addCriterion("pre_member_id not like", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdIn(List<String> values) {
            addCriterion("pre_member_id in", values, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotIn(List<String> values) {
            addCriterion("pre_member_id not in", values, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdBetween(String value1, String value2) {
            addCriterion("pre_member_id between", value1, value2, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotBetween(String value1, String value2) {
            addCriterion("pre_member_id not between", value1, value2, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameIsNull() {
            addCriterion("pre_member_name is null");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameIsNotNull() {
            addCriterion("pre_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameEqualTo(String value) {
            addCriterion("pre_member_name =", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameNotEqualTo(String value) {
            addCriterion("pre_member_name <>", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameGreaterThan(String value) {
            addCriterion("pre_member_name >", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("pre_member_name >=", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameLessThan(String value) {
            addCriterion("pre_member_name <", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameLessThanOrEqualTo(String value) {
            addCriterion("pre_member_name <=", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameLike(String value) {
            addCriterion("pre_member_name like", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameNotLike(String value) {
            addCriterion("pre_member_name not like", value, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameIn(List<String> values) {
            addCriterion("pre_member_name in", values, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameNotIn(List<String> values) {
            addCriterion("pre_member_name not in", values, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameBetween(String value1, String value2) {
            addCriterion("pre_member_name between", value1, value2, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberNameNotBetween(String value1, String value2) {
            addCriterion("pre_member_name not between", value1, value2, "preMemberName");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneIsNull() {
            addCriterion("pre_member_phone is null");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneIsNotNull() {
            addCriterion("pre_member_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneEqualTo(String value) {
            addCriterion("pre_member_phone =", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneNotEqualTo(String value) {
            addCriterion("pre_member_phone <>", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneGreaterThan(String value) {
            addCriterion("pre_member_phone >", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pre_member_phone >=", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneLessThan(String value) {
            addCriterion("pre_member_phone <", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneLessThanOrEqualTo(String value) {
            addCriterion("pre_member_phone <=", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneLike(String value) {
            addCriterion("pre_member_phone like", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneNotLike(String value) {
            addCriterion("pre_member_phone not like", value, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneIn(List<String> values) {
            addCriterion("pre_member_phone in", values, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneNotIn(List<String> values) {
            addCriterion("pre_member_phone not in", values, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneBetween(String value1, String value2) {
            addCriterion("pre_member_phone between", value1, value2, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andPreMemberPhoneNotBetween(String value1, String value2) {
            addCriterion("pre_member_phone not between", value1, value2, "preMemberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateIsNull() {
            addCriterion("member_created_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateIsNotNull() {
            addCriterion("member_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateEqualTo(Date value) {
            addCriterion("member_created_date =", value, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateNotEqualTo(Date value) {
            addCriterion("member_created_date <>", value, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateGreaterThan(Date value) {
            addCriterion("member_created_date >", value, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_created_date >=", value, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateLessThan(Date value) {
            addCriterion("member_created_date <", value, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("member_created_date <=", value, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateIn(List<Date> values) {
            addCriterion("member_created_date in", values, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateNotIn(List<Date> values) {
            addCriterion("member_created_date not in", values, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateBetween(Date value1, Date value2) {
            addCriterion("member_created_date between", value1, value2, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("member_created_date not between", value1, value2, "memberCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateIsNull() {
            addCriterion("member_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateIsNotNull() {
            addCriterion("member_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateEqualTo(Date value) {
            addCriterion("member_updated_date =", value, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateNotEqualTo(Date value) {
            addCriterion("member_updated_date <>", value, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateGreaterThan(Date value) {
            addCriterion("member_updated_date >", value, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_updated_date >=", value, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateLessThan(Date value) {
            addCriterion("member_updated_date <", value, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("member_updated_date <=", value, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateIn(List<Date> values) {
            addCriterion("member_updated_date in", values, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateNotIn(List<Date> values) {
            addCriterion("member_updated_date not in", values, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("member_updated_date between", value1, value2, "memberUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("member_updated_date not between", value1, value2, "memberUpdatedDate");
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