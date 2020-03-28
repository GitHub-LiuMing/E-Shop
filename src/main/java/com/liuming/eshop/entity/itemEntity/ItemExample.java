package com.liuming.eshop.entity.itemEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andCommissionIdIsNull() {
            addCriterion("commission_id is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIdIsNotNull() {
            addCriterion("commission_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionIdEqualTo(String value) {
            addCriterion("commission_id =", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdNotEqualTo(String value) {
            addCriterion("commission_id <>", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdGreaterThan(String value) {
            addCriterion("commission_id >", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("commission_id >=", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdLessThan(String value) {
            addCriterion("commission_id <", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdLessThanOrEqualTo(String value) {
            addCriterion("commission_id <=", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdLike(String value) {
            addCriterion("commission_id like", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdNotLike(String value) {
            addCriterion("commission_id not like", value, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdIn(List<String> values) {
            addCriterion("commission_id in", values, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdNotIn(List<String> values) {
            addCriterion("commission_id not in", values, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdBetween(String value1, String value2) {
            addCriterion("commission_id between", value1, value2, "commissionId");
            return (Criteria) this;
        }

        public Criteria andCommissionIdNotBetween(String value1, String value2) {
            addCriterion("commission_id not between", value1, value2, "commissionId");
            return (Criteria) this;
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

        public Criteria andItemOriginalPriceIsNull() {
            addCriterion("item_original_price is null");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceIsNotNull() {
            addCriterion("item_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceEqualTo(Double value) {
            addCriterion("item_original_price =", value, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceNotEqualTo(Double value) {
            addCriterion("item_original_price <>", value, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceGreaterThan(Double value) {
            addCriterion("item_original_price >", value, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("item_original_price >=", value, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceLessThan(Double value) {
            addCriterion("item_original_price <", value, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceLessThanOrEqualTo(Double value) {
            addCriterion("item_original_price <=", value, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceIn(List<Double> values) {
            addCriterion("item_original_price in", values, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceNotIn(List<Double> values) {
            addCriterion("item_original_price not in", values, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceBetween(Double value1, Double value2) {
            addCriterion("item_original_price between", value1, value2, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemOriginalPriceNotBetween(Double value1, Double value2) {
            addCriterion("item_original_price not between", value1, value2, "itemOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceIsNull() {
            addCriterion("item_present_price is null");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceIsNotNull() {
            addCriterion("item_present_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceEqualTo(Double value) {
            addCriterion("item_present_price =", value, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceNotEqualTo(Double value) {
            addCriterion("item_present_price <>", value, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceGreaterThan(Double value) {
            addCriterion("item_present_price >", value, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("item_present_price >=", value, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceLessThan(Double value) {
            addCriterion("item_present_price <", value, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceLessThanOrEqualTo(Double value) {
            addCriterion("item_present_price <=", value, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceIn(List<Double> values) {
            addCriterion("item_present_price in", values, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceNotIn(List<Double> values) {
            addCriterion("item_present_price not in", values, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceBetween(Double value1, Double value2) {
            addCriterion("item_present_price between", value1, value2, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemPresentPriceNotBetween(Double value1, Double value2) {
            addCriterion("item_present_price not between", value1, value2, "itemPresentPrice");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNull() {
            addCriterion("item_url is null");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNotNull() {
            addCriterion("item_url is not null");
            return (Criteria) this;
        }

        public Criteria andItemUrlEqualTo(String value) {
            addCriterion("item_url =", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotEqualTo(String value) {
            addCriterion("item_url <>", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThan(String value) {
            addCriterion("item_url >", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThanOrEqualTo(String value) {
            addCriterion("item_url >=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThan(String value) {
            addCriterion("item_url <", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThanOrEqualTo(String value) {
            addCriterion("item_url <=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLike(String value) {
            addCriterion("item_url like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotLike(String value) {
            addCriterion("item_url not like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlIn(List<String> values) {
            addCriterion("item_url in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotIn(List<String> values) {
            addCriterion("item_url not in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlBetween(String value1, String value2) {
            addCriterion("item_url between", value1, value2, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotBetween(String value1, String value2) {
            addCriterion("item_url not between", value1, value2, "itemUrl");
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

        public Criteria andMemberDiscountedStatusIsNull() {
            addCriterion("member_discounted_status is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusIsNotNull() {
            addCriterion("member_discounted_status is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusEqualTo(Integer value) {
            addCriterion("member_discounted_status =", value, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusNotEqualTo(Integer value) {
            addCriterion("member_discounted_status <>", value, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusGreaterThan(Integer value) {
            addCriterion("member_discounted_status >", value, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_discounted_status >=", value, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusLessThan(Integer value) {
            addCriterion("member_discounted_status <", value, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusLessThanOrEqualTo(Integer value) {
            addCriterion("member_discounted_status <=", value, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusIn(List<Integer> values) {
            addCriterion("member_discounted_status in", values, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusNotIn(List<Integer> values) {
            addCriterion("member_discounted_status not in", values, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusBetween(Integer value1, Integer value2) {
            addCriterion("member_discounted_status between", value1, value2, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("member_discounted_status not between", value1, value2, "memberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedIsNull() {
            addCriterion("member_discounted is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedIsNotNull() {
            addCriterion("member_discounted is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedEqualTo(Double value) {
            addCriterion("member_discounted =", value, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedNotEqualTo(Double value) {
            addCriterion("member_discounted <>", value, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedGreaterThan(Double value) {
            addCriterion("member_discounted >", value, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedGreaterThanOrEqualTo(Double value) {
            addCriterion("member_discounted >=", value, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedLessThan(Double value) {
            addCriterion("member_discounted <", value, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedLessThanOrEqualTo(Double value) {
            addCriterion("member_discounted <=", value, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedIn(List<Double> values) {
            addCriterion("member_discounted in", values, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedNotIn(List<Double> values) {
            addCriterion("member_discounted not in", values, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedBetween(Double value1, Double value2) {
            addCriterion("member_discounted between", value1, value2, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountedNotBetween(Double value1, Double value2) {
            addCriterion("member_discounted not between", value1, value2, "memberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusIsNull() {
            addCriterion("not_member_discounted_status is null");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusIsNotNull() {
            addCriterion("not_member_discounted_status is not null");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusEqualTo(Integer value) {
            addCriterion("not_member_discounted_status =", value, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusNotEqualTo(Integer value) {
            addCriterion("not_member_discounted_status <>", value, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusGreaterThan(Integer value) {
            addCriterion("not_member_discounted_status >", value, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_member_discounted_status >=", value, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusLessThan(Integer value) {
            addCriterion("not_member_discounted_status <", value, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusLessThanOrEqualTo(Integer value) {
            addCriterion("not_member_discounted_status <=", value, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusIn(List<Integer> values) {
            addCriterion("not_member_discounted_status in", values, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusNotIn(List<Integer> values) {
            addCriterion("not_member_discounted_status not in", values, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusBetween(Integer value1, Integer value2) {
            addCriterion("not_member_discounted_status between", value1, value2, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("not_member_discounted_status not between", value1, value2, "notMemberDiscountedStatus");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedIsNull() {
            addCriterion("not_member_discounted is null");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedIsNotNull() {
            addCriterion("not_member_discounted is not null");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedEqualTo(Double value) {
            addCriterion("not_member_discounted =", value, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedNotEqualTo(Double value) {
            addCriterion("not_member_discounted <>", value, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedGreaterThan(Double value) {
            addCriterion("not_member_discounted >", value, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedGreaterThanOrEqualTo(Double value) {
            addCriterion("not_member_discounted >=", value, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedLessThan(Double value) {
            addCriterion("not_member_discounted <", value, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedLessThanOrEqualTo(Double value) {
            addCriterion("not_member_discounted <=", value, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedIn(List<Double> values) {
            addCriterion("not_member_discounted in", values, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedNotIn(List<Double> values) {
            addCriterion("not_member_discounted not in", values, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedBetween(Double value1, Double value2) {
            addCriterion("not_member_discounted between", value1, value2, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andNotMemberDiscountedNotBetween(Double value1, Double value2) {
            addCriterion("not_member_discounted not between", value1, value2, "notMemberDiscounted");
            return (Criteria) this;
        }

        public Criteria andGmsxjfIsNull() {
            addCriterion("gmsxjf is null");
            return (Criteria) this;
        }

        public Criteria andGmsxjfIsNotNull() {
            addCriterion("gmsxjf is not null");
            return (Criteria) this;
        }

        public Criteria andGmsxjfEqualTo(Integer value) {
            addCriterion("gmsxjf =", value, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfNotEqualTo(Integer value) {
            addCriterion("gmsxjf <>", value, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfGreaterThan(Integer value) {
            addCriterion("gmsxjf >", value, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfGreaterThanOrEqualTo(Integer value) {
            addCriterion("gmsxjf >=", value, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfLessThan(Integer value) {
            addCriterion("gmsxjf <", value, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfLessThanOrEqualTo(Integer value) {
            addCriterion("gmsxjf <=", value, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfIn(List<Integer> values) {
            addCriterion("gmsxjf in", values, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfNotIn(List<Integer> values) {
            addCriterion("gmsxjf not in", values, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfBetween(Integer value1, Integer value2) {
            addCriterion("gmsxjf between", value1, value2, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andGmsxjfNotBetween(Integer value1, Integer value2) {
            addCriterion("gmsxjf not between", value1, value2, "gmsxjf");
            return (Criteria) this;
        }

        public Criteria andMrxgIsNull() {
            addCriterion("mrxg is null");
            return (Criteria) this;
        }

        public Criteria andMrxgIsNotNull() {
            addCriterion("mrxg is not null");
            return (Criteria) this;
        }

        public Criteria andMrxgEqualTo(Integer value) {
            addCriterion("mrxg =", value, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgNotEqualTo(Integer value) {
            addCriterion("mrxg <>", value, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgGreaterThan(Integer value) {
            addCriterion("mrxg >", value, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgGreaterThanOrEqualTo(Integer value) {
            addCriterion("mrxg >=", value, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgLessThan(Integer value) {
            addCriterion("mrxg <", value, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgLessThanOrEqualTo(Integer value) {
            addCriterion("mrxg <=", value, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgIn(List<Integer> values) {
            addCriterion("mrxg in", values, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgNotIn(List<Integer> values) {
            addCriterion("mrxg not in", values, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgBetween(Integer value1, Integer value2) {
            addCriterion("mrxg between", value1, value2, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrxgNotBetween(Integer value1, Integer value2) {
            addCriterion("mrxg not between", value1, value2, "mrxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgIsNull() {
            addCriterion("mrmtxg is null");
            return (Criteria) this;
        }

        public Criteria andMrmtxgIsNotNull() {
            addCriterion("mrmtxg is not null");
            return (Criteria) this;
        }

        public Criteria andMrmtxgEqualTo(Integer value) {
            addCriterion("mrmtxg =", value, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgNotEqualTo(Integer value) {
            addCriterion("mrmtxg <>", value, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgGreaterThan(Integer value) {
            addCriterion("mrmtxg >", value, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgGreaterThanOrEqualTo(Integer value) {
            addCriterion("mrmtxg >=", value, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgLessThan(Integer value) {
            addCriterion("mrmtxg <", value, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgLessThanOrEqualTo(Integer value) {
            addCriterion("mrmtxg <=", value, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgIn(List<Integer> values) {
            addCriterion("mrmtxg in", values, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgNotIn(List<Integer> values) {
            addCriterion("mrmtxg not in", values, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgBetween(Integer value1, Integer value2) {
            addCriterion("mrmtxg between", value1, value2, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andMrmtxgNotBetween(Integer value1, Integer value2) {
            addCriterion("mrmtxg not between", value1, value2, "mrmtxg");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqIsNull() {
            addCriterion("sfsyyhq is null");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqIsNotNull() {
            addCriterion("sfsyyhq is not null");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqEqualTo(Integer value) {
            addCriterion("sfsyyhq =", value, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqNotEqualTo(Integer value) {
            addCriterion("sfsyyhq <>", value, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqGreaterThan(Integer value) {
            addCriterion("sfsyyhq >", value, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqGreaterThanOrEqualTo(Integer value) {
            addCriterion("sfsyyhq >=", value, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqLessThan(Integer value) {
            addCriterion("sfsyyhq <", value, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqLessThanOrEqualTo(Integer value) {
            addCriterion("sfsyyhq <=", value, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqIn(List<Integer> values) {
            addCriterion("sfsyyhq in", values, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqNotIn(List<Integer> values) {
            addCriterion("sfsyyhq not in", values, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqBetween(Integer value1, Integer value2) {
            addCriterion("sfsyyhq between", value1, value2, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andSfsyyhqNotBetween(Integer value1, Integer value2) {
            addCriterion("sfsyyhq not between", value1, value2, "sfsyyhq");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateIsNull() {
            addCriterion("item_created_date is null");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateIsNotNull() {
            addCriterion("item_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateEqualTo(Date value) {
            addCriterion("item_created_date =", value, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateNotEqualTo(Date value) {
            addCriterion("item_created_date <>", value, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateGreaterThan(Date value) {
            addCriterion("item_created_date >", value, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("item_created_date >=", value, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateLessThan(Date value) {
            addCriterion("item_created_date <", value, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("item_created_date <=", value, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateIn(List<Date> values) {
            addCriterion("item_created_date in", values, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateNotIn(List<Date> values) {
            addCriterion("item_created_date not in", values, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateBetween(Date value1, Date value2) {
            addCriterion("item_created_date between", value1, value2, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("item_created_date not between", value1, value2, "itemCreatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateIsNull() {
            addCriterion("item_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateIsNotNull() {
            addCriterion("item_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateEqualTo(Date value) {
            addCriterion("item_updated_date =", value, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateNotEqualTo(Date value) {
            addCriterion("item_updated_date <>", value, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateGreaterThan(Date value) {
            addCriterion("item_updated_date >", value, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("item_updated_date >=", value, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateLessThan(Date value) {
            addCriterion("item_updated_date <", value, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("item_updated_date <=", value, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateIn(List<Date> values) {
            addCriterion("item_updated_date in", values, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateNotIn(List<Date> values) {
            addCriterion("item_updated_date not in", values, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("item_updated_date between", value1, value2, "itemUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("item_updated_date not between", value1, value2, "itemUpdatedDate");
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