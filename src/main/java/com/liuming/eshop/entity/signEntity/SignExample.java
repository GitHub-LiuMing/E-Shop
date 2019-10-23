package com.liuming.eshop.entity.signEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignExample() {
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

        public Criteria andSignIdIsNull() {
            addCriterion("sign_id is null");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNotNull() {
            addCriterion("sign_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignIdEqualTo(String value) {
            addCriterion("sign_id =", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotEqualTo(String value) {
            addCriterion("sign_id <>", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThan(String value) {
            addCriterion("sign_id >", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThanOrEqualTo(String value) {
            addCriterion("sign_id >=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThan(String value) {
            addCriterion("sign_id <", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThanOrEqualTo(String value) {
            addCriterion("sign_id <=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLike(String value) {
            addCriterion("sign_id like", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotLike(String value) {
            addCriterion("sign_id not like", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdIn(List<String> values) {
            addCriterion("sign_id in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotIn(List<String> values) {
            addCriterion("sign_id not in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdBetween(String value1, String value2) {
            addCriterion("sign_id between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotBetween(String value1, String value2) {
            addCriterion("sign_id not between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignRegulationIsNull() {
            addCriterion("sign_regulation is null");
            return (Criteria) this;
        }

        public Criteria andSignRegulationIsNotNull() {
            addCriterion("sign_regulation is not null");
            return (Criteria) this;
        }

        public Criteria andSignRegulationEqualTo(Integer value) {
            addCriterion("sign_regulation =", value, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationNotEqualTo(Integer value) {
            addCriterion("sign_regulation <>", value, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationGreaterThan(Integer value) {
            addCriterion("sign_regulation >", value, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_regulation >=", value, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationLessThan(Integer value) {
            addCriterion("sign_regulation <", value, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationLessThanOrEqualTo(Integer value) {
            addCriterion("sign_regulation <=", value, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationIn(List<Integer> values) {
            addCriterion("sign_regulation in", values, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationNotIn(List<Integer> values) {
            addCriterion("sign_regulation not in", values, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationBetween(Integer value1, Integer value2) {
            addCriterion("sign_regulation between", value1, value2, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignRegulationNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_regulation not between", value1, value2, "signRegulation");
            return (Criteria) this;
        }

        public Criteria andSignPointsIsNull() {
            addCriterion("sign_points is null");
            return (Criteria) this;
        }

        public Criteria andSignPointsIsNotNull() {
            addCriterion("sign_points is not null");
            return (Criteria) this;
        }

        public Criteria andSignPointsEqualTo(Integer value) {
            addCriterion("sign_points =", value, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsNotEqualTo(Integer value) {
            addCriterion("sign_points <>", value, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsGreaterThan(Integer value) {
            addCriterion("sign_points >", value, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_points >=", value, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsLessThan(Integer value) {
            addCriterion("sign_points <", value, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsLessThanOrEqualTo(Integer value) {
            addCriterion("sign_points <=", value, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsIn(List<Integer> values) {
            addCriterion("sign_points in", values, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsNotIn(List<Integer> values) {
            addCriterion("sign_points not in", values, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsBetween(Integer value1, Integer value2) {
            addCriterion("sign_points between", value1, value2, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_points not between", value1, value2, "signPoints");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNull() {
            addCriterion("sign_status is null");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNotNull() {
            addCriterion("sign_status is not null");
            return (Criteria) this;
        }

        public Criteria andSignStatusEqualTo(Integer value) {
            addCriterion("sign_status =", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotEqualTo(Integer value) {
            addCriterion("sign_status <>", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThan(Integer value) {
            addCriterion("sign_status >", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_status >=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThan(Integer value) {
            addCriterion("sign_status <", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sign_status <=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusIn(List<Integer> values) {
            addCriterion("sign_status in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotIn(List<Integer> values) {
            addCriterion("sign_status not in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusBetween(Integer value1, Integer value2) {
            addCriterion("sign_status between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_status not between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateIsNull() {
            addCriterion("sign_created_date is null");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateIsNotNull() {
            addCriterion("sign_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateEqualTo(Date value) {
            addCriterion("sign_created_date =", value, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateNotEqualTo(Date value) {
            addCriterion("sign_created_date <>", value, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateGreaterThan(Date value) {
            addCriterion("sign_created_date >", value, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_created_date >=", value, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateLessThan(Date value) {
            addCriterion("sign_created_date <", value, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("sign_created_date <=", value, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateIn(List<Date> values) {
            addCriterion("sign_created_date in", values, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateNotIn(List<Date> values) {
            addCriterion("sign_created_date not in", values, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateBetween(Date value1, Date value2) {
            addCriterion("sign_created_date between", value1, value2, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("sign_created_date not between", value1, value2, "signCreatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateIsNull() {
            addCriterion("sign_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateIsNotNull() {
            addCriterion("sign_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateEqualTo(Date value) {
            addCriterion("sign_updated_date =", value, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateNotEqualTo(Date value) {
            addCriterion("sign_updated_date <>", value, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateGreaterThan(Date value) {
            addCriterion("sign_updated_date >", value, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_updated_date >=", value, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateLessThan(Date value) {
            addCriterion("sign_updated_date <", value, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("sign_updated_date <=", value, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateIn(List<Date> values) {
            addCriterion("sign_updated_date in", values, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateNotIn(List<Date> values) {
            addCriterion("sign_updated_date not in", values, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("sign_updated_date between", value1, value2, "signUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andSignUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("sign_updated_date not between", value1, value2, "signUpdatedDate");
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