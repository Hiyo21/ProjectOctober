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
        protected List<Criterion> rsvStartDateCriteria;

        protected List<Criterion> rsvEndDateCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            rsvStartDateCriteria = new ArrayList<Criterion>();
            rsvEndDateCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getRsvStartDateCriteria() {
            return rsvStartDateCriteria;
        }

        protected void addRsvStartDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            rsvStartDateCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addRsvStartDateCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            rsvStartDateCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getRsvEndDateCriteria() {
            return rsvEndDateCriteria;
        }

        protected void addRsvEndDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            rsvEndDateCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addRsvEndDateCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            rsvEndDateCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || rsvStartDateCriteria.size() > 0
                || rsvEndDateCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(rsvStartDateCriteria);
                allCriteria.addAll(rsvEndDateCriteria);
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

        public Criteria andSvcNumIsNull() {
            addCriterion("SVC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSvcNumIsNotNull() {
            addCriterion("SVC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSvcNumEqualTo(Integer value) {
            addCriterion("SVC_NUM =", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumNotEqualTo(Integer value) {
            addCriterion("SVC_NUM <>", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumGreaterThan(Integer value) {
            addCriterion("SVC_NUM >", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_NUM >=", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumLessThan(Integer value) {
            addCriterion("SVC_NUM <", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_NUM <=", value, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumIn(List<Integer> values) {
            addCriterion("SVC_NUM in", values, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumNotIn(List<Integer> values) {
            addCriterion("SVC_NUM not in", values, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumBetween(Integer value1, Integer value2) {
            addCriterion("SVC_NUM between", value1, value2, "svcNum");
            return (Criteria) this;
        }

        public Criteria andSvcNumNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvStartDateIsNull() {
            addCriterion("RSV_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateIsNotNull() {
            addCriterion("RSV_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateEqualTo(LocalDateTime value) {
            addRsvStartDateCriterion("RSV_START_DATE =", value, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateNotEqualTo(LocalDateTime value) {
            addRsvStartDateCriterion("RSV_START_DATE <>", value, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateGreaterThan(LocalDateTime value) {
            addRsvStartDateCriterion("RSV_START_DATE >", value, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateGreaterThanOrEqualTo(LocalDateTime value) {
            addRsvStartDateCriterion("RSV_START_DATE >=", value, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateLessThan(LocalDateTime value) {
            addRsvStartDateCriterion("RSV_START_DATE <", value, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateLessThanOrEqualTo(LocalDateTime value) {
            addRsvStartDateCriterion("RSV_START_DATE <=", value, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateIn(List<LocalDateTime> values) {
            addRsvStartDateCriterion("RSV_START_DATE in", values, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateNotIn(List<LocalDateTime> values) {
            addRsvStartDateCriterion("RSV_START_DATE not in", values, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addRsvStartDateCriterion("RSV_START_DATE between", value1, value2, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvStartDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addRsvStartDateCriterion("RSV_START_DATE not between", value1, value2, "rsvStartDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateIsNull() {
            addCriterion("RSV_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateIsNotNull() {
            addCriterion("RSV_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateEqualTo(LocalDateTime value) {
            addRsvEndDateCriterion("RSV_END_DATE =", value, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateNotEqualTo(LocalDateTime value) {
            addRsvEndDateCriterion("RSV_END_DATE <>", value, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateGreaterThan(LocalDateTime value) {
            addRsvEndDateCriterion("RSV_END_DATE >", value, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateGreaterThanOrEqualTo(LocalDateTime value) {
            addRsvEndDateCriterion("RSV_END_DATE >=", value, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateLessThan(LocalDateTime value) {
            addRsvEndDateCriterion("RSV_END_DATE <", value, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateLessThanOrEqualTo(LocalDateTime value) {
            addRsvEndDateCriterion("RSV_END_DATE <=", value, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateIn(List<LocalDateTime> values) {
            addRsvEndDateCriterion("RSV_END_DATE in", values, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateNotIn(List<LocalDateTime> values) {
            addRsvEndDateCriterion("RSV_END_DATE not in", values, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addRsvEndDateCriterion("RSV_END_DATE between", value1, value2, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvEndDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addRsvEndDateCriterion("RSV_END_DATE not between", value1, value2, "rsvEndDate");
            return (Criteria) this;
        }

        public Criteria andRsvStatusIsNull() {
            addCriterion("RSV_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRsvStatusIsNotNull() {
            addCriterion("RSV_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRsvStatusEqualTo(Integer value) {
            addCriterion("RSV_STATUS =", value, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusNotEqualTo(Integer value) {
            addCriterion("RSV_STATUS <>", value, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusGreaterThan(Integer value) {
            addCriterion("RSV_STATUS >", value, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_STATUS >=", value, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusLessThan(Integer value) {
            addCriterion("RSV_STATUS <", value, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_STATUS <=", value, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusIn(List<Integer> values) {
            addCriterion("RSV_STATUS in", values, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusNotIn(List<Integer> values) {
            addCriterion("RSV_STATUS not in", values, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusBetween(Integer value1, Integer value2) {
            addCriterion("RSV_STATUS between", value1, value2, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andRsvStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RSV_STATUS not between", value1, value2, "rsvStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("RSV_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("RSV_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(char value) {
            addCriterion("RSV_GENDER =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(char value) {
            addCriterion("RSV_GENDER <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(char value) {
            addCriterion("RSV_GENDER >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(char value) {
            addCriterion("RSV_GENDER >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(char value) {
            addCriterion("RSV_GENDER <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(char value) {
            addCriterion("RSV_GENDER <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(char value) {
            addCriterion("RSV_GENDER like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(char value) {
            addCriterion("RSV_GENDER not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<Character> values) {
            addCriterion("RSV_GENDER in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<Character> values) {
            addCriterion("RSV_GENDER not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(char value1, char value2) {
            addCriterion("RSV_GENDER between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(char value1, char value2) {
            addCriterion("RSV_GENDER not between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andRsvTitleIsNull() {
            addCriterion("RSV_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andRsvTitleIsNotNull() {
            addCriterion("RSV_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andRsvTitleEqualTo(String value) {
            addCriterion("RSV_TITLE =", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleNotEqualTo(String value) {
            addCriterion("RSV_TITLE <>", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleGreaterThan(String value) {
            addCriterion("RSV_TITLE >", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("RSV_TITLE >=", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleLessThan(String value) {
            addCriterion("RSV_TITLE <", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleLessThanOrEqualTo(String value) {
            addCriterion("RSV_TITLE <=", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleLike(String value) {
            addCriterion("RSV_TITLE like", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleNotLike(String value) {
            addCriterion("RSV_TITLE not like", value, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleIn(List<String> values) {
            addCriterion("RSV_TITLE in", values, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleNotIn(List<String> values) {
            addCriterion("RSV_TITLE not in", values, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleBetween(String value1, String value2) {
            addCriterion("RSV_TITLE between", value1, value2, "rsvTitle");
            return (Criteria) this;
        }

        public Criteria andRsvTitleNotBetween(String value1, String value2) {
            addCriterion("RSV_TITLE not between", value1, value2, "rsvTitle");
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

        public Criteria andRsvTitleLikeInsensitive(String value) {
            addCriterion("upper(RSV_TITLE) like", value.toUpperCase(), "rsvTitle");
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