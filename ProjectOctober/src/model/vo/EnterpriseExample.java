package model.vo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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
        protected List<Criterion> etpStartHourCriteria;

        protected List<Criterion> etpEndHourCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            etpStartHourCriteria = new ArrayList<Criterion>();
            etpEndHourCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getEtpStartHourCriteria() {
            return etpStartHourCriteria;
        }

        protected void addEtpStartHourCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            etpStartHourCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalTimeHandler"));
            allCriteria = null;
        }

        protected void addEtpStartHourCriterion(String condition, LocalTime value1, LocalTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            etpStartHourCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalTimeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getEtpEndHourCriteria() {
            return etpEndHourCriteria;
        }

        protected void addEtpEndHourCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            etpEndHourCriteria.add(new Criterion(condition, value, "model.mapper.typehandler.LocalTimeHandler"));
            allCriteria = null;
        }

        protected void addEtpEndHourCriterion(String condition, LocalTime value1, LocalTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            etpEndHourCriteria.add(new Criterion(condition, value1, value2, "model.mapper.typehandler.LocalTimeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || etpStartHourCriteria.size() > 0
                || etpEndHourCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(etpStartHourCriteria);
                allCriteria.addAll(etpEndHourCriteria);
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

        public Criteria andEtpOwnerIsNull() {
            addCriterion("ETP_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerIsNotNull() {
            addCriterion("ETP_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerEqualTo(String value) {
            addCriterion("ETP_OWNER =", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerNotEqualTo(String value) {
            addCriterion("ETP_OWNER <>", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerGreaterThan(String value) {
            addCriterion("ETP_OWNER >", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_OWNER >=", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerLessThan(String value) {
            addCriterion("ETP_OWNER <", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerLessThanOrEqualTo(String value) {
            addCriterion("ETP_OWNER <=", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerLike(String value) {
            addCriterion("ETP_OWNER like", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerNotLike(String value) {
            addCriterion("ETP_OWNER not like", value, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerIn(List<String> values) {
            addCriterion("ETP_OWNER in", values, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerNotIn(List<String> values) {
            addCriterion("ETP_OWNER not in", values, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerBetween(String value1, String value2) {
            addCriterion("ETP_OWNER between", value1, value2, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpOwnerNotBetween(String value1, String value2) {
            addCriterion("ETP_OWNER not between", value1, value2, "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassIsNull() {
            addCriterion("ETP_SUPERCLASS is null");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassIsNotNull() {
            addCriterion("ETP_SUPERCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassEqualTo(String value) {
            addCriterion("ETP_SUPERCLASS =", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassNotEqualTo(String value) {
            addCriterion("ETP_SUPERCLASS <>", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassGreaterThan(String value) {
            addCriterion("ETP_SUPERCLASS >", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_SUPERCLASS >=", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassLessThan(String value) {
            addCriterion("ETP_SUPERCLASS <", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassLessThanOrEqualTo(String value) {
            addCriterion("ETP_SUPERCLASS <=", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassLike(String value) {
            addCriterion("ETP_SUPERCLASS like", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassNotLike(String value) {
            addCriterion("ETP_SUPERCLASS not like", value, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassIn(List<String> values) {
            addCriterion("ETP_SUPERCLASS in", values, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassNotIn(List<String> values) {
            addCriterion("ETP_SUPERCLASS not in", values, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassBetween(String value1, String value2) {
            addCriterion("ETP_SUPERCLASS between", value1, value2, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassNotBetween(String value1, String value2) {
            addCriterion("ETP_SUPERCLASS not between", value1, value2, "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpAddressIsNull() {
            addCriterion("ETP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEtpAddressIsNotNull() {
            addCriterion("ETP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEtpAddressEqualTo(String value) {
            addCriterion("ETP_ADDRESS =", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressNotEqualTo(String value) {
            addCriterion("ETP_ADDRESS <>", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressGreaterThan(String value) {
            addCriterion("ETP_ADDRESS >", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_ADDRESS >=", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressLessThan(String value) {
            addCriterion("ETP_ADDRESS <", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressLessThanOrEqualTo(String value) {
            addCriterion("ETP_ADDRESS <=", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressLike(String value) {
            addCriterion("ETP_ADDRESS like", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressNotLike(String value) {
            addCriterion("ETP_ADDRESS not like", value, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressIn(List<String> values) {
            addCriterion("ETP_ADDRESS in", values, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressNotIn(List<String> values) {
            addCriterion("ETP_ADDRESS not in", values, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressBetween(String value1, String value2) {
            addCriterion("ETP_ADDRESS between", value1, value2, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpAddressNotBetween(String value1, String value2) {
            addCriterion("ETP_ADDRESS not between", value1, value2, "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeIsNull() {
            addCriterion("ETP_ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeIsNotNull() {
            addCriterion("ETP_ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeEqualTo(String value) {
            addCriterion("ETP_ZIPCODE =", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeNotEqualTo(String value) {
            addCriterion("ETP_ZIPCODE <>", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeGreaterThan(String value) {
            addCriterion("ETP_ZIPCODE >", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_ZIPCODE >=", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeLessThan(String value) {
            addCriterion("ETP_ZIPCODE <", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeLessThanOrEqualTo(String value) {
            addCriterion("ETP_ZIPCODE <=", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeLike(String value) {
            addCriterion("ETP_ZIPCODE like", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeNotLike(String value) {
            addCriterion("ETP_ZIPCODE not like", value, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeIn(List<String> values) {
            addCriterion("ETP_ZIPCODE in", values, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeNotIn(List<String> values) {
            addCriterion("ETP_ZIPCODE not in", values, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeBetween(String value1, String value2) {
            addCriterion("ETP_ZIPCODE between", value1, value2, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeNotBetween(String value1, String value2) {
            addCriterion("ETP_ZIPCODE not between", value1, value2, "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpTitleIsNull() {
            addCriterion("ETP_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andEtpTitleIsNotNull() {
            addCriterion("ETP_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andEtpTitleEqualTo(String value) {
            addCriterion("ETP_TITLE =", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleNotEqualTo(String value) {
            addCriterion("ETP_TITLE <>", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleGreaterThan(String value) {
            addCriterion("ETP_TITLE >", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_TITLE >=", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleLessThan(String value) {
            addCriterion("ETP_TITLE <", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleLessThanOrEqualTo(String value) {
            addCriterion("ETP_TITLE <=", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleLike(String value) {
            addCriterion("ETP_TITLE like", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleNotLike(String value) {
            addCriterion("ETP_TITLE not like", value, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleIn(List<String> values) {
            addCriterion("ETP_TITLE in", values, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleNotIn(List<String> values) {
            addCriterion("ETP_TITLE not in", values, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleBetween(String value1, String value2) {
            addCriterion("ETP_TITLE between", value1, value2, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpTitleNotBetween(String value1, String value2) {
            addCriterion("ETP_TITLE not between", value1, value2, "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourIsNull() {
            addCriterion("ETP_START_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourIsNotNull() {
            addCriterion("ETP_START_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourEqualTo(LocalTime value) {
            addEtpStartHourCriterion("ETP_START_HOUR =", value, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourNotEqualTo(LocalTime value) {
            addEtpStartHourCriterion("ETP_START_HOUR <>", value, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourGreaterThan(LocalTime value) {
            addEtpStartHourCriterion("ETP_START_HOUR >", value, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourGreaterThanOrEqualTo(LocalTime value) {
            addEtpStartHourCriterion("ETP_START_HOUR >=", value, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourLessThan(LocalTime value) {
            addEtpStartHourCriterion("ETP_START_HOUR <", value, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourLessThanOrEqualTo(LocalTime value) {
            addEtpStartHourCriterion("ETP_START_HOUR <=", value, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourIn(List<LocalTime> values) {
            addEtpStartHourCriterion("ETP_START_HOUR in", values, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourNotIn(List<LocalTime> values) {
            addEtpStartHourCriterion("ETP_START_HOUR not in", values, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourBetween(LocalTime value1, LocalTime value2) {
            addEtpStartHourCriterion("ETP_START_HOUR between", value1, value2, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpStartHourNotBetween(LocalTime value1, LocalTime value2) {
            addEtpStartHourCriterion("ETP_START_HOUR not between", value1, value2, "etpStartHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourIsNull() {
            addCriterion("ETP_END_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourIsNotNull() {
            addCriterion("ETP_END_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourEqualTo(LocalTime value) {
            addEtpEndHourCriterion("ETP_END_HOUR =", value, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourNotEqualTo(LocalTime value) {
            addEtpEndHourCriterion("ETP_END_HOUR <>", value, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourGreaterThan(LocalTime value) {
            addEtpEndHourCriterion("ETP_END_HOUR >", value, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourGreaterThanOrEqualTo(LocalTime value) {
            addEtpEndHourCriterion("ETP_END_HOUR >=", value, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourLessThan(LocalTime value) {
            addEtpEndHourCriterion("ETP_END_HOUR <", value, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourLessThanOrEqualTo(LocalTime value) {
            addEtpEndHourCriterion("ETP_END_HOUR <=", value, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourIn(List<LocalTime> values) {
            addEtpEndHourCriterion("ETP_END_HOUR in", values, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourNotIn(List<LocalTime> values) {
            addEtpEndHourCriterion("ETP_END_HOUR not in", values, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourBetween(LocalTime value1, LocalTime value2) {
            addEtpEndHourCriterion("ETP_END_HOUR between", value1, value2, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpEndHourNotBetween(LocalTime value1, LocalTime value2) {
            addEtpEndHourCriterion("ETP_END_HOUR not between", value1, value2, "etpEndHour");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneIsNull() {
            addCriterion("ETP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneIsNotNull() {
            addCriterion("ETP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneEqualTo(String value) {
            addCriterion("ETP_PHONE =", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneNotEqualTo(String value) {
            addCriterion("ETP_PHONE <>", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneGreaterThan(String value) {
            addCriterion("ETP_PHONE >", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_PHONE >=", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneLessThan(String value) {
            addCriterion("ETP_PHONE <", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneLessThanOrEqualTo(String value) {
            addCriterion("ETP_PHONE <=", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneLike(String value) {
            addCriterion("ETP_PHONE like", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneNotLike(String value) {
            addCriterion("ETP_PHONE not like", value, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneIn(List<String> values) {
            addCriterion("ETP_PHONE in", values, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneNotIn(List<String> values) {
            addCriterion("ETP_PHONE not in", values, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneBetween(String value1, String value2) {
            addCriterion("ETP_PHONE between", value1, value2, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneNotBetween(String value1, String value2) {
            addCriterion("ETP_PHONE not between", value1, value2, "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffIsNull() {
            addCriterion("ETP_MALE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffIsNotNull() {
            addCriterion("ETP_MALE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffEqualTo(Integer value) {
            addCriterion("ETP_MALE_STAFF =", value, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffNotEqualTo(Integer value) {
            addCriterion("ETP_MALE_STAFF <>", value, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffGreaterThan(Integer value) {
            addCriterion("ETP_MALE_STAFF >", value, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_MALE_STAFF >=", value, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffLessThan(Integer value) {
            addCriterion("ETP_MALE_STAFF <", value, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_MALE_STAFF <=", value, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffIn(List<Integer> values) {
            addCriterion("ETP_MALE_STAFF in", values, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffNotIn(List<Integer> values) {
            addCriterion("ETP_MALE_STAFF not in", values, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffBetween(Integer value1, Integer value2) {
            addCriterion("ETP_MALE_STAFF between", value1, value2, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpMaleStaffNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_MALE_STAFF not between", value1, value2, "etpMaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffIsNull() {
            addCriterion("ETP_FEMALE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffIsNotNull() {
            addCriterion("ETP_FEMALE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffEqualTo(Integer value) {
            addCriterion("ETP_FEMALE_STAFF =", value, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffNotEqualTo(Integer value) {
            addCriterion("ETP_FEMALE_STAFF <>", value, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffGreaterThan(Integer value) {
            addCriterion("ETP_FEMALE_STAFF >", value, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_FEMALE_STAFF >=", value, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffLessThan(Integer value) {
            addCriterion("ETP_FEMALE_STAFF <", value, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_FEMALE_STAFF <=", value, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffIn(List<Integer> values) {
            addCriterion("ETP_FEMALE_STAFF in", values, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffNotIn(List<Integer> values) {
            addCriterion("ETP_FEMALE_STAFF not in", values, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffBetween(Integer value1, Integer value2) {
            addCriterion("ETP_FEMALE_STAFF between", value1, value2, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpFemaleStaffNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_FEMALE_STAFF not between", value1, value2, "etpFemaleStaff");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityIsNull() {
            addCriterion("ETP_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityIsNotNull() {
            addCriterion("ETP_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityEqualTo(Integer value) {
            addCriterion("ETP_CAPACITY =", value, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityNotEqualTo(Integer value) {
            addCriterion("ETP_CAPACITY <>", value, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityGreaterThan(Integer value) {
            addCriterion("ETP_CAPACITY >", value, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_CAPACITY >=", value, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityLessThan(Integer value) {
            addCriterion("ETP_CAPACITY <", value, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_CAPACITY <=", value, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityIn(List<Integer> values) {
            addCriterion("ETP_CAPACITY in", values, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityNotIn(List<Integer> values) {
            addCriterion("ETP_CAPACITY not in", values, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityBetween(Integer value1, Integer value2) {
            addCriterion("ETP_CAPACITY between", value1, value2, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_CAPACITY not between", value1, value2, "etpCapacity");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineIsNull() {
            addCriterion("ETP_RSV_DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineIsNotNull() {
            addCriterion("ETP_RSV_DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineEqualTo(Integer value) {
            addCriterion("ETP_RSV_DEADLINE =", value, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineNotEqualTo(Integer value) {
            addCriterion("ETP_RSV_DEADLINE <>", value, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineGreaterThan(Integer value) {
            addCriterion("ETP_RSV_DEADLINE >", value, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_RSV_DEADLINE >=", value, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineLessThan(Integer value) {
            addCriterion("ETP_RSV_DEADLINE <", value, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_RSV_DEADLINE <=", value, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineIn(List<Integer> values) {
            addCriterion("ETP_RSV_DEADLINE in", values, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineNotIn(List<Integer> values) {
            addCriterion("ETP_RSV_DEADLINE not in", values, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("ETP_RSV_DEADLINE between", value1, value2, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpRsvDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_RSV_DEADLINE not between", value1, value2, "etpRsvDeadline");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationIsNull() {
            addCriterion("ETP_SELF_NOTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationIsNotNull() {
            addCriterion("ETP_SELF_NOTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationEqualTo(Integer value) {
            addCriterion("ETP_SELF_NOTIFICATION =", value, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationNotEqualTo(Integer value) {
            addCriterion("ETP_SELF_NOTIFICATION <>", value, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationGreaterThan(Integer value) {
            addCriterion("ETP_SELF_NOTIFICATION >", value, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_SELF_NOTIFICATION >=", value, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationLessThan(Integer value) {
            addCriterion("ETP_SELF_NOTIFICATION <", value, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_SELF_NOTIFICATION <=", value, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationIn(List<Integer> values) {
            addCriterion("ETP_SELF_NOTIFICATION in", values, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationNotIn(List<Integer> values) {
            addCriterion("ETP_SELF_NOTIFICATION not in", values, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationBetween(Integer value1, Integer value2) {
            addCriterion("ETP_SELF_NOTIFICATION between", value1, value2, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpSelfNotificationNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_SELF_NOTIFICATION not between", value1, value2, "etpSelfNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationIsNull() {
            addCriterion("ETP_CST_NOTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationIsNotNull() {
            addCriterion("ETP_CST_NOTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationEqualTo(Integer value) {
            addCriterion("ETP_CST_NOTIFICATION =", value, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationNotEqualTo(Integer value) {
            addCriterion("ETP_CST_NOTIFICATION <>", value, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationGreaterThan(Integer value) {
            addCriterion("ETP_CST_NOTIFICATION >", value, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_CST_NOTIFICATION >=", value, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationLessThan(Integer value) {
            addCriterion("ETP_CST_NOTIFICATION <", value, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_CST_NOTIFICATION <=", value, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationIn(List<Integer> values) {
            addCriterion("ETP_CST_NOTIFICATION in", values, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationNotIn(List<Integer> values) {
            addCriterion("ETP_CST_NOTIFICATION not in", values, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationBetween(Integer value1, Integer value2) {
            addCriterion("ETP_CST_NOTIFICATION between", value1, value2, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpCstNotificationNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_CST_NOTIFICATION not between", value1, value2, "etpCstNotification");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeIsNull() {
            addCriterion("ETP_TEMPLATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeIsNotNull() {
            addCriterion("ETP_TEMPLATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeEqualTo(Integer value) {
            addCriterion("ETP_TEMPLATE_TYPE =", value, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeNotEqualTo(Integer value) {
            addCriterion("ETP_TEMPLATE_TYPE <>", value, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeGreaterThan(Integer value) {
            addCriterion("ETP_TEMPLATE_TYPE >", value, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_TEMPLATE_TYPE >=", value, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeLessThan(Integer value) {
            addCriterion("ETP_TEMPLATE_TYPE <", value, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_TEMPLATE_TYPE <=", value, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeIn(List<Integer> values) {
            addCriterion("ETP_TEMPLATE_TYPE in", values, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeNotIn(List<Integer> values) {
            addCriterion("ETP_TEMPLATE_TYPE not in", values, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeBetween(Integer value1, Integer value2) {
            addCriterion("ETP_TEMPLATE_TYPE between", value1, value2, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpTemplateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_TEMPLATE_TYPE not between", value1, value2, "etpTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressIsNull() {
            addCriterion("ETP_MAP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressIsNotNull() {
            addCriterion("ETP_MAP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressEqualTo(String value) {
            addCriterion("ETP_MAP_ADDRESS =", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressNotEqualTo(String value) {
            addCriterion("ETP_MAP_ADDRESS <>", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressGreaterThan(String value) {
            addCriterion("ETP_MAP_ADDRESS >", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_MAP_ADDRESS >=", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressLessThan(String value) {
            addCriterion("ETP_MAP_ADDRESS <", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressLessThanOrEqualTo(String value) {
            addCriterion("ETP_MAP_ADDRESS <=", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressLike(String value) {
            addCriterion("ETP_MAP_ADDRESS like", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressNotLike(String value) {
            addCriterion("ETP_MAP_ADDRESS not like", value, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressIn(List<String> values) {
            addCriterion("ETP_MAP_ADDRESS in", values, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressNotIn(List<String> values) {
            addCriterion("ETP_MAP_ADDRESS not in", values, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressBetween(String value1, String value2) {
            addCriterion("ETP_MAP_ADDRESS between", value1, value2, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressNotBetween(String value1, String value2) {
            addCriterion("ETP_MAP_ADDRESS not between", value1, value2, "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionIsNull() {
            addCriterion("ETP_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionIsNotNull() {
            addCriterion("ETP_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionEqualTo(String value) {
            addCriterion("ETP_DIRECTION =", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionNotEqualTo(String value) {
            addCriterion("ETP_DIRECTION <>", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionGreaterThan(String value) {
            addCriterion("ETP_DIRECTION >", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_DIRECTION >=", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionLessThan(String value) {
            addCriterion("ETP_DIRECTION <", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionLessThanOrEqualTo(String value) {
            addCriterion("ETP_DIRECTION <=", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionLike(String value) {
            addCriterion("ETP_DIRECTION like", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionNotLike(String value) {
            addCriterion("ETP_DIRECTION not like", value, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionIn(List<String> values) {
            addCriterion("ETP_DIRECTION in", values, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionNotIn(List<String> values) {
            addCriterion("ETP_DIRECTION not in", values, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionBetween(String value1, String value2) {
            addCriterion("ETP_DIRECTION between", value1, value2, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionNotBetween(String value1, String value2) {
            addCriterion("ETP_DIRECTION not between", value1, value2, "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedIsNull() {
            addCriterion("ETP_SVC_OFFERED is null");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedIsNotNull() {
            addCriterion("ETP_SVC_OFFERED is not null");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedEqualTo(String value) {
            addCriterion("ETP_SVC_OFFERED =", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedNotEqualTo(String value) {
            addCriterion("ETP_SVC_OFFERED <>", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedGreaterThan(String value) {
            addCriterion("ETP_SVC_OFFERED >", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_SVC_OFFERED >=", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedLessThan(String value) {
            addCriterion("ETP_SVC_OFFERED <", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedLessThanOrEqualTo(String value) {
            addCriterion("ETP_SVC_OFFERED <=", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedLike(String value) {
            addCriterion("ETP_SVC_OFFERED like", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedNotLike(String value) {
            addCriterion("ETP_SVC_OFFERED not like", value, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedIn(List<String> values) {
            addCriterion("ETP_SVC_OFFERED in", values, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedNotIn(List<String> values) {
            addCriterion("ETP_SVC_OFFERED not in", values, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedBetween(String value1, String value2) {
            addCriterion("ETP_SVC_OFFERED between", value1, value2, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedNotBetween(String value1, String value2) {
            addCriterion("ETP_SVC_OFFERED not between", value1, value2, "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassIsNull() {
            addCriterion("ETP_SUBCLASS is null");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassIsNotNull() {
            addCriterion("ETP_SUBCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassEqualTo(String value) {
            addCriterion("ETP_SUBCLASS =", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassNotEqualTo(String value) {
            addCriterion("ETP_SUBCLASS <>", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassGreaterThan(String value) {
            addCriterion("ETP_SUBCLASS >", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_SUBCLASS >=", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassLessThan(String value) {
            addCriterion("ETP_SUBCLASS <", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassLessThanOrEqualTo(String value) {
            addCriterion("ETP_SUBCLASS <=", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassLike(String value) {
            addCriterion("ETP_SUBCLASS like", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassNotLike(String value) {
            addCriterion("ETP_SUBCLASS not like", value, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassIn(List<String> values) {
            addCriterion("ETP_SUBCLASS in", values, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassNotIn(List<String> values) {
            addCriterion("ETP_SUBCLASS not in", values, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassBetween(String value1, String value2) {
            addCriterion("ETP_SUBCLASS between", value1, value2, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassNotBetween(String value1, String value2) {
            addCriterion("ETP_SUBCLASS not between", value1, value2, "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeIsNull() {
            addCriterion("ETP_SPECIALIZE is null");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeIsNotNull() {
            addCriterion("ETP_SPECIALIZE is not null");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeEqualTo(String value) {
            addCriterion("ETP_SPECIALIZE =", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeNotEqualTo(String value) {
            addCriterion("ETP_SPECIALIZE <>", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeGreaterThan(String value) {
            addCriterion("ETP_SPECIALIZE >", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_SPECIALIZE >=", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeLessThan(String value) {
            addCriterion("ETP_SPECIALIZE <", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeLessThanOrEqualTo(String value) {
            addCriterion("ETP_SPECIALIZE <=", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeLike(String value) {
            addCriterion("ETP_SPECIALIZE like", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeNotLike(String value) {
            addCriterion("ETP_SPECIALIZE not like", value, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeIn(List<String> values) {
            addCriterion("ETP_SPECIALIZE in", values, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeNotIn(List<String> values) {
            addCriterion("ETP_SPECIALIZE not in", values, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeBetween(String value1, String value2) {
            addCriterion("ETP_SPECIALIZE between", value1, value2, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeNotBetween(String value1, String value2) {
            addCriterion("ETP_SPECIALIZE not between", value1, value2, "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionIsNull() {
            addCriterion("ETP_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionIsNotNull() {
            addCriterion("ETP_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionEqualTo(String value) {
            addCriterion("ETP_DESCRIPTION =", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionNotEqualTo(String value) {
            addCriterion("ETP_DESCRIPTION <>", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionGreaterThan(String value) {
            addCriterion("ETP_DESCRIPTION >", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ETP_DESCRIPTION >=", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionLessThan(String value) {
            addCriterion("ETP_DESCRIPTION <", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ETP_DESCRIPTION <=", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionLike(String value) {
            addCriterion("ETP_DESCRIPTION like", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionNotLike(String value) {
            addCriterion("ETP_DESCRIPTION not like", value, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionIn(List<String> values) {
            addCriterion("ETP_DESCRIPTION in", values, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionNotIn(List<String> values) {
            addCriterion("ETP_DESCRIPTION not in", values, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionBetween(String value1, String value2) {
            addCriterion("ETP_DESCRIPTION between", value1, value2, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionNotBetween(String value1, String value2) {
            addCriterion("ETP_DESCRIPTION not between", value1, value2, "etpDescription");
            return (Criteria) this;
        }

        public Criteria andEtpStatusIsNull() {
            addCriterion("ETP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEtpStatusIsNotNull() {
            addCriterion("ETP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEtpStatusEqualTo(Integer value) {
            addCriterion("ETP_STATUS =", value, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusNotEqualTo(Integer value) {
            addCriterion("ETP_STATUS <>", value, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusGreaterThan(Integer value) {
            addCriterion("ETP_STATUS >", value, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_STATUS >=", value, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusLessThan(Integer value) {
            addCriterion("ETP_STATUS <", value, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_STATUS <=", value, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusIn(List<Integer> values) {
            addCriterion("ETP_STATUS in", values, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusNotIn(List<Integer> values) {
            addCriterion("ETP_STATUS not in", values, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusBetween(Integer value1, Integer value2) {
            addCriterion("ETP_STATUS between", value1, value2, "etpStatus");
            return (Criteria) this;
        }

        public Criteria andEtpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_STATUS not between", value1, value2, "etpStatus");
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

        public Criteria andEtpOwnerLikeInsensitive(String value) {
            addCriterion("upper(ETP_OWNER) like", value.toUpperCase(), "etpOwner");
            return (Criteria) this;
        }

        public Criteria andEtpSuperclassLikeInsensitive(String value) {
            addCriterion("upper(ETP_SUPERCLASS) like", value.toUpperCase(), "etpSuperclass");
            return (Criteria) this;
        }

        public Criteria andEtpAddressLikeInsensitive(String value) {
            addCriterion("upper(ETP_ADDRESS) like", value.toUpperCase(), "etpAddress");
            return (Criteria) this;
        }

        public Criteria andEtpZipcodeLikeInsensitive(String value) {
            addCriterion("upper(ETP_ZIPCODE) like", value.toUpperCase(), "etpZipcode");
            return (Criteria) this;
        }

        public Criteria andEtpTitleLikeInsensitive(String value) {
            addCriterion("upper(ETP_TITLE) like", value.toUpperCase(), "etpTitle");
            return (Criteria) this;
        }

        public Criteria andEtpPhoneLikeInsensitive(String value) {
            addCriterion("upper(ETP_PHONE) like", value.toUpperCase(), "etpPhone");
            return (Criteria) this;
        }

        public Criteria andEtpMapAddressLikeInsensitive(String value) {
            addCriterion("upper(ETP_MAP_ADDRESS) like", value.toUpperCase(), "etpMapAddress");
            return (Criteria) this;
        }

        public Criteria andEtpDirectionLikeInsensitive(String value) {
            addCriterion("upper(ETP_DIRECTION) like", value.toUpperCase(), "etpDirection");
            return (Criteria) this;
        }

        public Criteria andEtpSvcOfferedLikeInsensitive(String value) {
            addCriterion("upper(ETP_SVC_OFFERED) like", value.toUpperCase(), "etpSvcOffered");
            return (Criteria) this;
        }

        public Criteria andEtpSubclassLikeInsensitive(String value) {
            addCriterion("upper(ETP_SUBCLASS) like", value.toUpperCase(), "etpSubclass");
            return (Criteria) this;
        }

        public Criteria andEtpSpecializeLikeInsensitive(String value) {
            addCriterion("upper(ETP_SPECIALIZE) like", value.toUpperCase(), "etpSpecialize");
            return (Criteria) this;
        }

        public Criteria andEtpDescriptionLikeInsensitive(String value) {
            addCriterion("upper(ETP_DESCRIPTION) like", value.toUpperCase(), "etpDescription");
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