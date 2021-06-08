package com.odiy.domain.mapper.j99.model;

import java.util.ArrayList;
import java.util.List;

public class ShopDetailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopDetailInfoExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("DETAIL_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("DETAIL_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("DETAIL_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DETAIL_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("DETAIL_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("DETAIL_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("DETAIL_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("DETAIL_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("DETAIL_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DETAIL_ID not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailCommentIsNull() {
            addCriterion("DETAIL_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andDetailCommentIsNotNull() {
            addCriterion("DETAIL_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDetailCommentEqualTo(String value) {
            addCriterion("DETAIL_COMMENT =", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentNotEqualTo(String value) {
            addCriterion("DETAIL_COMMENT <>", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentGreaterThan(String value) {
            addCriterion("DETAIL_COMMENT >", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_COMMENT >=", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentLessThan(String value) {
            addCriterion("DETAIL_COMMENT <", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_COMMENT <=", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentLike(String value) {
            addCriterion("DETAIL_COMMENT like", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentNotLike(String value) {
            addCriterion("DETAIL_COMMENT not like", value, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentIn(List<String> values) {
            addCriterion("DETAIL_COMMENT in", values, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentNotIn(List<String> values) {
            addCriterion("DETAIL_COMMENT not in", values, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentBetween(String value1, String value2) {
            addCriterion("DETAIL_COMMENT between", value1, value2, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailCommentNotBetween(String value1, String value2) {
            addCriterion("DETAIL_COMMENT not between", value1, value2, "detailComment");
            return (Criteria) this;
        }

        public Criteria andDetailTextIsNull() {
            addCriterion("DETAIL_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andDetailTextIsNotNull() {
            addCriterion("DETAIL_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andDetailTextEqualTo(String value) {
            addCriterion("DETAIL_TEXT =", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextNotEqualTo(String value) {
            addCriterion("DETAIL_TEXT <>", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextGreaterThan(String value) {
            addCriterion("DETAIL_TEXT >", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_TEXT >=", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextLessThan(String value) {
            addCriterion("DETAIL_TEXT <", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_TEXT <=", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextLike(String value) {
            addCriterion("DETAIL_TEXT like", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextNotLike(String value) {
            addCriterion("DETAIL_TEXT not like", value, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextIn(List<String> values) {
            addCriterion("DETAIL_TEXT in", values, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextNotIn(List<String> values) {
            addCriterion("DETAIL_TEXT not in", values, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextBetween(String value1, String value2) {
            addCriterion("DETAIL_TEXT between", value1, value2, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailTextNotBetween(String value1, String value2) {
            addCriterion("DETAIL_TEXT not between", value1, value2, "detailText");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdIsNull() {
            addCriterion("DETAIL_IMG_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdIsNotNull() {
            addCriterion("DETAIL_IMG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdEqualTo(String value) {
            addCriterion("DETAIL_IMG_ID =", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdNotEqualTo(String value) {
            addCriterion("DETAIL_IMG_ID <>", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdGreaterThan(String value) {
            addCriterion("DETAIL_IMG_ID >", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_IMG_ID >=", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdLessThan(String value) {
            addCriterion("DETAIL_IMG_ID <", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_IMG_ID <=", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdLike(String value) {
            addCriterion("DETAIL_IMG_ID like", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdNotLike(String value) {
            addCriterion("DETAIL_IMG_ID not like", value, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdIn(List<String> values) {
            addCriterion("DETAIL_IMG_ID in", values, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdNotIn(List<String> values) {
            addCriterion("DETAIL_IMG_ID not in", values, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdBetween(String value1, String value2) {
            addCriterion("DETAIL_IMG_ID between", value1, value2, "detailImgId");
            return (Criteria) this;
        }

        public Criteria andDetailImgIdNotBetween(String value1, String value2) {
            addCriterion("DETAIL_IMG_ID not between", value1, value2, "detailImgId");
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