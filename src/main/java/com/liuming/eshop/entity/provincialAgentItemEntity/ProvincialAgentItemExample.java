package com.liuming.eshop.entity.provincialAgentItemEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProvincialAgentItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvincialAgentItemExample() {
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

        public Criteria andProvincialAgentItemIdIsNull() {
            addCriterion("provincial_agent_item_id is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdIsNotNull() {
            addCriterion("provincial_agent_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdEqualTo(String value) {
            addCriterion("provincial_agent_item_id =", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdNotEqualTo(String value) {
            addCriterion("provincial_agent_item_id <>", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdGreaterThan(String value) {
            addCriterion("provincial_agent_item_id >", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("provincial_agent_item_id >=", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdLessThan(String value) {
            addCriterion("provincial_agent_item_id <", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdLessThanOrEqualTo(String value) {
            addCriterion("provincial_agent_item_id <=", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdLike(String value) {
            addCriterion("provincial_agent_item_id like", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdNotLike(String value) {
            addCriterion("provincial_agent_item_id not like", value, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdIn(List<String> values) {
            addCriterion("provincial_agent_item_id in", values, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdNotIn(List<String> values) {
            addCriterion("provincial_agent_item_id not in", values, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdBetween(String value1, String value2) {
            addCriterion("provincial_agent_item_id between", value1, value2, "provincialAgentItemId");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemIdNotBetween(String value1, String value2) {
            addCriterion("provincial_agent_item_id not between", value1, value2, "provincialAgentItemId");
            return (Criteria) this;
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
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

        public Criteria andProvincialAgentItemOriginalPriceIsNull() {
            addCriterion("provincial_agent_item_original_price is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceIsNotNull() {
            addCriterion("provincial_agent_item_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceEqualTo(Double value) {
            addCriterion("provincial_agent_item_original_price =", value, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceNotEqualTo(Double value) {
            addCriterion("provincial_agent_item_original_price <>", value, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceGreaterThan(Double value) {
            addCriterion("provincial_agent_item_original_price >", value, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("provincial_agent_item_original_price >=", value, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceLessThan(Double value) {
            addCriterion("provincial_agent_item_original_price <", value, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceLessThanOrEqualTo(Double value) {
            addCriterion("provincial_agent_item_original_price <=", value, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceIn(List<Double> values) {
            addCriterion("provincial_agent_item_original_price in", values, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceNotIn(List<Double> values) {
            addCriterion("provincial_agent_item_original_price not in", values, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceBetween(Double value1, Double value2) {
            addCriterion("provincial_agent_item_original_price between", value1, value2, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemOriginalPriceNotBetween(Double value1, Double value2) {
            addCriterion("provincial_agent_item_original_price not between", value1, value2, "provincialAgentItemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceIsNull() {
            addCriterion("provincial_agent_item_present_price is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceIsNotNull() {
            addCriterion("provincial_agent_item_present_price is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceEqualTo(Double value) {
            addCriterion("provincial_agent_item_present_price =", value, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceNotEqualTo(Double value) {
            addCriterion("provincial_agent_item_present_price <>", value, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceGreaterThan(Double value) {
            addCriterion("provincial_agent_item_present_price >", value, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("provincial_agent_item_present_price >=", value, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceLessThan(Double value) {
            addCriterion("provincial_agent_item_present_price <", value, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceLessThanOrEqualTo(Double value) {
            addCriterion("provincial_agent_item_present_price <=", value, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceIn(List<Double> values) {
            addCriterion("provincial_agent_item_present_price in", values, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceNotIn(List<Double> values) {
            addCriterion("provincial_agent_item_present_price not in", values, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceBetween(Double value1, Double value2) {
            addCriterion("provincial_agent_item_present_price between", value1, value2, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemPresentPriceNotBetween(Double value1, Double value2) {
            addCriterion("provincial_agent_item_present_price not between", value1, value2, "provincialAgentItemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlIsNull() {
            addCriterion("provincial_agent_item_url is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlIsNotNull() {
            addCriterion("provincial_agent_item_url is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlEqualTo(String value) {
            addCriterion("provincial_agent_item_url =", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlNotEqualTo(String value) {
            addCriterion("provincial_agent_item_url <>", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlGreaterThan(String value) {
            addCriterion("provincial_agent_item_url >", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlGreaterThanOrEqualTo(String value) {
            addCriterion("provincial_agent_item_url >=", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlLessThan(String value) {
            addCriterion("provincial_agent_item_url <", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlLessThanOrEqualTo(String value) {
            addCriterion("provincial_agent_item_url <=", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlLike(String value) {
            addCriterion("provincial_agent_item_url like", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlNotLike(String value) {
            addCriterion("provincial_agent_item_url not like", value, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlIn(List<String> values) {
            addCriterion("provincial_agent_item_url in", values, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlNotIn(List<String> values) {
            addCriterion("provincial_agent_item_url not in", values, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlBetween(String value1, String value2) {
            addCriterion("provincial_agent_item_url between", value1, value2, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUrlNotBetween(String value1, String value2) {
            addCriterion("provincial_agent_item_url not between", value1, value2, "provincialAgentItemUrl");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNull() {
            addCriterion("stock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(Integer value) {
            addCriterion("stock_num =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(Integer value) {
            addCriterion("stock_num <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(Integer value) {
            addCriterion("stock_num >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_num >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(Integer value) {
            addCriterion("stock_num <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(Integer value) {
            addCriterion("stock_num <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<Integer> values) {
            addCriterion("stock_num in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<Integer> values) {
            addCriterion("stock_num not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(Integer value1, Integer value2) {
            addCriterion("stock_num between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_num not between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumIsNull() {
            addCriterion("sales_num is null");
            return (Criteria) this;
        }

        public Criteria andSalesNumIsNotNull() {
            addCriterion("sales_num is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNumEqualTo(Integer value) {
            addCriterion("sales_num =", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotEqualTo(Integer value) {
            addCriterion("sales_num <>", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumGreaterThan(Integer value) {
            addCriterion("sales_num >", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_num >=", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumLessThan(Integer value) {
            addCriterion("sales_num <", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumLessThanOrEqualTo(Integer value) {
            addCriterion("sales_num <=", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumIn(List<Integer> values) {
            addCriterion("sales_num in", values, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotIn(List<Integer> values) {
            addCriterion("sales_num not in", values, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumBetween(Integer value1, Integer value2) {
            addCriterion("sales_num between", value1, value2, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_num not between", value1, value2, "salesNum");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusIsNull() {
            addCriterion("provincial_agent_item_status is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusIsNotNull() {
            addCriterion("provincial_agent_item_status is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusEqualTo(Integer value) {
            addCriterion("provincial_agent_item_status =", value, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusNotEqualTo(Integer value) {
            addCriterion("provincial_agent_item_status <>", value, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusGreaterThan(Integer value) {
            addCriterion("provincial_agent_item_status >", value, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("provincial_agent_item_status >=", value, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusLessThan(Integer value) {
            addCriterion("provincial_agent_item_status <", value, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("provincial_agent_item_status <=", value, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusIn(List<Integer> values) {
            addCriterion("provincial_agent_item_status in", values, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusNotIn(List<Integer> values) {
            addCriterion("provincial_agent_item_status not in", values, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("provincial_agent_item_status between", value1, value2, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("provincial_agent_item_status not between", value1, value2, "provincialAgentItemStatus");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeIsNull() {
            addCriterion("provincial_agent_item_type is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeIsNotNull() {
            addCriterion("provincial_agent_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeEqualTo(Integer value) {
            addCriterion("provincial_agent_item_type =", value, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeNotEqualTo(Integer value) {
            addCriterion("provincial_agent_item_type <>", value, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeGreaterThan(Integer value) {
            addCriterion("provincial_agent_item_type >", value, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("provincial_agent_item_type >=", value, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeLessThan(Integer value) {
            addCriterion("provincial_agent_item_type <", value, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("provincial_agent_item_type <=", value, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeIn(List<Integer> values) {
            addCriterion("provincial_agent_item_type in", values, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeNotIn(List<Integer> values) {
            addCriterion("provincial_agent_item_type not in", values, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("provincial_agent_item_type between", value1, value2, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("provincial_agent_item_type not between", value1, value2, "provincialAgentItemType");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateIsNull() {
            addCriterion("provincial_agent_item_created_date is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateIsNotNull() {
            addCriterion("provincial_agent_item_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateEqualTo(Date value) {
            addCriterion("provincial_agent_item_created_date =", value, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateNotEqualTo(Date value) {
            addCriterion("provincial_agent_item_created_date <>", value, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateGreaterThan(Date value) {
            addCriterion("provincial_agent_item_created_date >", value, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_item_created_date >=", value, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateLessThan(Date value) {
            addCriterion("provincial_agent_item_created_date <", value, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_item_created_date <=", value, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateIn(List<Date> values) {
            addCriterion("provincial_agent_item_created_date in", values, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateNotIn(List<Date> values) {
            addCriterion("provincial_agent_item_created_date not in", values, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_item_created_date between", value1, value2, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_item_created_date not between", value1, value2, "provincialAgentItemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateIsNull() {
            addCriterion("provincial_agent_item_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateIsNotNull() {
            addCriterion("provincial_agent_item_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateEqualTo(Date value) {
            addCriterion("provincial_agent_item_updated_date =", value, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateNotEqualTo(Date value) {
            addCriterion("provincial_agent_item_updated_date <>", value, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateGreaterThan(Date value) {
            addCriterion("provincial_agent_item_updated_date >", value, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_item_updated_date >=", value, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateLessThan(Date value) {
            addCriterion("provincial_agent_item_updated_date <", value, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("provincial_agent_item_updated_date <=", value, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateIn(List<Date> values) {
            addCriterion("provincial_agent_item_updated_date in", values, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateNotIn(List<Date> values) {
            addCriterion("provincial_agent_item_updated_date not in", values, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_item_updated_date between", value1, value2, "provincialAgentItemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andProvincialAgentItemUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("provincial_agent_item_updated_date not between", value1, value2, "provincialAgentItemUpdatedDate");
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