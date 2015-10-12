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

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andSuperclassIsNull() {
            addCriterion("SUPERCLASS is null");
            return (Criteria) this;
        }

        public Criteria andSuperclassIsNotNull() {
            addCriterion("SUPERCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andSuperclassEqualTo(String value) {
            addCriterion("SUPERCLASS =", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassNotEqualTo(String value) {
            addCriterion("SUPERCLASS <>", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassGreaterThan(String value) {
            addCriterion("SUPERCLASS >", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERCLASS >=", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassLessThan(String value) {
            addCriterion("SUPERCLASS <", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassLessThanOrEqualTo(String value) {
            addCriterion("SUPERCLASS <=", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassLike(String value) {
            addCriterion("SUPERCLASS like", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassNotLike(String value) {
            addCriterion("SUPERCLASS not like", value, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassIn(List<String> values) {
            addCriterion("SUPERCLASS in", values, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassNotIn(List<String> values) {
            addCriterion("SUPERCLASS not in", values, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassBetween(String value1, String value2) {
            addCriterion("SUPERCLASS between", value1, value2, "superclass");
            return (Criteria) this;
        }

        public Criteria andSuperclassNotBetween(String value1, String value2) {
            addCriterion("SUPERCLASS not between", value1, value2, "superclass");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("ZIPCODE =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("ZIPCODE <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("ZIPCODE >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIPCODE >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("ZIPCODE <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("ZIPCODE <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("ZIPCODE like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("ZIPCODE not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("ZIPCODE in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("ZIPCODE not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("ZIPCODE between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("ZIPCODE not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andStartHourIsNull() {
            addCriterion("START_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andStartHourIsNotNull() {
            addCriterion("START_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andStartHourEqualTo(LocalTime value) {
            addCriterion("START_HOUR =", value, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourNotEqualTo(LocalTime value) {
            addCriterion("START_HOUR <>", value, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourGreaterThan(LocalTime value) {
            addCriterion("START_HOUR >", value, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourGreaterThanOrEqualTo(LocalTime value) {
            addCriterion("START_HOUR >=", value, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourLessThan(LocalTime value) {
            addCriterion("START_HOUR <", value, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourLessThanOrEqualTo(LocalTime value) {
            addCriterion("START_HOUR <=", value, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourIn(List<LocalTime> values) {
            addCriterion("START_HOUR in", values, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourNotIn(List<LocalTime> values) {
            addCriterion("START_HOUR not in", values, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourBetween(LocalTime value1, LocalTime value2) {
            addCriterion("START_HOUR between", value1, value2, "startHour");
            return (Criteria) this;
        }

        public Criteria andStartHourNotBetween(LocalTime value1, LocalTime value2) {
            addCriterion("START_HOUR not between", value1, value2, "startHour");
            return (Criteria) this;
        }

        public Criteria andEndHourIsNull() {
            addCriterion("END_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andEndHourIsNotNull() {
            addCriterion("END_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andEndHourEqualTo(LocalTime value) {
            addCriterion("END_HOUR =", value, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourNotEqualTo(LocalTime value) {
            addCriterion("END_HOUR <>", value, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourGreaterThan(LocalTime value) {
            addCriterion("END_HOUR >", value, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourGreaterThanOrEqualTo(LocalTime value) {
            addCriterion("END_HOUR >=", value, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourLessThan(LocalTime value) {
            addCriterion("END_HOUR <", value, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourLessThanOrEqualTo(LocalTime value) {
            addCriterion("END_HOUR <=", value, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourIn(List<LocalTime> values) {
            addCriterion("END_HOUR in", values, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourNotIn(List<LocalTime> values) {
            addCriterion("END_HOUR not in", values, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourBetween(LocalTime value1, LocalTime value2) {
            addCriterion("END_HOUR between", value1, value2, "endHour");
            return (Criteria) this;
        }

        public Criteria andEndHourNotBetween(LocalTime value1, LocalTime value2) {
            addCriterion("END_HOUR not between", value1, value2, "endHour");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountIsNull() {
            addCriterion("MALE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountIsNotNull() {
            addCriterion("MALE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountEqualTo(Integer value) {
            addCriterion("MALE_STAFF =", value, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountNotEqualTo(Integer value) {
            addCriterion("MALE_STAFF <>", value, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountGreaterThan(Integer value) {
            addCriterion("MALE_STAFF >", value, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MALE_STAFF >=", value, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountLessThan(Integer value) {
            addCriterion("MALE_STAFF <", value, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountLessThanOrEqualTo(Integer value) {
            addCriterion("MALE_STAFF <=", value, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountIn(List<Integer> values) {
            addCriterion("MALE_STAFF in", values, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountNotIn(List<Integer> values) {
            addCriterion("MALE_STAFF not in", values, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountBetween(Integer value1, Integer value2) {
            addCriterion("MALE_STAFF between", value1, value2, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andMaleStaffCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MALE_STAFF not between", value1, value2, "maleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountIsNull() {
            addCriterion("FEMALE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountIsNotNull() {
            addCriterion("FEMALE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountEqualTo(Integer value) {
            addCriterion("FEMALE_STAFF =", value, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountNotEqualTo(Integer value) {
            addCriterion("FEMALE_STAFF <>", value, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountGreaterThan(Integer value) {
            addCriterion("FEMALE_STAFF >", value, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FEMALE_STAFF >=", value, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountLessThan(Integer value) {
            addCriterion("FEMALE_STAFF <", value, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountLessThanOrEqualTo(Integer value) {
            addCriterion("FEMALE_STAFF <=", value, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountIn(List<Integer> values) {
            addCriterion("FEMALE_STAFF in", values, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountNotIn(List<Integer> values) {
            addCriterion("FEMALE_STAFF not in", values, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountBetween(Integer value1, Integer value2) {
            addCriterion("FEMALE_STAFF between", value1, value2, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andFemaleStaffCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FEMALE_STAFF not between", value1, value2, "femaleStaffCount");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityIsNull() {
            addCriterion("HOURLY_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityIsNotNull() {
            addCriterion("HOURLY_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityEqualTo(Integer value) {
            addCriterion("HOURLY_CAPACITY =", value, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityNotEqualTo(Integer value) {
            addCriterion("HOURLY_CAPACITY <>", value, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityGreaterThan(Integer value) {
            addCriterion("HOURLY_CAPACITY >", value, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOURLY_CAPACITY >=", value, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityLessThan(Integer value) {
            addCriterion("HOURLY_CAPACITY <", value, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("HOURLY_CAPACITY <=", value, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityIn(List<Integer> values) {
            addCriterion("HOURLY_CAPACITY in", values, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityNotIn(List<Integer> values) {
            addCriterion("HOURLY_CAPACITY not in", values, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityBetween(Integer value1, Integer value2) {
            addCriterion("HOURLY_CAPACITY between", value1, value2, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andHourlyCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("HOURLY_CAPACITY not between", value1, value2, "hourlyCapacity");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineIsNull() {
            addCriterion("RSV_DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineIsNotNull() {
            addCriterion("RSV_DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineEqualTo(Integer value) {
            addCriterion("RSV_DEADLINE =", value, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineNotEqualTo(Integer value) {
            addCriterion("RSV_DEADLINE <>", value, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineGreaterThan(Integer value) {
            addCriterion("RSV_DEADLINE >", value, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_DEADLINE >=", value, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineLessThan(Integer value) {
            addCriterion("RSV_DEADLINE <", value, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_DEADLINE <=", value, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineIn(List<Integer> values) {
            addCriterion("RSV_DEADLINE in", values, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineNotIn(List<Integer> values) {
            addCriterion("RSV_DEADLINE not in", values, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("RSV_DEADLINE between", value1, value2, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andModificationDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("RSV_DEADLINE not between", value1, value2, "modificationDeadline");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpIsNull() {
            addCriterion("ETP_NOTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpIsNotNull() {
            addCriterion("ETP_NOTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpEqualTo(Integer value) {
            addCriterion("ETP_NOTIFICATION =", value, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpNotEqualTo(Integer value) {
            addCriterion("ETP_NOTIFICATION <>", value, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpGreaterThan(Integer value) {
            addCriterion("ETP_NOTIFICATION >", value, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_NOTIFICATION >=", value, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpLessThan(Integer value) {
            addCriterion("ETP_NOTIFICATION <", value, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_NOTIFICATION <=", value, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpIn(List<Integer> values) {
            addCriterion("ETP_NOTIFICATION in", values, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpNotIn(List<Integer> values) {
            addCriterion("ETP_NOTIFICATION not in", values, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpBetween(Integer value1, Integer value2) {
            addCriterion("ETP_NOTIFICATION between", value1, value2, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToEtpNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_NOTIFICATION not between", value1, value2, "ntfFrequencyToEtp");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstIsNull() {
            addCriterion("CST_NOTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstIsNotNull() {
            addCriterion("CST_NOTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstEqualTo(Integer value) {
            addCriterion("CST_NOTIFICATION =", value, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstNotEqualTo(Integer value) {
            addCriterion("CST_NOTIFICATION <>", value, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstGreaterThan(Integer value) {
            addCriterion("CST_NOTIFICATION >", value, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstGreaterThanOrEqualTo(Integer value) {
            addCriterion("CST_NOTIFICATION >=", value, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstLessThan(Integer value) {
            addCriterion("CST_NOTIFICATION <", value, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstLessThanOrEqualTo(Integer value) {
            addCriterion("CST_NOTIFICATION <=", value, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstIn(List<Integer> values) {
            addCriterion("CST_NOTIFICATION in", values, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstNotIn(List<Integer> values) {
            addCriterion("CST_NOTIFICATION not in", values, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstBetween(Integer value1, Integer value2) {
            addCriterion("CST_NOTIFICATION between", value1, value2, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andNtfFrequencyToCstNotBetween(Integer value1, Integer value2) {
            addCriterion("CST_NOTIFICATION not between", value1, value2, "ntfFrequencyToCst");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeIsNull() {
            addCriterion("TEMPLATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeIsNotNull() {
            addCriterion("TEMPLATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeEqualTo(Integer value) {
            addCriterion("TEMPLATE_TYPE =", value, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeNotEqualTo(Integer value) {
            addCriterion("TEMPLATE_TYPE <>", value, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeGreaterThan(Integer value) {
            addCriterion("TEMPLATE_TYPE >", value, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_TYPE >=", value, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeLessThan(Integer value) {
            addCriterion("TEMPLATE_TYPE <", value, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_TYPE <=", value, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeIn(List<Integer> values) {
            addCriterion("TEMPLATE_TYPE in", values, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeNotIn(List<Integer> values) {
            addCriterion("TEMPLATE_TYPE not in", values, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_TYPE between", value1, value2, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andPageTemplateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_TYPE not between", value1, value2, "pageTemplateType");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressIsNull() {
            addCriterion("MAP_API_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressIsNotNull() {
            addCriterion("MAP_API_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressEqualTo(String value) {
            addCriterion("MAP_API_ADDRESS =", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressNotEqualTo(String value) {
            addCriterion("MAP_API_ADDRESS <>", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressGreaterThan(String value) {
            addCriterion("MAP_API_ADDRESS >", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressGreaterThanOrEqualTo(String value) {
            addCriterion("MAP_API_ADDRESS >=", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressLessThan(String value) {
            addCriterion("MAP_API_ADDRESS <", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressLessThanOrEqualTo(String value) {
            addCriterion("MAP_API_ADDRESS <=", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressLike(String value) {
            addCriterion("MAP_API_ADDRESS like", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressNotLike(String value) {
            addCriterion("MAP_API_ADDRESS not like", value, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressIn(List<String> values) {
            addCriterion("MAP_API_ADDRESS in", values, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressNotIn(List<String> values) {
            addCriterion("MAP_API_ADDRESS not in", values, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressBetween(String value1, String value2) {
            addCriterion("MAP_API_ADDRESS between", value1, value2, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressNotBetween(String value1, String value2) {
            addCriterion("MAP_API_ADDRESS not between", value1, value2, "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideIsNull() {
            addCriterion("LOCATION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideIsNotNull() {
            addCriterion("LOCATION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideEqualTo(String value) {
            addCriterion("LOCATION_DESC =", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideNotEqualTo(String value) {
            addCriterion("LOCATION_DESC <>", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideGreaterThan(String value) {
            addCriterion("LOCATION_DESC >", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_DESC >=", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideLessThan(String value) {
            addCriterion("LOCATION_DESC <", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_DESC <=", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideLike(String value) {
            addCriterion("LOCATION_DESC like", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideNotLike(String value) {
            addCriterion("LOCATION_DESC not like", value, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideIn(List<String> values) {
            addCriterion("LOCATION_DESC in", values, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideNotIn(List<String> values) {
            addCriterion("LOCATION_DESC not in", values, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideBetween(String value1, String value2) {
            addCriterion("LOCATION_DESC between", value1, value2, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideNotBetween(String value1, String value2) {
            addCriterion("LOCATION_DESC not between", value1, value2, "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andSvcListIsNull() {
            addCriterion("SVC_LIST is null");
            return (Criteria) this;
        }

        public Criteria andSvcListIsNotNull() {
            addCriterion("SVC_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andSvcListEqualTo(String value) {
            addCriterion("SVC_LIST =", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListNotEqualTo(String value) {
            addCriterion("SVC_LIST <>", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListGreaterThan(String value) {
            addCriterion("SVC_LIST >", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_LIST >=", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListLessThan(String value) {
            addCriterion("SVC_LIST <", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListLessThanOrEqualTo(String value) {
            addCriterion("SVC_LIST <=", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListLike(String value) {
            addCriterion("SVC_LIST like", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListNotLike(String value) {
            addCriterion("SVC_LIST not like", value, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListIn(List<String> values) {
            addCriterion("SVC_LIST in", values, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListNotIn(List<String> values) {
            addCriterion("SVC_LIST not in", values, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListBetween(String value1, String value2) {
            addCriterion("SVC_LIST between", value1, value2, "svcList");
            return (Criteria) this;
        }

        public Criteria andSvcListNotBetween(String value1, String value2) {
            addCriterion("SVC_LIST not between", value1, value2, "svcList");
            return (Criteria) this;
        }

        public Criteria andSubclassIsNull() {
            addCriterion("SUBCLASS is null");
            return (Criteria) this;
        }

        public Criteria andSubclassIsNotNull() {
            addCriterion("SUBCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andSubclassEqualTo(String value) {
            addCriterion("SUBCLASS =", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassNotEqualTo(String value) {
            addCriterion("SUBCLASS <>", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassGreaterThan(String value) {
            addCriterion("SUBCLASS >", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCLASS >=", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassLessThan(String value) {
            addCriterion("SUBCLASS <", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassLessThanOrEqualTo(String value) {
            addCriterion("SUBCLASS <=", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassLike(String value) {
            addCriterion("SUBCLASS like", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassNotLike(String value) {
            addCriterion("SUBCLASS not like", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassIn(List<String> values) {
            addCriterion("SUBCLASS in", values, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassNotIn(List<String> values) {
            addCriterion("SUBCLASS not in", values, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassBetween(String value1, String value2) {
            addCriterion("SUBCLASS between", value1, value2, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassNotBetween(String value1, String value2) {
            addCriterion("SUBCLASS not between", value1, value2, "subclass");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListIsNull() {
            addCriterion("SPECIALTY_LIST is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListIsNotNull() {
            addCriterion("SPECIALTY_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListEqualTo(String value) {
            addCriterion("SPECIALTY_LIST =", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListNotEqualTo(String value) {
            addCriterion("SPECIALTY_LIST <>", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListGreaterThan(String value) {
            addCriterion("SPECIALTY_LIST >", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALTY_LIST >=", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListLessThan(String value) {
            addCriterion("SPECIALTY_LIST <", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListLessThanOrEqualTo(String value) {
            addCriterion("SPECIALTY_LIST <=", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListLike(String value) {
            addCriterion("SPECIALTY_LIST like", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListNotLike(String value) {
            addCriterion("SPECIALTY_LIST not like", value, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListIn(List<String> values) {
            addCriterion("SPECIALTY_LIST in", values, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListNotIn(List<String> values) {
            addCriterion("SPECIALTY_LIST not in", values, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListBetween(String value1, String value2) {
            addCriterion("SPECIALTY_LIST between", value1, value2, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListNotBetween(String value1, String value2) {
            addCriterion("SPECIALTY_LIST not between", value1, value2, "specialtyList");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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

        public Criteria andOwnerLikeInsensitive(String value) {
            addCriterion("upper(OWNER) like", value.toUpperCase(), "owner");
            return (Criteria) this;
        }

        public Criteria andSuperclassLikeInsensitive(String value) {
            addCriterion("upper(SUPERCLASS) like", value.toUpperCase(), "superclass");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andZipcodeLikeInsensitive(String value) {
            addCriterion("upper(ZIPCODE) like", value.toUpperCase(), "zipcode");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(TITLE) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(PHONE) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andEtpLocationMapAPIAddressLikeInsensitive(String value) {
            addCriterion("upper(MAP_API_ADDRESS) like", value.toUpperCase(), "etpLocationMapAPIAddress");
            return (Criteria) this;
        }

        public Criteria andEtpLocationGuideLikeInsensitive(String value) {
            addCriterion("upper(LOCATION_DESC) like", value.toUpperCase(), "etpLocationGuide");
            return (Criteria) this;
        }

        public Criteria andSvcListLikeInsensitive(String value) {
            addCriterion("upper(SVC_LIST) like", value.toUpperCase(), "svcList");
            return (Criteria) this;
        }

        public Criteria andSubclassLikeInsensitive(String value) {
            addCriterion("upper(SUBCLASS) like", value.toUpperCase(), "subclass");
            return (Criteria) this;
        }

        public Criteria andSpecialtyListLikeInsensitive(String value) {
            addCriterion("upper(SPECIALTY_LIST) like", value.toUpperCase(), "specialtyList");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(DESCRIPTION) like", value.toUpperCase(), "description");
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