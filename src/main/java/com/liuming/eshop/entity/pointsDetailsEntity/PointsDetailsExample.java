package com.liuming.eshop.entity.pointsDetailsEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointsDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointsDetailsExample() {
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

        public Criteria andPointsDetailsIdIsNull() {
            addCriterion("points_details_id is null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdIsNotNull() {
            addCriterion("points_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdEqualTo(String value) {
            addCriterion("points_details_id =", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdNotEqualTo(String value) {
            addCriterion("points_details_id <>", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdGreaterThan(String value) {
            addCriterion("points_details_id >", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("points_details_id >=", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdLessThan(String value) {
            addCriterion("points_details_id <", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("points_details_id <=", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdLike(String value) {
            addCriterion("points_details_id like", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdNotLike(String value) {
            addCriterion("points_details_id not like", value, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdIn(List<String> values) {
            addCriterion("points_details_id in", values, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdNotIn(List<String> values) {
            addCriterion("points_details_id not in", values, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdBetween(String value1, String value2) {
            addCriterion("points_details_id between", value1, value2, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsIdNotBetween(String value1, String value2) {
            addCriterion("points_details_id not between", value1, value2, "pointsDetailsId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNull() {
            addCriterion("wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNotNull() {
            addCriterion("wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNameEqualTo(String value) {
            addCriterion("wechat_name =", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotEqualTo(String value) {
            addCriterion("wechat_name <>", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThan(String value) {
            addCriterion("wechat_name >", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_name >=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThan(String value) {
            addCriterion("wechat_name <", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThanOrEqualTo(String value) {
            addCriterion("wechat_name <=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLike(String value) {
            addCriterion("wechat_name like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotLike(String value) {
            addCriterion("wechat_name not like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameIn(List<String> values) {
            addCriterion("wechat_name in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotIn(List<String> values) {
            addCriterion("wechat_name not in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameBetween(String value1, String value2) {
            addCriterion("wechat_name between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotBetween(String value1, String value2) {
            addCriterion("wechat_name not between", value1, value2, "wechatName");
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

        public Criteria andBeforeModifyPointsIsNull() {
            addCriterion("before_modify_points is null");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsIsNotNull() {
            addCriterion("before_modify_points is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsEqualTo(Integer value) {
            addCriterion("before_modify_points =", value, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsNotEqualTo(Integer value) {
            addCriterion("before_modify_points <>", value, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsGreaterThan(Integer value) {
            addCriterion("before_modify_points >", value, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("before_modify_points >=", value, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsLessThan(Integer value) {
            addCriterion("before_modify_points <", value, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsLessThanOrEqualTo(Integer value) {
            addCriterion("before_modify_points <=", value, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsIn(List<Integer> values) {
            addCriterion("before_modify_points in", values, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsNotIn(List<Integer> values) {
            addCriterion("before_modify_points not in", values, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsBetween(Integer value1, Integer value2) {
            addCriterion("before_modify_points between", value1, value2, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andBeforeModifyPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("before_modify_points not between", value1, value2, "beforeModifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsIsNull() {
            addCriterion("modify_points is null");
            return (Criteria) this;
        }

        public Criteria andModifyPointsIsNotNull() {
            addCriterion("modify_points is not null");
            return (Criteria) this;
        }

        public Criteria andModifyPointsEqualTo(Integer value) {
            addCriterion("modify_points =", value, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsNotEqualTo(Integer value) {
            addCriterion("modify_points <>", value, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsGreaterThan(Integer value) {
            addCriterion("modify_points >", value, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_points >=", value, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsLessThan(Integer value) {
            addCriterion("modify_points <", value, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsLessThanOrEqualTo(Integer value) {
            addCriterion("modify_points <=", value, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsIn(List<Integer> values) {
            addCriterion("modify_points in", values, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsNotIn(List<Integer> values) {
            addCriterion("modify_points not in", values, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsBetween(Integer value1, Integer value2) {
            addCriterion("modify_points between", value1, value2, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andModifyPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_points not between", value1, value2, "modifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsIsNull() {
            addCriterion("after_modify_points is null");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsIsNotNull() {
            addCriterion("after_modify_points is not null");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsEqualTo(Integer value) {
            addCriterion("after_modify_points =", value, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsNotEqualTo(Integer value) {
            addCriterion("after_modify_points <>", value, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsGreaterThan(Integer value) {
            addCriterion("after_modify_points >", value, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_modify_points >=", value, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsLessThan(Integer value) {
            addCriterion("after_modify_points <", value, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsLessThanOrEqualTo(Integer value) {
            addCriterion("after_modify_points <=", value, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsIn(List<Integer> values) {
            addCriterion("after_modify_points in", values, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsNotIn(List<Integer> values) {
            addCriterion("after_modify_points not in", values, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsBetween(Integer value1, Integer value2) {
            addCriterion("after_modify_points between", value1, value2, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andAfterModifyPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("after_modify_points not between", value1, value2, "afterModifyPoints");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeIsNull() {
            addCriterion("points_details_type is null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeIsNotNull() {
            addCriterion("points_details_type is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeEqualTo(Integer value) {
            addCriterion("points_details_type =", value, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeNotEqualTo(Integer value) {
            addCriterion("points_details_type <>", value, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeGreaterThan(Integer value) {
            addCriterion("points_details_type >", value, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_details_type >=", value, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeLessThan(Integer value) {
            addCriterion("points_details_type <", value, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("points_details_type <=", value, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeIn(List<Integer> values) {
            addCriterion("points_details_type in", values, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeNotIn(List<Integer> values) {
            addCriterion("points_details_type not in", values, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeBetween(Integer value1, Integer value2) {
            addCriterion("points_details_type between", value1, value2, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("points_details_type not between", value1, value2, "pointsDetailsType");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsIsNull() {
            addCriterion("points_details_details is null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsIsNotNull() {
            addCriterion("points_details_details is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsEqualTo(String value) {
            addCriterion("points_details_details =", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsNotEqualTo(String value) {
            addCriterion("points_details_details <>", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsGreaterThan(String value) {
            addCriterion("points_details_details >", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("points_details_details >=", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsLessThan(String value) {
            addCriterion("points_details_details <", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsLessThanOrEqualTo(String value) {
            addCriterion("points_details_details <=", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsLike(String value) {
            addCriterion("points_details_details like", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsNotLike(String value) {
            addCriterion("points_details_details not like", value, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsIn(List<String> values) {
            addCriterion("points_details_details in", values, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsNotIn(List<String> values) {
            addCriterion("points_details_details not in", values, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsBetween(String value1, String value2) {
            addCriterion("points_details_details between", value1, value2, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsDetailsNotBetween(String value1, String value2) {
            addCriterion("points_details_details not between", value1, value2, "pointsDetailsDetails");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusIsNull() {
            addCriterion("points_details_status is null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusIsNotNull() {
            addCriterion("points_details_status is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusEqualTo(Integer value) {
            addCriterion("points_details_status =", value, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusNotEqualTo(Integer value) {
            addCriterion("points_details_status <>", value, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusGreaterThan(Integer value) {
            addCriterion("points_details_status >", value, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_details_status >=", value, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusLessThan(Integer value) {
            addCriterion("points_details_status <", value, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("points_details_status <=", value, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusIn(List<Integer> values) {
            addCriterion("points_details_status in", values, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusNotIn(List<Integer> values) {
            addCriterion("points_details_status not in", values, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusBetween(Integer value1, Integer value2) {
            addCriterion("points_details_status between", value1, value2, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("points_details_status not between", value1, value2, "pointsDetailsStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateIsNull() {
            addCriterion("points_details_created_date is null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateIsNotNull() {
            addCriterion("points_details_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateEqualTo(Date value) {
            addCriterion("points_details_created_date =", value, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateNotEqualTo(Date value) {
            addCriterion("points_details_created_date <>", value, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateGreaterThan(Date value) {
            addCriterion("points_details_created_date >", value, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("points_details_created_date >=", value, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateLessThan(Date value) {
            addCriterion("points_details_created_date <", value, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("points_details_created_date <=", value, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateIn(List<Date> values) {
            addCriterion("points_details_created_date in", values, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateNotIn(List<Date> values) {
            addCriterion("points_details_created_date not in", values, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateBetween(Date value1, Date value2) {
            addCriterion("points_details_created_date between", value1, value2, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("points_details_created_date not between", value1, value2, "pointsDetailsCreatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateIsNull() {
            addCriterion("points_details_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateIsNotNull() {
            addCriterion("points_details_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateEqualTo(Date value) {
            addCriterion("points_details_updated_date =", value, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateNotEqualTo(Date value) {
            addCriterion("points_details_updated_date <>", value, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateGreaterThan(Date value) {
            addCriterion("points_details_updated_date >", value, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("points_details_updated_date >=", value, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateLessThan(Date value) {
            addCriterion("points_details_updated_date <", value, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("points_details_updated_date <=", value, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateIn(List<Date> values) {
            addCriterion("points_details_updated_date in", values, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateNotIn(List<Date> values) {
            addCriterion("points_details_updated_date not in", values, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("points_details_updated_date between", value1, value2, "pointsDetailsUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andPointsDetailsUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("points_details_updated_date not between", value1, value2, "pointsDetailsUpdatedDate");
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