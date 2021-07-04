package com.odiy.domain.mapper.j99.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopAdditionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopAdditionInfoExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andVerIsNull() {
            addCriterion("VER is null");
            return (Criteria) this;
        }

        public Criteria andVerIsNotNull() {
            addCriterion("VER is not null");
            return (Criteria) this;
        }

        public Criteria andVerEqualTo(Integer value) {
            addCriterion("VER =", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotEqualTo(Integer value) {
            addCriterion("VER <>", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThan(Integer value) {
            addCriterion("VER >", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThanOrEqualTo(Integer value) {
            addCriterion("VER >=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThan(Integer value) {
            addCriterion("VER <", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThanOrEqualTo(Integer value) {
            addCriterion("VER <=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerIn(List<Integer> values) {
            addCriterion("VER in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotIn(List<Integer> values) {
            addCriterion("VER not in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerBetween(Integer value1, Integer value2) {
            addCriterion("VER between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotBetween(Integer value1, Integer value2) {
            addCriterion("VER not between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIsNull() {
            addCriterion("UPDATE_MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIsNotNull() {
            addCriterion("UPDATE_MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdEqualTo(Integer value) {
            addCriterion("UPDATE_MEMBER_ID =", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotEqualTo(Integer value) {
            addCriterion("UPDATE_MEMBER_ID <>", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdGreaterThan(Integer value) {
            addCriterion("UPDATE_MEMBER_ID >", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_MEMBER_ID >=", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdLessThan(Integer value) {
            addCriterion("UPDATE_MEMBER_ID <", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_MEMBER_ID <=", value, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdIn(List<Integer> values) {
            addCriterion("UPDATE_MEMBER_ID in", values, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotIn(List<Integer> values) {
            addCriterion("UPDATE_MEMBER_ID not in", values, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_MEMBER_ID between", value1, value2, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_MEMBER_ID not between", value1, value2, "updateMemberId");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<LocalDateTime> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("VALUE like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("VALUE not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("VALUE not between", value1, value2, "value");
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