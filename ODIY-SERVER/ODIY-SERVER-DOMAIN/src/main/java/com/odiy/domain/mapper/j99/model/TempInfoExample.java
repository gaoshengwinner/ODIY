package com.odiy.domain.mapper.j99.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TempInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempInfoExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(LocalDate value) {
            addCriterion("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(LocalDate value) {
            addCriterion("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(LocalDate value) {
            addCriterion("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(LocalDate value) {
            addCriterion("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<LocalDate> values) {
            addCriterion("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<LocalDate> values) {
            addCriterion("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("DATE not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeIsNull() {
            addCriterion("Valid_Datetime is null");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeIsNotNull() {
            addCriterion("Valid_Datetime is not null");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeEqualTo(LocalDateTime value) {
            addCriterion("Valid_Datetime =", value, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("Valid_Datetime <>", value, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("Valid_Datetime >", value, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("Valid_Datetime >=", value, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeLessThan(LocalDateTime value) {
            addCriterion("Valid_Datetime <", value, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("Valid_Datetime <=", value, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeIn(List<LocalDateTime> values) {
            addCriterion("Valid_Datetime in", values, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("Valid_Datetime not in", values, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("Valid_Datetime between", value1, value2, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValidDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("Valid_Datetime not between", value1, value2, "validDatetime");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("Value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("Value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("Value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("Value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("Value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("Value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("Value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("Value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("Value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("Value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("Value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("Value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("Value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("Value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesIsNull() {
            addCriterion("CAN_ERR_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesIsNotNull() {
            addCriterion("CAN_ERR_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesEqualTo(Integer value) {
            addCriterion("CAN_ERR_TIMES =", value, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesNotEqualTo(Integer value) {
            addCriterion("CAN_ERR_TIMES <>", value, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesGreaterThan(Integer value) {
            addCriterion("CAN_ERR_TIMES >", value, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_ERR_TIMES >=", value, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesLessThan(Integer value) {
            addCriterion("CAN_ERR_TIMES <", value, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_ERR_TIMES <=", value, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesIn(List<Integer> values) {
            addCriterion("CAN_ERR_TIMES in", values, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesNotIn(List<Integer> values) {
            addCriterion("CAN_ERR_TIMES not in", values, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesBetween(Integer value1, Integer value2) {
            addCriterion("CAN_ERR_TIMES between", value1, value2, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andCanErrTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_ERR_TIMES not between", value1, value2, "canErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesIsNull() {
            addCriterion("NOW_ERR_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesIsNotNull() {
            addCriterion("NOW_ERR_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesEqualTo(Integer value) {
            addCriterion("NOW_ERR_TIMES =", value, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesNotEqualTo(Integer value) {
            addCriterion("NOW_ERR_TIMES <>", value, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesGreaterThan(Integer value) {
            addCriterion("NOW_ERR_TIMES >", value, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOW_ERR_TIMES >=", value, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesLessThan(Integer value) {
            addCriterion("NOW_ERR_TIMES <", value, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesLessThanOrEqualTo(Integer value) {
            addCriterion("NOW_ERR_TIMES <=", value, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesIn(List<Integer> values) {
            addCriterion("NOW_ERR_TIMES in", values, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesNotIn(List<Integer> values) {
            addCriterion("NOW_ERR_TIMES not in", values, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesBetween(Integer value1, Integer value2) {
            addCriterion("NOW_ERR_TIMES between", value1, value2, "nowErrTimes");
            return (Criteria) this;
        }

        public Criteria andNowErrTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("NOW_ERR_TIMES not between", value1, value2, "nowErrTimes");
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