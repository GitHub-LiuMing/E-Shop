package com.liuming.eshop.entity.ordersEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(String value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(String value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(String value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(String value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(String value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(String value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLike(String value) {
            addCriterion("orders_id like", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotLike(String value) {
            addCriterion("orders_id not like", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<String> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<String> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(String value1, String value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(String value1, String value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
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

        public Criteria andCouponDetailsIdIsNull() {
            addCriterion("coupon_details_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdIsNotNull() {
            addCriterion("coupon_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdEqualTo(String value) {
            addCriterion("coupon_details_id =", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotEqualTo(String value) {
            addCriterion("coupon_details_id <>", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdGreaterThan(String value) {
            addCriterion("coupon_details_id >", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_details_id >=", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdLessThan(String value) {
            addCriterion("coupon_details_id <", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_details_id <=", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdLike(String value) {
            addCriterion("coupon_details_id like", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotLike(String value) {
            addCriterion("coupon_details_id not like", value, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdIn(List<String> values) {
            addCriterion("coupon_details_id in", values, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotIn(List<String> values) {
            addCriterion("coupon_details_id not in", values, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdBetween(String value1, String value2) {
            addCriterion("coupon_details_id between", value1, value2, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailsIdNotBetween(String value1, String value2) {
            addCriterion("coupon_details_id not between", value1, value2, "couponDetailsId");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNull() {
            addCriterion("item_num is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion("item_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(Integer value) {
            addCriterion("item_num =", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(Integer value) {
            addCriterion("item_num <>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(Integer value) {
            addCriterion("item_num >", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_num >=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(Integer value) {
            addCriterion("item_num <", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(Integer value) {
            addCriterion("item_num <=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<Integer> values) {
            addCriterion("item_num in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<Integer> values) {
            addCriterion("item_num not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(Integer value1, Integer value2) {
            addCriterion("item_num between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("item_num not between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Double value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Double value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Double value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Double value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Double> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Double> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Double value1, Double value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNull() {
            addCriterion("detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("detailed_address =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("detailed_address <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("detailed_address >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_address >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("detailed_address <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("detailed_address <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("detailed_address like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("detailed_address not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("detailed_address in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("detailed_address not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("detailed_address between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("detailed_address not between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCourierNumberIsNull() {
            addCriterion("courier_number is null");
            return (Criteria) this;
        }

        public Criteria andCourierNumberIsNotNull() {
            addCriterion("courier_number is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNumberEqualTo(String value) {
            addCriterion("courier_number =", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotEqualTo(String value) {
            addCriterion("courier_number <>", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberGreaterThan(String value) {
            addCriterion("courier_number >", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("courier_number >=", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberLessThan(String value) {
            addCriterion("courier_number <", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberLessThanOrEqualTo(String value) {
            addCriterion("courier_number <=", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberLike(String value) {
            addCriterion("courier_number like", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotLike(String value) {
            addCriterion("courier_number not like", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberIn(List<String> values) {
            addCriterion("courier_number in", values, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotIn(List<String> values) {
            addCriterion("courier_number not in", values, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberBetween(String value1, String value2) {
            addCriterion("courier_number between", value1, value2, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotBetween(String value1, String value2) {
            addCriterion("courier_number not between", value1, value2, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyIsNull() {
            addCriterion("courier_services_company is null");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyIsNotNull() {
            addCriterion("courier_services_company is not null");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyEqualTo(String value) {
            addCriterion("courier_services_company =", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyNotEqualTo(String value) {
            addCriterion("courier_services_company <>", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyGreaterThan(String value) {
            addCriterion("courier_services_company >", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("courier_services_company >=", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyLessThan(String value) {
            addCriterion("courier_services_company <", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyLessThanOrEqualTo(String value) {
            addCriterion("courier_services_company <=", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyLike(String value) {
            addCriterion("courier_services_company like", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyNotLike(String value) {
            addCriterion("courier_services_company not like", value, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyIn(List<String> values) {
            addCriterion("courier_services_company in", values, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyNotIn(List<String> values) {
            addCriterion("courier_services_company not in", values, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyBetween(String value1, String value2) {
            addCriterion("courier_services_company between", value1, value2, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andCourierServicesCompanyNotBetween(String value1, String value2) {
            addCriterion("courier_services_company not between", value1, value2, "courierServicesCompany");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlIsNull() {
            addCriterion("member_comment_url is null");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlIsNotNull() {
            addCriterion("member_comment_url is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlEqualTo(String value) {
            addCriterion("member_comment_url =", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlNotEqualTo(String value) {
            addCriterion("member_comment_url <>", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlGreaterThan(String value) {
            addCriterion("member_comment_url >", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlGreaterThanOrEqualTo(String value) {
            addCriterion("member_comment_url >=", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlLessThan(String value) {
            addCriterion("member_comment_url <", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlLessThanOrEqualTo(String value) {
            addCriterion("member_comment_url <=", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlLike(String value) {
            addCriterion("member_comment_url like", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlNotLike(String value) {
            addCriterion("member_comment_url not like", value, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlIn(List<String> values) {
            addCriterion("member_comment_url in", values, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlNotIn(List<String> values) {
            addCriterion("member_comment_url not in", values, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlBetween(String value1, String value2) {
            addCriterion("member_comment_url between", value1, value2, "memberCommentUrl");
            return (Criteria) this;
        }

        public Criteria andMemberCommentUrlNotBetween(String value1, String value2) {
            addCriterion("member_comment_url not between", value1, value2, "memberCommentUrl");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayResulIsNull() {
            addCriterion("pay_resul is null");
            return (Criteria) this;
        }

        public Criteria andPayResulIsNotNull() {
            addCriterion("pay_resul is not null");
            return (Criteria) this;
        }

        public Criteria andPayResulEqualTo(Integer value) {
            addCriterion("pay_resul =", value, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulNotEqualTo(Integer value) {
            addCriterion("pay_resul <>", value, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulGreaterThan(Integer value) {
            addCriterion("pay_resul >", value, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_resul >=", value, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulLessThan(Integer value) {
            addCriterion("pay_resul <", value, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulLessThanOrEqualTo(Integer value) {
            addCriterion("pay_resul <=", value, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulIn(List<Integer> values) {
            addCriterion("pay_resul in", values, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulNotIn(List<Integer> values) {
            addCriterion("pay_resul not in", values, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulBetween(Integer value1, Integer value2) {
            addCriterion("pay_resul between", value1, value2, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayResulNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_resul not between", value1, value2, "payResul");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Double value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Double value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Double value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Double value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Double value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Double> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Double> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Double value1, Double value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Double value1, Double value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusIsNull() {
            addCriterion("orders_status is null");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusIsNotNull() {
            addCriterion("orders_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusEqualTo(Integer value) {
            addCriterion("orders_status =", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusNotEqualTo(Integer value) {
            addCriterion("orders_status <>", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusGreaterThan(Integer value) {
            addCriterion("orders_status >", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_status >=", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusLessThan(Integer value) {
            addCriterion("orders_status <", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusLessThanOrEqualTo(Integer value) {
            addCriterion("orders_status <=", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusIn(List<Integer> values) {
            addCriterion("orders_status in", values, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusNotIn(List<Integer> values) {
            addCriterion("orders_status not in", values, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusBetween(Integer value1, Integer value2) {
            addCriterion("orders_status between", value1, value2, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_status not between", value1, value2, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNull() {
            addCriterion("orders_type is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNotNull() {
            addCriterion("orders_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeEqualTo(Integer value) {
            addCriterion("orders_type =", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotEqualTo(Integer value) {
            addCriterion("orders_type <>", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThan(Integer value) {
            addCriterion("orders_type >", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_type >=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThan(Integer value) {
            addCriterion("orders_type <", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orders_type <=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIn(List<Integer> values) {
            addCriterion("orders_type in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotIn(List<Integer> values) {
            addCriterion("orders_type not in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeBetween(Integer value1, Integer value2) {
            addCriterion("orders_type between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_type not between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateIsNull() {
            addCriterion("orders_create_date is null");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateIsNotNull() {
            addCriterion("orders_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateEqualTo(Date value) {
            addCriterion("orders_create_date =", value, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateNotEqualTo(Date value) {
            addCriterion("orders_create_date <>", value, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateGreaterThan(Date value) {
            addCriterion("orders_create_date >", value, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("orders_create_date >=", value, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateLessThan(Date value) {
            addCriterion("orders_create_date <", value, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("orders_create_date <=", value, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateIn(List<Date> values) {
            addCriterion("orders_create_date in", values, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateNotIn(List<Date> values) {
            addCriterion("orders_create_date not in", values, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateBetween(Date value1, Date value2) {
            addCriterion("orders_create_date between", value1, value2, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("orders_create_date not between", value1, value2, "ordersCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateIsNull() {
            addCriterion("orders_update_date is null");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateIsNotNull() {
            addCriterion("orders_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateEqualTo(Date value) {
            addCriterion("orders_update_date =", value, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateNotEqualTo(Date value) {
            addCriterion("orders_update_date <>", value, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateGreaterThan(Date value) {
            addCriterion("orders_update_date >", value, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("orders_update_date >=", value, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateLessThan(Date value) {
            addCriterion("orders_update_date <", value, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("orders_update_date <=", value, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateIn(List<Date> values) {
            addCriterion("orders_update_date in", values, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateNotIn(List<Date> values) {
            addCriterion("orders_update_date not in", values, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateBetween(Date value1, Date value2) {
            addCriterion("orders_update_date between", value1, value2, "ordersUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrdersUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("orders_update_date not between", value1, value2, "ordersUpdateDate");
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