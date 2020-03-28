package com.liuming.eshop.entity.logisticsTemplateEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogisticsTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticsTemplateExample() {
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

        public Criteria andLogisticsTemplateIdIsNull() {
            addCriterion("logistics_template_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdIsNotNull() {
            addCriterion("logistics_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdEqualTo(String value) {
            addCriterion("logistics_template_id =", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdNotEqualTo(String value) {
            addCriterion("logistics_template_id <>", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdGreaterThan(String value) {
            addCriterion("logistics_template_id >", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_template_id >=", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdLessThan(String value) {
            addCriterion("logistics_template_id <", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("logistics_template_id <=", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdLike(String value) {
            addCriterion("logistics_template_id like", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdNotLike(String value) {
            addCriterion("logistics_template_id not like", value, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdIn(List<String> values) {
            addCriterion("logistics_template_id in", values, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdNotIn(List<String> values) {
            addCriterion("logistics_template_id not in", values, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdBetween(String value1, String value2) {
            addCriterion("logistics_template_id between", value1, value2, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateIdNotBetween(String value1, String value2) {
            addCriterion("logistics_template_id not between", value1, value2, "logisticsTemplateId");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameIsNull() {
            addCriterion("logistics_template_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameIsNotNull() {
            addCriterion("logistics_template_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameEqualTo(String value) {
            addCriterion("logistics_template_name =", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameNotEqualTo(String value) {
            addCriterion("logistics_template_name <>", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameGreaterThan(String value) {
            addCriterion("logistics_template_name >", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_template_name >=", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameLessThan(String value) {
            addCriterion("logistics_template_name <", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_template_name <=", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameLike(String value) {
            addCriterion("logistics_template_name like", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameNotLike(String value) {
            addCriterion("logistics_template_name not like", value, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameIn(List<String> values) {
            addCriterion("logistics_template_name in", values, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameNotIn(List<String> values) {
            addCriterion("logistics_template_name not in", values, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameBetween(String value1, String value2) {
            addCriterion("logistics_template_name between", value1, value2, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateNameNotBetween(String value1, String value2) {
            addCriterion("logistics_template_name not between", value1, value2, "logisticsTemplateName");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIsNull() {
            addCriterion("logistics_type is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIsNotNull() {
            addCriterion("logistics_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeEqualTo(Integer value) {
            addCriterion("logistics_type =", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotEqualTo(Integer value) {
            addCriterion("logistics_type <>", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeGreaterThan(Integer value) {
            addCriterion("logistics_type >", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_type >=", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLessThan(Integer value) {
            addCriterion("logistics_type <", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_type <=", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIn(List<Integer> values) {
            addCriterion("logistics_type in", values, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotIn(List<Integer> values) {
            addCriterion("logistics_type not in", values, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeBetween(Integer value1, Integer value2) {
            addCriterion("logistics_type between", value1, value2, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_type not between", value1, value2, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeIsNull() {
            addCriterion("logistics_mode is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeIsNotNull() {
            addCriterion("logistics_mode is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeEqualTo(Integer value) {
            addCriterion("logistics_mode =", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeNotEqualTo(Integer value) {
            addCriterion("logistics_mode <>", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeGreaterThan(Integer value) {
            addCriterion("logistics_mode >", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_mode >=", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeLessThan(Integer value) {
            addCriterion("logistics_mode <", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_mode <=", value, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeIn(List<Integer> values) {
            addCriterion("logistics_mode in", values, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeNotIn(List<Integer> values) {
            addCriterion("logistics_mode not in", values, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeBetween(Integer value1, Integer value2) {
            addCriterion("logistics_mode between", value1, value2, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsModeNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_mode not between", value1, value2, "logisticsMode");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIsNull() {
            addCriterion("logistics_number is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIsNotNull() {
            addCriterion("logistics_number is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberEqualTo(Integer value) {
            addCriterion("logistics_number =", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotEqualTo(Integer value) {
            addCriterion("logistics_number <>", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberGreaterThan(Integer value) {
            addCriterion("logistics_number >", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_number >=", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLessThan(Integer value) {
            addCriterion("logistics_number <", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_number <=", value, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberIn(List<Integer> values) {
            addCriterion("logistics_number in", values, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotIn(List<Integer> values) {
            addCriterion("logistics_number not in", values, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberBetween(Integer value1, Integer value2) {
            addCriterion("logistics_number between", value1, value2, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_number not between", value1, value2, "logisticsNumber");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNull() {
            addCriterion("logistics_cost is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNotNull() {
            addCriterion("logistics_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostEqualTo(Integer value) {
            addCriterion("logistics_cost =", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotEqualTo(Integer value) {
            addCriterion("logistics_cost <>", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThan(Integer value) {
            addCriterion("logistics_cost >", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_cost >=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThan(Integer value) {
            addCriterion("logistics_cost <", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_cost <=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIn(List<Integer> values) {
            addCriterion("logistics_cost in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotIn(List<Integer> values) {
            addCriterion("logistics_cost not in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostBetween(Integer value1, Integer value2) {
            addCriterion("logistics_cost between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_cost not between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusIsNull() {
            addCriterion("logistics_template_status is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusIsNotNull() {
            addCriterion("logistics_template_status is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusEqualTo(Integer value) {
            addCriterion("logistics_template_status =", value, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusNotEqualTo(Integer value) {
            addCriterion("logistics_template_status <>", value, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusGreaterThan(Integer value) {
            addCriterion("logistics_template_status >", value, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_template_status >=", value, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusLessThan(Integer value) {
            addCriterion("logistics_template_status <", value, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_template_status <=", value, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusIn(List<Integer> values) {
            addCriterion("logistics_template_status in", values, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusNotIn(List<Integer> values) {
            addCriterion("logistics_template_status not in", values, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusBetween(Integer value1, Integer value2) {
            addCriterion("logistics_template_status between", value1, value2, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_template_status not between", value1, value2, "logisticsTemplateStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateIsNull() {
            addCriterion("logistics_template_created_date is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateIsNotNull() {
            addCriterion("logistics_template_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateEqualTo(Date value) {
            addCriterion("logistics_template_created_date =", value, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateNotEqualTo(Date value) {
            addCriterion("logistics_template_created_date <>", value, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateGreaterThan(Date value) {
            addCriterion("logistics_template_created_date >", value, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("logistics_template_created_date >=", value, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateLessThan(Date value) {
            addCriterion("logistics_template_created_date <", value, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("logistics_template_created_date <=", value, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateIn(List<Date> values) {
            addCriterion("logistics_template_created_date in", values, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateNotIn(List<Date> values) {
            addCriterion("logistics_template_created_date not in", values, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateBetween(Date value1, Date value2) {
            addCriterion("logistics_template_created_date between", value1, value2, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("logistics_template_created_date not between", value1, value2, "logisticsTemplateCreatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateIsNull() {
            addCriterion("logistics_template_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateIsNotNull() {
            addCriterion("logistics_template_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateEqualTo(Date value) {
            addCriterion("logistics_template_updated_date =", value, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateNotEqualTo(Date value) {
            addCriterion("logistics_template_updated_date <>", value, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateGreaterThan(Date value) {
            addCriterion("logistics_template_updated_date >", value, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("logistics_template_updated_date >=", value, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateLessThan(Date value) {
            addCriterion("logistics_template_updated_date <", value, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("logistics_template_updated_date <=", value, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateIn(List<Date> values) {
            addCriterion("logistics_template_updated_date in", values, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateNotIn(List<Date> values) {
            addCriterion("logistics_template_updated_date not in", values, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("logistics_template_updated_date between", value1, value2, "logisticsTemplateUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsTemplateUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("logistics_template_updated_date not between", value1, value2, "logisticsTemplateUpdatedDate");
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