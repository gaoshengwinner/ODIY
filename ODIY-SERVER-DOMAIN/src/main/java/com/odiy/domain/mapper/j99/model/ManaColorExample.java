package com.odiy.domain.mapper.j99.model;

import java.util.ArrayList;
import java.util.List;

public class ManaColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManaColorExample() {
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

        public Criteria andTempIdIsNull() {
            addCriterion("TEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andTempIdIsNotNull() {
            addCriterion("TEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTempIdEqualTo(Integer value) {
            addCriterion("TEMP_ID =", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotEqualTo(Integer value) {
            addCriterion("TEMP_ID <>", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThan(Integer value) {
            addCriterion("TEMP_ID >", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMP_ID >=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThan(Integer value) {
            addCriterion("TEMP_ID <", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEMP_ID <=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdIn(List<Integer> values) {
            addCriterion("TEMP_ID in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotIn(List<Integer> values) {
            addCriterion("TEMP_ID not in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdBetween(Integer value1, Integer value2) {
            addCriterion("TEMP_ID between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMP_ID not between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("IS_USE is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("IS_USE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Byte value) {
            addCriterion("IS_USE =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Byte value) {
            addCriterion("IS_USE <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Byte value) {
            addCriterion("IS_USE >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_USE >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Byte value) {
            addCriterion("IS_USE <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Byte value) {
            addCriterion("IS_USE <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Byte> values) {
            addCriterion("IS_USE in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Byte> values) {
            addCriterion("IS_USE not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Byte value1, Byte value2) {
            addCriterion("IS_USE between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_USE not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andRedIsNull() {
            addCriterion("RED is null");
            return (Criteria) this;
        }

        public Criteria andRedIsNotNull() {
            addCriterion("RED is not null");
            return (Criteria) this;
        }

        public Criteria andRedEqualTo(Double value) {
            addCriterion("RED =", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedNotEqualTo(Double value) {
            addCriterion("RED <>", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedGreaterThan(Double value) {
            addCriterion("RED >", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedGreaterThanOrEqualTo(Double value) {
            addCriterion("RED >=", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedLessThan(Double value) {
            addCriterion("RED <", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedLessThanOrEqualTo(Double value) {
            addCriterion("RED <=", value, "red");
            return (Criteria) this;
        }

        public Criteria andRedIn(List<Double> values) {
            addCriterion("RED in", values, "red");
            return (Criteria) this;
        }

        public Criteria andRedNotIn(List<Double> values) {
            addCriterion("RED not in", values, "red");
            return (Criteria) this;
        }

        public Criteria andRedBetween(Double value1, Double value2) {
            addCriterion("RED between", value1, value2, "red");
            return (Criteria) this;
        }

        public Criteria andRedNotBetween(Double value1, Double value2) {
            addCriterion("RED not between", value1, value2, "red");
            return (Criteria) this;
        }

        public Criteria andGreenIsNull() {
            addCriterion("GREEN is null");
            return (Criteria) this;
        }

        public Criteria andGreenIsNotNull() {
            addCriterion("GREEN is not null");
            return (Criteria) this;
        }

        public Criteria andGreenEqualTo(Double value) {
            addCriterion("GREEN =", value, "green");
            return (Criteria) this;
        }

        public Criteria andGreenNotEqualTo(Double value) {
            addCriterion("GREEN <>", value, "green");
            return (Criteria) this;
        }

        public Criteria andGreenGreaterThan(Double value) {
            addCriterion("GREEN >", value, "green");
            return (Criteria) this;
        }

        public Criteria andGreenGreaterThanOrEqualTo(Double value) {
            addCriterion("GREEN >=", value, "green");
            return (Criteria) this;
        }

        public Criteria andGreenLessThan(Double value) {
            addCriterion("GREEN <", value, "green");
            return (Criteria) this;
        }

        public Criteria andGreenLessThanOrEqualTo(Double value) {
            addCriterion("GREEN <=", value, "green");
            return (Criteria) this;
        }

        public Criteria andGreenIn(List<Double> values) {
            addCriterion("GREEN in", values, "green");
            return (Criteria) this;
        }

        public Criteria andGreenNotIn(List<Double> values) {
            addCriterion("GREEN not in", values, "green");
            return (Criteria) this;
        }

        public Criteria andGreenBetween(Double value1, Double value2) {
            addCriterion("GREEN between", value1, value2, "green");
            return (Criteria) this;
        }

        public Criteria andGreenNotBetween(Double value1, Double value2) {
            addCriterion("GREEN not between", value1, value2, "green");
            return (Criteria) this;
        }

        public Criteria andBlueIsNull() {
            addCriterion("BLUE is null");
            return (Criteria) this;
        }

        public Criteria andBlueIsNotNull() {
            addCriterion("BLUE is not null");
            return (Criteria) this;
        }

        public Criteria andBlueEqualTo(Double value) {
            addCriterion("BLUE =", value, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueNotEqualTo(Double value) {
            addCriterion("BLUE <>", value, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueGreaterThan(Double value) {
            addCriterion("BLUE >", value, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueGreaterThanOrEqualTo(Double value) {
            addCriterion("BLUE >=", value, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueLessThan(Double value) {
            addCriterion("BLUE <", value, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueLessThanOrEqualTo(Double value) {
            addCriterion("BLUE <=", value, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueIn(List<Double> values) {
            addCriterion("BLUE in", values, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueNotIn(List<Double> values) {
            addCriterion("BLUE not in", values, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueBetween(Double value1, Double value2) {
            addCriterion("BLUE between", value1, value2, "blue");
            return (Criteria) this;
        }

        public Criteria andBlueNotBetween(Double value1, Double value2) {
            addCriterion("BLUE not between", value1, value2, "blue");
            return (Criteria) this;
        }

        public Criteria andOpacityIsNull() {
            addCriterion("OPACITY is null");
            return (Criteria) this;
        }

        public Criteria andOpacityIsNotNull() {
            addCriterion("OPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andOpacityEqualTo(Double value) {
            addCriterion("OPACITY =", value, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityNotEqualTo(Double value) {
            addCriterion("OPACITY <>", value, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityGreaterThan(Double value) {
            addCriterion("OPACITY >", value, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityGreaterThanOrEqualTo(Double value) {
            addCriterion("OPACITY >=", value, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityLessThan(Double value) {
            addCriterion("OPACITY <", value, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityLessThanOrEqualTo(Double value) {
            addCriterion("OPACITY <=", value, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityIn(List<Double> values) {
            addCriterion("OPACITY in", values, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityNotIn(List<Double> values) {
            addCriterion("OPACITY not in", values, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityBetween(Double value1, Double value2) {
            addCriterion("OPACITY between", value1, value2, "opacity");
            return (Criteria) this;
        }

        public Criteria andOpacityNotBetween(Double value1, Double value2) {
            addCriterion("OPACITY not between", value1, value2, "opacity");
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