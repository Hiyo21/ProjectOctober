package model.vo;

import java.util.ArrayList;
import java.util.List;

public class WorkingDaysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkingDaysExample() {
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

        public Criteria andMonIsNull() {
            addCriterion("MON is null");
            return (Criteria) this;
        }

        public Criteria andMonIsNotNull() {
            addCriterion("MON is not null");
            return (Criteria) this;
        }

        public Criteria andMonEqualTo(Integer value) {
            addCriterion("MON =", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonNotEqualTo(Integer value) {
            addCriterion("MON <>", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonGreaterThan(Integer value) {
            addCriterion("MON >", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonGreaterThanOrEqualTo(Integer value) {
            addCriterion("MON >=", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonLessThan(Integer value) {
            addCriterion("MON <", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonLessThanOrEqualTo(Integer value) {
            addCriterion("MON <=", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonIn(List<Integer> values) {
            addCriterion("MON in", values, "mon");
            return (Criteria) this;
        }

        public Criteria andMonNotIn(List<Integer> values) {
            addCriterion("MON not in", values, "mon");
            return (Criteria) this;
        }

        public Criteria andMonBetween(Integer value1, Integer value2) {
            addCriterion("MON between", value1, value2, "mon");
            return (Criteria) this;
        }

        public Criteria andMonNotBetween(Integer value1, Integer value2) {
            addCriterion("MON not between", value1, value2, "mon");
            return (Criteria) this;
        }

        public Criteria andTueIsNull() {
            addCriterion("TUE is null");
            return (Criteria) this;
        }

        public Criteria andTueIsNotNull() {
            addCriterion("TUE is not null");
            return (Criteria) this;
        }

        public Criteria andTueEqualTo(Integer value) {
            addCriterion("TUE =", value, "tue");
            return (Criteria) this;
        }

        public Criteria andTueNotEqualTo(Integer value) {
            addCriterion("TUE <>", value, "tue");
            return (Criteria) this;
        }

        public Criteria andTueGreaterThan(Integer value) {
            addCriterion("TUE >", value, "tue");
            return (Criteria) this;
        }

        public Criteria andTueGreaterThanOrEqualTo(Integer value) {
            addCriterion("TUE >=", value, "tue");
            return (Criteria) this;
        }

        public Criteria andTueLessThan(Integer value) {
            addCriterion("TUE <", value, "tue");
            return (Criteria) this;
        }

        public Criteria andTueLessThanOrEqualTo(Integer value) {
            addCriterion("TUE <=", value, "tue");
            return (Criteria) this;
        }

        public Criteria andTueIn(List<Integer> values) {
            addCriterion("TUE in", values, "tue");
            return (Criteria) this;
        }

        public Criteria andTueNotIn(List<Integer> values) {
            addCriterion("TUE not in", values, "tue");
            return (Criteria) this;
        }

        public Criteria andTueBetween(Integer value1, Integer value2) {
            addCriterion("TUE between", value1, value2, "tue");
            return (Criteria) this;
        }

        public Criteria andTueNotBetween(Integer value1, Integer value2) {
            addCriterion("TUE not between", value1, value2, "tue");
            return (Criteria) this;
        }

        public Criteria andWedIsNull() {
            addCriterion("WED is null");
            return (Criteria) this;
        }

        public Criteria andWedIsNotNull() {
            addCriterion("WED is not null");
            return (Criteria) this;
        }

        public Criteria andWedEqualTo(Integer value) {
            addCriterion("WED =", value, "wed");
            return (Criteria) this;
        }

        public Criteria andWedNotEqualTo(Integer value) {
            addCriterion("WED <>", value, "wed");
            return (Criteria) this;
        }

        public Criteria andWedGreaterThan(Integer value) {
            addCriterion("WED >", value, "wed");
            return (Criteria) this;
        }

        public Criteria andWedGreaterThanOrEqualTo(Integer value) {
            addCriterion("WED >=", value, "wed");
            return (Criteria) this;
        }

        public Criteria andWedLessThan(Integer value) {
            addCriterion("WED <", value, "wed");
            return (Criteria) this;
        }

        public Criteria andWedLessThanOrEqualTo(Integer value) {
            addCriterion("WED <=", value, "wed");
            return (Criteria) this;
        }

        public Criteria andWedIn(List<Integer> values) {
            addCriterion("WED in", values, "wed");
            return (Criteria) this;
        }

        public Criteria andWedNotIn(List<Integer> values) {
            addCriterion("WED not in", values, "wed");
            return (Criteria) this;
        }

        public Criteria andWedBetween(Integer value1, Integer value2) {
            addCriterion("WED between", value1, value2, "wed");
            return (Criteria) this;
        }

        public Criteria andWedNotBetween(Integer value1, Integer value2) {
            addCriterion("WED not between", value1, value2, "wed");
            return (Criteria) this;
        }

        public Criteria andThuIsNull() {
            addCriterion("THU is null");
            return (Criteria) this;
        }

        public Criteria andThuIsNotNull() {
            addCriterion("THU is not null");
            return (Criteria) this;
        }

        public Criteria andThuEqualTo(Integer value) {
            addCriterion("THU =", value, "thu");
            return (Criteria) this;
        }

        public Criteria andThuNotEqualTo(Integer value) {
            addCriterion("THU <>", value, "thu");
            return (Criteria) this;
        }

        public Criteria andThuGreaterThan(Integer value) {
            addCriterion("THU >", value, "thu");
            return (Criteria) this;
        }

        public Criteria andThuGreaterThanOrEqualTo(Integer value) {
            addCriterion("THU >=", value, "thu");
            return (Criteria) this;
        }

        public Criteria andThuLessThan(Integer value) {
            addCriterion("THU <", value, "thu");
            return (Criteria) this;
        }

        public Criteria andThuLessThanOrEqualTo(Integer value) {
            addCriterion("THU <=", value, "thu");
            return (Criteria) this;
        }

        public Criteria andThuIn(List<Integer> values) {
            addCriterion("THU in", values, "thu");
            return (Criteria) this;
        }

        public Criteria andThuNotIn(List<Integer> values) {
            addCriterion("THU not in", values, "thu");
            return (Criteria) this;
        }

        public Criteria andThuBetween(Integer value1, Integer value2) {
            addCriterion("THU between", value1, value2, "thu");
            return (Criteria) this;
        }

        public Criteria andThuNotBetween(Integer value1, Integer value2) {
            addCriterion("THU not between", value1, value2, "thu");
            return (Criteria) this;
        }

        public Criteria andFriIsNull() {
            addCriterion("FRI is null");
            return (Criteria) this;
        }

        public Criteria andFriIsNotNull() {
            addCriterion("FRI is not null");
            return (Criteria) this;
        }

        public Criteria andFriEqualTo(Integer value) {
            addCriterion("FRI =", value, "fri");
            return (Criteria) this;
        }

        public Criteria andFriNotEqualTo(Integer value) {
            addCriterion("FRI <>", value, "fri");
            return (Criteria) this;
        }

        public Criteria andFriGreaterThan(Integer value) {
            addCriterion("FRI >", value, "fri");
            return (Criteria) this;
        }

        public Criteria andFriGreaterThanOrEqualTo(Integer value) {
            addCriterion("FRI >=", value, "fri");
            return (Criteria) this;
        }

        public Criteria andFriLessThan(Integer value) {
            addCriterion("FRI <", value, "fri");
            return (Criteria) this;
        }

        public Criteria andFriLessThanOrEqualTo(Integer value) {
            addCriterion("FRI <=", value, "fri");
            return (Criteria) this;
        }

        public Criteria andFriIn(List<Integer> values) {
            addCriterion("FRI in", values, "fri");
            return (Criteria) this;
        }

        public Criteria andFriNotIn(List<Integer> values) {
            addCriterion("FRI not in", values, "fri");
            return (Criteria) this;
        }

        public Criteria andFriBetween(Integer value1, Integer value2) {
            addCriterion("FRI between", value1, value2, "fri");
            return (Criteria) this;
        }

        public Criteria andFriNotBetween(Integer value1, Integer value2) {
            addCriterion("FRI not between", value1, value2, "fri");
            return (Criteria) this;
        }

        public Criteria andSatIsNull() {
            addCriterion("SAT is null");
            return (Criteria) this;
        }

        public Criteria andSatIsNotNull() {
            addCriterion("SAT is not null");
            return (Criteria) this;
        }

        public Criteria andSatEqualTo(Integer value) {
            addCriterion("SAT =", value, "sat");
            return (Criteria) this;
        }

        public Criteria andSatNotEqualTo(Integer value) {
            addCriterion("SAT <>", value, "sat");
            return (Criteria) this;
        }

        public Criteria andSatGreaterThan(Integer value) {
            addCriterion("SAT >", value, "sat");
            return (Criteria) this;
        }

        public Criteria andSatGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAT >=", value, "sat");
            return (Criteria) this;
        }

        public Criteria andSatLessThan(Integer value) {
            addCriterion("SAT <", value, "sat");
            return (Criteria) this;
        }

        public Criteria andSatLessThanOrEqualTo(Integer value) {
            addCriterion("SAT <=", value, "sat");
            return (Criteria) this;
        }

        public Criteria andSatIn(List<Integer> values) {
            addCriterion("SAT in", values, "sat");
            return (Criteria) this;
        }

        public Criteria andSatNotIn(List<Integer> values) {
            addCriterion("SAT not in", values, "sat");
            return (Criteria) this;
        }

        public Criteria andSatBetween(Integer value1, Integer value2) {
            addCriterion("SAT between", value1, value2, "sat");
            return (Criteria) this;
        }

        public Criteria andSatNotBetween(Integer value1, Integer value2) {
            addCriterion("SAT not between", value1, value2, "sat");
            return (Criteria) this;
        }

        public Criteria andSunIsNull() {
            addCriterion("SUN is null");
            return (Criteria) this;
        }

        public Criteria andSunIsNotNull() {
            addCriterion("SUN is not null");
            return (Criteria) this;
        }

        public Criteria andSunEqualTo(Integer value) {
            addCriterion("SUN =", value, "sun");
            return (Criteria) this;
        }

        public Criteria andSunNotEqualTo(Integer value) {
            addCriterion("SUN <>", value, "sun");
            return (Criteria) this;
        }

        public Criteria andSunGreaterThan(Integer value) {
            addCriterion("SUN >", value, "sun");
            return (Criteria) this;
        }

        public Criteria andSunGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUN >=", value, "sun");
            return (Criteria) this;
        }

        public Criteria andSunLessThan(Integer value) {
            addCriterion("SUN <", value, "sun");
            return (Criteria) this;
        }

        public Criteria andSunLessThanOrEqualTo(Integer value) {
            addCriterion("SUN <=", value, "sun");
            return (Criteria) this;
        }

        public Criteria andSunIn(List<Integer> values) {
            addCriterion("SUN in", values, "sun");
            return (Criteria) this;
        }

        public Criteria andSunNotIn(List<Integer> values) {
            addCriterion("SUN not in", values, "sun");
            return (Criteria) this;
        }

        public Criteria andSunBetween(Integer value1, Integer value2) {
            addCriterion("SUN between", value1, value2, "sun");
            return (Criteria) this;
        }

        public Criteria andSunNotBetween(Integer value1, Integer value2) {
            addCriterion("SUN not between", value1, value2, "sun");
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