package model.vo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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
        protected List<Criterion> memJoinedDateCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            memJoinedDateCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getMemJoinedDateCriteria() {
            return memJoinedDateCriteria;
        }

        protected void addMemJoinedDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            memJoinedDateCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateHandler"));
            allCriteria = null;
        }

        protected void addMemJoinedDateCriterion(String condition, LocalDate value1, LocalDate value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            memJoinedDateCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || memJoinedDateCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(memJoinedDateCriteria);
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

        public Criteria andMemEmailIsNull() {
            addCriterion("MEM_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMemEmailIsNotNull() {
            addCriterion("MEM_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMemEmailEqualTo(String value) {
            addCriterion("MEM_EMAIL =", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotEqualTo(String value) {
            addCriterion("MEM_EMAIL <>", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailGreaterThan(String value) {
            addCriterion("MEM_EMAIL >", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_EMAIL >=", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailLessThan(String value) {
            addCriterion("MEM_EMAIL <", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailLessThanOrEqualTo(String value) {
            addCriterion("MEM_EMAIL <=", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailLike(String value) {
            addCriterion("MEM_EMAIL like", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotLike(String value) {
            addCriterion("MEM_EMAIL not like", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailIn(List<String> values) {
            addCriterion("MEM_EMAIL in", values, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotIn(List<String> values) {
            addCriterion("MEM_EMAIL not in", values, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailBetween(String value1, String value2) {
            addCriterion("MEM_EMAIL between", value1, value2, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotBetween(String value1, String value2) {
            addCriterion("MEM_EMAIL not between", value1, value2, "memEmail");
            return (Criteria) this;
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

        public Criteria andMemNameIsNull() {
            addCriterion("MEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNotNull() {
            addCriterion("MEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemNameEqualTo(String value) {
            addCriterion("MEM_NAME =", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotEqualTo(String value) {
            addCriterion("MEM_NAME <>", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThan(String value) {
            addCriterion("MEM_NAME >", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_NAME >=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThan(String value) {
            addCriterion("MEM_NAME <", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThanOrEqualTo(String value) {
            addCriterion("MEM_NAME <=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLike(String value) {
            addCriterion("MEM_NAME like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotLike(String value) {
            addCriterion("MEM_NAME not like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameIn(List<String> values) {
            addCriterion("MEM_NAME in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotIn(List<String> values) {
            addCriterion("MEM_NAME not in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameBetween(String value1, String value2) {
            addCriterion("MEM_NAME between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotBetween(String value1, String value2) {
            addCriterion("MEM_NAME not between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemPasswordIsNull() {
            addCriterion("MEM_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andMemPasswordIsNotNull() {
            addCriterion("MEM_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andMemPasswordEqualTo(String value) {
            addCriterion("MEM_PASSWORD =", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotEqualTo(String value) {
            addCriterion("MEM_PASSWORD <>", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordGreaterThan(String value) {
            addCriterion("MEM_PASSWORD >", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_PASSWORD >=", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordLessThan(String value) {
            addCriterion("MEM_PASSWORD <", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordLessThanOrEqualTo(String value) {
            addCriterion("MEM_PASSWORD <=", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordLike(String value) {
            addCriterion("MEM_PASSWORD like", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotLike(String value) {
            addCriterion("MEM_PASSWORD not like", value, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordIn(List<String> values) {
            addCriterion("MEM_PASSWORD in", values, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotIn(List<String> values) {
            addCriterion("MEM_PASSWORD not in", values, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordBetween(String value1, String value2) {
            addCriterion("MEM_PASSWORD between", value1, value2, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPasswordNotBetween(String value1, String value2) {
            addCriterion("MEM_PASSWORD not between", value1, value2, "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPhoneIsNull() {
            addCriterion("MEM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMemPhoneIsNotNull() {
            addCriterion("MEM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMemPhoneEqualTo(String value) {
            addCriterion("MEM_PHONE =", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotEqualTo(String value) {
            addCriterion("MEM_PHONE <>", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneGreaterThan(String value) {
            addCriterion("MEM_PHONE >", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_PHONE >=", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneLessThan(String value) {
            addCriterion("MEM_PHONE <", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneLessThanOrEqualTo(String value) {
            addCriterion("MEM_PHONE <=", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneLike(String value) {
            addCriterion("MEM_PHONE like", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotLike(String value) {
            addCriterion("MEM_PHONE not like", value, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneIn(List<String> values) {
            addCriterion("MEM_PHONE in", values, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotIn(List<String> values) {
            addCriterion("MEM_PHONE not in", values, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneBetween(String value1, String value2) {
            addCriterion("MEM_PHONE between", value1, value2, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemPhoneNotBetween(String value1, String value2) {
            addCriterion("MEM_PHONE not between", value1, value2, "memPhone");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateIsNull() {
            addCriterion("MEM_JOINED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateIsNotNull() {
            addCriterion("MEM_JOINED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateEqualTo(LocalDate value) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE =", value, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateNotEqualTo(LocalDate value) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE <>", value, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateGreaterThan(LocalDate value) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE >", value, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateGreaterThanOrEqualTo(LocalDate value) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE >=", value, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateLessThan(LocalDate value) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE <", value, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateLessThanOrEqualTo(LocalDate value) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE <=", value, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateIn(List<LocalDate> values) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE in", values, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateNotIn(List<LocalDate> values) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE not in", values, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateBetween(LocalDate value1, LocalDate value2) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE between", value1, value2, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemJoinedDateNotBetween(LocalDate value1, LocalDate value2) {
            addMemJoinedDateCriterion("MEM_JOINED_DATE not between", value1, value2, "memJoinedDate");
            return (Criteria) this;
        }

        public Criteria andMemEmailLikeInsensitive(String value) {
            addCriterion("upper(MEM_EMAIL) like", value.toUpperCase(), "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemNameLikeInsensitive(String value) {
            addCriterion("upper(MEM_NAME) like", value.toUpperCase(), "memName");
            return (Criteria) this;
        }

        public Criteria andMemPasswordLikeInsensitive(String value) {
            addCriterion("upper(MEM_PASSWORD) like", value.toUpperCase(), "memPassword");
            return (Criteria) this;
        }

        public Criteria andMemPhoneLikeInsensitive(String value) {
            addCriterion("upper(MEM_PHONE) like", value.toUpperCase(), "memPhone");
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