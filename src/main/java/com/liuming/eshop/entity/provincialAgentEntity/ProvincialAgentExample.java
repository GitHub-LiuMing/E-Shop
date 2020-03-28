package com.liuming.eshop.entity.provincialAgentEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProvincialAgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvincialAgentExample() {
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

        public Criteria andProvincialAgentIdIsNull() {
            addCriterion("provincial_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdIsNotNull() {
            addCriterion("provincial_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdEqualTo(String value) {
            addCriterion("provincial_agent_id =", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdNotEqualTo(String value) {
            addCriterion("provincial_agent_id <>", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdGreaterThan(String value) {
            addCriterion("provincial_agent_id >", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("provincial_agent_id >=", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdLessThan(String value) {
            addCriterion("provincial_agent_id <", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdLessThanOrEqualTo(String value) {
            addCriterion("provincial_agent_id <=", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdLike(String value) {
            addCriterion("provincial_agent_id like", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdNotLike(String value) {
            addCriterion("provincial_agent_id not like", value, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdIn(List<String> values) {
            addCriterion("provincial_agent_id in", values, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdNotIn(List<String> values) {
            addCriterion("provincial_agent_id not in", values, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdBetween(String value1, String value2) {
            addCriterion("provincial_agent_id between", value1, value2, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentIdNotBetween(String value1, String value2) {
            addCriterion("provincial_agent_id not between", value1, value2, "provincialAgentId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameIsNull() {
            addCriterion("provincial_agent_name is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameIsNotNull() {
            addCriterion("provincial_agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameEqualTo(String value) {
            addCriterion("provincial_agent_name =", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameNotEqualTo(String value) {
            addCriterion("provincial_agent_name <>", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameGreaterThan(String value) {
            addCriterion("provincial_agent_name >", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("provincial_agent_name >=", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameLessThan(String value) {
            addCriterion("provincial_agent_name <", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameLessThanOrEqualTo(String value) {
            addCriterion("provincial_agent_name <=", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameLike(String value) {
            addCriterion("provincial_agent_name like", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameNotLike(String value) {
            addCriterion("provincial_agent_name not like", value, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameIn(List<String> values) {
            addCriterion("provincial_agent_name in", values, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameNotIn(List<String> values) {
            addCriterion("provincial_agent_name not in", values, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameBetween(String value1, String value2) {
            addCriterion("provincial_agent_name between", value1, value2, "provincialAgentName");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentNameNotBetween(String value1, String value2) {
            addCriterion("provincial_agent_name not between", value1, value2, "provincialAgentName");
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

        public Criteria andProvincialAgentStatusIsNull() {
            addCriterion("provincial_agent_status is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusIsNotNull() {
            addCriterion("provincial_agent_status is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusEqualTo(Integer value) {
            addCriterion("provincial_agent_status =", value, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusNotEqualTo(Integer value) {
            addCriterion("provincial_agent_status <>", value, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusGreaterThan(Integer value) {
            addCriterion("provincial_agent_status >", value, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("provincial_agent_status >=", value, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusLessThan(Integer value) {
            addCriterion("provincial_agent_status <", value, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("provincial_agent_status <=", value, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusIn(List<Integer> values) {
            addCriterion("provincial_agent_status in", values, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusNotIn(List<Integer> values) {
            addCriterion("provincial_agent_status not in", values, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusBetween(Integer value1, Integer value2) {
            addCriterion("provincial_agent_status between", value1, value2, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("provincial_agent_status not between", value1, value2, "provincialAgentStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateIsNull() {
            addCriterion("provincial_agent_created_date is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateIsNotNull() {
            addCriterion("provincial_agent_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateEqualTo(Date value) {
            addCriterion("provincial_agent_created_date =", value, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateNotEqualTo(Date value) {
            addCriterion("provincial_agent_created_date <>", value, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateGreaterThan(Date value) {
            addCriterion("provincial_agent_created_date >", value, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_created_date >=", value, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateLessThan(Date value) {
            addCriterion("provincial_agent_created_date <", value, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_created_date <=", value, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateIn(List<Date> values) {
            addCriterion("provincial_agent_created_date in", values, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateNotIn(List<Date> values) {
            addCriterion("provincial_agent_created_date not in", values, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_created_date between", value1, value2, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_created_date not between", value1, value2, "provincialAgentCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateIsNull() {
            addCriterion("provincial_agent_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateIsNotNull() {
            addCriterion("provincial_agent_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateEqualTo(Date value) {
            addCriterion("provincial_agent_updated_date =", value, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateNotEqualTo(Date value) {
            addCriterion("provincial_agent_updated_date <>", value, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateGreaterThan(Date value) {
            addCriterion("provincial_agent_updated_date >", value, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_updated_date >=", value, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateLessThan(Date value) {
            addCriterion("provincial_agent_updated_date <", value, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_updated_date <=", value, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateIn(List<Date> values) {
            addCriterion("provincial_agent_updated_date in", values, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateNotIn(List<Date> values) {
            addCriterion("provincial_agent_updated_date not in", values, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_updated_date between", value1, value2, "provincialAgentUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_updated_date not between", value1, value2, "provincialAgentUpdatedDate");
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