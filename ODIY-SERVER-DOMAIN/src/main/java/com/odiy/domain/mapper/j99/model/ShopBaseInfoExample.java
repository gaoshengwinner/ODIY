package com.odiy.domain.mapper.j99.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopBaseInfoExample() {
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

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopPostnoIsNull() {
            addCriterion("SHOP_POSTNO is null");
            return (Criteria) this;
        }

        public Criteria andShopPostnoIsNotNull() {
            addCriterion("SHOP_POSTNO is not null");
            return (Criteria) this;
        }

        public Criteria andShopPostnoEqualTo(String value) {
            addCriterion("SHOP_POSTNO =", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoNotEqualTo(String value) {
            addCriterion("SHOP_POSTNO <>", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoGreaterThan(String value) {
            addCriterion("SHOP_POSTNO >", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_POSTNO >=", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoLessThan(String value) {
            addCriterion("SHOP_POSTNO <", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoLessThanOrEqualTo(String value) {
            addCriterion("SHOP_POSTNO <=", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoLike(String value) {
            addCriterion("SHOP_POSTNO like", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoNotLike(String value) {
            addCriterion("SHOP_POSTNO not like", value, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoIn(List<String> values) {
            addCriterion("SHOP_POSTNO in", values, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoNotIn(List<String> values) {
            addCriterion("SHOP_POSTNO not in", values, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoBetween(String value1, String value2) {
            addCriterion("SHOP_POSTNO between", value1, value2, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopPostnoNotBetween(String value1, String value2) {
            addCriterion("SHOP_POSTNO not between", value1, value2, "shopPostno");
            return (Criteria) this;
        }

        public Criteria andShopAddrIsNull() {
            addCriterion("SHOP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andShopAddrIsNotNull() {
            addCriterion("SHOP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddrEqualTo(String value) {
            addCriterion("SHOP_ADDR =", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotEqualTo(String value) {
            addCriterion("SHOP_ADDR <>", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrGreaterThan(String value) {
            addCriterion("SHOP_ADDR >", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDR >=", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrLessThan(String value) {
            addCriterion("SHOP_ADDR <", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDR <=", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrLike(String value) {
            addCriterion("SHOP_ADDR like", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotLike(String value) {
            addCriterion("SHOP_ADDR not like", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrIn(List<String> values) {
            addCriterion("SHOP_ADDR in", values, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotIn(List<String> values) {
            addCriterion("SHOP_ADDR not in", values, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrBetween(String value1, String value2) {
            addCriterion("SHOP_ADDR between", value1, value2, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotBetween(String value1, String value2) {
            addCriterion("SHOP_ADDR not between", value1, value2, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivIsNull() {
            addCriterion("SHOP_ORDER_DIV is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivIsNotNull() {
            addCriterion("SHOP_ORDER_DIV is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivEqualTo(String value) {
            addCriterion("SHOP_ORDER_DIV =", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivNotEqualTo(String value) {
            addCriterion("SHOP_ORDER_DIV <>", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivGreaterThan(String value) {
            addCriterion("SHOP_ORDER_DIV >", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_DIV >=", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivLessThan(String value) {
            addCriterion("SHOP_ORDER_DIV <", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ORDER_DIV <=", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivLike(String value) {
            addCriterion("SHOP_ORDER_DIV like", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivNotLike(String value) {
            addCriterion("SHOP_ORDER_DIV not like", value, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivIn(List<String> values) {
            addCriterion("SHOP_ORDER_DIV in", values, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivNotIn(List<String> values) {
            addCriterion("SHOP_ORDER_DIV not in", values, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_DIV between", value1, value2, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopOrderDivNotBetween(String value1, String value2) {
            addCriterion("SHOP_ORDER_DIV not between", value1, value2, "shopOrderDiv");
            return (Criteria) this;
        }

        public Criteria andShopTelIsNull() {
            addCriterion("SHOP_TEL is null");
            return (Criteria) this;
        }

        public Criteria andShopTelIsNotNull() {
            addCriterion("SHOP_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andShopTelEqualTo(String value) {
            addCriterion("SHOP_TEL =", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotEqualTo(String value) {
            addCriterion("SHOP_TEL <>", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelGreaterThan(String value) {
            addCriterion("SHOP_TEL >", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_TEL >=", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelLessThan(String value) {
            addCriterion("SHOP_TEL <", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelLessThanOrEqualTo(String value) {
            addCriterion("SHOP_TEL <=", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelLike(String value) {
            addCriterion("SHOP_TEL like", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotLike(String value) {
            addCriterion("SHOP_TEL not like", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelIn(List<String> values) {
            addCriterion("SHOP_TEL in", values, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotIn(List<String> values) {
            addCriterion("SHOP_TEL not in", values, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelBetween(String value1, String value2) {
            addCriterion("SHOP_TEL between", value1, value2, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotBetween(String value1, String value2) {
            addCriterion("SHOP_TEL not between", value1, value2, "shopTel");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("ADD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("ADD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("ADD_DATE =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("ADD_DATE <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("ADD_DATE >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("ADD_DATE <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("ADD_DATE in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("ADD_DATE not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE not between", value1, value2, "addDate");
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