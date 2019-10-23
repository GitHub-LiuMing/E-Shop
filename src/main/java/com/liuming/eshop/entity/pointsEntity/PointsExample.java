package com.liuming.eshop.entity.pointsEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointsExample() {
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

        public Criteria andPointsIdIsNull() {
            addCriterion("points_id is null");
            return (Criteria) this;
        }

        public Criteria andPointsIdIsNotNull() {
            addCriterion("points_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointsIdEqualTo(String value) {
            addCriterion("points_id =", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdNotEqualTo(String value) {
            addCriterion("points_id <>", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdGreaterThan(String value) {
            addCriterion("points_id >", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdGreaterThanOrEqualTo(String value) {
            addCriterion("points_id >=", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdLessThan(String value) {
            addCriterion("points_id <", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdLessThanOrEqualTo(String value) {
            addCriterion("points_id <=", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdLike(String value) {
            addCriterion("points_id like", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdNotLike(String value) {
            addCriterion("points_id not like", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdIn(List<String> values) {
            addCriterion("points_id in", values, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdNotIn(List<String> values) {
            addCriterion("points_id not in", values, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdBetween(String value1, String value2) {
            addCriterion("points_id between", value1, value2, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdNotBetween(String value1, String value2) {
            addCriterion("points_id not between", value1, value2, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationIsNull() {
            addCriterion("points_regulation is null");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationIsNotNull() {
            addCriterion("points_regulation is not null");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationEqualTo(Integer value) {
            addCriterion("points_regulation =", value, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationNotEqualTo(Integer value) {
            addCriterion("points_regulation <>", value, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationGreaterThan(Integer value) {
            addCriterion("points_regulation >", value, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_regulation >=", value, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationLessThan(Integer value) {
            addCriterion("points_regulation <", value, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationLessThanOrEqualTo(Integer value) {
            addCriterion("points_regulation <=", value, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationIn(List<Integer> values) {
            addCriterion("points_regulation in", values, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationNotIn(List<Integer> values) {
            addCriterion("points_regulation not in", values, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationBetween(Integer value1, Integer value2) {
            addCriterion("points_regulation between", value1, value2, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsRegulationNotBetween(Integer value1, Integer value2) {
            addCriterion("points_regulation not between", value1, value2, "pointsRegulation");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsStatusIsNull() {
            addCriterion("points_status is null");
            return (Criteria) this;
        }

        public Criteria andPointsStatusIsNotNull() {
            addCriterion("points_status is not null");
            return (Criteria) this;
        }

        public Criteria andPointsStatusEqualTo(Integer value) {
            addCriterion("points_status =", value, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusNotEqualTo(Integer value) {
            addCriterion("points_status <>", value, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusGreaterThan(Integer value) {
            addCriterion("points_status >", value, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_status >=", value, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusLessThan(Integer value) {
            addCriterion("points_status <", value, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("points_status <=", value, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusIn(List<Integer> values) {
            addCriterion("points_status in", values, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusNotIn(List<Integer> values) {
            addCriterion("points_status not in", values, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusBetween(Integer value1, Integer value2) {
            addCriterion("points_status between", value1, value2, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("points_status not between", value1, value2, "pointsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateIsNull() {
            addCriterion("points_created_date is null");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateIsNotNull() {
            addCriterion("points_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateEqualTo(Date value) {
            addCriterion("points_created_date =", value, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateNotEqualTo(Date value) {
            addCriterion("points_created_date <>", value, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateGreaterThan(Date value) {
            addCriterion("points_created_date >", value, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("points_created_date >=", value, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateLessThan(Date value) {
            addCriterion("points_created_date <", value, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("points_created_date <=", value, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateIn(List<Date> values) {
            addCriterion("points_created_date in", values, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateNotIn(List<Date> values) {
            addCriterion("points_created_date not in", values, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateBetween(Date value1, Date value2) {
            addCriterion("points_created_date between", value1, value2, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("points_created_date not between", value1, value2, "pointsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateIsNull() {
            addCriterion("points_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateIsNotNull() {
            addCriterion("points_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateEqualTo(Date value) {
            addCriterion("points_updated_date =", value, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateNotEqualTo(Date value) {
            addCriterion("points_updated_date <>", value, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateGreaterThan(Date value) {
            addCriterion("points_updated_date >", value, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("points_updated_date >=", value, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateLessThan(Date value) {
            addCriterion("points_updated_date <", value, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("points_updated_date <=", value, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateIn(List<Date> values) {
            addCriterion("points_updated_date in", values, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateNotIn(List<Date> values) {
            addCriterion("points_updated_date not in", values, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("points_updated_date between", value1, value2, "pointsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("points_updated_date not between", value1, value2, "pointsUpdatedDate");
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