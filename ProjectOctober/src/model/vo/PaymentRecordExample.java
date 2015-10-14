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
        protected List<Criterion> pmtTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            pmtTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getPmtTimeCriteria() {
            return pmtTimeCriteria;
        }

        protected void addPmtTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            pmtTimeCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addPmtTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            pmtTimeCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || pmtTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(pmtTimeCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
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

        public Criteria andPmtTimeIsNull() {
            addCriterion("PMT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPmtTimeIsNotNull() {
            addCriterion("PMT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPmtTimeEqualTo(LocalDateTime value) {
            addPmtTimeCriterion("PMT_TIME =", value, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeNotEqualTo(LocalDateTime value) {
            addPmtTimeCriterion("PMT_TIME <>", value, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeGreaterThan(LocalDateTime value) {
            addPmtTimeCriterion("PMT_TIME >", value, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addPmtTimeCriterion("PMT_TIME >=", value, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeLessThan(LocalDateTime value) {
            addPmtTimeCriterion("PMT_TIME <", value, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeLessThanOrEqualTo(LocalDateTime value) {
            addPmtTimeCriterion("PMT_TIME <=", value, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeIn(List<LocalDateTime> values) {
            addPmtTimeCriterion("PMT_TIME in", values, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeNotIn(List<LocalDateTime> values) {
            addPmtTimeCriterion("PMT_TIME not in", values, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addPmtTimeCriterion("PMT_TIME between", value1, value2, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addPmtTimeCriterion("PMT_TIME not between", value1, value2, "pmtTime");
            return (Criteria) this;
        }

        public Criteria andPmtAmountIsNull() {
            addCriterion("PMT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPmtAmountIsNotNull() {
            addCriterion("PMT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPmtAmountEqualTo(Integer value) {
            addCriterion("PMT_AMOUNT =", value, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountNotEqualTo(Integer value) {
            addCriterion("PMT_AMOUNT <>", value, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountGreaterThan(Integer value) {
            addCriterion("PMT_AMOUNT >", value, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PMT_AMOUNT >=", value, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountLessThan(Integer value) {
            addCriterion("PMT_AMOUNT <", value, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountLessThanOrEqualTo(Integer value) {
            addCriterion("PMT_AMOUNT <=", value, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountIn(List<Integer> values) {
            addCriterion("PMT_AMOUNT in", values, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountNotIn(List<Integer> values) {
            addCriterion("PMT_AMOUNT not in", values, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountBetween(Integer value1, Integer value2) {
            addCriterion("PMT_AMOUNT between", value1, value2, "pmtAmount");
            return (Criteria) this;
        }

        public Criteria andPmtAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("PMT_AMOUNT not between", value1, value2, "pmtAmount");
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