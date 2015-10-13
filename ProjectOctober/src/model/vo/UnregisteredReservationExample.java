package model.vo;

import java.util.ArrayList;
import java.util.List;

public class UnregisteredReservationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnregisteredReservationExample() {
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

        public Criteria andUrgRsvNumIsNull() {
            addCriterion("URG_RSV_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumIsNotNull() {
            addCriterion("URG_RSV_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumEqualTo(Integer value) {
            addCriterion("URG_RSV_NUM =", value, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumNotEqualTo(Integer value) {
            addCriterion("URG_RSV_NUM <>", value, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumGreaterThan(Integer value) {
            addCriterion("URG_RSV_NUM >", value, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("URG_RSV_NUM >=", value, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumLessThan(Integer value) {
            addCriterion("URG_RSV_NUM <", value, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumLessThanOrEqualTo(Integer value) {
            addCriterion("URG_RSV_NUM <=", value, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumIn(List<Integer> values) {
            addCriterion("URG_RSV_NUM in", values, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumNotIn(List<Integer> values) {
            addCriterion("URG_RSV_NUM not in", values, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumBetween(Integer value1, Integer value2) {
            addCriterion("URG_RSV_NUM between", value1, value2, "urgRsvNum");
            return (Criteria) this;
        }

        public Criteria andUrgRsvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("URG_RSV_NUM not between", value1, value2, "urgRsvNum");
            return (Criteria) this;
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

        public Criteria andUrgRsvPasswordIsNull() {
            addCriterion("URG_RSV_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordIsNotNull() {
            addCriterion("URG_RSV_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordEqualTo(String value) {
            addCriterion("URG_RSV_PASSWORD =", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordNotEqualTo(String value) {
            addCriterion("URG_RSV_PASSWORD <>", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordGreaterThan(String value) {
            addCriterion("URG_RSV_PASSWORD >", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("URG_RSV_PASSWORD >=", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordLessThan(String value) {
            addCriterion("URG_RSV_PASSWORD <", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordLessThanOrEqualTo(String value) {
            addCriterion("URG_RSV_PASSWORD <=", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordLike(String value) {
            addCriterion("URG_RSV_PASSWORD like", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordNotLike(String value) {
            addCriterion("URG_RSV_PASSWORD not like", value, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordIn(List<String> values) {
            addCriterion("URG_RSV_PASSWORD in", values, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordNotIn(List<String> values) {
            addCriterion("URG_RSV_PASSWORD not in", values, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordBetween(String value1, String value2) {
            addCriterion("URG_RSV_PASSWORD between", value1, value2, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordNotBetween(String value1, String value2) {
            addCriterion("URG_RSV_PASSWORD not between", value1, value2, "urgRsvPassword");
            return (Criteria) this;
        }

        public Criteria andUrgRsvPasswordLikeInsensitive(String value) {
            addCriterion("upper(URG_RSV_PASSWORD) like", value.toUpperCase(), "urgRsvPassword");
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