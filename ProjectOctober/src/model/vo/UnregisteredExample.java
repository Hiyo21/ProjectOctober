package model.vo;

import java.util.ArrayList;
import java.util.List;

public class UnregisteredExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnregisteredExample() {
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

        public Criteria andUrgNumIsNull() {
            addCriterion("URG_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUrgNumIsNotNull() {
            addCriterion("URG_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUrgNumEqualTo(Integer value) {
            addCriterion("URG_NUM =", value, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumNotEqualTo(Integer value) {
            addCriterion("URG_NUM <>", value, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumGreaterThan(Integer value) {
            addCriterion("URG_NUM >", value, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("URG_NUM >=", value, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumLessThan(Integer value) {
            addCriterion("URG_NUM <", value, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumLessThanOrEqualTo(Integer value) {
            addCriterion("URG_NUM <=", value, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumIn(List<Integer> values) {
            addCriterion("URG_NUM in", values, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumNotIn(List<Integer> values) {
            addCriterion("URG_NUM not in", values, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumBetween(Integer value1, Integer value2) {
            addCriterion("URG_NUM between", value1, value2, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNumNotBetween(Integer value1, Integer value2) {
            addCriterion("URG_NUM not between", value1, value2, "urgNum");
            return (Criteria) this;
        }

        public Criteria andUrgNameIsNull() {
            addCriterion("URG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUrgNameIsNotNull() {
            addCriterion("URG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUrgNameEqualTo(String value) {
            addCriterion("URG_NAME =", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameNotEqualTo(String value) {
            addCriterion("URG_NAME <>", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameGreaterThan(String value) {
            addCriterion("URG_NAME >", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("URG_NAME >=", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameLessThan(String value) {
            addCriterion("URG_NAME <", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameLessThanOrEqualTo(String value) {
            addCriterion("URG_NAME <=", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameLike(String value) {
            addCriterion("URG_NAME like", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameNotLike(String value) {
            addCriterion("URG_NAME not like", value, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameIn(List<String> values) {
            addCriterion("URG_NAME in", values, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameNotIn(List<String> values) {
            addCriterion("URG_NAME not in", values, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameBetween(String value1, String value2) {
            addCriterion("URG_NAME between", value1, value2, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgNameNotBetween(String value1, String value2) {
            addCriterion("URG_NAME not between", value1, value2, "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgEmailIsNull() {
            addCriterion("URG_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUrgEmailIsNotNull() {
            addCriterion("URG_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUrgEmailEqualTo(String value) {
            addCriterion("URG_EMAIL =", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailNotEqualTo(String value) {
            addCriterion("URG_EMAIL <>", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailGreaterThan(String value) {
            addCriterion("URG_EMAIL >", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailGreaterThanOrEqualTo(String value) {
            addCriterion("URG_EMAIL >=", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailLessThan(String value) {
            addCriterion("URG_EMAIL <", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailLessThanOrEqualTo(String value) {
            addCriterion("URG_EMAIL <=", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailLike(String value) {
            addCriterion("URG_EMAIL like", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailNotLike(String value) {
            addCriterion("URG_EMAIL not like", value, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailIn(List<String> values) {
            addCriterion("URG_EMAIL in", values, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailNotIn(List<String> values) {
            addCriterion("URG_EMAIL not in", values, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailBetween(String value1, String value2) {
            addCriterion("URG_EMAIL between", value1, value2, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgEmailNotBetween(String value1, String value2) {
            addCriterion("URG_EMAIL not between", value1, value2, "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneIsNull() {
            addCriterion("URG_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneIsNotNull() {
            addCriterion("URG_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneEqualTo(String value) {
            addCriterion("URG_PHONE =", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneNotEqualTo(String value) {
            addCriterion("URG_PHONE <>", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneGreaterThan(String value) {
            addCriterion("URG_PHONE >", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("URG_PHONE >=", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneLessThan(String value) {
            addCriterion("URG_PHONE <", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneLessThanOrEqualTo(String value) {
            addCriterion("URG_PHONE <=", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneLike(String value) {
            addCriterion("URG_PHONE like", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneNotLike(String value) {
            addCriterion("URG_PHONE not like", value, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneIn(List<String> values) {
            addCriterion("URG_PHONE in", values, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneNotIn(List<String> values) {
            addCriterion("URG_PHONE not in", values, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneBetween(String value1, String value2) {
            addCriterion("URG_PHONE between", value1, value2, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneNotBetween(String value1, String value2) {
            addCriterion("URG_PHONE not between", value1, value2, "urgPhone");
            return (Criteria) this;
        }

        public Criteria andUrgNameLikeInsensitive(String value) {
            addCriterion("upper(URG_NAME) like", value.toUpperCase(), "urgName");
            return (Criteria) this;
        }

        public Criteria andUrgEmailLikeInsensitive(String value) {
            addCriterion("upper(URG_EMAIL) like", value.toUpperCase(), "urgEmail");
            return (Criteria) this;
        }

        public Criteria andUrgPhoneLikeInsensitive(String value) {
            addCriterion("upper(URG_PHONE) like", value.toUpperCase(), "urgPhone");
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