package com.odiy.domain.mapper.j99.model;

import java.util.ArrayList;
import java.util.List;

public class ShopItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopItemExample() {
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

        public Criteria andOrderIndexIsNull() {
            addCriterion("ORDER_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIsNotNull() {
            addCriterion("ORDER_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIndexEqualTo(Integer value) {
            addCriterion("ORDER_INDEX =", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotEqualTo(Integer value) {
            addCriterion("ORDER_INDEX <>", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThan(Integer value) {
            addCriterion("ORDER_INDEX >", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_INDEX >=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThan(Integer value) {
            addCriterion("ORDER_INDEX <", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_INDEX <=", value, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexIn(List<Integer> values) {
            addCriterion("ORDER_INDEX in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotIn(List<Integer> values) {
            addCriterion("ORDER_INDEX not in", values, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_INDEX between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andOrderIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_INDEX not between", value1, value2, "orderIndex");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNull() {
            addCriterion("ITEM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("ITEM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(Integer value) {
            addCriterion("ITEM_PRICE =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(Integer value) {
            addCriterion("ITEM_PRICE <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(Integer value) {
            addCriterion("ITEM_PRICE >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_PRICE >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(Integer value) {
            addCriterion("ITEM_PRICE <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_PRICE <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<Integer> values) {
            addCriterion("ITEM_PRICE in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<Integer> values) {
            addCriterion("ITEM_PRICE not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_PRICE between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_PRICE not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemDescrIsNull() {
            addCriterion("ITEM_DESCR is null");
            return (Criteria) this;
        }

        public Criteria andItemDescrIsNotNull() {
            addCriterion("ITEM_DESCR is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescrEqualTo(String value) {
            addCriterion("ITEM_DESCR =", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrNotEqualTo(String value) {
            addCriterion("ITEM_DESCR <>", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrGreaterThan(String value) {
            addCriterion("ITEM_DESCR >", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DESCR >=", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrLessThan(String value) {
            addCriterion("ITEM_DESCR <", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DESCR <=", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrLike(String value) {
            addCriterion("ITEM_DESCR like", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrNotLike(String value) {
            addCriterion("ITEM_DESCR not like", value, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrIn(List<String> values) {
            addCriterion("ITEM_DESCR in", values, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrNotIn(List<String> values) {
            addCriterion("ITEM_DESCR not in", values, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrBetween(String value1, String value2) {
            addCriterion("ITEM_DESCR between", value1, value2, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemDescrNotBetween(String value1, String value2) {
            addCriterion("ITEM_DESCR not between", value1, value2, "itemDescr");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlIsNull() {
            addCriterion("ITEM_MAIN_PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlIsNotNull() {
            addCriterion("ITEM_MAIN_PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlEqualTo(String value) {
            addCriterion("ITEM_MAIN_PIC_URL =", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlNotEqualTo(String value) {
            addCriterion("ITEM_MAIN_PIC_URL <>", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlGreaterThan(String value) {
            addCriterion("ITEM_MAIN_PIC_URL >", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_MAIN_PIC_URL >=", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlLessThan(String value) {
            addCriterion("ITEM_MAIN_PIC_URL <", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlLessThanOrEqualTo(String value) {
            addCriterion("ITEM_MAIN_PIC_URL <=", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlLike(String value) {
            addCriterion("ITEM_MAIN_PIC_URL like", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlNotLike(String value) {
            addCriterion("ITEM_MAIN_PIC_URL not like", value, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlIn(List<String> values) {
            addCriterion("ITEM_MAIN_PIC_URL in", values, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlNotIn(List<String> values) {
            addCriterion("ITEM_MAIN_PIC_URL not in", values, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlBetween(String value1, String value2) {
            addCriterion("ITEM_MAIN_PIC_URL between", value1, value2, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemMainPicUrlNotBetween(String value1, String value2) {
            addCriterion("ITEM_MAIN_PIC_URL not between", value1, value2, "itemMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailIsNull() {
            addCriterion("ITEM_DISP_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailIsNotNull() {
            addCriterion("ITEM_DISP_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailEqualTo(String value) {
            addCriterion("ITEM_DISP_DETAIL =", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailNotEqualTo(String value) {
            addCriterion("ITEM_DISP_DETAIL <>", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailGreaterThan(String value) {
            addCriterion("ITEM_DISP_DETAIL >", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DISP_DETAIL >=", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailLessThan(String value) {
            addCriterion("ITEM_DISP_DETAIL <", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DISP_DETAIL <=", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailLike(String value) {
            addCriterion("ITEM_DISP_DETAIL like", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailNotLike(String value) {
            addCriterion("ITEM_DISP_DETAIL not like", value, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailIn(List<String> values) {
            addCriterion("ITEM_DISP_DETAIL in", values, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailNotIn(List<String> values) {
            addCriterion("ITEM_DISP_DETAIL not in", values, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailBetween(String value1, String value2) {
            addCriterion("ITEM_DISP_DETAIL between", value1, value2, "itemDispDetail");
            return (Criteria) this;
        }

        public Criteria andItemDispDetailNotBetween(String value1, String value2) {
            addCriterion("ITEM_DISP_DETAIL not between", value1, value2, "itemDispDetail");
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