package model.vo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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
        protected List<Criterion> cstBirthdayCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            cstBirthdayCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getCstBirthdayCriteria() {
            return cstBirthdayCriteria;
        }

        protected void addCstBirthdayCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            cstBirthdayCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateHandler"));
            allCriteria = null;
        }

        protected void addCstBirthdayCriterion(String condition, LocalDate value1, LocalDate value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            cstBirthdayCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || cstBirthdayCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(cstBirthdayCriteria);
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

        public Criteria andCstAddressIsNull() {
            addCriterion("CST_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCstAddressIsNotNull() {
            addCriterion("CST_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCstAddressEqualTo(String value) {
            addCriterion("CST_ADDRESS =", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotEqualTo(String value) {
            addCriterion("CST_ADDRESS <>", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressGreaterThan(String value) {
            addCriterion("CST_ADDRESS >", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CST_ADDRESS >=", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressLessThan(String value) {
            addCriterion("CST_ADDRESS <", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressLessThanOrEqualTo(String value) {
            addCriterion("CST_ADDRESS <=", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressLike(String value) {
            addCriterion("CST_ADDRESS like", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotLike(String value) {
            addCriterion("CST_ADDRESS not like", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressIn(List<String> values) {
            addCriterion("CST_ADDRESS in", values, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotIn(List<String> values) {
            addCriterion("CST_ADDRESS not in", values, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressBetween(String value1, String value2) {
            addCriterion("CST_ADDRESS between", value1, value2, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotBetween(String value1, String value2) {
            addCriterion("CST_ADDRESS not between", value1, value2, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeIsNull() {
            addCriterion("CST_ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeIsNotNull() {
            addCriterion("CST_ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeEqualTo(String value) {
            addCriterion("CST_ZIPCODE =", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeNotEqualTo(String value) {
            addCriterion("CST_ZIPCODE <>", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeGreaterThan(String value) {
            addCriterion("CST_ZIPCODE >", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CST_ZIPCODE >=", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeLessThan(String value) {
            addCriterion("CST_ZIPCODE <", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeLessThanOrEqualTo(String value) {
            addCriterion("CST_ZIPCODE <=", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeLike(String value) {
            addCriterion("CST_ZIPCODE like", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeNotLike(String value) {
            addCriterion("CST_ZIPCODE not like", value, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeIn(List<String> values) {
            addCriterion("CST_ZIPCODE in", values, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeNotIn(List<String> values) {
            addCriterion("CST_ZIPCODE not in", values, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeBetween(String value1, String value2) {
            addCriterion("CST_ZIPCODE between", value1, value2, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeNotBetween(String value1, String value2) {
            addCriterion("CST_ZIPCODE not between", value1, value2, "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayIsNull() {
            addCriterion("CST_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayIsNotNull() {
            addCriterion("CST_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayEqualTo(LocalDate value) {
            addCstBirthdayCriterion("CST_BIRTHDAY =", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayNotEqualTo(LocalDate value) {
            addCstBirthdayCriterion("CST_BIRTHDAY <>", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayGreaterThan(LocalDate value) {
            addCstBirthdayCriterion("CST_BIRTHDAY >", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayGreaterThanOrEqualTo(LocalDate value) {
            addCstBirthdayCriterion("CST_BIRTHDAY >=", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayLessThan(LocalDate value) {
            addCstBirthdayCriterion("CST_BIRTHDAY <", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayLessThanOrEqualTo(LocalDate value) {
            addCstBirthdayCriterion("CST_BIRTHDAY <=", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayIn(List<LocalDate> values) {
            addCstBirthdayCriterion("CST_BIRTHDAY in", values, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayNotIn(List<LocalDate> values) {
            addCstBirthdayCriterion("CST_BIRTHDAY not in", values, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayBetween(LocalDate value1, LocalDate value2) {
            addCstBirthdayCriterion("CST_BIRTHDAY between", value1, value2, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayNotBetween(LocalDate value1, LocalDate value2) {
            addCstBirthdayCriterion("CST_BIRTHDAY not between", value1, value2, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstGenderIsNull() {
            addCriterion("CST_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andCstGenderIsNotNull() {
            addCriterion("CST_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andCstGenderEqualTo(String value) {
            addCriterion("CST_GENDER =", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderNotEqualTo(String value) {
            addCriterion("CST_GENDER <>", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderGreaterThan(String value) {
            addCriterion("CST_GENDER >", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderGreaterThanOrEqualTo(String value) {
            addCriterion("CST_GENDER >=", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderLessThan(String value) {
            addCriterion("CST_GENDER <", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderLessThanOrEqualTo(String value) {
            addCriterion("CST_GENDER <=", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderLike(String value) {
            addCriterion("CST_GENDER like", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderNotLike(String value) {
            addCriterion("CST_GENDER not like", value, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderIn(List<String> values) {
            addCriterion("CST_GENDER in", values, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderNotIn(List<String> values) {
            addCriterion("CST_GENDER not in", values, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderBetween(String value1, String value2) {
            addCriterion("CST_GENDER between", value1, value2, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstGenderNotBetween(String value1, String value2) {
            addCriterion("CST_GENDER not between", value1, value2, "cstGender");
            return (Criteria) this;
        }

        public Criteria andCstOneclickIsNull() {
            addCriterion("CST_ONECLICK is null");
            return (Criteria) this;
        }

        public Criteria andCstOneclickIsNotNull() {
            addCriterion("CST_ONECLICK is not null");
            return (Criteria) this;
        }

        public Criteria andCstOneclickEqualTo(Integer value) {
            addCriterion("CST_ONECLICK =", value, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickNotEqualTo(Integer value) {
            addCriterion("CST_ONECLICK <>", value, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickGreaterThan(Integer value) {
            addCriterion("CST_ONECLICK >", value, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickGreaterThanOrEqualTo(Integer value) {
            addCriterion("CST_ONECLICK >=", value, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickLessThan(Integer value) {
            addCriterion("CST_ONECLICK <", value, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickLessThanOrEqualTo(Integer value) {
            addCriterion("CST_ONECLICK <=", value, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickIn(List<Integer> values) {
            addCriterion("CST_ONECLICK in", values, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickNotIn(List<Integer> values) {
            addCriterion("CST_ONECLICK not in", values, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickBetween(Integer value1, Integer value2) {
            addCriterion("CST_ONECLICK between", value1, value2, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstOneclickNotBetween(Integer value1, Integer value2) {
            addCriterion("CST_ONECLICK not between", value1, value2, "cstOneclick");
            return (Criteria) this;
        }

        public Criteria andCstEmailLikeInsensitive(String value) {
            addCriterion("upper(CST_EMAIL) like", value.toUpperCase(), "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstAddressLikeInsensitive(String value) {
            addCriterion("upper(CST_ADDRESS) like", value.toUpperCase(), "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstZipcodeLikeInsensitive(String value) {
            addCriterion("upper(CST_ZIPCODE) like", value.toUpperCase(), "cstZipcode");
            return (Criteria) this;
        }

        public Criteria andCstGenderLikeInsensitive(String value) {
            addCriterion("upper(CST_GENDER) like", value.toUpperCase(), "cstGender");
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