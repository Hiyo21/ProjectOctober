package model.vo;

import java.util.ArrayList;
import java.util.List;

public class MemberCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberCodeExample() {
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

        public Criteria andMemCodeIsNull() {
            addCriterion("MEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMemCodeIsNotNull() {
            addCriterion("MEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMemCodeEqualTo(Integer value) {
            addCriterion("MEM_CODE =", value, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeNotEqualTo(Integer value) {
            addCriterion("MEM_CODE <>", value, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeGreaterThan(Integer value) {
            addCriterion("MEM_CODE >", value, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_CODE >=", value, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeLessThan(Integer value) {
            addCriterion("MEM_CODE <", value, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_CODE <=", value, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeIn(List<Integer> values) {
            addCriterion("MEM_CODE in", values, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeNotIn(List<Integer> values) {
            addCriterion("MEM_CODE not in", values, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeBetween(Integer value1, Integer value2) {
            addCriterion("MEM_CODE between", value1, value2, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_CODE not between", value1, value2, "memCode");
            return (Criteria) this;
        }

        public Criteria andMemTypeIsNull() {
            addCriterion("MEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMemTypeIsNotNull() {
            addCriterion("MEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMemTypeEqualTo(String value) {
            addCriterion("MEM_TYPE =", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotEqualTo(String value) {
            addCriterion("MEM_TYPE <>", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeGreaterThan(String value) {
            addCriterion("MEM_TYPE >", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_TYPE >=", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeLessThan(String value) {
            addCriterion("MEM_TYPE <", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeLessThanOrEqualTo(String value) {
            addCriterion("MEM_TYPE <=", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeLike(String value) {
            addCriterion("MEM_TYPE like", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotLike(String value) {
            addCriterion("MEM_TYPE not like", value, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeIn(List<String> values) {
            addCriterion("MEM_TYPE in", values, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotIn(List<String> values) {
            addCriterion("MEM_TYPE not in", values, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeBetween(String value1, String value2) {
            addCriterion("MEM_TYPE between", value1, value2, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeNotBetween(String value1, String value2) {
            addCriterion("MEM_TYPE not between", value1, value2, "memType");
            return (Criteria) this;
        }

        public Criteria andMemTypeLikeInsensitive(String value) {
            addCriterion("upper(MEM_TYPE) like", value.toUpperCase(), "memType");
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