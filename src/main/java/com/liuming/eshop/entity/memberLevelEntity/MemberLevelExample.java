package com.liuming.eshop.entity.memberLevelEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberLevelExample() {
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

        public Criteria andMemberLevelIdIsNull() {
            addCriterion("member_level_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIsNotNull() {
            addCriterion("member_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdEqualTo(String value) {
            addCriterion("member_level_id =", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotEqualTo(String value) {
            addCriterion("member_level_id <>", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThan(String value) {
            addCriterion("member_level_id >", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_level_id >=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThan(String value) {
            addCriterion("member_level_id <", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThanOrEqualTo(String value) {
            addCriterion("member_level_id <=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLike(String value) {
            addCriterion("member_level_id like", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotLike(String value) {
            addCriterion("member_level_id not like", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIn(List<String> values) {
            addCriterion("member_level_id in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotIn(List<String> values) {
            addCriterion("member_level_id not in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdBetween(String value1, String value2) {
            addCriterion("member_level_id between", value1, value2, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotBetween(String value1, String value2) {
            addCriterion("member_level_id not between", value1, value2, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIsNull() {
            addCriterion("member_level_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIsNotNull() {
            addCriterion("member_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameEqualTo(String value) {
            addCriterion("member_level_name =", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotEqualTo(String value) {
            addCriterion("member_level_name <>", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameGreaterThan(String value) {
            addCriterion("member_level_name >", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_level_name >=", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLessThan(String value) {
            addCriterion("member_level_name <", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLessThanOrEqualTo(String value) {
            addCriterion("member_level_name <=", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLike(String value) {
            addCriterion("member_level_name like", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotLike(String value) {
            addCriterion("member_level_name not like", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIn(List<String> values) {
            addCriterion("member_level_name in", values, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotIn(List<String> values) {
            addCriterion("member_level_name not in", values, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameBetween(String value1, String value2) {
            addCriterion("member_level_name between", value1, value2, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotBetween(String value1, String value2) {
            addCriterion("member_level_name not between", value1, value2, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitIsNull() {
            addCriterion("member_level_transactions_limit is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitIsNotNull() {
            addCriterion("member_level_transactions_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitEqualTo(Integer value) {
            addCriterion("member_level_transactions_limit =", value, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitNotEqualTo(Integer value) {
            addCriterion("member_level_transactions_limit <>", value, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitGreaterThan(Integer value) {
            addCriterion("member_level_transactions_limit >", value, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level_transactions_limit >=", value, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitLessThan(Integer value) {
            addCriterion("member_level_transactions_limit <", value, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitLessThanOrEqualTo(Integer value) {
            addCriterion("member_level_transactions_limit <=", value, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitIn(List<Integer> values) {
            addCriterion("member_level_transactions_limit in", values, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitNotIn(List<Integer> values) {
            addCriterion("member_level_transactions_limit not in", values, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitBetween(Integer value1, Integer value2) {
            addCriterion("member_level_transactions_limit between", value1, value2, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelTransactionsLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level_transactions_limit not between", value1, value2, "memberLevelTransactionsLimit");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemIsNull() {
            addCriterion("member_level_item is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemIsNotNull() {
            addCriterion("member_level_item is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemEqualTo(String value) {
            addCriterion("member_level_item =", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemNotEqualTo(String value) {
            addCriterion("member_level_item <>", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemGreaterThan(String value) {
            addCriterion("member_level_item >", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemGreaterThanOrEqualTo(String value) {
            addCriterion("member_level_item >=", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemLessThan(String value) {
            addCriterion("member_level_item <", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemLessThanOrEqualTo(String value) {
            addCriterion("member_level_item <=", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemLike(String value) {
            addCriterion("member_level_item like", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemNotLike(String value) {
            addCriterion("member_level_item not like", value, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemIn(List<String> values) {
            addCriterion("member_level_item in", values, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemNotIn(List<String> values) {
            addCriterion("member_level_item not in", values, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemBetween(String value1, String value2) {
            addCriterion("member_level_item between", value1, value2, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemNotBetween(String value1, String value2) {
            addCriterion("member_level_item not between", value1, value2, "memberLevelItem");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleIsNull() {
            addCriterion("member_level_item_rule is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleIsNotNull() {
            addCriterion("member_level_item_rule is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleEqualTo(Integer value) {
            addCriterion("member_level_item_rule =", value, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleNotEqualTo(Integer value) {
            addCriterion("member_level_item_rule <>", value, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleGreaterThan(Integer value) {
            addCriterion("member_level_item_rule >", value, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level_item_rule >=", value, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleLessThan(Integer value) {
            addCriterion("member_level_item_rule <", value, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleLessThanOrEqualTo(Integer value) {
            addCriterion("member_level_item_rule <=", value, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleIn(List<Integer> values) {
            addCriterion("member_level_item_rule in", values, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleNotIn(List<Integer> values) {
            addCriterion("member_level_item_rule not in", values, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleBetween(Integer value1, Integer value2) {
            addCriterion("member_level_item_rule between", value1, value2, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelItemRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level_item_rule not between", value1, value2, "memberLevelItemRule");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountIsNull() {
            addCriterion("member_level_discount is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountIsNotNull() {
            addCriterion("member_level_discount is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountEqualTo(Double value) {
            addCriterion("member_level_discount =", value, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountNotEqualTo(Double value) {
            addCriterion("member_level_discount <>", value, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountGreaterThan(Double value) {
            addCriterion("member_level_discount >", value, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("member_level_discount >=", value, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountLessThan(Double value) {
            addCriterion("member_level_discount <", value, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountLessThanOrEqualTo(Double value) {
            addCriterion("member_level_discount <=", value, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountIn(List<Double> values) {
            addCriterion("member_level_discount in", values, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountNotIn(List<Double> values) {
            addCriterion("member_level_discount not in", values, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountBetween(Double value1, Double value2) {
            addCriterion("member_level_discount between", value1, value2, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDiscountNotBetween(Double value1, Double value2) {
            addCriterion("member_level_discount not between", value1, value2, "memberLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsIsNull() {
            addCriterion("member_level_points is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsIsNotNull() {
            addCriterion("member_level_points is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsEqualTo(Double value) {
            addCriterion("member_level_points =", value, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsNotEqualTo(Double value) {
            addCriterion("member_level_points <>", value, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsGreaterThan(Double value) {
            addCriterion("member_level_points >", value, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsGreaterThanOrEqualTo(Double value) {
            addCriterion("member_level_points >=", value, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsLessThan(Double value) {
            addCriterion("member_level_points <", value, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsLessThanOrEqualTo(Double value) {
            addCriterion("member_level_points <=", value, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsIn(List<Double> values) {
            addCriterion("member_level_points in", values, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsNotIn(List<Double> values) {
            addCriterion("member_level_points not in", values, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsBetween(Double value1, Double value2) {
            addCriterion("member_level_points between", value1, value2, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelPointsNotBetween(Double value1, Double value2) {
            addCriterion("member_level_points not between", value1, value2, "memberLevelPoints");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusIsNull() {
            addCriterion("member_level_status is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusIsNotNull() {
            addCriterion("member_level_status is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusEqualTo(Integer value) {
            addCriterion("member_level_status =", value, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusNotEqualTo(Integer value) {
            addCriterion("member_level_status <>", value, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusGreaterThan(Integer value) {
            addCriterion("member_level_status >", value, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level_status >=", value, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusLessThan(Integer value) {
            addCriterion("member_level_status <", value, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("member_level_status <=", value, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusIn(List<Integer> values) {
            addCriterion("member_level_status in", values, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusNotIn(List<Integer> values) {
            addCriterion("member_level_status not in", values, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusBetween(Integer value1, Integer value2) {
            addCriterion("member_level_status between", value1, value2, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level_status not between", value1, value2, "memberLevelStatus");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateIsNull() {
            addCriterion("member_level_created_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateIsNotNull() {
            addCriterion("member_level_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateEqualTo(Date value) {
            addCriterion("member_level_created_date =", value, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateNotEqualTo(Date value) {
            addCriterion("member_level_created_date <>", value, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateGreaterThan(Date value) {
            addCriterion("member_level_created_date >", value, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_level_created_date >=", value, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateLessThan(Date value) {
            addCriterion("member_level_created_date <", value, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("member_level_created_date <=", value, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateIn(List<Date> values) {
            addCriterion("member_level_created_date in", values, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateNotIn(List<Date> values) {
            addCriterion("member_level_created_date not in", values, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateBetween(Date value1, Date value2) {
            addCriterion("member_level_created_date between", value1, value2, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("member_level_created_date not between", value1, value2, "memberLevelCreatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateIsNull() {
            addCriterion("member_level_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateIsNotNull() {
            addCriterion("member_level_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateEqualTo(Date value) {
            addCriterion("member_level_updated_date =", value, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateNotEqualTo(Date value) {
            addCriterion("member_level_updated_date <>", value, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateGreaterThan(Date value) {
            addCriterion("member_level_updated_date >", value, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_level_updated_date >=", value, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateLessThan(Date value) {
            addCriterion("member_level_updated_date <", value, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("member_level_updated_date <=", value, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateIn(List<Date> values) {
            addCriterion("member_level_updated_date in", values, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateNotIn(List<Date> values) {
            addCriterion("member_level_updated_date not in", values, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("member_level_updated_date between", value1, value2, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("member_level_updated_date not between", value1, value2, "memberLevelUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateIsNull() {
            addCriterion("member_level_deleted_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateIsNotNull() {
            addCriterion("member_level_deleted_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateEqualTo(Date value) {
            addCriterion("member_level_deleted_date =", value, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateNotEqualTo(Date value) {
            addCriterion("member_level_deleted_date <>", value, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateGreaterThan(Date value) {
            addCriterion("member_level_deleted_date >", value, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_level_deleted_date >=", value, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateLessThan(Date value) {
            addCriterion("member_level_deleted_date <", value, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateLessThanOrEqualTo(Date value) {
            addCriterion("member_level_deleted_date <=", value, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateIn(List<Date> values) {
            addCriterion("member_level_deleted_date in", values, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateNotIn(List<Date> values) {
            addCriterion("member_level_deleted_date not in", values, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateBetween(Date value1, Date value2) {
            addCriterion("member_level_deleted_date between", value1, value2, "memberLevelDeletedDate");
            return (Criteria) this;
        }

        public Criteria andMemberLevelDeletedDateNotBetween(Date value1, Date value2) {
            addCriterion("member_level_deleted_date not between", value1, value2, "memberLevelDeletedDate");
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