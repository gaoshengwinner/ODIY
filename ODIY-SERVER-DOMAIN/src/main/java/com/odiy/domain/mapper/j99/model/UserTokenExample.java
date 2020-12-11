package com.odiy.domain.mapper.j99.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTokenExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("Device_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("Device_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("Device_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("Device_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("Device_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("Device_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("Device_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("Device_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("Device_ID like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("Device_ID not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("Device_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("Device_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("Device_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("Device_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNull() {
            addCriterion("REFRESH_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNotNull() {
            addCriterion("REFRESH_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenEqualTo(String value) {
            addCriterion("REFRESH_TOKEN =", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotEqualTo(String value) {
            addCriterion("REFRESH_TOKEN <>", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThan(String value) {
            addCriterion("REFRESH_TOKEN >", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("REFRESH_TOKEN >=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThan(String value) {
            addCriterion("REFRESH_TOKEN <", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("REFRESH_TOKEN <=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLike(String value) {
            addCriterion("REFRESH_TOKEN like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotLike(String value) {
            addCriterion("REFRESH_TOKEN not like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIn(List<String> values) {
            addCriterion("REFRESH_TOKEN in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotIn(List<String> values) {
            addCriterion("REFRESH_TOKEN not in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenBetween(String value1, String value2) {
            addCriterion("REFRESH_TOKEN between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("REFRESH_TOKEN not between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitIsNull() {
            addCriterion("REFRESH_TOKEN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitIsNotNull() {
            addCriterion("REFRESH_TOKEN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitEqualTo(Date value) {
            addCriterion("REFRESH_TOKEN_LIMIT =", value, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitNotEqualTo(Date value) {
            addCriterion("REFRESH_TOKEN_LIMIT <>", value, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitGreaterThan(Date value) {
            addCriterion("REFRESH_TOKEN_LIMIT >", value, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitGreaterThanOrEqualTo(Date value) {
            addCriterion("REFRESH_TOKEN_LIMIT >=", value, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitLessThan(Date value) {
            addCriterion("REFRESH_TOKEN_LIMIT <", value, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitLessThanOrEqualTo(Date value) {
            addCriterion("REFRESH_TOKEN_LIMIT <=", value, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitIn(List<Date> values) {
            addCriterion("REFRESH_TOKEN_LIMIT in", values, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitNotIn(List<Date> values) {
            addCriterion("REFRESH_TOKEN_LIMIT not in", values, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitBetween(Date value1, Date value2) {
            addCriterion("REFRESH_TOKEN_LIMIT between", value1, value2, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLimitNotBetween(Date value1, Date value2) {
            addCriterion("REFRESH_TOKEN_LIMIT not between", value1, value2, "refreshTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("ACCESS_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("ACCESS_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("ACCESS_TOKEN =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("ACCESS_TOKEN <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("ACCESS_TOKEN >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_TOKEN >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("ACCESS_TOKEN <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_TOKEN <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("ACCESS_TOKEN like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("ACCESS_TOKEN not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("ACCESS_TOKEN in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("ACCESS_TOKEN not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("ACCESS_TOKEN between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("ACCESS_TOKEN not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitIsNull() {
            addCriterion("ACCESS_TOKEN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitIsNotNull() {
            addCriterion("ACCESS_TOKEN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitEqualTo(Date value) {
            addCriterion("ACCESS_TOKEN_LIMIT =", value, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitNotEqualTo(Date value) {
            addCriterion("ACCESS_TOKEN_LIMIT <>", value, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitGreaterThan(Date value) {
            addCriterion("ACCESS_TOKEN_LIMIT >", value, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCESS_TOKEN_LIMIT >=", value, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitLessThan(Date value) {
            addCriterion("ACCESS_TOKEN_LIMIT <", value, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitLessThanOrEqualTo(Date value) {
            addCriterion("ACCESS_TOKEN_LIMIT <=", value, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitIn(List<Date> values) {
            addCriterion("ACCESS_TOKEN_LIMIT in", values, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitNotIn(List<Date> values) {
            addCriterion("ACCESS_TOKEN_LIMIT not in", values, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitBetween(Date value1, Date value2) {
            addCriterion("ACCESS_TOKEN_LIMIT between", value1, value2, "accessTokenLimit");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLimitNotBetween(Date value1, Date value2) {
            addCriterion("ACCESS_TOKEN_LIMIT not between", value1, value2, "accessTokenLimit");
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