package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PaymentRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentRecordExample() {
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

        public Criteria andPmtNumIsNull() {
            addCriterion("PMT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPmtNumIsNotNull() {
            addCriterion("PMT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPmtNumEqualTo(Integer value) {
            addCriterion("PMT_NUM =", value, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumNotEqualTo(Integer value) {
            addCriterion("PMT_NUM <>", value, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumGreaterThan(Integer value) {
            addCriterion("PMT_NUM >", value, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PMT_NUM >=", value, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumLessThan(Integer value) {
            addCriterion("PMT_NUM <", value, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumLessThanOrEqualTo(Integer value) {
            addCriterion("PMT_NUM <=", value, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumIn(List<Integer> values) {
            addCriterion("PMT_NUM in", values, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumNotIn(List<Integer> values) {
            addCriterion("PMT_NUM not in", values, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumBetween(Integer value1, Integer value2) {
            addCriterion("PMT_NUM between", value1, value2, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andPmtNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PMT_NUM not between", value1, value2, "pmtNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumIsNull() {
            addCriterion("RSV_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRsvNumIsNotNull() {
            addCriterion("RSV_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRsvNumEqualTo(Integer value) {
            addCriterion("RSV_NUM =", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumNotEqualTo(Integer value) {
            addCriterion("RSV_NUM <>", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumGreaterThan(Integer value) {
            addCriterion("RSV_NUM >", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_NUM >=", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumLessThan(Integer value) {
            addCriterion("RSV_NUM <", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_NUM <=", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumIn(List<Integer> values) {
            addCriterion("RSV_NUM in", values, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumNotIn(List<Integer> values) {
            addCriterion("RSV_NUM not in", values, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumBetween(Integer value1, Integer value2) {
            addCriterion("RSV_NUM between", value1, value2, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("RSV_NUM not between", value1, value2, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(LocalDateTime value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(LocalDateTime value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(LocalDateTime value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(LocalDateTime value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<LocalDateTime> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<LocalDateTime> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
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