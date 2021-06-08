package com.odiy.domain.mapper.j99.model;

import java.util.ArrayList;
import java.util.List;

public class MemberBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberBaseInfoExample() {
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

        public Criteria andMemberPhoneNoIsNull() {
            addCriterion("MEMBER_PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoIsNotNull() {
            addCriterion("MEMBER_PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoEqualTo(String value) {
            addCriterion("MEMBER_PHONE_NO =", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoNotEqualTo(String value) {
            addCriterion("MEMBER_PHONE_NO <>", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoGreaterThan(String value) {
            addCriterion("MEMBER_PHONE_NO >", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHONE_NO >=", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoLessThan(String value) {
            addCriterion("MEMBER_PHONE_NO <", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHONE_NO <=", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoLike(String value) {
            addCriterion("MEMBER_PHONE_NO like", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoNotLike(String value) {
            addCriterion("MEMBER_PHONE_NO not like", value, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoIn(List<String> values) {
            addCriterion("MEMBER_PHONE_NO in", values, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoNotIn(List<String> values) {
            addCriterion("MEMBER_PHONE_NO not in", values, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoBetween(String value1, String value2) {
            addCriterion("MEMBER_PHONE_NO between", value1, value2, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNoNotBetween(String value1, String value2) {
            addCriterion("MEMBER_PHONE_NO not between", value1, value2, "memberPhoneNo");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitIsNull() {
            addCriterion("MEMBER_PHONE_4BIT is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitIsNotNull() {
            addCriterion("MEMBER_PHONE_4BIT is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitEqualTo(String value) {
            addCriterion("MEMBER_PHONE_4BIT =", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitNotEqualTo(String value) {
            addCriterion("MEMBER_PHONE_4BIT <>", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitGreaterThan(String value) {
            addCriterion("MEMBER_PHONE_4BIT >", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHONE_4BIT >=", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitLessThan(String value) {
            addCriterion("MEMBER_PHONE_4BIT <", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHONE_4BIT <=", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitLike(String value) {
            addCriterion("MEMBER_PHONE_4BIT like", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitNotLike(String value) {
            addCriterion("MEMBER_PHONE_4BIT not like", value, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitIn(List<String> values) {
            addCriterion("MEMBER_PHONE_4BIT in", values, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitNotIn(List<String> values) {
            addCriterion("MEMBER_PHONE_4BIT not in", values, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitBetween(String value1, String value2) {
            addCriterion("MEMBER_PHONE_4BIT between", value1, value2, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberPhone4bitNotBetween(String value1, String value2) {
            addCriterion("MEMBER_PHONE_4BIT not between", value1, value2, "memberPhone4bit");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("MEMBER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("MEMBER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("MEMBER_EMAIL =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("MEMBER_EMAIL >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("MEMBER_EMAIL <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("MEMBER_EMAIL like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("MEMBER_EMAIL not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("MEMBER_EMAIL in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("MEMBER_EMAIL not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberStausIsNull() {
            addCriterion("MEMBER_STAUS is null");
            return (Criteria) this;
        }

        public Criteria andMemberStausIsNotNull() {
            addCriterion("MEMBER_STAUS is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStausEqualTo(String value) {
            addCriterion("MEMBER_STAUS =", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausNotEqualTo(String value) {
            addCriterion("MEMBER_STAUS <>", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausGreaterThan(String value) {
            addCriterion("MEMBER_STAUS >", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STAUS >=", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausLessThan(String value) {
            addCriterion("MEMBER_STAUS <", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STAUS <=", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausLike(String value) {
            addCriterion("MEMBER_STAUS like", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausNotLike(String value) {
            addCriterion("MEMBER_STAUS not like", value, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausIn(List<String> values) {
            addCriterion("MEMBER_STAUS in", values, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausNotIn(List<String> values) {
            addCriterion("MEMBER_STAUS not in", values, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausBetween(String value1, String value2) {
            addCriterion("MEMBER_STAUS between", value1, value2, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberStausNotBetween(String value1, String value2) {
            addCriterion("MEMBER_STAUS not between", value1, value2, "memberStaus");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("MEMBER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("MEMBER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("MEMBER_PASSWORD =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("MEMBER_PASSWORD <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("MEMBER_PASSWORD >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_PASSWORD >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("MEMBER_PASSWORD <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_PASSWORD <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("MEMBER_PASSWORD like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("MEMBER_PASSWORD not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("MEMBER_PASSWORD in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("MEMBER_PASSWORD not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("MEMBER_PASSWORD between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("MEMBER_PASSWORD not between", value1, value2, "memberPassword");
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