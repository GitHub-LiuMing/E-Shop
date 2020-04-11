package com.liuming.eshop.entity.commissionEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommissionExample() {
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

        public Criteria andCommissionNameIsNull() {
            addCriterion("commission_name is null");
            return (Criteria) this;
        }

        public Criteria andCommissionNameIsNotNull() {
            addCriterion("commission_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionNameEqualTo(String value) {
            addCriterion("commission_name =", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameNotEqualTo(String value) {
            addCriterion("commission_name <>", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameGreaterThan(String value) {
            addCriterion("commission_name >", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("commission_name >=", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameLessThan(String value) {
            addCriterion("commission_name <", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameLessThanOrEqualTo(String value) {
            addCriterion("commission_name <=", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameLike(String value) {
            addCriterion("commission_name like", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameNotLike(String value) {
            addCriterion("commission_name not like", value, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameIn(List<String> values) {
            addCriterion("commission_name in", values, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameNotIn(List<String> values) {
            addCriterion("commission_name not in", values, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameBetween(String value1, String value2) {
            addCriterion("commission_name between", value1, value2, "commissionName");
            return (Criteria) this;
        }

        public Criteria andCommissionNameNotBetween(String value1, String value2) {
            addCriterion("commission_name not between", value1, value2, "commissionName");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceIsNull() {
            addCriterion("hy_hy_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceIsNotNull() {
            addCriterion("hy_hy_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceEqualTo(Double value) {
            addCriterion("hy_hy_zt_price =", value, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceNotEqualTo(Double value) {
            addCriterion("hy_hy_zt_price <>", value, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceGreaterThan(Double value) {
            addCriterion("hy_hy_zt_price >", value, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hy_hy_zt_price >=", value, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceLessThan(Double value) {
            addCriterion("hy_hy_zt_price <", value, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("hy_hy_zt_price <=", value, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceIn(List<Double> values) {
            addCriterion("hy_hy_zt_price in", values, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceNotIn(List<Double> values) {
            addCriterion("hy_hy_zt_price not in", values, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceBetween(Double value1, Double value2) {
            addCriterion("hy_hy_zt_price between", value1, value2, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyHyZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("hy_hy_zt_price not between", value1, value2, "hyHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceIsNull() {
            addCriterion("hy_gj_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceIsNotNull() {
            addCriterion("hy_gj_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceEqualTo(Double value) {
            addCriterion("hy_gj_zt_price =", value, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceNotEqualTo(Double value) {
            addCriterion("hy_gj_zt_price <>", value, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceGreaterThan(Double value) {
            addCriterion("hy_gj_zt_price >", value, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hy_gj_zt_price >=", value, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceLessThan(Double value) {
            addCriterion("hy_gj_zt_price <", value, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("hy_gj_zt_price <=", value, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceIn(List<Double> values) {
            addCriterion("hy_gj_zt_price in", values, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceNotIn(List<Double> values) {
            addCriterion("hy_gj_zt_price not in", values, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceBetween(Double value1, Double value2) {
            addCriterion("hy_gj_zt_price between", value1, value2, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyGjZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("hy_gj_zt_price not between", value1, value2, "hyGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceIsNull() {
            addCriterion("hy_dl_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceIsNotNull() {
            addCriterion("hy_dl_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceEqualTo(Double value) {
            addCriterion("hy_dl_zt_price =", value, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceNotEqualTo(Double value) {
            addCriterion("hy_dl_zt_price <>", value, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceGreaterThan(Double value) {
            addCriterion("hy_dl_zt_price >", value, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hy_dl_zt_price >=", value, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceLessThan(Double value) {
            addCriterion("hy_dl_zt_price <", value, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("hy_dl_zt_price <=", value, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceIn(List<Double> values) {
            addCriterion("hy_dl_zt_price in", values, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceNotIn(List<Double> values) {
            addCriterion("hy_dl_zt_price not in", values, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceBetween(Double value1, Double value2) {
            addCriterion("hy_dl_zt_price between", value1, value2, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andHyDlZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("hy_dl_zt_price not between", value1, value2, "hyDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceIsNull() {
            addCriterion("gj_hy_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceIsNotNull() {
            addCriterion("gj_hy_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceEqualTo(Double value) {
            addCriterion("gj_hy_zt_price =", value, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceNotEqualTo(Double value) {
            addCriterion("gj_hy_zt_price <>", value, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceGreaterThan(Double value) {
            addCriterion("gj_hy_zt_price >", value, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gj_hy_zt_price >=", value, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceLessThan(Double value) {
            addCriterion("gj_hy_zt_price <", value, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("gj_hy_zt_price <=", value, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceIn(List<Double> values) {
            addCriterion("gj_hy_zt_price in", values, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceNotIn(List<Double> values) {
            addCriterion("gj_hy_zt_price not in", values, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceBetween(Double value1, Double value2) {
            addCriterion("gj_hy_zt_price between", value1, value2, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("gj_hy_zt_price not between", value1, value2, "gjHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceIsNull() {
            addCriterion("gj_hy_td_price is null");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceIsNotNull() {
            addCriterion("gj_hy_td_price is not null");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceEqualTo(Double value) {
            addCriterion("gj_hy_td_price =", value, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceNotEqualTo(Double value) {
            addCriterion("gj_hy_td_price <>", value, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceGreaterThan(Double value) {
            addCriterion("gj_hy_td_price >", value, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gj_hy_td_price >=", value, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceLessThan(Double value) {
            addCriterion("gj_hy_td_price <", value, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceLessThanOrEqualTo(Double value) {
            addCriterion("gj_hy_td_price <=", value, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceIn(List<Double> values) {
            addCriterion("gj_hy_td_price in", values, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceNotIn(List<Double> values) {
            addCriterion("gj_hy_td_price not in", values, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceBetween(Double value1, Double value2) {
            addCriterion("gj_hy_td_price between", value1, value2, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyTdPriceNotBetween(Double value1, Double value2) {
            addCriterion("gj_hy_td_price not between", value1, value2, "gjHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceIsNull() {
            addCriterion("gj_hy_fg_price is null");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceIsNotNull() {
            addCriterion("gj_hy_fg_price is not null");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceEqualTo(Double value) {
            addCriterion("gj_hy_fg_price =", value, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceNotEqualTo(Double value) {
            addCriterion("gj_hy_fg_price <>", value, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceGreaterThan(Double value) {
            addCriterion("gj_hy_fg_price >", value, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gj_hy_fg_price >=", value, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceLessThan(Double value) {
            addCriterion("gj_hy_fg_price <", value, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceLessThanOrEqualTo(Double value) {
            addCriterion("gj_hy_fg_price <=", value, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceIn(List<Double> values) {
            addCriterion("gj_hy_fg_price in", values, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceNotIn(List<Double> values) {
            addCriterion("gj_hy_fg_price not in", values, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceBetween(Double value1, Double value2) {
            addCriterion("gj_hy_fg_price between", value1, value2, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjHyFgPriceNotBetween(Double value1, Double value2) {
            addCriterion("gj_hy_fg_price not between", value1, value2, "gjHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceIsNull() {
            addCriterion("gj_gj_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceIsNotNull() {
            addCriterion("gj_gj_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceEqualTo(Double value) {
            addCriterion("gj_gj_zt_price =", value, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceNotEqualTo(Double value) {
            addCriterion("gj_gj_zt_price <>", value, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceGreaterThan(Double value) {
            addCriterion("gj_gj_zt_price >", value, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gj_gj_zt_price >=", value, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceLessThan(Double value) {
            addCriterion("gj_gj_zt_price <", value, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("gj_gj_zt_price <=", value, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceIn(List<Double> values) {
            addCriterion("gj_gj_zt_price in", values, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceNotIn(List<Double> values) {
            addCriterion("gj_gj_zt_price not in", values, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceBetween(Double value1, Double value2) {
            addCriterion("gj_gj_zt_price between", value1, value2, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("gj_gj_zt_price not between", value1, value2, "gjGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceIsNull() {
            addCriterion("gj_gj_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceIsNotNull() {
            addCriterion("gj_gj_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceEqualTo(Double value) {
            addCriterion("gj_gj_jt_price =", value, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceNotEqualTo(Double value) {
            addCriterion("gj_gj_jt_price <>", value, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceGreaterThan(Double value) {
            addCriterion("gj_gj_jt_price >", value, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gj_gj_jt_price >=", value, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceLessThan(Double value) {
            addCriterion("gj_gj_jt_price <", value, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("gj_gj_jt_price <=", value, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceIn(List<Double> values) {
            addCriterion("gj_gj_jt_price in", values, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceNotIn(List<Double> values) {
            addCriterion("gj_gj_jt_price not in", values, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceBetween(Double value1, Double value2) {
            addCriterion("gj_gj_jt_price between", value1, value2, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjGjJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("gj_gj_jt_price not between", value1, value2, "gjGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceIsNull() {
            addCriterion("gj_dl_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceIsNotNull() {
            addCriterion("gj_dl_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceEqualTo(Double value) {
            addCriterion("gj_dl_zt_price =", value, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceNotEqualTo(Double value) {
            addCriterion("gj_dl_zt_price <>", value, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceGreaterThan(Double value) {
            addCriterion("gj_dl_zt_price >", value, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gj_dl_zt_price >=", value, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceLessThan(Double value) {
            addCriterion("gj_dl_zt_price <", value, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("gj_dl_zt_price <=", value, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceIn(List<Double> values) {
            addCriterion("gj_dl_zt_price in", values, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceNotIn(List<Double> values) {
            addCriterion("gj_dl_zt_price not in", values, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceBetween(Double value1, Double value2) {
            addCriterion("gj_dl_zt_price between", value1, value2, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("gj_dl_zt_price not between", value1, value2, "gjDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceIsNull() {
            addCriterion("gj_dl_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceIsNotNull() {
            addCriterion("gj_dl_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceEqualTo(Double value) {
            addCriterion("gj_dl_jt_price =", value, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceNotEqualTo(Double value) {
            addCriterion("gj_dl_jt_price <>", value, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceGreaterThan(Double value) {
            addCriterion("gj_dl_jt_price >", value, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gj_dl_jt_price >=", value, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceLessThan(Double value) {
            addCriterion("gj_dl_jt_price <", value, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("gj_dl_jt_price <=", value, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceIn(List<Double> values) {
            addCriterion("gj_dl_jt_price in", values, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceNotIn(List<Double> values) {
            addCriterion("gj_dl_jt_price not in", values, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceBetween(Double value1, Double value2) {
            addCriterion("gj_dl_jt_price between", value1, value2, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andGjDlJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("gj_dl_jt_price not between", value1, value2, "gjDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceIsNull() {
            addCriterion("vip_hy_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceIsNotNull() {
            addCriterion("vip_hy_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceEqualTo(Double value) {
            addCriterion("vip_hy_zt_price =", value, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceNotEqualTo(Double value) {
            addCriterion("vip_hy_zt_price <>", value, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceGreaterThan(Double value) {
            addCriterion("vip_hy_zt_price >", value, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_hy_zt_price >=", value, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceLessThan(Double value) {
            addCriterion("vip_hy_zt_price <", value, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_hy_zt_price <=", value, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceIn(List<Double> values) {
            addCriterion("vip_hy_zt_price in", values, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceNotIn(List<Double> values) {
            addCriterion("vip_hy_zt_price not in", values, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceBetween(Double value1, Double value2) {
            addCriterion("vip_hy_zt_price between", value1, value2, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_hy_zt_price not between", value1, value2, "vipHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceIsNull() {
            addCriterion("vip_hy_td_price is null");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceIsNotNull() {
            addCriterion("vip_hy_td_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceEqualTo(Double value) {
            addCriterion("vip_hy_td_price =", value, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceNotEqualTo(Double value) {
            addCriterion("vip_hy_td_price <>", value, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceGreaterThan(Double value) {
            addCriterion("vip_hy_td_price >", value, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_hy_td_price >=", value, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceLessThan(Double value) {
            addCriterion("vip_hy_td_price <", value, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_hy_td_price <=", value, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceIn(List<Double> values) {
            addCriterion("vip_hy_td_price in", values, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceNotIn(List<Double> values) {
            addCriterion("vip_hy_td_price not in", values, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceBetween(Double value1, Double value2) {
            addCriterion("vip_hy_td_price between", value1, value2, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyTdPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_hy_td_price not between", value1, value2, "vipHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceIsNull() {
            addCriterion("vip_hy_fg_price is null");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceIsNotNull() {
            addCriterion("vip_hy_fg_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceEqualTo(Double value) {
            addCriterion("vip_hy_fg_price =", value, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceNotEqualTo(Double value) {
            addCriterion("vip_hy_fg_price <>", value, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceGreaterThan(Double value) {
            addCriterion("vip_hy_fg_price >", value, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_hy_fg_price >=", value, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceLessThan(Double value) {
            addCriterion("vip_hy_fg_price <", value, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_hy_fg_price <=", value, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceIn(List<Double> values) {
            addCriterion("vip_hy_fg_price in", values, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceNotIn(List<Double> values) {
            addCriterion("vip_hy_fg_price not in", values, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceBetween(Double value1, Double value2) {
            addCriterion("vip_hy_fg_price between", value1, value2, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipHyFgPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_hy_fg_price not between", value1, value2, "vipHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceIsNull() {
            addCriterion("vip_gj_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceIsNotNull() {
            addCriterion("vip_gj_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceEqualTo(Double value) {
            addCriterion("vip_gj_zt_price =", value, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceNotEqualTo(Double value) {
            addCriterion("vip_gj_zt_price <>", value, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceGreaterThan(Double value) {
            addCriterion("vip_gj_zt_price >", value, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_gj_zt_price >=", value, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceLessThan(Double value) {
            addCriterion("vip_gj_zt_price <", value, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_gj_zt_price <=", value, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceIn(List<Double> values) {
            addCriterion("vip_gj_zt_price in", values, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceNotIn(List<Double> values) {
            addCriterion("vip_gj_zt_price not in", values, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceBetween(Double value1, Double value2) {
            addCriterion("vip_gj_zt_price between", value1, value2, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_gj_zt_price not between", value1, value2, "vipGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceIsNull() {
            addCriterion("vip_gj_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceIsNotNull() {
            addCriterion("vip_gj_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceEqualTo(Double value) {
            addCriterion("vip_gj_jt_price =", value, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceNotEqualTo(Double value) {
            addCriterion("vip_gj_jt_price <>", value, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceGreaterThan(Double value) {
            addCriterion("vip_gj_jt_price >", value, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_gj_jt_price >=", value, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceLessThan(Double value) {
            addCriterion("vip_gj_jt_price <", value, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_gj_jt_price <=", value, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceIn(List<Double> values) {
            addCriterion("vip_gj_jt_price in", values, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceNotIn(List<Double> values) {
            addCriterion("vip_gj_jt_price not in", values, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceBetween(Double value1, Double value2) {
            addCriterion("vip_gj_jt_price between", value1, value2, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_gj_jt_price not between", value1, value2, "vipGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceIsNull() {
            addCriterion("vip_gj_td_price is null");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceIsNotNull() {
            addCriterion("vip_gj_td_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceEqualTo(Double value) {
            addCriterion("vip_gj_td_price =", value, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceNotEqualTo(Double value) {
            addCriterion("vip_gj_td_price <>", value, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceGreaterThan(Double value) {
            addCriterion("vip_gj_td_price >", value, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_gj_td_price >=", value, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceLessThan(Double value) {
            addCriterion("vip_gj_td_price <", value, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_gj_td_price <=", value, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceIn(List<Double> values) {
            addCriterion("vip_gj_td_price in", values, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceNotIn(List<Double> values) {
            addCriterion("vip_gj_td_price not in", values, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceBetween(Double value1, Double value2) {
            addCriterion("vip_gj_td_price between", value1, value2, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipGjTdPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_gj_td_price not between", value1, value2, "vipGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceIsNull() {
            addCriterion("vip_dl_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceIsNotNull() {
            addCriterion("vip_dl_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceEqualTo(Double value) {
            addCriterion("vip_dl_zt_price =", value, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceNotEqualTo(Double value) {
            addCriterion("vip_dl_zt_price <>", value, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceGreaterThan(Double value) {
            addCriterion("vip_dl_zt_price >", value, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_dl_zt_price >=", value, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceLessThan(Double value) {
            addCriterion("vip_dl_zt_price <", value, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_dl_zt_price <=", value, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceIn(List<Double> values) {
            addCriterion("vip_dl_zt_price in", values, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceNotIn(List<Double> values) {
            addCriterion("vip_dl_zt_price not in", values, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceBetween(Double value1, Double value2) {
            addCriterion("vip_dl_zt_price between", value1, value2, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_dl_zt_price not between", value1, value2, "vipDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceIsNull() {
            addCriterion("vip_dl_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceIsNotNull() {
            addCriterion("vip_dl_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceEqualTo(Double value) {
            addCriterion("vip_dl_jt_price =", value, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceNotEqualTo(Double value) {
            addCriterion("vip_dl_jt_price <>", value, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceGreaterThan(Double value) {
            addCriterion("vip_dl_jt_price >", value, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vip_dl_jt_price >=", value, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceLessThan(Double value) {
            addCriterion("vip_dl_jt_price <", value, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("vip_dl_jt_price <=", value, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceIn(List<Double> values) {
            addCriterion("vip_dl_jt_price in", values, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceNotIn(List<Double> values) {
            addCriterion("vip_dl_jt_price not in", values, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceBetween(Double value1, Double value2) {
            addCriterion("vip_dl_jt_price between", value1, value2, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andVipDlJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("vip_dl_jt_price not between", value1, value2, "vipDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceIsNull() {
            addCriterion("zz_hy_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceIsNotNull() {
            addCriterion("zz_hy_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceEqualTo(Double value) {
            addCriterion("zz_hy_zt_price =", value, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceNotEqualTo(Double value) {
            addCriterion("zz_hy_zt_price <>", value, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceGreaterThan(Double value) {
            addCriterion("zz_hy_zt_price >", value, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_hy_zt_price >=", value, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceLessThan(Double value) {
            addCriterion("zz_hy_zt_price <", value, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_hy_zt_price <=", value, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceIn(List<Double> values) {
            addCriterion("zz_hy_zt_price in", values, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceNotIn(List<Double> values) {
            addCriterion("zz_hy_zt_price not in", values, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceBetween(Double value1, Double value2) {
            addCriterion("zz_hy_zt_price between", value1, value2, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_hy_zt_price not between", value1, value2, "zzHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceIsNull() {
            addCriterion("zz_hy_td_price is null");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceIsNotNull() {
            addCriterion("zz_hy_td_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceEqualTo(Double value) {
            addCriterion("zz_hy_td_price =", value, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceNotEqualTo(Double value) {
            addCriterion("zz_hy_td_price <>", value, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceGreaterThan(Double value) {
            addCriterion("zz_hy_td_price >", value, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_hy_td_price >=", value, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceLessThan(Double value) {
            addCriterion("zz_hy_td_price <", value, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_hy_td_price <=", value, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceIn(List<Double> values) {
            addCriterion("zz_hy_td_price in", values, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceNotIn(List<Double> values) {
            addCriterion("zz_hy_td_price not in", values, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceBetween(Double value1, Double value2) {
            addCriterion("zz_hy_td_price between", value1, value2, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyTdPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_hy_td_price not between", value1, value2, "zzHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceIsNull() {
            addCriterion("zz_hy_fg_price is null");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceIsNotNull() {
            addCriterion("zz_hy_fg_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceEqualTo(Double value) {
            addCriterion("zz_hy_fg_price =", value, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceNotEqualTo(Double value) {
            addCriterion("zz_hy_fg_price <>", value, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceGreaterThan(Double value) {
            addCriterion("zz_hy_fg_price >", value, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_hy_fg_price >=", value, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceLessThan(Double value) {
            addCriterion("zz_hy_fg_price <", value, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_hy_fg_price <=", value, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceIn(List<Double> values) {
            addCriterion("zz_hy_fg_price in", values, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceNotIn(List<Double> values) {
            addCriterion("zz_hy_fg_price not in", values, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceBetween(Double value1, Double value2) {
            addCriterion("zz_hy_fg_price between", value1, value2, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzHyFgPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_hy_fg_price not between", value1, value2, "zzHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceIsNull() {
            addCriterion("zz_gj_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceIsNotNull() {
            addCriterion("zz_gj_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceEqualTo(Double value) {
            addCriterion("zz_gj_zt_price =", value, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceNotEqualTo(Double value) {
            addCriterion("zz_gj_zt_price <>", value, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceGreaterThan(Double value) {
            addCriterion("zz_gj_zt_price >", value, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_gj_zt_price >=", value, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceLessThan(Double value) {
            addCriterion("zz_gj_zt_price <", value, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_gj_zt_price <=", value, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceIn(List<Double> values) {
            addCriterion("zz_gj_zt_price in", values, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceNotIn(List<Double> values) {
            addCriterion("zz_gj_zt_price not in", values, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceBetween(Double value1, Double value2) {
            addCriterion("zz_gj_zt_price between", value1, value2, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_gj_zt_price not between", value1, value2, "zzGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceIsNull() {
            addCriterion("zz_gj_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceIsNotNull() {
            addCriterion("zz_gj_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceEqualTo(Double value) {
            addCriterion("zz_gj_jt_price =", value, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceNotEqualTo(Double value) {
            addCriterion("zz_gj_jt_price <>", value, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceGreaterThan(Double value) {
            addCriterion("zz_gj_jt_price >", value, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_gj_jt_price >=", value, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceLessThan(Double value) {
            addCriterion("zz_gj_jt_price <", value, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_gj_jt_price <=", value, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceIn(List<Double> values) {
            addCriterion("zz_gj_jt_price in", values, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceNotIn(List<Double> values) {
            addCriterion("zz_gj_jt_price not in", values, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceBetween(Double value1, Double value2) {
            addCriterion("zz_gj_jt_price between", value1, value2, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_gj_jt_price not between", value1, value2, "zzGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceIsNull() {
            addCriterion("zz_gj_td_price is null");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceIsNotNull() {
            addCriterion("zz_gj_td_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceEqualTo(Double value) {
            addCriterion("zz_gj_td_price =", value, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceNotEqualTo(Double value) {
            addCriterion("zz_gj_td_price <>", value, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceGreaterThan(Double value) {
            addCriterion("zz_gj_td_price >", value, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_gj_td_price >=", value, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceLessThan(Double value) {
            addCriterion("zz_gj_td_price <", value, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_gj_td_price <=", value, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceIn(List<Double> values) {
            addCriterion("zz_gj_td_price in", values, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceNotIn(List<Double> values) {
            addCriterion("zz_gj_td_price not in", values, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceBetween(Double value1, Double value2) {
            addCriterion("zz_gj_td_price between", value1, value2, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjTdPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_gj_td_price not between", value1, value2, "zzGjTdPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceIsNull() {
            addCriterion("zz_gj_pj_price is null");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceIsNotNull() {
            addCriterion("zz_gj_pj_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceEqualTo(Double value) {
            addCriterion("zz_gj_pj_price =", value, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceNotEqualTo(Double value) {
            addCriterion("zz_gj_pj_price <>", value, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceGreaterThan(Double value) {
            addCriterion("zz_gj_pj_price >", value, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_gj_pj_price >=", value, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceLessThan(Double value) {
            addCriterion("zz_gj_pj_price <", value, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_gj_pj_price <=", value, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceIn(List<Double> values) {
            addCriterion("zz_gj_pj_price in", values, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceNotIn(List<Double> values) {
            addCriterion("zz_gj_pj_price not in", values, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceBetween(Double value1, Double value2) {
            addCriterion("zz_gj_pj_price between", value1, value2, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzGjPjPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_gj_pj_price not between", value1, value2, "zzGjPjPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceIsNull() {
            addCriterion("zz_dl_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceIsNotNull() {
            addCriterion("zz_dl_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceEqualTo(Double value) {
            addCriterion("zz_dl_zt_price =", value, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceNotEqualTo(Double value) {
            addCriterion("zz_dl_zt_price <>", value, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceGreaterThan(Double value) {
            addCriterion("zz_dl_zt_price >", value, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_dl_zt_price >=", value, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceLessThan(Double value) {
            addCriterion("zz_dl_zt_price <", value, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_dl_zt_price <=", value, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceIn(List<Double> values) {
            addCriterion("zz_dl_zt_price in", values, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceNotIn(List<Double> values) {
            addCriterion("zz_dl_zt_price not in", values, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceBetween(Double value1, Double value2) {
            addCriterion("zz_dl_zt_price between", value1, value2, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_dl_zt_price not between", value1, value2, "zzDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceIsNull() {
            addCriterion("zz_dl_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceIsNotNull() {
            addCriterion("zz_dl_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceEqualTo(Double value) {
            addCriterion("zz_dl_jt_price =", value, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceNotEqualTo(Double value) {
            addCriterion("zz_dl_jt_price <>", value, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceGreaterThan(Double value) {
            addCriterion("zz_dl_jt_price >", value, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zz_dl_jt_price >=", value, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceLessThan(Double value) {
            addCriterion("zz_dl_jt_price <", value, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("zz_dl_jt_price <=", value, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceIn(List<Double> values) {
            addCriterion("zz_dl_jt_price in", values, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceNotIn(List<Double> values) {
            addCriterion("zz_dl_jt_price not in", values, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceBetween(Double value1, Double value2) {
            addCriterion("zz_dl_jt_price between", value1, value2, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andZzDlJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("zz_dl_jt_price not between", value1, value2, "zzDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceIsNull() {
            addCriterion("dl_hy_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceIsNotNull() {
            addCriterion("dl_hy_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceEqualTo(Double value) {
            addCriterion("dl_hy_zt_price =", value, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceNotEqualTo(Double value) {
            addCriterion("dl_hy_zt_price <>", value, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceGreaterThan(Double value) {
            addCriterion("dl_hy_zt_price >", value, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dl_hy_zt_price >=", value, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceLessThan(Double value) {
            addCriterion("dl_hy_zt_price <", value, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("dl_hy_zt_price <=", value, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceIn(List<Double> values) {
            addCriterion("dl_hy_zt_price in", values, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceNotIn(List<Double> values) {
            addCriterion("dl_hy_zt_price not in", values, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceBetween(Double value1, Double value2) {
            addCriterion("dl_hy_zt_price between", value1, value2, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("dl_hy_zt_price not between", value1, value2, "dlHyZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceIsNull() {
            addCriterion("dl_hy_td_price is null");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceIsNotNull() {
            addCriterion("dl_hy_td_price is not null");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceEqualTo(Double value) {
            addCriterion("dl_hy_td_price =", value, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceNotEqualTo(Double value) {
            addCriterion("dl_hy_td_price <>", value, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceGreaterThan(Double value) {
            addCriterion("dl_hy_td_price >", value, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dl_hy_td_price >=", value, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceLessThan(Double value) {
            addCriterion("dl_hy_td_price <", value, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceLessThanOrEqualTo(Double value) {
            addCriterion("dl_hy_td_price <=", value, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceIn(List<Double> values) {
            addCriterion("dl_hy_td_price in", values, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceNotIn(List<Double> values) {
            addCriterion("dl_hy_td_price not in", values, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceBetween(Double value1, Double value2) {
            addCriterion("dl_hy_td_price between", value1, value2, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyTdPriceNotBetween(Double value1, Double value2) {
            addCriterion("dl_hy_td_price not between", value1, value2, "dlHyTdPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceIsNull() {
            addCriterion("dl_hy_fg_price is null");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceIsNotNull() {
            addCriterion("dl_hy_fg_price is not null");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceEqualTo(Double value) {
            addCriterion("dl_hy_fg_price =", value, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceNotEqualTo(Double value) {
            addCriterion("dl_hy_fg_price <>", value, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceGreaterThan(Double value) {
            addCriterion("dl_hy_fg_price >", value, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dl_hy_fg_price >=", value, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceLessThan(Double value) {
            addCriterion("dl_hy_fg_price <", value, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceLessThanOrEqualTo(Double value) {
            addCriterion("dl_hy_fg_price <=", value, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceIn(List<Double> values) {
            addCriterion("dl_hy_fg_price in", values, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceNotIn(List<Double> values) {
            addCriterion("dl_hy_fg_price not in", values, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceBetween(Double value1, Double value2) {
            addCriterion("dl_hy_fg_price between", value1, value2, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlHyFgPriceNotBetween(Double value1, Double value2) {
            addCriterion("dl_hy_fg_price not between", value1, value2, "dlHyFgPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceIsNull() {
            addCriterion("dl_gj_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceIsNotNull() {
            addCriterion("dl_gj_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceEqualTo(Double value) {
            addCriterion("dl_gj_zt_price =", value, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceNotEqualTo(Double value) {
            addCriterion("dl_gj_zt_price <>", value, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceGreaterThan(Double value) {
            addCriterion("dl_gj_zt_price >", value, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dl_gj_zt_price >=", value, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceLessThan(Double value) {
            addCriterion("dl_gj_zt_price <", value, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("dl_gj_zt_price <=", value, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceIn(List<Double> values) {
            addCriterion("dl_gj_zt_price in", values, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceNotIn(List<Double> values) {
            addCriterion("dl_gj_zt_price not in", values, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceBetween(Double value1, Double value2) {
            addCriterion("dl_gj_zt_price between", value1, value2, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("dl_gj_zt_price not between", value1, value2, "dlGjZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceIsNull() {
            addCriterion("dl_gj_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceIsNotNull() {
            addCriterion("dl_gj_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceEqualTo(Double value) {
            addCriterion("dl_gj_jt_price =", value, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceNotEqualTo(Double value) {
            addCriterion("dl_gj_jt_price <>", value, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceGreaterThan(Double value) {
            addCriterion("dl_gj_jt_price >", value, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dl_gj_jt_price >=", value, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceLessThan(Double value) {
            addCriterion("dl_gj_jt_price <", value, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("dl_gj_jt_price <=", value, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceIn(List<Double> values) {
            addCriterion("dl_gj_jt_price in", values, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceNotIn(List<Double> values) {
            addCriterion("dl_gj_jt_price not in", values, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceBetween(Double value1, Double value2) {
            addCriterion("dl_gj_jt_price between", value1, value2, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlGjJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("dl_gj_jt_price not between", value1, value2, "dlGjJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceIsNull() {
            addCriterion("dl_dl_zt_price is null");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceIsNotNull() {
            addCriterion("dl_dl_zt_price is not null");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceEqualTo(Double value) {
            addCriterion("dl_dl_zt_price =", value, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceNotEqualTo(Double value) {
            addCriterion("dl_dl_zt_price <>", value, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceGreaterThan(Double value) {
            addCriterion("dl_dl_zt_price >", value, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dl_dl_zt_price >=", value, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceLessThan(Double value) {
            addCriterion("dl_dl_zt_price <", value, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceLessThanOrEqualTo(Double value) {
            addCriterion("dl_dl_zt_price <=", value, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceIn(List<Double> values) {
            addCriterion("dl_dl_zt_price in", values, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceNotIn(List<Double> values) {
            addCriterion("dl_dl_zt_price not in", values, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceBetween(Double value1, Double value2) {
            addCriterion("dl_dl_zt_price between", value1, value2, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlZtPriceNotBetween(Double value1, Double value2) {
            addCriterion("dl_dl_zt_price not between", value1, value2, "dlDlZtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceIsNull() {
            addCriterion("dl_dl_jt_price is null");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceIsNotNull() {
            addCriterion("dl_dl_jt_price is not null");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceEqualTo(Double value) {
            addCriterion("dl_dl_jt_price =", value, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceNotEqualTo(Double value) {
            addCriterion("dl_dl_jt_price <>", value, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceGreaterThan(Double value) {
            addCriterion("dl_dl_jt_price >", value, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dl_dl_jt_price >=", value, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceLessThan(Double value) {
            addCriterion("dl_dl_jt_price <", value, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceLessThanOrEqualTo(Double value) {
            addCriterion("dl_dl_jt_price <=", value, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceIn(List<Double> values) {
            addCriterion("dl_dl_jt_price in", values, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceNotIn(List<Double> values) {
            addCriterion("dl_dl_jt_price not in", values, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceBetween(Double value1, Double value2) {
            addCriterion("dl_dl_jt_price between", value1, value2, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andDlDlJtPriceNotBetween(Double value1, Double value2) {
            addCriterion("dl_dl_jt_price not between", value1, value2, "dlDlJtPrice");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusIsNull() {
            addCriterion("commission_status is null");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusIsNotNull() {
            addCriterion("commission_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusEqualTo(Integer value) {
            addCriterion("commission_status =", value, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusNotEqualTo(Integer value) {
            addCriterion("commission_status <>", value, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusGreaterThan(Integer value) {
            addCriterion("commission_status >", value, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission_status >=", value, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusLessThan(Integer value) {
            addCriterion("commission_status <", value, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("commission_status <=", value, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusIn(List<Integer> values) {
            addCriterion("commission_status in", values, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusNotIn(List<Integer> values) {
            addCriterion("commission_status not in", values, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusBetween(Integer value1, Integer value2) {
            addCriterion("commission_status between", value1, value2, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("commission_status not between", value1, value2, "commissionStatus");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateIsNull() {
            addCriterion("commission_created_date is null");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateIsNotNull() {
            addCriterion("commission_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateEqualTo(Date value) {
            addCriterion("commission_created_date =", value, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateNotEqualTo(Date value) {
            addCriterion("commission_created_date <>", value, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateGreaterThan(Date value) {
            addCriterion("commission_created_date >", value, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("commission_created_date >=", value, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateLessThan(Date value) {
            addCriterion("commission_created_date <", value, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("commission_created_date <=", value, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateIn(List<Date> values) {
            addCriterion("commission_created_date in", values, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateNotIn(List<Date> values) {
            addCriterion("commission_created_date not in", values, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateBetween(Date value1, Date value2) {
            addCriterion("commission_created_date between", value1, value2, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("commission_created_date not between", value1, value2, "commissionCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateIsNull() {
            addCriterion("commission_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateIsNotNull() {
            addCriterion("commission_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateEqualTo(Date value) {
            addCriterion("commission_updated_date =", value, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateNotEqualTo(Date value) {
            addCriterion("commission_updated_date <>", value, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateGreaterThan(Date value) {
            addCriterion("commission_updated_date >", value, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("commission_updated_date >=", value, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateLessThan(Date value) {
            addCriterion("commission_updated_date <", value, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("commission_updated_date <=", value, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateIn(List<Date> values) {
            addCriterion("commission_updated_date in", values, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateNotIn(List<Date> values) {
            addCriterion("commission_updated_date not in", values, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("commission_updated_date between", value1, value2, "commissionUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCommissionUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("commission_updated_date not between", value1, value2, "commissionUpdatedDate");
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