package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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
        protected List<Criterion> cpnStartDateCriteria;

        protected List<Criterion> cpnEndDateCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            cpnStartDateCriteria = new ArrayList<Criterion>();
            cpnEndDateCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getCpnStartDateCriteria() {
            return cpnStartDateCriteria;
        }

        protected void addCpnStartDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            cpnStartDateCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addCpnStartDateCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            cpnStartDateCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getCpnEndDateCriteria() {
            return cpnEndDateCriteria;
        }

        protected void addCpnEndDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            cpnEndDateCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addCpnEndDateCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            cpnEndDateCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || cpnStartDateCriteria.size() > 0
                || cpnEndDateCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(cpnStartDateCriteria);
                allCriteria.addAll(cpnEndDateCriteria);
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

        public Criteria andCpnNumIsNull() {
            addCriterion("CPN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCpnNumIsNotNull() {
            addCriterion("CPN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCpnNumEqualTo(Integer value) {
            addCriterion("CPN_NUM =", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumNotEqualTo(Integer value) {
            addCriterion("CPN_NUM <>", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumGreaterThan(Integer value) {
            addCriterion("CPN_NUM >", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CPN_NUM >=", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumLessThan(Integer value) {
            addCriterion("CPN_NUM <", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumLessThanOrEqualTo(Integer value) {
            addCriterion("CPN_NUM <=", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumIn(List<Integer> values) {
            addCriterion("CPN_NUM in", values, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumNotIn(List<Integer> values) {
            addCriterion("CPN_NUM not in", values, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumBetween(Integer value1, Integer value2) {
            addCriterion("CPN_NUM between", value1, value2, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CPN_NUM not between", value1, value2, "cpnNum");
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

        public Criteria andCpnTitleIsNull() {
            addCriterion("CPN_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCpnTitleIsNotNull() {
            addCriterion("CPN_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCpnTitleEqualTo(String value) {
            addCriterion("CPN_TITLE =", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleNotEqualTo(String value) {
            addCriterion("CPN_TITLE <>", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleGreaterThan(String value) {
            addCriterion("CPN_TITLE >", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CPN_TITLE >=", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleLessThan(String value) {
            addCriterion("CPN_TITLE <", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleLessThanOrEqualTo(String value) {
            addCriterion("CPN_TITLE <=", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleLike(String value) {
            addCriterion("CPN_TITLE like", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleNotLike(String value) {
            addCriterion("CPN_TITLE not like", value, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleIn(List<String> values) {
            addCriterion("CPN_TITLE in", values, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleNotIn(List<String> values) {
            addCriterion("CPN_TITLE not in", values, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleBetween(String value1, String value2) {
            addCriterion("CPN_TITLE between", value1, value2, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnTitleNotBetween(String value1, String value2) {
            addCriterion("CPN_TITLE not between", value1, value2, "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnCodeIsNull() {
            addCriterion("CPN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCpnCodeIsNotNull() {
            addCriterion("CPN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCpnCodeEqualTo(String value) {
            addCriterion("CPN_CODE =", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeNotEqualTo(String value) {
            addCriterion("CPN_CODE <>", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeGreaterThan(String value) {
            addCriterion("CPN_CODE >", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CPN_CODE >=", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeLessThan(String value) {
            addCriterion("CPN_CODE <", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeLessThanOrEqualTo(String value) {
            addCriterion("CPN_CODE <=", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeLike(String value) {
            addCriterion("CPN_CODE like", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeNotLike(String value) {
            addCriterion("CPN_CODE not like", value, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeIn(List<String> values) {
            addCriterion("CPN_CODE in", values, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeNotIn(List<String> values) {
            addCriterion("CPN_CODE not in", values, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeBetween(String value1, String value2) {
            addCriterion("CPN_CODE between", value1, value2, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnCodeNotBetween(String value1, String value2) {
            addCriterion("CPN_CODE not between", value1, value2, "cpnCode");
            return (Criteria) this;
        }

        public Criteria andCpnRateIsNull() {
            addCriterion("CPN_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCpnRateIsNotNull() {
            addCriterion("CPN_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCpnRateEqualTo(Integer value) {
            addCriterion("CPN_RATE =", value, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateNotEqualTo(Integer value) {
            addCriterion("CPN_RATE <>", value, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateGreaterThan(Integer value) {
            addCriterion("CPN_RATE >", value, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CPN_RATE >=", value, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateLessThan(Integer value) {
            addCriterion("CPN_RATE <", value, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateLessThanOrEqualTo(Integer value) {
            addCriterion("CPN_RATE <=", value, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateIn(List<Integer> values) {
            addCriterion("CPN_RATE in", values, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateNotIn(List<Integer> values) {
            addCriterion("CPN_RATE not in", values, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateBetween(Integer value1, Integer value2) {
            addCriterion("CPN_RATE between", value1, value2, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnRateNotBetween(Integer value1, Integer value2) {
            addCriterion("CPN_RATE not between", value1, value2, "cpnRate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateIsNull() {
            addCriterion("CPN_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateIsNotNull() {
            addCriterion("CPN_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateEqualTo(LocalDateTime value) {
            addCpnStartDateCriterion("CPN_START_DATE =", value, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateNotEqualTo(LocalDateTime value) {
            addCpnStartDateCriterion("CPN_START_DATE <>", value, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateGreaterThan(LocalDateTime value) {
            addCpnStartDateCriterion("CPN_START_DATE >", value, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCpnStartDateCriterion("CPN_START_DATE >=", value, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateLessThan(LocalDateTime value) {
            addCpnStartDateCriterion("CPN_START_DATE <", value, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateLessThanOrEqualTo(LocalDateTime value) {
            addCpnStartDateCriterion("CPN_START_DATE <=", value, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateIn(List<LocalDateTime> values) {
            addCpnStartDateCriterion("CPN_START_DATE in", values, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateNotIn(List<LocalDateTime> values) {
            addCpnStartDateCriterion("CPN_START_DATE not in", values, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCpnStartDateCriterion("CPN_START_DATE between", value1, value2, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnStartDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCpnStartDateCriterion("CPN_START_DATE not between", value1, value2, "cpnStartDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateIsNull() {
            addCriterion("CPN_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateIsNotNull() {
            addCriterion("CPN_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateEqualTo(LocalDateTime value) {
            addCpnEndDateCriterion("CPN_END_DATE =", value, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateNotEqualTo(LocalDateTime value) {
            addCpnEndDateCriterion("CPN_END_DATE <>", value, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateGreaterThan(LocalDateTime value) {
            addCpnEndDateCriterion("CPN_END_DATE >", value, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCpnEndDateCriterion("CPN_END_DATE >=", value, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateLessThan(LocalDateTime value) {
            addCpnEndDateCriterion("CPN_END_DATE <", value, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateLessThanOrEqualTo(LocalDateTime value) {
            addCpnEndDateCriterion("CPN_END_DATE <=", value, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateIn(List<LocalDateTime> values) {
            addCpnEndDateCriterion("CPN_END_DATE in", values, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateNotIn(List<LocalDateTime> values) {
            addCpnEndDateCriterion("CPN_END_DATE not in", values, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCpnEndDateCriterion("CPN_END_DATE between", value1, value2, "cpnEndDate");
            return (Criteria) this;
        }

        public Criteria andCpnEndDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCpnEndDateCriterion("CPN_END_DATE not between", value1, value2, "cpnEndDate");
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

        public Criteria andCpnTitleLikeInsensitive(String value) {
            addCriterion("upper(CPN_TITLE) like", value.toUpperCase(), "cpnTitle");
            return (Criteria) this;
        }

        public Criteria andCpnCodeLikeInsensitive(String value) {
            addCriterion("upper(CPN_CODE) like", value.toUpperCase(), "cpnCode");
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