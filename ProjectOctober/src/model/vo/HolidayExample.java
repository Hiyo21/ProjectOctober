package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HolidayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HolidayExample() {
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

        public Criteria andHolNumIsNull() {
            addCriterion("HOL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andHolNumIsNotNull() {
            addCriterion("HOL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andHolNumEqualTo(Integer value) {
            addCriterion("HOL_NUM =", value, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumNotEqualTo(Integer value) {
            addCriterion("HOL_NUM <>", value, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumGreaterThan(Integer value) {
            addCriterion("HOL_NUM >", value, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOL_NUM >=", value, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumLessThan(Integer value) {
            addCriterion("HOL_NUM <", value, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumLessThanOrEqualTo(Integer value) {
            addCriterion("HOL_NUM <=", value, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumIn(List<Integer> values) {
            addCriterion("HOL_NUM in", values, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumNotIn(List<Integer> values) {
            addCriterion("HOL_NUM not in", values, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumBetween(Integer value1, Integer value2) {
            addCriterion("HOL_NUM between", value1, value2, "holNum");
            return (Criteria) this;
        }

        public Criteria andHolNumNotBetween(Integer value1, Integer value2) {
            addCriterion("HOL_NUM not between", value1, value2, "holNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumIsNull() {
            addCriterion("ETP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEtpNumIsNotNull() {
            addCriterion("ETP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEtpNumEqualTo(String value) {
            addCriterion("ETP_NUM =", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumNotEqualTo(String value) {
            addCriterion("ETP_NUM <>", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumGreaterThan(String value) {
            addCriterion("ETP_NUM >", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_NUM >=", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumLessThan(String value) {
            addCriterion("ETP_NUM <", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumLessThanOrEqualTo(String value) {
            addCriterion("ETP_NUM <=", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumLike(String value) {
            addCriterion("ETP_NUM like", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumNotLike(String value) {
            addCriterion("ETP_NUM not like", value, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumIn(List<String> values) {
            addCriterion("ETP_NUM in", values, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumNotIn(List<String> values) {
            addCriterion("ETP_NUM not in", values, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumBetween(String value1, String value2) {
            addCriterion("ETP_NUM between", value1, value2, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpNumNotBetween(String value1, String value2) {
            addCriterion("ETP_NUM not between", value1, value2, "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpEmailIsNull() {
            addCriterion("ETP_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEtpEmailIsNotNull() {
            addCriterion("ETP_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEtpEmailEqualTo(String value) {
            addCriterion("ETP_EMAIL =", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailNotEqualTo(String value) {
            addCriterion("ETP_EMAIL <>", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailGreaterThan(String value) {
            addCriterion("ETP_EMAIL >", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_EMAIL >=", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailLessThan(String value) {
            addCriterion("ETP_EMAIL <", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailLessThanOrEqualTo(String value) {
            addCriterion("ETP_EMAIL <=", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailLike(String value) {
            addCriterion("ETP_EMAIL like", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailNotLike(String value) {
            addCriterion("ETP_EMAIL not like", value, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailIn(List<String> values) {
            addCriterion("ETP_EMAIL in", values, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailNotIn(List<String> values) {
            addCriterion("ETP_EMAIL not in", values, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailBetween(String value1, String value2) {
            addCriterion("ETP_EMAIL between", value1, value2, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andEtpEmailNotBetween(String value1, String value2) {
            addCriterion("ETP_EMAIL not between", value1, value2, "etpEmail");
            return (Criteria) this;
        }

        public Criteria andHolDateIsNull() {
            addCriterion("HOL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHolDateIsNotNull() {
            addCriterion("HOL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHolDateEqualTo(LocalDateTime value) {
            addCriterion("HOL_DATE =", value, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateNotEqualTo(LocalDateTime value) {
            addCriterion("HOL_DATE <>", value, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateGreaterThan(LocalDateTime value) {
            addCriterion("HOL_DATE >", value, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("HOL_DATE >=", value, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateLessThan(LocalDateTime value) {
            addCriterion("HOL_DATE <", value, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("HOL_DATE <=", value, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateIn(List<LocalDateTime> values) {
            addCriterion("HOL_DATE in", values, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateNotIn(List<LocalDateTime> values) {
            addCriterion("HOL_DATE not in", values, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("HOL_DATE between", value1, value2, "holDate");
            return (Criteria) this;
        }

        public Criteria andHolDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("HOL_DATE not between", value1, value2, "holDate");
            return (Criteria) this;
        }

        public Criteria andEtpNumLikeInsensitive(String value) {
            addCriterion("upper(ETP_NUM) like", value.toUpperCase(), "etpNum");
            return (Criteria) this;
        }

        public Criteria andEtpEmailLikeInsensitive(String value) {
            addCriterion("upper(ETP_EMAIL) like", value.toUpperCase(), "etpEmail");
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