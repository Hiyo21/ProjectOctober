package model.vo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceExample() {
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
        protected List<Criterion> svcTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            svcTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getSvcTimeCriteria() {
            return svcTimeCriteria;
        }

        protected void addSvcTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            svcTimeCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalTimeHandler"));
            allCriteria = null;
        }

        protected void addSvcTimeCriterion(String condition, LocalTime value1, LocalTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            svcTimeCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || svcTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(svcTimeCriteria);
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

        public Criteria andSvcTitleIsNull() {
            addCriterion("SVC_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSvcTitleIsNotNull() {
            addCriterion("SVC_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSvcTitleEqualTo(String value) {
            addCriterion("SVC_TITLE =", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleNotEqualTo(String value) {
            addCriterion("SVC_TITLE <>", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleGreaterThan(String value) {
            addCriterion("SVC_TITLE >", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_TITLE >=", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleLessThan(String value) {
            addCriterion("SVC_TITLE <", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleLessThanOrEqualTo(String value) {
            addCriterion("SVC_TITLE <=", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleLike(String value) {
            addCriterion("SVC_TITLE like", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleNotLike(String value) {
            addCriterion("SVC_TITLE not like", value, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleIn(List<String> values) {
            addCriterion("SVC_TITLE in", values, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleNotIn(List<String> values) {
            addCriterion("SVC_TITLE not in", values, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleBetween(String value1, String value2) {
            addCriterion("SVC_TITLE between", value1, value2, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcTitleNotBetween(String value1, String value2) {
            addCriterion("SVC_TITLE not between", value1, value2, "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcCostIsNull() {
            addCriterion("SVC_COST is null");
            return (Criteria) this;
        }

        public Criteria andSvcCostIsNotNull() {
            addCriterion("SVC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andSvcCostEqualTo(Integer value) {
            addCriterion("SVC_COST =", value, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostNotEqualTo(Integer value) {
            addCriterion("SVC_COST <>", value, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostGreaterThan(Integer value) {
            addCriterion("SVC_COST >", value, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_COST >=", value, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostLessThan(Integer value) {
            addCriterion("SVC_COST <", value, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_COST <=", value, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostIn(List<Integer> values) {
            addCriterion("SVC_COST in", values, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostNotIn(List<Integer> values) {
            addCriterion("SVC_COST not in", values, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostBetween(Integer value1, Integer value2) {
            addCriterion("SVC_COST between", value1, value2, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcCostNotBetween(Integer value1, Integer value2) {
            addCriterion("SVC_COST not between", value1, value2, "svcCost");
            return (Criteria) this;
        }

        public Criteria andSvcTimeIsNull() {
            addCriterion("SVC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSvcTimeIsNotNull() {
            addCriterion("SVC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSvcTimeEqualTo(LocalTime value) {
            addSvcTimeCriterion("SVC_TIME =", value, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeNotEqualTo(LocalTime value) {
            addSvcTimeCriterion("SVC_TIME <>", value, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeGreaterThan(LocalTime value) {
            addSvcTimeCriterion("SVC_TIME >", value, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeGreaterThanOrEqualTo(LocalTime value) {
            addSvcTimeCriterion("SVC_TIME >=", value, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeLessThan(LocalTime value) {
            addSvcTimeCriterion("SVC_TIME <", value, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeLessThanOrEqualTo(LocalTime value) {
            addSvcTimeCriterion("SVC_TIME <=", value, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeIn(List<LocalTime> values) {
            addSvcTimeCriterion("SVC_TIME in", values, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeNotIn(List<LocalTime> values) {
            addSvcTimeCriterion("SVC_TIME not in", values, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeBetween(LocalTime value1, LocalTime value2) {
            addSvcTimeCriterion("SVC_TIME between", value1, value2, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcTimeNotBetween(LocalTime value1, LocalTime value2) {
            addSvcTimeCriterion("SVC_TIME not between", value1, value2, "svcTime");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionIsNull() {
            addCriterion("SVC_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionIsNotNull() {
            addCriterion("SVC_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionEqualTo(String value) {
            addCriterion("SVC_DESCRIPTION =", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionNotEqualTo(String value) {
            addCriterion("SVC_DESCRIPTION <>", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionGreaterThan(String value) {
            addCriterion("SVC_DESCRIPTION >", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_DESCRIPTION >=", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionLessThan(String value) {
            addCriterion("SVC_DESCRIPTION <", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionLessThanOrEqualTo(String value) {
            addCriterion("SVC_DESCRIPTION <=", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionLike(String value) {
            addCriterion("SVC_DESCRIPTION like", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionNotLike(String value) {
            addCriterion("SVC_DESCRIPTION not like", value, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionIn(List<String> values) {
            addCriterion("SVC_DESCRIPTION in", values, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionNotIn(List<String> values) {
            addCriterion("SVC_DESCRIPTION not in", values, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionBetween(String value1, String value2) {
            addCriterion("SVC_DESCRIPTION between", value1, value2, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionNotBetween(String value1, String value2) {
            addCriterion("SVC_DESCRIPTION not between", value1, value2, "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryIsNull() {
            addCriterion("SVC_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryIsNotNull() {
            addCriterion("SVC_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryEqualTo(String value) {
            addCriterion("SVC_CATEGORY =", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryNotEqualTo(String value) {
            addCriterion("SVC_CATEGORY <>", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryGreaterThan(String value) {
            addCriterion("SVC_CATEGORY >", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_CATEGORY >=", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryLessThan(String value) {
            addCriterion("SVC_CATEGORY <", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryLessThanOrEqualTo(String value) {
            addCriterion("SVC_CATEGORY <=", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryLike(String value) {
            addCriterion("SVC_CATEGORY like", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryNotLike(String value) {
            addCriterion("SVC_CATEGORY not like", value, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryIn(List<String> values) {
            addCriterion("SVC_CATEGORY in", values, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryNotIn(List<String> values) {
            addCriterion("SVC_CATEGORY not in", values, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryBetween(String value1, String value2) {
            addCriterion("SVC_CATEGORY between", value1, value2, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryNotBetween(String value1, String value2) {
            addCriterion("SVC_CATEGORY not between", value1, value2, "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeIsNull() {
            addCriterion("SVC_SPECIALIZE is null");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeIsNotNull() {
            addCriterion("SVC_SPECIALIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeEqualTo(String value) {
            addCriterion("SVC_SPECIALIZE =", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeNotEqualTo(String value) {
            addCriterion("SVC_SPECIALIZE <>", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeGreaterThan(String value) {
            addCriterion("SVC_SPECIALIZE >", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_SPECIALIZE >=", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeLessThan(String value) {
            addCriterion("SVC_SPECIALIZE <", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeLessThanOrEqualTo(String value) {
            addCriterion("SVC_SPECIALIZE <=", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeLike(String value) {
            addCriterion("SVC_SPECIALIZE like", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeNotLike(String value) {
            addCriterion("SVC_SPECIALIZE not like", value, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeIn(List<String> values) {
            addCriterion("SVC_SPECIALIZE in", values, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeNotIn(List<String> values) {
            addCriterion("SVC_SPECIALIZE not in", values, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeBetween(String value1, String value2) {
            addCriterion("SVC_SPECIALIZE between", value1, value2, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeNotBetween(String value1, String value2) {
            addCriterion("SVC_SPECIALIZE not between", value1, value2, "svcSpecialize");
            return (Criteria) this;
        }

        public Criteria andSvcCountIsNull() {
            addCriterion("SVC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSvcCountIsNotNull() {
            addCriterion("SVC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSvcCountEqualTo(Integer value) {
            addCriterion("SVC_COUNT =", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountNotEqualTo(Integer value) {
            addCriterion("SVC_COUNT <>", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountGreaterThan(Integer value) {
            addCriterion("SVC_COUNT >", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_COUNT >=", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountLessThan(Integer value) {
            addCriterion("SVC_COUNT <", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_COUNT <=", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountIn(List<Integer> values) {
            addCriterion("SVC_COUNT in", values, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountNotIn(List<Integer> values) {
            addCriterion("SVC_COUNT not in", values, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountBetween(Integer value1, Integer value2) {
            addCriterion("SVC_COUNT between", value1, value2, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SVC_COUNT not between", value1, value2, "svcCount");
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

        public Criteria andSvcTitleLikeInsensitive(String value) {
            addCriterion("upper(SVC_TITLE) like", value.toUpperCase(), "svcTitle");
            return (Criteria) this;
        }

        public Criteria andSvcDescriptionLikeInsensitive(String value) {
            addCriterion("upper(SVC_DESCRIPTION) like", value.toUpperCase(), "svcDescription");
            return (Criteria) this;
        }

        public Criteria andSvcCategoryLikeInsensitive(String value) {
            addCriterion("upper(SVC_CATEGORY) like", value.toUpperCase(), "svcCategory");
            return (Criteria) this;
        }

        public Criteria andSvcSpecializeLikeInsensitive(String value) {
            addCriterion("upper(SVC_SPECIALIZE) like", value.toUpperCase(), "svcSpecialize");
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