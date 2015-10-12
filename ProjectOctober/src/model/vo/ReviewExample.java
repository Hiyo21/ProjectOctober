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

        public Criteria andInputDateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(LocalDateTime value) {
            addCriterion("INPUTDATE =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(LocalDateTime value) {
            addCriterion("INPUTDATE <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(LocalDateTime value) {
            addCriterion("INPUTDATE >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("INPUTDATE >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(LocalDateTime value) {
            addCriterion("INPUTDATE <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("INPUTDATE <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<LocalDateTime> values) {
            addCriterion("INPUTDATE in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<LocalDateTime> values) {
            addCriterion("INPUTDATE not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("INPUTDATE between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("INPUTDATE not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressIsNull() {
            addCriterion("IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressIsNotNull() {
            addCriterion("IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressEqualTo(String value) {
            addCriterion("IP_ADDRESS =", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotEqualTo(String value) {
            addCriterion("IP_ADDRESS <>", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressGreaterThan(String value) {
            addCriterion("IP_ADDRESS >", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS >=", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressLessThan(String value) {
            addCriterion("IP_ADDRESS <", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS <=", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressLike(String value) {
            addCriterion("IP_ADDRESS like", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotLike(String value) {
            addCriterion("IP_ADDRESS not like", value, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressIn(List<String> values) {
            addCriterion("IP_ADDRESS in", values, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotIn(List<String> values) {
            addCriterion("IP_ADDRESS not in", values, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS between", value1, value2, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andCstIpAddressNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS not between", value1, value2, "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCstJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andCstJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andCstJobEqualTo(String value) {
            addCriterion("JOB =", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobGreaterThan(String value) {
            addCriterion("JOB >", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobLessThan(String value) {
            addCriterion("JOB <", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobLike(String value) {
            addCriterion("JOB like", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotLike(String value) {
            addCriterion("JOB not like", value, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobIn(List<String> values) {
            addCriterion("JOB in", values, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "cstJob");
            return (Criteria) this;
        }

        public Criteria andCstJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "cstJob");
            return (Criteria) this;
        }

        public Criteria andHygieneIsNull() {
            addCriterion("HYGIENE is null");
            return (Criteria) this;
        }

        public Criteria andHygieneIsNotNull() {
            addCriterion("HYGIENE is not null");
            return (Criteria) this;
        }

        public Criteria andHygieneEqualTo(Integer value) {
            addCriterion("HYGIENE =", value, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneNotEqualTo(Integer value) {
            addCriterion("HYGIENE <>", value, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneGreaterThan(Integer value) {
            addCriterion("HYGIENE >", value, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneGreaterThanOrEqualTo(Integer value) {
            addCriterion("HYGIENE >=", value, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneLessThan(Integer value) {
            addCriterion("HYGIENE <", value, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneLessThanOrEqualTo(Integer value) {
            addCriterion("HYGIENE <=", value, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneIn(List<Integer> values) {
            addCriterion("HYGIENE in", values, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneNotIn(List<Integer> values) {
            addCriterion("HYGIENE not in", values, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneBetween(Integer value1, Integer value2) {
            addCriterion("HYGIENE between", value1, value2, "hygiene");
            return (Criteria) this;
        }

        public Criteria andHygieneNotBetween(Integer value1, Integer value2) {
            addCriterion("HYGIENE not between", value1, value2, "hygiene");
            return (Criteria) this;
        }

        public Criteria andComfortIsNull() {
            addCriterion("COMFORT is null");
            return (Criteria) this;
        }

        public Criteria andComfortIsNotNull() {
            addCriterion("COMFORT is not null");
            return (Criteria) this;
        }

        public Criteria andComfortEqualTo(Integer value) {
            addCriterion("COMFORT =", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortNotEqualTo(Integer value) {
            addCriterion("COMFORT <>", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortGreaterThan(Integer value) {
            addCriterion("COMFORT >", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMFORT >=", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortLessThan(Integer value) {
            addCriterion("COMFORT <", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortLessThanOrEqualTo(Integer value) {
            addCriterion("COMFORT <=", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortIn(List<Integer> values) {
            addCriterion("COMFORT in", values, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortNotIn(List<Integer> values) {
            addCriterion("COMFORT not in", values, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortBetween(Integer value1, Integer value2) {
            addCriterion("COMFORT between", value1, value2, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortNotBetween(Integer value1, Integer value2) {
            addCriterion("COMFORT not between", value1, value2, "comfort");
            return (Criteria) this;
        }

        public Criteria andTechniqueIsNull() {
            addCriterion("TECHNIQUE is null");
            return (Criteria) this;
        }

        public Criteria andTechniqueIsNotNull() {
            addCriterion("TECHNIQUE is not null");
            return (Criteria) this;
        }

        public Criteria andTechniqueEqualTo(Integer value) {
            addCriterion("TECHNIQUE =", value, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueNotEqualTo(Integer value) {
            addCriterion("TECHNIQUE <>", value, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueGreaterThan(Integer value) {
            addCriterion("TECHNIQUE >", value, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("TECHNIQUE >=", value, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueLessThan(Integer value) {
            addCriterion("TECHNIQUE <", value, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueLessThanOrEqualTo(Integer value) {
            addCriterion("TECHNIQUE <=", value, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueIn(List<Integer> values) {
            addCriterion("TECHNIQUE in", values, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueNotIn(List<Integer> values) {
            addCriterion("TECHNIQUE not in", values, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueBetween(Integer value1, Integer value2) {
            addCriterion("TECHNIQUE between", value1, value2, "technique");
            return (Criteria) this;
        }

        public Criteria andTechniqueNotBetween(Integer value1, Integer value2) {
            addCriterion("TECHNIQUE not between", value1, value2, "technique");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(Integer value) {
            addCriterion("SERVICE =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(Integer value) {
            addCriterion("SERVICE <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(Integer value) {
            addCriterion("SERVICE >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(Integer value) {
            addCriterion("SERVICE <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<Integer> values) {
            addCriterion("SERVICE in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<Integer> values) {
            addCriterion("SERVICE not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE not between", value1, value2, "service");
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
            addCriterion("upper(IP_ADDRESS) like", value.toUpperCase(), "cstIpAddress");
            return (Criteria) this;
        }

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(CONTENT) like", value.toUpperCase(), "content");
            return (Criteria) this;
        }

        public Criteria andCstJobLikeInsensitive(String value) {
            addCriterion("upper(JOB) like", value.toUpperCase(), "cstJob");
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