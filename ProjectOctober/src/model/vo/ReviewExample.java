package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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
        protected List<Criterion> rvwInputDateCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            rvwInputDateCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getRvwInputDateCriteria() {
            return rvwInputDateCriteria;
        }

        protected void addRvwInputDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            rvwInputDateCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addRvwInputDateCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            rvwInputDateCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || rvwInputDateCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(rvwInputDateCriteria);
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

        public Criteria andRvwNumIsNull() {
            addCriterion("RVW_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRvwNumIsNotNull() {
            addCriterion("RVW_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRvwNumEqualTo(Integer value) {
            addCriterion("RVW_NUM =", value, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumNotEqualTo(Integer value) {
            addCriterion("RVW_NUM <>", value, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumGreaterThan(Integer value) {
            addCriterion("RVW_NUM >", value, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RVW_NUM >=", value, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumLessThan(Integer value) {
            addCriterion("RVW_NUM <", value, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumLessThanOrEqualTo(Integer value) {
            addCriterion("RVW_NUM <=", value, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumIn(List<Integer> values) {
            addCriterion("RVW_NUM in", values, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumNotIn(List<Integer> values) {
            addCriterion("RVW_NUM not in", values, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumBetween(Integer value1, Integer value2) {
            addCriterion("RVW_NUM between", value1, value2, "rvwNum");
            return (Criteria) this;
        }

        public Criteria andRvwNumNotBetween(Integer value1, Integer value2) {
            addCriterion("RVW_NUM not between", value1, value2, "rvwNum");
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

        public Criteria andRvwInputDateIsNull() {
            addCriterion("RVW_INPUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateIsNotNull() {
            addCriterion("RVW_INPUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateEqualTo(LocalDateTime value) {
            addRvwInputDateCriterion("RVW_INPUT_DATE =", value, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateNotEqualTo(LocalDateTime value) {
            addRvwInputDateCriterion("RVW_INPUT_DATE <>", value, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateGreaterThan(LocalDateTime value) {
            addRvwInputDateCriterion("RVW_INPUT_DATE >", value, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateGreaterThanOrEqualTo(LocalDateTime value) {
            addRvwInputDateCriterion("RVW_INPUT_DATE >=", value, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateLessThan(LocalDateTime value) {
            addRvwInputDateCriterion("RVW_INPUT_DATE <", value, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateLessThanOrEqualTo(LocalDateTime value) {
            addRvwInputDateCriterion("RVW_INPUT_DATE <=", value, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateIn(List<LocalDateTime> values) {
            addRvwInputDateCriterion("RVW_INPUT_DATE in", values, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateNotIn(List<LocalDateTime> values) {
            addRvwInputDateCriterion("RVW_INPUT_DATE not in", values, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addRvwInputDateCriterion("RVW_INPUT_DATE between", value1, value2, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andRvwInputDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addRvwInputDateCriterion("RVW_INPUT_DATE not between", value1, value2, "rvwInputDate");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressIsNull() {
            addCriterion("CST_IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressIsNotNull() {
            addCriterion("CST_IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressEqualTo(String value) {
            addCriterion("CST_IP_ADDRESS =", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotEqualTo(String value) {
            addCriterion("CST_IP_ADDRESS <>", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressGreaterThan(String value) {
            addCriterion("CST_IP_ADDRESS >", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CST_IP_ADDRESS >=", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressLessThan(String value) {
            addCriterion("CST_IP_ADDRESS <", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressLessThanOrEqualTo(String value) {
            addCriterion("CST_IP_ADDRESS <=", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressLike(String value) {
            addCriterion("CST_IP_ADDRESS like", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotLike(String value) {
            addCriterion("CST_IP_ADDRESS not like", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressIn(List<String> values) {
            addCriterion("CST_IP_ADDRESS in", values, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotIn(List<String> values) {
            addCriterion("CST_IP_ADDRESS not in", values, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressBetween(String value1, String value2) {
            addCriterion("CST_IP_ADDRESS between", value1, value2, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotBetween(String value1, String value2) {
            addCriterion("CST_IP_ADDRESS not between", value1, value2, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andRvwContentIsNull() {
            addCriterion("RVW_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRvwContentIsNotNull() {
            addCriterion("RVW_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRvwContentEqualTo(String value) {
            addCriterion("RVW_CONTENT =", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentNotEqualTo(String value) {
            addCriterion("RVW_CONTENT <>", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentGreaterThan(String value) {
            addCriterion("RVW_CONTENT >", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentGreaterThanOrEqualTo(String value) {
            addCriterion("RVW_CONTENT >=", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentLessThan(String value) {
            addCriterion("RVW_CONTENT <", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentLessThanOrEqualTo(String value) {
            addCriterion("RVW_CONTENT <=", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentLike(String value) {
            addCriterion("RVW_CONTENT like", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentNotLike(String value) {
            addCriterion("RVW_CONTENT not like", value, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentIn(List<String> values) {
            addCriterion("RVW_CONTENT in", values, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentNotIn(List<String> values) {
            addCriterion("RVW_CONTENT not in", values, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentBetween(String value1, String value2) {
            addCriterion("RVW_CONTENT between", value1, value2, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andRvwContentNotBetween(String value1, String value2) {
            addCriterion("RVW_CONTENT not between", value1, value2, "rvwContent");
            return (Criteria) this;
        }

        public Criteria andCstJobIsNull() {
            addCriterion("CST_JOB is null");
            return (Criteria) this;
        }

        public Criteria andCstJobIsNotNull() {
            addCriterion("CST_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andCstJobEqualTo(String value) {
            addCriterion("CST_JOB =", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotEqualTo(String value) {
            addCriterion("CST_JOB <>", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobGreaterThan(String value) {
            addCriterion("CST_JOB >", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobGreaterThanOrEqualTo(String value) {
            addCriterion("CST_JOB >=", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobLessThan(String value) {
            addCriterion("CST_JOB <", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobLessThanOrEqualTo(String value) {
            addCriterion("CST_JOB <=", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobLike(String value) {
            addCriterion("CST_JOB like", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotLike(String value) {
            addCriterion("CST_JOB not like", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobIn(List<String> values) {
            addCriterion("CST_JOB in", values, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotIn(List<String> values) {
            addCriterion("CST_JOB not in", values, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobBetween(String value1, String value2) {
            addCriterion("CST_JOB between", value1, value2, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotBetween(String value1, String value2) {
            addCriterion("CST_JOB not between", value1, value2, "cstJob");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneIsNull() {
            addCriterion("RVW_HYGIENE is null");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneIsNotNull() {
            addCriterion("RVW_HYGIENE is not null");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneEqualTo(Integer value) {
            addCriterion("RVW_HYGIENE =", value, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneNotEqualTo(Integer value) {
            addCriterion("RVW_HYGIENE <>", value, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneGreaterThan(Integer value) {
            addCriterion("RVW_HYGIENE >", value, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneGreaterThanOrEqualTo(Integer value) {
            addCriterion("RVW_HYGIENE >=", value, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneLessThan(Integer value) {
            addCriterion("RVW_HYGIENE <", value, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneLessThanOrEqualTo(Integer value) {
            addCriterion("RVW_HYGIENE <=", value, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneIn(List<Integer> values) {
            addCriterion("RVW_HYGIENE in", values, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneNotIn(List<Integer> values) {
            addCriterion("RVW_HYGIENE not in", values, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneBetween(Integer value1, Integer value2) {
            addCriterion("RVW_HYGIENE between", value1, value2, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwHygieneNotBetween(Integer value1, Integer value2) {
            addCriterion("RVW_HYGIENE not between", value1, value2, "rvwHygiene");
            return (Criteria) this;
        }

        public Criteria andRvwComfortIsNull() {
            addCriterion("RVW_COMFORT is null");
            return (Criteria) this;
        }

        public Criteria andRvwComfortIsNotNull() {
            addCriterion("RVW_COMFORT is not null");
            return (Criteria) this;
        }

        public Criteria andRvwComfortEqualTo(Integer value) {
            addCriterion("RVW_COMFORT =", value, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortNotEqualTo(Integer value) {
            addCriterion("RVW_COMFORT <>", value, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortGreaterThan(Integer value) {
            addCriterion("RVW_COMFORT >", value, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortGreaterThanOrEqualTo(Integer value) {
            addCriterion("RVW_COMFORT >=", value, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortLessThan(Integer value) {
            addCriterion("RVW_COMFORT <", value, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortLessThanOrEqualTo(Integer value) {
            addCriterion("RVW_COMFORT <=", value, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortIn(List<Integer> values) {
            addCriterion("RVW_COMFORT in", values, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortNotIn(List<Integer> values) {
            addCriterion("RVW_COMFORT not in", values, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortBetween(Integer value1, Integer value2) {
            addCriterion("RVW_COMFORT between", value1, value2, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwComfortNotBetween(Integer value1, Integer value2) {
            addCriterion("RVW_COMFORT not between", value1, value2, "rvwComfort");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueIsNull() {
            addCriterion("RVW_TECHNIQUE is null");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueIsNotNull() {
            addCriterion("RVW_TECHNIQUE is not null");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueEqualTo(Integer value) {
            addCriterion("RVW_TECHNIQUE =", value, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueNotEqualTo(Integer value) {
            addCriterion("RVW_TECHNIQUE <>", value, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueGreaterThan(Integer value) {
            addCriterion("RVW_TECHNIQUE >", value, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("RVW_TECHNIQUE >=", value, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueLessThan(Integer value) {
            addCriterion("RVW_TECHNIQUE <", value, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueLessThanOrEqualTo(Integer value) {
            addCriterion("RVW_TECHNIQUE <=", value, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueIn(List<Integer> values) {
            addCriterion("RVW_TECHNIQUE in", values, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueNotIn(List<Integer> values) {
            addCriterion("RVW_TECHNIQUE not in", values, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueBetween(Integer value1, Integer value2) {
            addCriterion("RVW_TECHNIQUE between", value1, value2, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwTechniqueNotBetween(Integer value1, Integer value2) {
            addCriterion("RVW_TECHNIQUE not between", value1, value2, "rvwTechnique");
            return (Criteria) this;
        }

        public Criteria andRvwPriceIsNull() {
            addCriterion("RVW_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRvwPriceIsNotNull() {
            addCriterion("RVW_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRvwPriceEqualTo(Integer value) {
            addCriterion("RVW_PRICE =", value, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceNotEqualTo(Integer value) {
            addCriterion("RVW_PRICE <>", value, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceGreaterThan(Integer value) {
            addCriterion("RVW_PRICE >", value, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("RVW_PRICE >=", value, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceLessThan(Integer value) {
            addCriterion("RVW_PRICE <", value, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceLessThanOrEqualTo(Integer value) {
            addCriterion("RVW_PRICE <=", value, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceIn(List<Integer> values) {
            addCriterion("RVW_PRICE in", values, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceNotIn(List<Integer> values) {
            addCriterion("RVW_PRICE not in", values, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceBetween(Integer value1, Integer value2) {
            addCriterion("RVW_PRICE between", value1, value2, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("RVW_PRICE not between", value1, value2, "rvwPrice");
            return (Criteria) this;
        }

        public Criteria andRvwServiceIsNull() {
            addCriterion("RVW_SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andRvwServiceIsNotNull() {
            addCriterion("RVW_SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andRvwServiceEqualTo(Integer value) {
            addCriterion("RVW_SERVICE =", value, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceNotEqualTo(Integer value) {
            addCriterion("RVW_SERVICE <>", value, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceGreaterThan(Integer value) {
            addCriterion("RVW_SERVICE >", value, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("RVW_SERVICE >=", value, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceLessThan(Integer value) {
            addCriterion("RVW_SERVICE <", value, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceLessThanOrEqualTo(Integer value) {
            addCriterion("RVW_SERVICE <=", value, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceIn(List<Integer> values) {
            addCriterion("RVW_SERVICE in", values, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceNotIn(List<Integer> values) {
            addCriterion("RVW_SERVICE not in", values, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceBetween(Integer value1, Integer value2) {
            addCriterion("RVW_SERVICE between", value1, value2, "rvwService");
            return (Criteria) this;
        }

        public Criteria andRvwServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("RVW_SERVICE not between", value1, value2, "rvwService");
            return (Criteria) this;
        }

        public Criteria andCstEmailLikeInsensitive(String value) {
            addCriterion("upper(CST_EMAIL) like", value.toUpperCase(), "cstEmail");
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

        public Criteria andCstIpAddressLikeInsensitive(String value) {
            addCriterion("upper(CST_IP_ADDRESS) like", value.toUpperCase(), "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andRvwContentLikeInsensitive(String value) {
            addCriterion("upper(RVW_CONTENT) like", value.toUpperCase(), "rvwContent");
            return (Criteria) this;
        }

        public Criteria andCstJobLikeInsensitive(String value) {
            addCriterion("upper(CST_JOB) like", value.toUpperCase(), "cstJob");
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