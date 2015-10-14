package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class WaitlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaitlistExample() {
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
        protected List<Criterion> wtlApplyTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            wtlApplyTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getWtlApplyTimeCriteria() {
            return wtlApplyTimeCriteria;
        }

        protected void addWtlApplyTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            wtlApplyTimeCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addWtlApplyTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            wtlApplyTimeCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || wtlApplyTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(wtlApplyTimeCriteria);
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

        public Criteria andWtlNumIsNull() {
            addCriterion("WTL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andWtlNumIsNotNull() {
            addCriterion("WTL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andWtlNumEqualTo(Integer value) {
            addCriterion("WTL_NUM =", value, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumNotEqualTo(Integer value) {
            addCriterion("WTL_NUM <>", value, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumGreaterThan(Integer value) {
            addCriterion("WTL_NUM >", value, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("WTL_NUM >=", value, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumLessThan(Integer value) {
            addCriterion("WTL_NUM <", value, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumLessThanOrEqualTo(Integer value) {
            addCriterion("WTL_NUM <=", value, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumIn(List<Integer> values) {
            addCriterion("WTL_NUM in", values, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumNotIn(List<Integer> values) {
            addCriterion("WTL_NUM not in", values, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumBetween(Integer value1, Integer value2) {
            addCriterion("WTL_NUM between", value1, value2, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlNumNotBetween(Integer value1, Integer value2) {
            addCriterion("WTL_NUM not between", value1, value2, "wtlNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumIsNull() {
            addCriterion("WTL_ETP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumIsNotNull() {
            addCriterion("WTL_ETP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumEqualTo(String value) {
            addCriterion("WTL_ETP_NUM =", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumNotEqualTo(String value) {
            addCriterion("WTL_ETP_NUM <>", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumGreaterThan(String value) {
            addCriterion("WTL_ETP_NUM >", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumGreaterThanOrEqualTo(String value) {
            addCriterion("WTL_ETP_NUM >=", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumLessThan(String value) {
            addCriterion("WTL_ETP_NUM <", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumLessThanOrEqualTo(String value) {
            addCriterion("WTL_ETP_NUM <=", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumLike(String value) {
            addCriterion("WTL_ETP_NUM like", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumNotLike(String value) {
            addCriterion("WTL_ETP_NUM not like", value, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumIn(List<String> values) {
            addCriterion("WTL_ETP_NUM in", values, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumNotIn(List<String> values) {
            addCriterion("WTL_ETP_NUM not in", values, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumBetween(String value1, String value2) {
            addCriterion("WTL_ETP_NUM between", value1, value2, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumNotBetween(String value1, String value2) {
            addCriterion("WTL_ETP_NUM not between", value1, value2, "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingIsNull() {
            addCriterion("WTL_WAITING is null");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingIsNotNull() {
            addCriterion("WTL_WAITING is not null");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingEqualTo(Integer value) {
            addCriterion("WTL_WAITING =", value, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingNotEqualTo(Integer value) {
            addCriterion("WTL_WAITING <>", value, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingGreaterThan(Integer value) {
            addCriterion("WTL_WAITING >", value, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingGreaterThanOrEqualTo(Integer value) {
            addCriterion("WTL_WAITING >=", value, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingLessThan(Integer value) {
            addCriterion("WTL_WAITING <", value, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingLessThanOrEqualTo(Integer value) {
            addCriterion("WTL_WAITING <=", value, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingIn(List<Integer> values) {
            addCriterion("WTL_WAITING in", values, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingNotIn(List<Integer> values) {
            addCriterion("WTL_WAITING not in", values, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingBetween(Integer value1, Integer value2) {
            addCriterion("WTL_WAITING between", value1, value2, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlWaitingNotBetween(Integer value1, Integer value2) {
            addCriterion("WTL_WAITING not between", value1, value2, "wtlWaiting");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeIsNull() {
            addCriterion("WTL_APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeIsNotNull() {
            addCriterion("WTL_APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeEqualTo(LocalDateTime value) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME =", value, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeNotEqualTo(LocalDateTime value) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME <>", value, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeGreaterThan(LocalDateTime value) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME >", value, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME >=", value, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeLessThan(LocalDateTime value) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME <", value, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeLessThanOrEqualTo(LocalDateTime value) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME <=", value, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeIn(List<LocalDateTime> values) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME in", values, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeNotIn(List<LocalDateTime> values) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME not in", values, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME between", value1, value2, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlApplyTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addWtlApplyTimeCriterion("WTL_APPLY_TIME not between", value1, value2, "wtlApplyTime");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardIsNull() {
            addCriterion("WTL_REG_CARD is null");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardIsNotNull() {
            addCriterion("WTL_REG_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardEqualTo(String value) {
            addCriterion("WTL_REG_CARD =", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardNotEqualTo(String value) {
            addCriterion("WTL_REG_CARD <>", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardGreaterThan(String value) {
            addCriterion("WTL_REG_CARD >", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardGreaterThanOrEqualTo(String value) {
            addCriterion("WTL_REG_CARD >=", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardLessThan(String value) {
            addCriterion("WTL_REG_CARD <", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardLessThanOrEqualTo(String value) {
            addCriterion("WTL_REG_CARD <=", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardLike(String value) {
            addCriterion("WTL_REG_CARD like", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardNotLike(String value) {
            addCriterion("WTL_REG_CARD not like", value, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardIn(List<String> values) {
            addCriterion("WTL_REG_CARD in", values, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardNotIn(List<String> values) {
            addCriterion("WTL_REG_CARD not in", values, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardBetween(String value1, String value2) {
            addCriterion("WTL_REG_CARD between", value1, value2, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardNotBetween(String value1, String value2) {
            addCriterion("WTL_REG_CARD not between", value1, value2, "wtlRegCard");
            return (Criteria) this;
        }

        public Criteria andWtlEtpNumLikeInsensitive(String value) {
            addCriterion("upper(WTL_ETP_NUM) like", value.toUpperCase(), "wtlEtpNum");
            return (Criteria) this;
        }

        public Criteria andWtlRegCardLikeInsensitive(String value) {
            addCriterion("upper(WTL_REG_CARD) like", value.toUpperCase(), "wtlRegCard");
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