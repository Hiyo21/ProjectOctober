package model.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PhotoLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotoLocationExample() {
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
        protected List<Criterion> phtUploadDateCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            phtUploadDateCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getPhtUploadDateCriteria() {
            return phtUploadDateCriteria;
        }

        protected void addPhtUploadDateCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            phtUploadDateCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        protected void addPhtUploadDateCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            phtUploadDateCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalDateTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || phtUploadDateCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(phtUploadDateCriteria);
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

        public Criteria andPhotoNumIsNull() {
            addCriterion("PHOTO_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPhotoNumIsNotNull() {
            addCriterion("PHOTO_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoNumEqualTo(Integer value) {
            addCriterion("PHOTO_NUM =", value, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumNotEqualTo(Integer value) {
            addCriterion("PHOTO_NUM <>", value, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumGreaterThan(Integer value) {
            addCriterion("PHOTO_NUM >", value, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PHOTO_NUM >=", value, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumLessThan(Integer value) {
            addCriterion("PHOTO_NUM <", value, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumLessThanOrEqualTo(Integer value) {
            addCriterion("PHOTO_NUM <=", value, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumIn(List<Integer> values) {
            addCriterion("PHOTO_NUM in", values, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumNotIn(List<Integer> values) {
            addCriterion("PHOTO_NUM not in", values, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumBetween(Integer value1, Integer value2) {
            addCriterion("PHOTO_NUM between", value1, value2, "photoNum");
            return (Criteria) this;
        }

        public Criteria andPhotoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PHOTO_NUM not between", value1, value2, "photoNum");
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

        public Criteria andPhtUsageIsNull() {
            addCriterion("PHT_USAGE is null");
            return (Criteria) this;
        }

        public Criteria andPhtUsageIsNotNull() {
            addCriterion("PHT_USAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPhtUsageEqualTo(String value) {
            addCriterion("PHT_USAGE =", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageNotEqualTo(String value) {
            addCriterion("PHT_USAGE <>", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageGreaterThan(String value) {
            addCriterion("PHT_USAGE >", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageGreaterThanOrEqualTo(String value) {
            addCriterion("PHT_USAGE >=", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageLessThan(String value) {
            addCriterion("PHT_USAGE <", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageLessThanOrEqualTo(String value) {
            addCriterion("PHT_USAGE <=", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageLike(String value) {
            addCriterion("PHT_USAGE like", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageNotLike(String value) {
            addCriterion("PHT_USAGE not like", value, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageIn(List<String> values) {
            addCriterion("PHT_USAGE in", values, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageNotIn(List<String> values) {
            addCriterion("PHT_USAGE not in", values, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageBetween(String value1, String value2) {
            addCriterion("PHT_USAGE between", value1, value2, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtUsageNotBetween(String value1, String value2) {
            addCriterion("PHT_USAGE not between", value1, value2, "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionIsNull() {
            addCriterion("PHT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionIsNotNull() {
            addCriterion("PHT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionEqualTo(String value) {
            addCriterion("PHT_DESCRIPTION =", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionNotEqualTo(String value) {
            addCriterion("PHT_DESCRIPTION <>", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionGreaterThan(String value) {
            addCriterion("PHT_DESCRIPTION >", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PHT_DESCRIPTION >=", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionLessThan(String value) {
            addCriterion("PHT_DESCRIPTION <", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PHT_DESCRIPTION <=", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionLike(String value) {
            addCriterion("PHT_DESCRIPTION like", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionNotLike(String value) {
            addCriterion("PHT_DESCRIPTION not like", value, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionIn(List<String> values) {
            addCriterion("PHT_DESCRIPTION in", values, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionNotIn(List<String> values) {
            addCriterion("PHT_DESCRIPTION not in", values, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionBetween(String value1, String value2) {
            addCriterion("PHT_DESCRIPTION between", value1, value2, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionNotBetween(String value1, String value2) {
            addCriterion("PHT_DESCRIPTION not between", value1, value2, "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtAddressIsNull() {
            addCriterion("PHT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPhtAddressIsNotNull() {
            addCriterion("PHT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPhtAddressEqualTo(String value) {
            addCriterion("PHT_ADDRESS =", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressNotEqualTo(String value) {
            addCriterion("PHT_ADDRESS <>", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressGreaterThan(String value) {
            addCriterion("PHT_ADDRESS >", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PHT_ADDRESS >=", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressLessThan(String value) {
            addCriterion("PHT_ADDRESS <", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressLessThanOrEqualTo(String value) {
            addCriterion("PHT_ADDRESS <=", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressLike(String value) {
            addCriterion("PHT_ADDRESS like", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressNotLike(String value) {
            addCriterion("PHT_ADDRESS not like", value, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressIn(List<String> values) {
            addCriterion("PHT_ADDRESS in", values, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressNotIn(List<String> values) {
            addCriterion("PHT_ADDRESS not in", values, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressBetween(String value1, String value2) {
            addCriterion("PHT_ADDRESS between", value1, value2, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtAddressNotBetween(String value1, String value2) {
            addCriterion("PHT_ADDRESS not between", value1, value2, "phtAddress");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateIsNull() {
            addCriterion("PHT_UPLOAD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateIsNotNull() {
            addCriterion("PHT_UPLOAD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateEqualTo(LocalDateTime value) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE =", value, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateNotEqualTo(LocalDateTime value) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE <>", value, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateGreaterThan(LocalDateTime value) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE >", value, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateGreaterThanOrEqualTo(LocalDateTime value) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE >=", value, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateLessThan(LocalDateTime value) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE <", value, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateLessThanOrEqualTo(LocalDateTime value) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE <=", value, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateIn(List<LocalDateTime> values) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE in", values, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateNotIn(List<LocalDateTime> values) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE not in", values, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE between", value1, value2, "phtUploadDate");
            return (Criteria) this;
        }

        public Criteria andPhtUploadDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addPhtUploadDateCriterion("PHT_UPLOAD_DATE not between", value1, value2, "phtUploadDate");
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

        public Criteria andPhtUsageLikeInsensitive(String value) {
            addCriterion("upper(PHT_USAGE) like", value.toUpperCase(), "phtUsage");
            return (Criteria) this;
        }

        public Criteria andPhtDescriptionLikeInsensitive(String value) {
            addCriterion("upper(PHT_DESCRIPTION) like", value.toUpperCase(), "phtDescription");
            return (Criteria) this;
        }

        public Criteria andPhtAddressLikeInsensitive(String value) {
            addCriterion("upper(PHT_ADDRESS) like", value.toUpperCase(), "phtAddress");
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