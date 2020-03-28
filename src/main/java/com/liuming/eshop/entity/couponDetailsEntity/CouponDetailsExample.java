package com.liuming.eshop.entity.couponDetailsEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CouponDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponDetailsExample() {
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

        public Criteria andCouponDetailsIdIsNull() {
            addCriterion("coupon_details_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdIsNotNull() {
            addCriterion("coupon_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdEqualTo(String value) {
            addCriterion("coupon_details_id =", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotEqualTo(String value) {
            addCriterion("coupon_details_id <>", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdGreaterThan(String value) {
            addCriterion("coupon_details_id >", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_details_id >=", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdLessThan(String value) {
            addCriterion("coupon_details_id <", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_details_id <=", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdLike(String value) {
            addCriterion("coupon_details_id like", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotLike(String value) {
            addCriterion("coupon_details_id not like", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdIn(List<String> values) {
            addCriterion("coupon_details_id in", values, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotIn(List<String> values) {
            addCriterion("coupon_details_id not in", values, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdBetween(String value1, String value2) {
            addCriterion("coupon_details_id between", value1, value2, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotBetween(String value1, String value2) {
            addCriterion("coupon_details_id not between", value1, value2, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
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

        public Criteria andCouponStartTimeIsNull() {
            addCriterion("coupon_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNotNull() {
            addCriterion("coupon_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time =", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time <>", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("coupon_start_time >", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time >=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("coupon_start_time <", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time <=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_start_time in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_start_time not in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_start_time between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_start_time not between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNull() {
            addCriterion("coupon_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNotNull() {
            addCriterion("coupon_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time =", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time <>", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("coupon_end_time >", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time >=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("coupon_end_time <", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time <=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_end_time in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_end_time not in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_end_time between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_end_time not between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusIsNull() {
            addCriterion("coupon_details_status is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusIsNotNull() {
            addCriterion("coupon_details_status is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusEqualTo(Integer value) {
            addCriterion("coupon_details_status =", value, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusNotEqualTo(Integer value) {
            addCriterion("coupon_details_status <>", value, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusGreaterThan(Integer value) {
            addCriterion("coupon_details_status >", value, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_details_status >=", value, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusLessThan(Integer value) {
            addCriterion("coupon_details_status <", value, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_details_status <=", value, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusIn(List<Integer> values) {
            addCriterion("coupon_details_status in", values, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusNotIn(List<Integer> values) {
            addCriterion("coupon_details_status not in", values, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusBetween(Integer value1, Integer value2) {
            addCriterion("coupon_details_status between", value1, value2, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_details_status not between", value1, value2, "couponDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateIsNull() {
            addCriterion("coupon_details_create_date is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateIsNotNull() {
            addCriterion("coupon_details_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateEqualTo(Date value) {
            addCriterion("coupon_details_create_date =", value, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateNotEqualTo(Date value) {
            addCriterion("coupon_details_create_date <>", value, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateGreaterThan(Date value) {
            addCriterion("coupon_details_create_date >", value, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_details_create_date >=", value, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateLessThan(Date value) {
            addCriterion("coupon_details_create_date <", value, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("coupon_details_create_date <=", value, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateIn(List<Date> values) {
            addCriterion("coupon_details_create_date in", values, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateNotIn(List<Date> values) {
            addCriterion("coupon_details_create_date not in", values, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateBetween(Date value1, Date value2) {
            addCriterion("coupon_details_create_date between", value1, value2, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("coupon_details_create_date not between", value1, value2, "couponDetailsCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateIsNull() {
            addCriterion("coupon_details_update_date is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateIsNotNull() {
            addCriterion("coupon_details_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateEqualTo(Date value) {
            addCriterion("coupon_details_update_date =", value, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateNotEqualTo(Date value) {
            addCriterion("coupon_details_update_date <>", value, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateGreaterThan(Date value) {
            addCriterion("coupon_details_update_date >", value, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_details_update_date >=", value, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateLessThan(Date value) {
            addCriterion("coupon_details_update_date <", value, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("coupon_details_update_date <=", value, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateIn(List<Date> values) {
            addCriterion("coupon_details_update_date in", values, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateNotIn(List<Date> values) {
            addCriterion("coupon_details_update_date not in", values, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateBetween(Date value1, Date value2) {
            addCriterion("coupon_details_update_date between", value1, value2, "couponDetailsUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("coupon_details_update_date not between", value1, value2, "couponDetailsUpdateDate");
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