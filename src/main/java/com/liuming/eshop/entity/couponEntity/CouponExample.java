package com.liuming.eshop.entity.couponEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeIsNull() {
            addCriterion("coupon_zdje is null");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeIsNotNull() {
            addCriterion("coupon_zdje is not null");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeEqualTo(Double value) {
            addCriterion("coupon_zdje =", value, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeNotEqualTo(Double value) {
            addCriterion("coupon_zdje <>", value, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeGreaterThan(Double value) {
            addCriterion("coupon_zdje >", value, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeGreaterThanOrEqualTo(Double value) {
            addCriterion("coupon_zdje >=", value, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeLessThan(Double value) {
            addCriterion("coupon_zdje <", value, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeLessThanOrEqualTo(Double value) {
            addCriterion("coupon_zdje <=", value, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeIn(List<Double> values) {
            addCriterion("coupon_zdje in", values, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeNotIn(List<Double> values) {
            addCriterion("coupon_zdje not in", values, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeBetween(Double value1, Double value2) {
            addCriterion("coupon_zdje between", value1, value2, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponZdjeNotBetween(Double value1, Double value2) {
            addCriterion("coupon_zdje not between", value1, value2, "couponZdje");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkIsNull() {
            addCriterion("coupon_yhzk is null");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkIsNotNull() {
            addCriterion("coupon_yhzk is not null");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkEqualTo(Double value) {
            addCriterion("coupon_yhzk =", value, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkNotEqualTo(Double value) {
            addCriterion("coupon_yhzk <>", value, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkGreaterThan(Double value) {
            addCriterion("coupon_yhzk >", value, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkGreaterThanOrEqualTo(Double value) {
            addCriterion("coupon_yhzk >=", value, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkLessThan(Double value) {
            addCriterion("coupon_yhzk <", value, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkLessThanOrEqualTo(Double value) {
            addCriterion("coupon_yhzk <=", value, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkIn(List<Double> values) {
            addCriterion("coupon_yhzk in", values, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkNotIn(List<Double> values) {
            addCriterion("coupon_yhzk not in", values, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkBetween(Double value1, Double value2) {
            addCriterion("coupon_yhzk between", value1, value2, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andCouponYhzkNotBetween(Double value1, Double value2) {
            addCriterion("coupon_yhzk not between", value1, value2, "couponYhzk");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(String value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(String value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(String value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(String value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(String value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(String value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLike(String value) {
            addCriterion("member_level like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotLike(String value) {
            addCriterion("member_level not like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<String> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<String> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(String value1, String value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(String value1, String value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIsNull() {
            addCriterion("orders_price is null");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIsNotNull() {
            addCriterion("orders_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceEqualTo(Double value) {
            addCriterion("orders_price =", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotEqualTo(Double value) {
            addCriterion("orders_price <>", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceGreaterThan(Double value) {
            addCriterion("orders_price >", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("orders_price >=", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceLessThan(Double value) {
            addCriterion("orders_price <", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceLessThanOrEqualTo(Double value) {
            addCriterion("orders_price <=", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIn(List<Double> values) {
            addCriterion("orders_price in", values, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotIn(List<Double> values) {
            addCriterion("orders_price not in", values, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceBetween(Double value1, Double value2) {
            addCriterion("orders_price between", value1, value2, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotBetween(Double value1, Double value2) {
            addCriterion("orders_price not between", value1, value2, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andCouponNumIsNull() {
            addCriterion("coupon_num is null");
            return (Criteria) this;
        }

        public Criteria andCouponNumIsNotNull() {
            addCriterion("coupon_num is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNumEqualTo(Integer value) {
            addCriterion("coupon_num =", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotEqualTo(Integer value) {
            addCriterion("coupon_num <>", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumGreaterThan(Integer value) {
            addCriterion("coupon_num >", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_num >=", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumLessThan(Integer value) {
            addCriterion("coupon_num <", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_num <=", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumIn(List<Integer> values) {
            addCriterion("coupon_num in", values, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotIn(List<Integer> values) {
            addCriterion("coupon_num not in", values, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumBetween(Integer value1, Integer value2) {
            addCriterion("coupon_num between", value1, value2, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_num not between", value1, value2, "couponNum");
            return (Criteria) this;
        }

        public Criteria andItemIsNull() {
            addCriterion("item is null");
            return (Criteria) this;
        }

        public Criteria andItemIsNotNull() {
            addCriterion("item is not null");
            return (Criteria) this;
        }

        public Criteria andItemEqualTo(String value) {
            addCriterion("item =", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotEqualTo(String value) {
            addCriterion("item <>", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThan(String value) {
            addCriterion("item >", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThanOrEqualTo(String value) {
            addCriterion("item >=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThan(String value) {
            addCriterion("item <", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThanOrEqualTo(String value) {
            addCriterion("item <=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLike(String value) {
            addCriterion("item like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotLike(String value) {
            addCriterion("item not like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemIn(List<String> values) {
            addCriterion("item in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotIn(List<String> values) {
            addCriterion("item not in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemBetween(String value1, String value2) {
            addCriterion("item between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotBetween(String value1, String value2) {
            addCriterion("item not between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNull() {
            addCriterion("coupon_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNotNull() {
            addCriterion("coupon_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time =", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time <>", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("coupon_start_time >", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time >=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("coupon_start_time <", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_start_time <=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_start_time in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_start_time not in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_start_time between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_start_time not between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNull() {
            addCriterion("coupon_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNotNull() {
            addCriterion("coupon_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time =", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time <>", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("coupon_end_time >", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time >=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("coupon_end_time <", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coupon_end_time <=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_end_time in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("coupon_end_time not in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_end_time between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coupon_end_time not between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNull() {
            addCriterion("coupon_status is null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNotNull() {
            addCriterion("coupon_status is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusEqualTo(Integer value) {
            addCriterion("coupon_status =", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotEqualTo(Integer value) {
            addCriterion("coupon_status <>", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThan(Integer value) {
            addCriterion("coupon_status >", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_status >=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThan(Integer value) {
            addCriterion("coupon_status <", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_status <=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIn(List<Integer> values) {
            addCriterion("coupon_status in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotIn(List<Integer> values) {
            addCriterion("coupon_status not in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status not between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateIsNull() {
            addCriterion("coupon_create_date is null");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateIsNotNull() {
            addCriterion("coupon_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateEqualTo(Date value) {
            addCriterion("coupon_create_date =", value, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateNotEqualTo(Date value) {
            addCriterion("coupon_create_date <>", value, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateGreaterThan(Date value) {
            addCriterion("coupon_create_date >", value, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_create_date >=", value, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateLessThan(Date value) {
            addCriterion("coupon_create_date <", value, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("coupon_create_date <=", value, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateIn(List<Date> values) {
            addCriterion("coupon_create_date in", values, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateNotIn(List<Date> values) {
            addCriterion("coupon_create_date not in", values, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateBetween(Date value1, Date value2) {
            addCriterion("coupon_create_date between", value1, value2, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("coupon_create_date not between", value1, value2, "couponCreateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateIsNull() {
            addCriterion("coupon_update_date is null");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateIsNotNull() {
            addCriterion("coupon_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateEqualTo(Date value) {
            addCriterion("coupon_update_date =", value, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateNotEqualTo(Date value) {
            addCriterion("coupon_update_date <>", value, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateGreaterThan(Date value) {
            addCriterion("coupon_update_date >", value, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_update_date >=", value, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateLessThan(Date value) {
            addCriterion("coupon_update_date <", value, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("coupon_update_date <=", value, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateIn(List<Date> values) {
            addCriterion("coupon_update_date in", values, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateNotIn(List<Date> values) {
            addCriterion("coupon_update_date not in", values, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateBetween(Date value1, Date value2) {
            addCriterion("coupon_update_date between", value1, value2, "couponUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("coupon_update_date not between", value1, value2, "couponUpdateDate");
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