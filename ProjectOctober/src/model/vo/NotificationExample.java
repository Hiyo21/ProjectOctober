package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotificationExample() {
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
        protected List<Criterion> ntfTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            ntfTimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getNtfTimeCriteria() {
            return ntfTimeCriteria;
        }

        protected void addNtfTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            ntfTimeCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addNtfTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            ntfTimeCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || ntfTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(ntfTimeCriteria);
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

        public Criteria andNtfNumIsNull() {
            addCriterion("NTF_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNtfNumIsNotNull() {
            addCriterion("NTF_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNtfNumEqualTo(Integer value) {
            addCriterion("NTF_NUM =", value, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumNotEqualTo(Integer value) {
            addCriterion("NTF_NUM <>", value, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumGreaterThan(Integer value) {
            addCriterion("NTF_NUM >", value, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("NTF_NUM >=", value, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumLessThan(Integer value) {
            addCriterion("NTF_NUM <", value, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumLessThanOrEqualTo(Integer value) {
            addCriterion("NTF_NUM <=", value, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumIn(List<Integer> values) {
            addCriterion("NTF_NUM in", values, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumNotIn(List<Integer> values) {
            addCriterion("NTF_NUM not in", values, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumBetween(Integer value1, Integer value2) {
            addCriterion("NTF_NUM between", value1, value2, "ntfNum");
            return (Criteria) this;
        }

        public Criteria andNtfNumNotBetween(Integer value1, Integer value2) {
            addCriterion("NTF_NUM not between", value1, value2, "ntfNum");
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

        public Criteria andNtfMessageIsNull() {
            addCriterion("NTF_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andNtfMessageIsNotNull() {
            addCriterion("NTF_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andNtfMessageEqualTo(String value) {
            addCriterion("NTF_MESSAGE =", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageNotEqualTo(String value) {
            addCriterion("NTF_MESSAGE <>", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageGreaterThan(String value) {
            addCriterion("NTF_MESSAGE >", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageGreaterThanOrEqualTo(String value) {
            addCriterion("NTF_MESSAGE >=", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageLessThan(String value) {
            addCriterion("NTF_MESSAGE <", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageLessThanOrEqualTo(String value) {
            addCriterion("NTF_MESSAGE <=", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageLike(String value) {
            addCriterion("NTF_MESSAGE like", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageNotLike(String value) {
            addCriterion("NTF_MESSAGE not like", value, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageIn(List<String> values) {
            addCriterion("NTF_MESSAGE in", values, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageNotIn(List<String> values) {
            addCriterion("NTF_MESSAGE not in", values, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageBetween(String value1, String value2) {
            addCriterion("NTF_MESSAGE between", value1, value2, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfMessageNotBetween(String value1, String value2) {
            addCriterion("NTF_MESSAGE not between", value1, value2, "ntfMessage");
            return (Criteria) this;
        }

        public Criteria andNtfTimeIsNull() {
            addCriterion("NTF_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNtfTimeIsNotNull() {
            addCriterion("NTF_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNtfTimeEqualTo(LocalDateTime value) {
            addNtfTimeCriterion("NTF_TIME =", value, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeNotEqualTo(LocalDateTime value) {
            addNtfTimeCriterion("NTF_TIME <>", value, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeGreaterThan(LocalDateTime value) {
            addNtfTimeCriterion("NTF_TIME >", value, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addNtfTimeCriterion("NTF_TIME >=", value, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeLessThan(LocalDateTime value) {
            addNtfTimeCriterion("NTF_TIME <", value, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeLessThanOrEqualTo(LocalDateTime value) {
            addNtfTimeCriterion("NTF_TIME <=", value, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeIn(List<LocalDateTime> values) {
            addNtfTimeCriterion("NTF_TIME in", values, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeNotIn(List<LocalDateTime> values) {
            addNtfTimeCriterion("NTF_TIME not in", values, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addNtfTimeCriterion("NTF_TIME between", value1, value2, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addNtfTimeCriterion("NTF_TIME not between", value1, value2, "ntfTime");
            return (Criteria) this;
        }

        public Criteria andNtfReadIsNull() {
            addCriterion("NTF_READ is null");
            return (Criteria) this;
        }

        public Criteria andNtfReadIsNotNull() {
            addCriterion("NTF_READ is not null");
            return (Criteria) this;
        }

        public Criteria andNtfReadEqualTo(Integer value) {
            addCriterion("NTF_READ =", value, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadNotEqualTo(Integer value) {
            addCriterion("NTF_READ <>", value, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadGreaterThan(Integer value) {
            addCriterion("NTF_READ >", value, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("NTF_READ >=", value, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadLessThan(Integer value) {
            addCriterion("NTF_READ <", value, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadLessThanOrEqualTo(Integer value) {
            addCriterion("NTF_READ <=", value, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadIn(List<Integer> values) {
            addCriterion("NTF_READ in", values, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadNotIn(List<Integer> values) {
            addCriterion("NTF_READ not in", values, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadBetween(Integer value1, Integer value2) {
            addCriterion("NTF_READ between", value1, value2, "ntfRead");
            return (Criteria) this;
        }

        public Criteria andNtfReadNotBetween(Integer value1, Integer value2) {
            addCriterion("NTF_READ not between", value1, value2, "ntfRead");
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

        public Criteria andNtfMessageLikeInsensitive(String value) {
            addCriterion("upper(NTF_MESSAGE) like", value.toUpperCase(), "ntfMessage");
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