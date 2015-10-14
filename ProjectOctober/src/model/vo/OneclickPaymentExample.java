package model.vo;

import java.util.ArrayList;
import java.util.List;

public class OneclickPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OneclickPaymentExample() {
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

        public Criteria andCardNumIsNull() {
            addCriterion("CARD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNotNull() {
            addCriterion("CARD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumEqualTo(Integer value) {
            addCriterion("CARD_NUM =", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotEqualTo(Integer value) {
            addCriterion("CARD_NUM <>", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThan(Integer value) {
            addCriterion("CARD_NUM >", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARD_NUM >=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThan(Integer value) {
            addCriterion("CARD_NUM <", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThanOrEqualTo(Integer value) {
            addCriterion("CARD_NUM <=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumIn(List<Integer> values) {
            addCriterion("CARD_NUM in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotIn(List<Integer> values) {
            addCriterion("CARD_NUM not in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumBetween(Integer value1, Integer value2) {
            addCriterion("CARD_NUM between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CARD_NUM not between", value1, value2, "cardNum");
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

        public Criteria andCardTitleIsNull() {
            addCriterion("CARD_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCardTitleIsNotNull() {
            addCriterion("CARD_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTitleEqualTo(String value) {
            addCriterion("CARD_TITLE =", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleNotEqualTo(String value) {
            addCriterion("CARD_TITLE <>", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleGreaterThan(String value) {
            addCriterion("CARD_TITLE >", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TITLE >=", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleLessThan(String value) {
            addCriterion("CARD_TITLE <", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleLessThanOrEqualTo(String value) {
            addCriterion("CARD_TITLE <=", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleLike(String value) {
            addCriterion("CARD_TITLE like", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleNotLike(String value) {
            addCriterion("CARD_TITLE not like", value, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleIn(List<String> values) {
            addCriterion("CARD_TITLE in", values, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleNotIn(List<String> values) {
            addCriterion("CARD_TITLE not in", values, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleBetween(String value1, String value2) {
            addCriterion("CARD_TITLE between", value1, value2, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardTitleNotBetween(String value1, String value2) {
            addCriterion("CARD_TITLE not between", value1, value2, "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardDigitIsNull() {
            addCriterion("CARD_DIGIT is null");
            return (Criteria) this;
        }

        public Criteria andCardDigitIsNotNull() {
            addCriterion("CARD_DIGIT is not null");
            return (Criteria) this;
        }

        public Criteria andCardDigitEqualTo(String value) {
            addCriterion("CARD_DIGIT =", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitNotEqualTo(String value) {
            addCriterion("CARD_DIGIT <>", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitGreaterThan(String value) {
            addCriterion("CARD_DIGIT >", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_DIGIT >=", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitLessThan(String value) {
            addCriterion("CARD_DIGIT <", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitLessThanOrEqualTo(String value) {
            addCriterion("CARD_DIGIT <=", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitLike(String value) {
            addCriterion("CARD_DIGIT like", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitNotLike(String value) {
            addCriterion("CARD_DIGIT not like", value, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitIn(List<String> values) {
            addCriterion("CARD_DIGIT in", values, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitNotIn(List<String> values) {
            addCriterion("CARD_DIGIT not in", values, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitBetween(String value1, String value2) {
            addCriterion("CARD_DIGIT between", value1, value2, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardDigitNotBetween(String value1, String value2) {
            addCriterion("CARD_DIGIT not between", value1, value2, "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardCvcIsNull() {
            addCriterion("CARD_CVC is null");
            return (Criteria) this;
        }

        public Criteria andCardCvcIsNotNull() {
            addCriterion("CARD_CVC is not null");
            return (Criteria) this;
        }

        public Criteria andCardCvcEqualTo(String value) {
            addCriterion("CARD_CVC =", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcNotEqualTo(String value) {
            addCriterion("CARD_CVC <>", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcGreaterThan(String value) {
            addCriterion("CARD_CVC >", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_CVC >=", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcLessThan(String value) {
            addCriterion("CARD_CVC <", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcLessThanOrEqualTo(String value) {
            addCriterion("CARD_CVC <=", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcLike(String value) {
            addCriterion("CARD_CVC like", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcNotLike(String value) {
            addCriterion("CARD_CVC not like", value, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcIn(List<String> values) {
            addCriterion("CARD_CVC in", values, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcNotIn(List<String> values) {
            addCriterion("CARD_CVC not in", values, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcBetween(String value1, String value2) {
            addCriterion("CARD_CVC between", value1, value2, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardCvcNotBetween(String value1, String value2) {
            addCriterion("CARD_CVC not between", value1, value2, "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardExpireIsNull() {
            addCriterion("CARD_EXPIRE is null");
            return (Criteria) this;
        }

        public Criteria andCardExpireIsNotNull() {
            addCriterion("CARD_EXPIRE is not null");
            return (Criteria) this;
        }

        public Criteria andCardExpireEqualTo(String value) {
            addCriterion("CARD_EXPIRE =", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireNotEqualTo(String value) {
            addCriterion("CARD_EXPIRE <>", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireGreaterThan(String value) {
            addCriterion("CARD_EXPIRE >", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_EXPIRE >=", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireLessThan(String value) {
            addCriterion("CARD_EXPIRE <", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireLessThanOrEqualTo(String value) {
            addCriterion("CARD_EXPIRE <=", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireLike(String value) {
            addCriterion("CARD_EXPIRE like", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireNotLike(String value) {
            addCriterion("CARD_EXPIRE not like", value, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireIn(List<String> values) {
            addCriterion("CARD_EXPIRE in", values, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireNotIn(List<String> values) {
            addCriterion("CARD_EXPIRE not in", values, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireBetween(String value1, String value2) {
            addCriterion("CARD_EXPIRE between", value1, value2, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCardExpireNotBetween(String value1, String value2) {
            addCriterion("CARD_EXPIRE not between", value1, value2, "cardExpire");
            return (Criteria) this;
        }

        public Criteria andCstEmailLikeInsensitive(String value) {
            addCriterion("upper(CST_EMAIL) like", value.toUpperCase(), "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCardTitleLikeInsensitive(String value) {
            addCriterion("upper(CARD_TITLE) like", value.toUpperCase(), "cardTitle");
            return (Criteria) this;
        }

        public Criteria andCardDigitLikeInsensitive(String value) {
            addCriterion("upper(CARD_DIGIT) like", value.toUpperCase(), "cardDigit");
            return (Criteria) this;
        }

        public Criteria andCardCvcLikeInsensitive(String value) {
            addCriterion("upper(CARD_CVC) like", value.toUpperCase(), "cardCvc");
            return (Criteria) this;
        }

        public Criteria andCardExpireLikeInsensitive(String value) {
            addCriterion("upper(CARD_EXPIRE) like", value.toUpperCase(), "cardExpire");
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