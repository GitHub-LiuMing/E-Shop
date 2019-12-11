package com.liuming.eshop.entity.userEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlIsNull() {
            addCriterion("user_head_img_url is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlIsNotNull() {
            addCriterion("user_head_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlEqualTo(String value) {
            addCriterion("user_head_img_url =", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlNotEqualTo(String value) {
            addCriterion("user_head_img_url <>", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlGreaterThan(String value) {
            addCriterion("user_head_img_url >", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_head_img_url >=", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlLessThan(String value) {
            addCriterion("user_head_img_url <", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlLessThanOrEqualTo(String value) {
            addCriterion("user_head_img_url <=", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlLike(String value) {
            addCriterion("user_head_img_url like", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlNotLike(String value) {
            addCriterion("user_head_img_url not like", value, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlIn(List<String> values) {
            addCriterion("user_head_img_url in", values, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlNotIn(List<String> values) {
            addCriterion("user_head_img_url not in", values, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlBetween(String value1, String value2) {
            addCriterion("user_head_img_url between", value1, value2, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserHeadImgUrlNotBetween(String value1, String value2) {
            addCriterion("user_head_img_url not between", value1, value2, "userHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIsNull() {
            addCriterion("user_create_date is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIsNotNull() {
            addCriterion("user_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateEqualTo(Date value) {
            addCriterion("user_create_date =", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotEqualTo(Date value) {
            addCriterion("user_create_date <>", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateGreaterThan(Date value) {
            addCriterion("user_create_date >", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create_date >=", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateLessThan(Date value) {
            addCriterion("user_create_date <", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("user_create_date <=", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIn(List<Date> values) {
            addCriterion("user_create_date in", values, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotIn(List<Date> values) {
            addCriterion("user_create_date not in", values, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateBetween(Date value1, Date value2) {
            addCriterion("user_create_date between", value1, value2, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("user_create_date not between", value1, value2, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateIsNull() {
            addCriterion("user_update_date is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateIsNotNull() {
            addCriterion("user_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateEqualTo(Date value) {
            addCriterion("user_update_date =", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateNotEqualTo(Date value) {
            addCriterion("user_update_date <>", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateGreaterThan(Date value) {
            addCriterion("user_update_date >", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_update_date >=", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateLessThan(Date value) {
            addCriterion("user_update_date <", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("user_update_date <=", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateIn(List<Date> values) {
            addCriterion("user_update_date in", values, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateNotIn(List<Date> values) {
            addCriterion("user_update_date not in", values, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateBetween(Date value1, Date value2) {
            addCriterion("user_update_date between", value1, value2, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("user_update_date not between", value1, value2, "userUpdateDate");
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