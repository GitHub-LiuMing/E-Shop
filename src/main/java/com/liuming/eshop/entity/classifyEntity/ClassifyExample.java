package com.liuming.eshop.entity.classifyEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassifyExample() {
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

        public Criteria andClassifyIdIsNull() {
            addCriterion("classify_id is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIsNotNull() {
            addCriterion("classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyIdEqualTo(String value) {
            addCriterion("classify_id =", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotEqualTo(String value) {
            addCriterion("classify_id <>", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThan(String value) {
            addCriterion("classify_id >", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("classify_id >=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThan(String value) {
            addCriterion("classify_id <", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("classify_id <=", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdLike(String value) {
            addCriterion("classify_id like", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotLike(String value) {
            addCriterion("classify_id not like", value, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdIn(List<String> values) {
            addCriterion("classify_id in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotIn(List<String> values) {
            addCriterion("classify_id not in", values, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdBetween(String value1, String value2) {
            addCriterion("classify_id between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyIdNotBetween(String value1, String value2) {
            addCriterion("classify_id not between", value1, value2, "classifyId");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNull() {
            addCriterion("classify_name is null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIsNotNull() {
            addCriterion("classify_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyNameEqualTo(String value) {
            addCriterion("classify_name =", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotEqualTo(String value) {
            addCriterion("classify_name <>", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThan(String value) {
            addCriterion("classify_name >", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("classify_name >=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThan(String value) {
            addCriterion("classify_name <", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLessThanOrEqualTo(String value) {
            addCriterion("classify_name <=", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameLike(String value) {
            addCriterion("classify_name like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotLike(String value) {
            addCriterion("classify_name not like", value, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameIn(List<String> values) {
            addCriterion("classify_name in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotIn(List<String> values) {
            addCriterion("classify_name not in", values, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameBetween(String value1, String value2) {
            addCriterion("classify_name between", value1, value2, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyNameNotBetween(String value1, String value2) {
            addCriterion("classify_name not between", value1, value2, "classifyName");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlIsNull() {
            addCriterion("classify_url is null");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlIsNotNull() {
            addCriterion("classify_url is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlEqualTo(String value) {
            addCriterion("classify_url =", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlNotEqualTo(String value) {
            addCriterion("classify_url <>", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlGreaterThan(String value) {
            addCriterion("classify_url >", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("classify_url >=", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlLessThan(String value) {
            addCriterion("classify_url <", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlLessThanOrEqualTo(String value) {
            addCriterion("classify_url <=", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlLike(String value) {
            addCriterion("classify_url like", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlNotLike(String value) {
            addCriterion("classify_url not like", value, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlIn(List<String> values) {
            addCriterion("classify_url in", values, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlNotIn(List<String> values) {
            addCriterion("classify_url not in", values, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlBetween(String value1, String value2) {
            addCriterion("classify_url between", value1, value2, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyUrlNotBetween(String value1, String value2) {
            addCriterion("classify_url not between", value1, value2, "classifyUrl");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusIsNull() {
            addCriterion("classify_status is null");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusIsNotNull() {
            addCriterion("classify_status is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusEqualTo(Integer value) {
            addCriterion("classify_status =", value, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusNotEqualTo(Integer value) {
            addCriterion("classify_status <>", value, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusGreaterThan(Integer value) {
            addCriterion("classify_status >", value, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify_status >=", value, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusLessThan(Integer value) {
            addCriterion("classify_status <", value, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("classify_status <=", value, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusIn(List<Integer> values) {
            addCriterion("classify_status in", values, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusNotIn(List<Integer> values) {
            addCriterion("classify_status not in", values, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("classify_status between", value1, value2, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("classify_status not between", value1, value2, "classifyStatus");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateIsNull() {
            addCriterion("classify_create_date is null");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateIsNotNull() {
            addCriterion("classify_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateEqualTo(Date value) {
            addCriterion("classify_create_date =", value, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateNotEqualTo(Date value) {
            addCriterion("classify_create_date <>", value, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateGreaterThan(Date value) {
            addCriterion("classify_create_date >", value, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("classify_create_date >=", value, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateLessThan(Date value) {
            addCriterion("classify_create_date <", value, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("classify_create_date <=", value, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateIn(List<Date> values) {
            addCriterion("classify_create_date in", values, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateNotIn(List<Date> values) {
            addCriterion("classify_create_date not in", values, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateBetween(Date value1, Date value2) {
            addCriterion("classify_create_date between", value1, value2, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("classify_create_date not between", value1, value2, "classifyCreateDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateIsNull() {
            addCriterion("classify_modified_date is null");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateIsNotNull() {
            addCriterion("classify_modified_date is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateEqualTo(Date value) {
            addCriterion("classify_modified_date =", value, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateNotEqualTo(Date value) {
            addCriterion("classify_modified_date <>", value, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateGreaterThan(Date value) {
            addCriterion("classify_modified_date >", value, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("classify_modified_date >=", value, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateLessThan(Date value) {
            addCriterion("classify_modified_date <", value, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("classify_modified_date <=", value, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateIn(List<Date> values) {
            addCriterion("classify_modified_date in", values, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateNotIn(List<Date> values) {
            addCriterion("classify_modified_date not in", values, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateBetween(Date value1, Date value2) {
            addCriterion("classify_modified_date between", value1, value2, "classifyModifiedDate");
            return (Criteria) this;
        }

        public Criteria andClassifyModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("classify_modified_date not between", value1, value2, "classifyModifiedDate");
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