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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Short value) {
            addCriterion("COST =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Short value) {
            addCriterion("COST <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Short value) {
            addCriterion("COST >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Short value) {
            addCriterion("COST >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Short value) {
            addCriterion("COST <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Short value) {
            addCriterion("COST <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Short> values) {
            addCriterion("COST in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Short> values) {
            addCriterion("COST not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Short value1, Short value2) {
            addCriterion("COST between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Short value1, Short value2) {
            addCriterion("COST not between", value1, value2, "cost");
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

        public Criteria andTimeEqualTo(LocalTime value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(LocalTime value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(LocalTime value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(LocalTime value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(LocalTime value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(LocalTime value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<LocalTime> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<LocalTime> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(LocalTime value1, LocalTime value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(LocalTime value1, LocalTime value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("SPECIALTY is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("SPECIALTY is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("SPECIALTY =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("SPECIALTY <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("SPECIALTY >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALTY >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("SPECIALTY <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("SPECIALTY <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("SPECIALTY like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("SPECIALTY not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("SPECIALTY in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("SPECIALTY not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("SPECIALTY between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("SPECIALTY not between", value1, value2, "specialty");
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

        public Criteria andSvcCountEqualTo(Short value) {
            addCriterion("SVC_COUNT =", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountNotEqualTo(Short value) {
            addCriterion("SVC_COUNT <>", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountGreaterThan(Short value) {
            addCriterion("SVC_COUNT >", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountGreaterThanOrEqualTo(Short value) {
            addCriterion("SVC_COUNT >=", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountLessThan(Short value) {
            addCriterion("SVC_COUNT <", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountLessThanOrEqualTo(Short value) {
            addCriterion("SVC_COUNT <=", value, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountIn(List<Short> values) {
            addCriterion("SVC_COUNT in", values, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountNotIn(List<Short> values) {
            addCriterion("SVC_COUNT not in", values, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountBetween(Short value1, Short value2) {
            addCriterion("SVC_COUNT between", value1, value2, "svcCount");
            return (Criteria) this;
        }

        public Criteria andSvcCountNotBetween(Short value1, Short value2) {
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

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(TITLE) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(DESCRIPTION) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andCategoryLikeInsensitive(String value) {
            addCriterion("upper(CATEGORY) like", value.toUpperCase(), "category");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLikeInsensitive(String value) {
            addCriterion("upper(SPECIALTY) like", value.toUpperCase(), "specialty");
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