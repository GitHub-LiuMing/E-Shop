package com.liuming.eshop.entity.changeEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangeExample() {
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

        public Criteria andChangeIdIsNull() {
            addCriterion("change_id is null");
            return (Criteria) this;
        }

        public Criteria andChangeIdIsNotNull() {
            addCriterion("change_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangeIdEqualTo(String value) {
            addCriterion("change_id =", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotEqualTo(String value) {
            addCriterion("change_id <>", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdGreaterThan(String value) {
            addCriterion("change_id >", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("change_id >=", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdLessThan(String value) {
            addCriterion("change_id <", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdLessThanOrEqualTo(String value) {
            addCriterion("change_id <=", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdLike(String value) {
            addCriterion("change_id like", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotLike(String value) {
            addCriterion("change_id not like", value, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdIn(List<String> values) {
            addCriterion("change_id in", values, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotIn(List<String> values) {
            addCriterion("change_id not in", values, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdBetween(String value1, String value2) {
            addCriterion("change_id between", value1, value2, "changeId");
            return (Criteria) this;
        }

        public Criteria andChangeIdNotBetween(String value1, String value2) {
            addCriterion("change_id not between", value1, value2, "changeId");
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

        public Criteria andChangePriceIsNull() {
            addCriterion("change_price is null");
            return (Criteria) this;
        }

        public Criteria andChangePriceIsNotNull() {
            addCriterion("change_price is not null");
            return (Criteria) this;
        }

        public Criteria andChangePriceEqualTo(Double value) {
            addCriterion("change_price =", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotEqualTo(Double value) {
            addCriterion("change_price <>", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceGreaterThan(Double value) {
            addCriterion("change_price >", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("change_price >=", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceLessThan(Double value) {
            addCriterion("change_price <", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceLessThanOrEqualTo(Double value) {
            addCriterion("change_price <=", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceIn(List<Double> values) {
            addCriterion("change_price in", values, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotIn(List<Double> values) {
            addCriterion("change_price not in", values, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceBetween(Double value1, Double value2) {
            addCriterion("change_price between", value1, value2, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotBetween(Double value1, Double value2) {
            addCriterion("change_price not between", value1, value2, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(Integer value) {
            addCriterion("change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(Integer value) {
            addCriterion("change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(Integer value) {
            addCriterion("change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(Integer value) {
            addCriterion("change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<Integer> values) {
            addCriterion("change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<Integer> values) {
            addCriterion("change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(Integer value1, Integer value2) {
            addCriterion("change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeStatusIsNull() {
            addCriterion("change_status is null");
            return (Criteria) this;
        }

        public Criteria andChangeStatusIsNotNull() {
            addCriterion("change_status is not null");
            return (Criteria) this;
        }

        public Criteria andChangeStatusEqualTo(Integer value) {
            addCriterion("change_status =", value, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusNotEqualTo(Integer value) {
            addCriterion("change_status <>", value, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusGreaterThan(Integer value) {
            addCriterion("change_status >", value, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_status >=", value, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusLessThan(Integer value) {
            addCriterion("change_status <", value, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("change_status <=", value, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusIn(List<Integer> values) {
            addCriterion("change_status in", values, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusNotIn(List<Integer> values) {
            addCriterion("change_status not in", values, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusBetween(Integer value1, Integer value2) {
            addCriterion("change_status between", value1, value2, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("change_status not between", value1, value2, "changeStatus");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateIsNull() {
            addCriterion("change_create_date is null");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateIsNotNull() {
            addCriterion("change_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateEqualTo(Date value) {
            addCriterion("change_create_date =", value, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateNotEqualTo(Date value) {
            addCriterion("change_create_date <>", value, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateGreaterThan(Date value) {
            addCriterion("change_create_date >", value, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("change_create_date >=", value, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateLessThan(Date value) {
            addCriterion("change_create_date <", value, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("change_create_date <=", value, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateIn(List<Date> values) {
            addCriterion("change_create_date in", values, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateNotIn(List<Date> values) {
            addCriterion("change_create_date not in", values, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateBetween(Date value1, Date value2) {
            addCriterion("change_create_date between", value1, value2, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("change_create_date not between", value1, value2, "changeCreateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateIsNull() {
            addCriterion("change_update_date is null");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateIsNotNull() {
            addCriterion("change_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateEqualTo(Date value) {
            addCriterion("change_update_date =", value, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateNotEqualTo(Date value) {
            addCriterion("change_update_date <>", value, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateGreaterThan(Date value) {
            addCriterion("change_update_date >", value, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("change_update_date >=", value, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateLessThan(Date value) {
            addCriterion("change_update_date <", value, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("change_update_date <=", value, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateIn(List<Date> values) {
            addCriterion("change_update_date in", values, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateNotIn(List<Date> values) {
            addCriterion("change_update_date not in", values, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateBetween(Date value1, Date value2) {
            addCriterion("change_update_date between", value1, value2, "changeUpdateDate");
            return (Criteria) this;
        }

        public Criteria andChangeUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("change_update_date not between", value1, value2, "changeUpdateDate");
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