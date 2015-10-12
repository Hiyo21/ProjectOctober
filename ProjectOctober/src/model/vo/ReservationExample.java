package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReservationExample() {
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

        public Criteria andRsvNumIsNull() {
            addCriterion("RSV_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRsvNumIsNotNull() {
            addCriterion("RSV_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRsvNumEqualTo(Short value) {
            addCriterion("RSV_NUM =", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumNotEqualTo(Short value) {
            addCriterion("RSV_NUM <>", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumGreaterThan(Short value) {
            addCriterion("RSV_NUM >", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_NUM >=", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumLessThan(Short value) {
            addCriterion("RSV_NUM <", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumLessThanOrEqualTo(Short value) {
            addCriterion("RSV_NUM <=", value, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumIn(List<Short> values) {
            addCriterion("RSV_NUM in", values, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumNotIn(List<Short> values) {
            addCriterion("RSV_NUM not in", values, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumBetween(Short value1, Short value2) {
            addCriterion("RSV_NUM between", value1, value2, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andRsvNumNotBetween(Short value1, Short value2) {
            addCriterion("RSV_NUM not between", value1, value2, "rsvNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumIsNull() {
            addCriterion("SVC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSvcNumIsNotNull() {
            addCriterion("SVC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSvcNumEqualTo(Short value) {
            addCriterion("SVC_NUM =", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumNotEqualTo(Short value) {
            addCriterion("SVC_NUM <>", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumGreaterThan(Short value) {
            addCriterion("SVC_NUM >", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumGreaterThanOrEqualTo(Short value) {
            addCriterion("SVC_NUM >=", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumLessThan(Short value) {
            addCriterion("SVC_NUM <", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumLessThanOrEqualTo(Short value) {
            addCriterion("SVC_NUM <=", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumIn(List<Short> values) {
            addCriterion("SVC_NUM in", values, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumNotIn(List<Short> values) {
            addCriterion("SVC_NUM not in", values, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumBetween(Short value1, Short value2) {
            addCriterion("SVC_NUM between", value1, value2, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumNotBetween(Short value1, Short value2) {
            addCriterion("SVC_NUM not between", value1, value2, "svcNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumIsNull() {
            addCriterion("CPN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCpnNumIsNotNull() {
            addCriterion("CPN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCpnNumEqualTo(Short value) {
            addCriterion("CPN_NUM =", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumNotEqualTo(Short value) {
            addCriterion("CPN_NUM <>", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumGreaterThan(Short value) {
            addCriterion("CPN_NUM >", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumGreaterThanOrEqualTo(Short value) {
            addCriterion("CPN_NUM >=", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumLessThan(Short value) {
            addCriterion("CPN_NUM <", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumLessThanOrEqualTo(Short value) {
            addCriterion("CPN_NUM <=", value, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumIn(List<Short> values) {
            addCriterion("CPN_NUM in", values, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumNotIn(List<Short> values) {
            addCriterion("CPN_NUM not in", values, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumBetween(Short value1, Short value2) {
            addCriterion("CPN_NUM between", value1, value2, "cpnNum");
            return (Criteria) this;
        }

        public Criteria andCpnNumNotBetween(Short value1, Short value2) {
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

        public Criteria andCstEmailIsNull() {
            addCriterion("CST_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCstEmailIsNotNull() {
            addCriterion("CST_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCstEmailEqualTo(String value) {
            addCriterion("CST_EMAIL =", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotEqualTo(String value) {
            addCriterion("CST_EMAIL <>", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailGreaterThan(String value) {
            addCriterion("CST_EMAIL >", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CST_EMAIL >=", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailLessThan(String value) {
            addCriterion("CST_EMAIL <", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailLessThanOrEqualTo(String value) {
            addCriterion("CST_EMAIL <=", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailLike(String value) {
            addCriterion("CST_EMAIL like", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotLike(String value) {
            addCriterion("CST_EMAIL not like", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailIn(List<String> values) {
            addCriterion("CST_EMAIL in", values, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotIn(List<String> values) {
            addCriterion("CST_EMAIL not in", values, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailBetween(String value1, String value2) {
            addCriterion("CST_EMAIL between", value1, value2, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotBetween(String value1, String value2) {
            addCriterion("CST_EMAIL not between", value1, value2, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(LocalDateTime value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(LocalDateTime value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(LocalDateTime value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(LocalDateTime value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<LocalDateTime> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<LocalDateTime> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(LocalDateTime value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(LocalDateTime value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(LocalDateTime value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(LocalDateTime value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<LocalDateTime> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<LocalDateTime> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(char value) {
            addCriterion("GENDER =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(char value) {
            addCriterion("GENDER <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(char value) {
            addCriterion("GENDER >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(char value) {
            addCriterion("GENDER >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(char value) {
            addCriterion("GENDER <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(char value) {
            addCriterion("GENDER <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(char value) {
            addCriterion("GENDER like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(char value) {
            addCriterion("GENDER not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<Character> values) {
            addCriterion("GENDER in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<Character> values) {
            addCriterion("GENDER not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(char value1, char value2) {
            addCriterion("GENDER between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(char value1, char value2) {
            addCriterion("GENDER not between", value1, value2, "employeeGender");
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

        public Criteria andCstEmailLikeInsensitive(String value) {
            addCriterion("upper(CST_EMAIL) like", value.toUpperCase(), "cstEmail");
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