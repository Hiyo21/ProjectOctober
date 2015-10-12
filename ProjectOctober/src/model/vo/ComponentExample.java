package model.vo;

import java.util.ArrayList;
import java.util.List;

public class ComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComponentExample() {
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

        public Criteria andLogoComponentIsNull() {
            addCriterion("LOGO is null");
            return (Criteria) this;
        }

        public Criteria andLogoComponentIsNotNull() {
            addCriterion("LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andLogoComponentEqualTo(Integer value) {
            addCriterion("LOGO =", value, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentNotEqualTo(Integer value) {
            addCriterion("LOGO <>", value, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentGreaterThan(Integer value) {
            addCriterion("LOGO >", value, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGO >=", value, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentLessThan(Integer value) {
            addCriterion("LOGO <", value, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentLessThanOrEqualTo(Integer value) {
            addCriterion("LOGO <=", value, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentIn(List<Integer> values) {
            addCriterion("LOGO in", values, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentNotIn(List<Integer> values) {
            addCriterion("LOGO not in", values, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentBetween(Integer value1, Integer value2) {
            addCriterion("LOGO between", value1, value2, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGO not between", value1, value2, "logoComponent");
            return (Criteria) this;
        }

        public Criteria andLogoThemeIsNull() {
            addCriterion("LOGO_THEME is null");
            return (Criteria) this;
        }

        public Criteria andLogoThemeIsNotNull() {
            addCriterion("LOGO_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andLogoThemeEqualTo(Short value) {
            addCriterion("LOGO_THEME =", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeNotEqualTo(Short value) {
            addCriterion("LOGO_THEME <>", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeGreaterThan(Short value) {
            addCriterion("LOGO_THEME >", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGO_THEME >=", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeLessThan(Short value) {
            addCriterion("LOGO_THEME <", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeLessThanOrEqualTo(Short value) {
            addCriterion("LOGO_THEME <=", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeIn(List<Short> values) {
            addCriterion("LOGO_THEME in", values, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeNotIn(List<Short> values) {
            addCriterion("LOGO_THEME not in", values, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeBetween(Short value1, Short value2) {
            addCriterion("LOGO_THEME between", value1, value2, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeNotBetween(Short value1, Short value2) {
            addCriterion("LOGO_THEME not between", value1, value2, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXIsNull() {
            addCriterion("LOGO_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXIsNotNull() {
            addCriterion("LOGO_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXEqualTo(Short value) {
            addCriterion("LOGO_SIZE_X =", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXNotEqualTo(Short value) {
            addCriterion("LOGO_SIZE_X <>", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXGreaterThan(Short value) {
            addCriterion("LOGO_SIZE_X >", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGO_SIZE_X >=", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXLessThan(Short value) {
            addCriterion("LOGO_SIZE_X <", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXLessThanOrEqualTo(Short value) {
            addCriterion("LOGO_SIZE_X <=", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXIn(List<Short> values) {
            addCriterion("LOGO_SIZE_X in", values, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXNotIn(List<Short> values) {
            addCriterion("LOGO_SIZE_X not in", values, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXBetween(Short value1, Short value2) {
            addCriterion("LOGO_SIZE_X between", value1, value2, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXNotBetween(Short value1, Short value2) {
            addCriterion("LOGO_SIZE_X not between", value1, value2, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYIsNull() {
            addCriterion("LOGO_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYIsNotNull() {
            addCriterion("LOGO_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYEqualTo(Short value) {
            addCriterion("LOGO_SIZE_Y =", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYNotEqualTo(Short value) {
            addCriterion("LOGO_SIZE_Y <>", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYGreaterThan(Short value) {
            addCriterion("LOGO_SIZE_Y >", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGO_SIZE_Y >=", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYLessThan(Short value) {
            addCriterion("LOGO_SIZE_Y <", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYLessThanOrEqualTo(Short value) {
            addCriterion("LOGO_SIZE_Y <=", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYIn(List<Short> values) {
            addCriterion("LOGO_SIZE_Y in", values, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYNotIn(List<Short> values) {
            addCriterion("LOGO_SIZE_Y not in", values, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYBetween(Short value1, Short value2) {
            addCriterion("LOGO_SIZE_Y between", value1, value2, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYNotBetween(Short value1, Short value2) {
            addCriterion("LOGO_SIZE_Y not between", value1, value2, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoPosXIsNull() {
            addCriterion("LOGO_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andLogoPosXIsNotNull() {
            addCriterion("LOGO_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPosXEqualTo(Short value) {
            addCriterion("LOGO_POS_X =", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXNotEqualTo(Short value) {
            addCriterion("LOGO_POS_X <>", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXGreaterThan(Short value) {
            addCriterion("LOGO_POS_X >", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGO_POS_X >=", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXLessThan(Short value) {
            addCriterion("LOGO_POS_X <", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXLessThanOrEqualTo(Short value) {
            addCriterion("LOGO_POS_X <=", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXIn(List<Short> values) {
            addCriterion("LOGO_POS_X in", values, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXNotIn(List<Short> values) {
            addCriterion("LOGO_POS_X not in", values, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXBetween(Short value1, Short value2) {
            addCriterion("LOGO_POS_X between", value1, value2, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXNotBetween(Short value1, Short value2) {
            addCriterion("LOGO_POS_X not between", value1, value2, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosYIsNull() {
            addCriterion("LOGO_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andLogoPosYIsNotNull() {
            addCriterion("LOGO_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPosYEqualTo(Short value) {
            addCriterion("LOGO_POS_Y =", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYNotEqualTo(Short value) {
            addCriterion("LOGO_POS_Y <>", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYGreaterThan(Short value) {
            addCriterion("LOGO_POS_Y >", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGO_POS_Y >=", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYLessThan(Short value) {
            addCriterion("LOGO_POS_Y <", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYLessThanOrEqualTo(Short value) {
            addCriterion("LOGO_POS_Y <=", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYIn(List<Short> values) {
            addCriterion("LOGO_POS_Y in", values, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYNotIn(List<Short> values) {
            addCriterion("LOGO_POS_Y not in", values, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYBetween(Short value1, Short value2) {
            addCriterion("LOGO_POS_Y between", value1, value2, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYNotBetween(Short value1, Short value2) {
            addCriterion("LOGO_POS_Y not between", value1, value2, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetIsNull() {
            addCriterion("OUTLINE is null");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetIsNotNull() {
            addCriterion("OUTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetEqualTo(Integer value) {
            addCriterion("OUTLINE =", value, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetNotEqualTo(Integer value) {
            addCriterion("OUTLINE <>", value, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetGreaterThan(Integer value) {
            addCriterion("OUTLINE >", value, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE >=", value, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetLessThan(Integer value) {
            addCriterion("OUTLINE <", value, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetLessThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE <=", value, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetIn(List<Integer> values) {
            addCriterion("OUTLINE in", values, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetNotIn(List<Integer> values) {
            addCriterion("OUTLINE not in", values, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetBetween(Integer value1, Integer value2) {
            addCriterion("OUTLINE between", value1, value2, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineComponenetNotBetween(Integer value1, Integer value2) {
            addCriterion("OUTLINE not between", value1, value2, "outlineComponenet");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeIsNull() {
            addCriterion("OUTLINE_THEME is null");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeIsNotNull() {
            addCriterion("OUTLINE_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeEqualTo(Short value) {
            addCriterion("OUTLINE_THEME =", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeNotEqualTo(Short value) {
            addCriterion("OUTLINE_THEME <>", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeGreaterThan(Short value) {
            addCriterion("OUTLINE_THEME >", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_THEME >=", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeLessThan(Short value) {
            addCriterion("OUTLINE_THEME <", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeLessThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_THEME <=", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeIn(List<Short> values) {
            addCriterion("OUTLINE_THEME in", values, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeNotIn(List<Short> values) {
            addCriterion("OUTLINE_THEME not in", values, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_THEME between", value1, value2, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeNotBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_THEME not between", value1, value2, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXIsNull() {
            addCriterion("OUTLINE_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXIsNotNull() {
            addCriterion("OUTLINE_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_X =", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXNotEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_X <>", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXGreaterThan(Short value) {
            addCriterion("OUTLINE_SIZE_X >", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_X >=", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXLessThan(Short value) {
            addCriterion("OUTLINE_SIZE_X <", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXLessThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_X <=", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXIn(List<Short> values) {
            addCriterion("OUTLINE_SIZE_X in", values, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXNotIn(List<Short> values) {
            addCriterion("OUTLINE_SIZE_X not in", values, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_SIZE_X between", value1, value2, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXNotBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_SIZE_X not between", value1, value2, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYIsNull() {
            addCriterion("OUTLINE_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYIsNotNull() {
            addCriterion("OUTLINE_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_Y =", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYNotEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_Y <>", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYGreaterThan(Short value) {
            addCriterion("OUTLINE_SIZE_Y >", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_Y >=", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYLessThan(Short value) {
            addCriterion("OUTLINE_SIZE_Y <", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYLessThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_SIZE_Y <=", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYIn(List<Short> values) {
            addCriterion("OUTLINE_SIZE_Y in", values, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYNotIn(List<Short> values) {
            addCriterion("OUTLINE_SIZE_Y not in", values, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_SIZE_Y between", value1, value2, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYNotBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_SIZE_Y not between", value1, value2, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXIsNull() {
            addCriterion("OUTLINE_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXIsNotNull() {
            addCriterion("OUTLINE_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXEqualTo(Short value) {
            addCriterion("OUTLINE_POS_X =", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXNotEqualTo(Short value) {
            addCriterion("OUTLINE_POS_X <>", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXGreaterThan(Short value) {
            addCriterion("OUTLINE_POS_X >", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXGreaterThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_POS_X >=", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXLessThan(Short value) {
            addCriterion("OUTLINE_POS_X <", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXLessThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_POS_X <=", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXIn(List<Short> values) {
            addCriterion("OUTLINE_POS_X in", values, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXNotIn(List<Short> values) {
            addCriterion("OUTLINE_POS_X not in", values, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_POS_X between", value1, value2, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXNotBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_POS_X not between", value1, value2, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYIsNull() {
            addCriterion("OUTLINE_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYIsNotNull() {
            addCriterion("OUTLINE_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYEqualTo(Short value) {
            addCriterion("OUTLINE_POS_Y =", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYNotEqualTo(Short value) {
            addCriterion("OUTLINE_POS_Y <>", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYGreaterThan(Short value) {
            addCriterion("OUTLINE_POS_Y >", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYGreaterThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_POS_Y >=", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYLessThan(Short value) {
            addCriterion("OUTLINE_POS_Y <", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYLessThanOrEqualTo(Short value) {
            addCriterion("OUTLINE_POS_Y <=", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYIn(List<Short> values) {
            addCriterion("OUTLINE_POS_Y in", values, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYNotIn(List<Short> values) {
            addCriterion("OUTLINE_POS_Y not in", values, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_POS_Y between", value1, value2, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYNotBetween(Short value1, Short value2) {
            addCriterion("OUTLINE_POS_Y not between", value1, value2, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentIsNull() {
            addCriterion("RSV_MGM is null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentIsNotNull() {
            addCriterion("RSV_MGM is not null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentEqualTo(Integer value) {
            addCriterion("RSV_MGM =", value, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentNotEqualTo(Integer value) {
            addCriterion("RSV_MGM <>", value, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentGreaterThan(Integer value) {
            addCriterion("RSV_MGM >", value, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM >=", value, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentLessThan(Integer value) {
            addCriterion("RSV_MGM <", value, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM <=", value, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentIn(List<Integer> values) {
            addCriterion("RSV_MGM in", values, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentNotIn(List<Integer> values) {
            addCriterion("RSV_MGM not in", values, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentBetween(Integer value1, Integer value2) {
            addCriterion("RSV_MGM between", value1, value2, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("RSV_MGM not between", value1, value2, "rsvMgmComponent");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeIsNull() {
            addCriterion("RSV_MGM_THEME is null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeIsNotNull() {
            addCriterion("RSV_MGM_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeEqualTo(Short value) {
            addCriterion("RSV_MGM_THEME =", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeNotEqualTo(Short value) {
            addCriterion("RSV_MGM_THEME <>", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeGreaterThan(Short value) {
            addCriterion("RSV_MGM_THEME >", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_THEME >=", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeLessThan(Short value) {
            addCriterion("RSV_MGM_THEME <", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeLessThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_THEME <=", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeIn(List<Short> values) {
            addCriterion("RSV_MGM_THEME in", values, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeNotIn(List<Short> values) {
            addCriterion("RSV_MGM_THEME not in", values, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_THEME between", value1, value2, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeNotBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_THEME not between", value1, value2, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXIsNull() {
            addCriterion("RSV_MGM_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXIsNotNull() {
            addCriterion("RSV_MGM_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_X =", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXNotEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_X <>", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXGreaterThan(Short value) {
            addCriterion("RSV_MGM_SIZE_X >", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_X >=", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXLessThan(Short value) {
            addCriterion("RSV_MGM_SIZE_X <", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXLessThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_X <=", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXIn(List<Short> values) {
            addCriterion("RSV_MGM_SIZE_X in", values, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXNotIn(List<Short> values) {
            addCriterion("RSV_MGM_SIZE_X not in", values, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_SIZE_X between", value1, value2, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXNotBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_SIZE_X not between", value1, value2, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYIsNull() {
            addCriterion("RSV_MGM_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYIsNotNull() {
            addCriterion("RSV_MGM_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_Y =", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYNotEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_Y <>", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYGreaterThan(Short value) {
            addCriterion("RSV_MGM_SIZE_Y >", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_Y >=", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYLessThan(Short value) {
            addCriterion("RSV_MGM_SIZE_Y <", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYLessThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_SIZE_Y <=", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYIn(List<Short> values) {
            addCriterion("RSV_MGM_SIZE_Y in", values, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYNotIn(List<Short> values) {
            addCriterion("RSV_MGM_SIZE_Y not in", values, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_SIZE_Y between", value1, value2, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYNotBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_SIZE_Y not between", value1, value2, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXIsNull() {
            addCriterion("RSV_MGM_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXIsNotNull() {
            addCriterion("RSV_MGM_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_X =", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXNotEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_X <>", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXGreaterThan(Short value) {
            addCriterion("RSV_MGM_POS_X >", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_X >=", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXLessThan(Short value) {
            addCriterion("RSV_MGM_POS_X <", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXLessThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_X <=", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXIn(List<Short> values) {
            addCriterion("RSV_MGM_POS_X in", values, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXNotIn(List<Short> values) {
            addCriterion("RSV_MGM_POS_X not in", values, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_POS_X between", value1, value2, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXNotBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_POS_X not between", value1, value2, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYIsNull() {
            addCriterion("RSV_MGM_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYIsNotNull() {
            addCriterion("RSV_MGM_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_Y =", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYNotEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_Y <>", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYGreaterThan(Short value) {
            addCriterion("RSV_MGM_POS_Y >", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_Y >=", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYLessThan(Short value) {
            addCriterion("RSV_MGM_POS_Y <", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYLessThanOrEqualTo(Short value) {
            addCriterion("RSV_MGM_POS_Y <=", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYIn(List<Short> values) {
            addCriterion("RSV_MGM_POS_Y in", values, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYNotIn(List<Short> values) {
            addCriterion("RSV_MGM_POS_Y not in", values, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_POS_Y between", value1, value2, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYNotBetween(Short value1, Short value2) {
            addCriterion("RSV_MGM_POS_Y not between", value1, value2, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentIsNull() {
            addCriterion("MISC_SETTING is null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentIsNotNull() {
            addCriterion("MISC_SETTING is not null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentEqualTo(Integer value) {
            addCriterion("MISC_SETTING =", value, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentNotEqualTo(Integer value) {
            addCriterion("MISC_SETTING <>", value, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentGreaterThan(Integer value) {
            addCriterion("MISC_SETTING >", value, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING >=", value, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentLessThan(Integer value) {
            addCriterion("MISC_SETTING <", value, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentLessThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING <=", value, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentIn(List<Integer> values) {
            addCriterion("MISC_SETTING in", values, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentNotIn(List<Integer> values) {
            addCriterion("MISC_SETTING not in", values, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentBetween(Integer value1, Integer value2) {
            addCriterion("MISC_SETTING between", value1, value2, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("MISC_SETTING not between", value1, value2, "miscSettingComponent");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeIsNull() {
            addCriterion("MISC_SETTING_THEME is null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeIsNotNull() {
            addCriterion("MISC_SETTING_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeEqualTo(Short value) {
            addCriterion("MISC_SETTING_THEME =", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeNotEqualTo(Short value) {
            addCriterion("MISC_SETTING_THEME <>", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeGreaterThan(Short value) {
            addCriterion("MISC_SETTING_THEME >", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_THEME >=", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeLessThan(Short value) {
            addCriterion("MISC_SETTING_THEME <", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeLessThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_THEME <=", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeIn(List<Short> values) {
            addCriterion("MISC_SETTING_THEME in", values, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeNotIn(List<Short> values) {
            addCriterion("MISC_SETTING_THEME not in", values, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_THEME between", value1, value2, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeNotBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_THEME not between", value1, value2, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXIsNull() {
            addCriterion("MISC_SETTING_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXIsNotNull() {
            addCriterion("MISC_SETTING_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_X =", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXNotEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_X <>", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXGreaterThan(Short value) {
            addCriterion("MISC_SETTING_SIZE_X >", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_X >=", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXLessThan(Short value) {
            addCriterion("MISC_SETTING_SIZE_X <", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXLessThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_X <=", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXIn(List<Short> values) {
            addCriterion("MISC_SETTING_SIZE_X in", values, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXNotIn(List<Short> values) {
            addCriterion("MISC_SETTING_SIZE_X not in", values, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_SIZE_X between", value1, value2, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXNotBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_SIZE_X not between", value1, value2, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYIsNull() {
            addCriterion("MISC_SETTING_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYIsNotNull() {
            addCriterion("MISC_SETTING_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_Y =", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYNotEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_Y <>", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYGreaterThan(Short value) {
            addCriterion("MISC_SETTING_SIZE_Y >", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_Y >=", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYLessThan(Short value) {
            addCriterion("MISC_SETTING_SIZE_Y <", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYLessThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_SIZE_Y <=", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYIn(List<Short> values) {
            addCriterion("MISC_SETTING_SIZE_Y in", values, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYNotIn(List<Short> values) {
            addCriterion("MISC_SETTING_SIZE_Y not in", values, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_SIZE_Y between", value1, value2, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYNotBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_SIZE_Y not between", value1, value2, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXIsNull() {
            addCriterion("MISC_SETTING_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXIsNotNull() {
            addCriterion("MISC_SETTING_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_X =", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXNotEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_X <>", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXGreaterThan(Short value) {
            addCriterion("MISC_SETTING_POS_X >", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_X >=", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXLessThan(Short value) {
            addCriterion("MISC_SETTING_POS_X <", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXLessThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_X <=", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXIn(List<Short> values) {
            addCriterion("MISC_SETTING_POS_X in", values, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXNotIn(List<Short> values) {
            addCriterion("MISC_SETTING_POS_X not in", values, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_POS_X between", value1, value2, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXNotBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_POS_X not between", value1, value2, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYIsNull() {
            addCriterion("MISC_SETTING_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYIsNotNull() {
            addCriterion("MISC_SETTING_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_Y =", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYNotEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_Y <>", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYGreaterThan(Short value) {
            addCriterion("MISC_SETTING_POS_Y >", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_Y >=", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYLessThan(Short value) {
            addCriterion("MISC_SETTING_POS_Y <", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYLessThanOrEqualTo(Short value) {
            addCriterion("MISC_SETTING_POS_Y <=", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYIn(List<Short> values) {
            addCriterion("MISC_SETTING_POS_Y in", values, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYNotIn(List<Short> values) {
            addCriterion("MISC_SETTING_POS_Y not in", values, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_POS_Y between", value1, value2, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYNotBetween(Short value1, Short value2) {
            addCriterion("MISC_SETTING_POS_Y not between", value1, value2, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentIsNull() {
            addCriterion("RSV_BTN_BAR is null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentIsNotNull() {
            addCriterion("RSV_BTN_BAR is not null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR =", value, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentNotEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR <>", value, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentGreaterThan(Integer value) {
            addCriterion("RSV_BTN_BAR >", value, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR >=", value, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentLessThan(Integer value) {
            addCriterion("RSV_BTN_BAR <", value, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR <=", value, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR in", values, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentNotIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR not in", values, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentBetween(Integer value1, Integer value2) {
            addCriterion("RSV_BTN_BAR between", value1, value2, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("RSV_BTN_BAR not between", value1, value2, "rsvBtnBarComponent");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeIsNull() {
            addCriterion("RSV_BTN_BAR_THEME is null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeIsNotNull() {
            addCriterion("RSV_BTN_BAR_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_THEME =", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeNotEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_THEME <>", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeGreaterThan(Short value) {
            addCriterion("RSV_BTN_BAR_THEME >", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_THEME >=", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeLessThan(Short value) {
            addCriterion("RSV_BTN_BAR_THEME <", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeLessThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_THEME <=", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_THEME in", values, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeNotIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_THEME not in", values, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_THEME between", value1, value2, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeNotBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_THEME not between", value1, value2, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXIsNull() {
            addCriterion("RSV_BTN_BAR_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXIsNotNull() {
            addCriterion("RSV_BTN_BAR_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_X =", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXNotEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_X <>", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXGreaterThan(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_X >", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_X >=", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXLessThan(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_X <", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXLessThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_X <=", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_SIZE_X in", values, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXNotIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_SIZE_X not in", values, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_SIZE_X between", value1, value2, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXNotBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_SIZE_X not between", value1, value2, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYIsNull() {
            addCriterion("RSV_BTN_BAR_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYIsNotNull() {
            addCriterion("RSV_BTN_BAR_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y =", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYNotEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y <>", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYGreaterThan(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y >", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y >=", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYLessThan(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y <", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYLessThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y <=", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_SIZE_Y in", values, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYNotIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_SIZE_Y not in", values, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_SIZE_Y between", value1, value2, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYNotBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_SIZE_Y not between", value1, value2, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXIsNull() {
            addCriterion("RSV_BTN_BAR_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXIsNotNull() {
            addCriterion("RSV_BTN_BAR_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_X =", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXNotEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_X <>", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXGreaterThan(Short value) {
            addCriterion("RSV_BTN_BAR_POS_X >", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_X >=", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXLessThan(Short value) {
            addCriterion("RSV_BTN_BAR_POS_X <", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXLessThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_X <=", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_POS_X in", values, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXNotIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_POS_X not in", values, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_POS_X between", value1, value2, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXNotBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_POS_X not between", value1, value2, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYIsNull() {
            addCriterion("RSV_BTN_BAR_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYIsNotNull() {
            addCriterion("RSV_BTN_BAR_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_Y =", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYNotEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_Y <>", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYGreaterThan(Short value) {
            addCriterion("RSV_BTN_BAR_POS_Y >", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_Y >=", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYLessThan(Short value) {
            addCriterion("RSV_BTN_BAR_POS_Y <", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYLessThanOrEqualTo(Short value) {
            addCriterion("RSV_BTN_BAR_POS_Y <=", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_POS_Y in", values, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYNotIn(List<Short> values) {
            addCriterion("RSV_BTN_BAR_POS_Y not in", values, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_POS_Y between", value1, value2, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYNotBetween(Short value1, Short value2) {
            addCriterion("RSV_BTN_BAR_POS_Y not between", value1, value2, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentIsNull() {
            addCriterion("ETP_INFO is null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentIsNotNull() {
            addCriterion("ETP_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentEqualTo(Integer value) {
            addCriterion("ETP_INFO =", value, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentNotEqualTo(Integer value) {
            addCriterion("ETP_INFO <>", value, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentGreaterThan(Integer value) {
            addCriterion("ETP_INFO >", value, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO >=", value, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentLessThan(Integer value) {
            addCriterion("ETP_INFO <", value, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO <=", value, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentIn(List<Integer> values) {
            addCriterion("ETP_INFO in", values, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentNotIn(List<Integer> values) {
            addCriterion("ETP_INFO not in", values, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentBetween(Integer value1, Integer value2) {
            addCriterion("ETP_INFO between", value1, value2, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("ETP_INFO not between", value1, value2, "etpInfoComponent");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeIsNull() {
            addCriterion("ETP_INFO_THEME is null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeIsNotNull() {
            addCriterion("ETP_INFO_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeEqualTo(Short value) {
            addCriterion("ETP_INFO_THEME =", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeNotEqualTo(Short value) {
            addCriterion("ETP_INFO_THEME <>", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeGreaterThan(Short value) {
            addCriterion("ETP_INFO_THEME >", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_THEME >=", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeLessThan(Short value) {
            addCriterion("ETP_INFO_THEME <", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeLessThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_THEME <=", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeIn(List<Short> values) {
            addCriterion("ETP_INFO_THEME in", values, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeNotIn(List<Short> values) {
            addCriterion("ETP_INFO_THEME not in", values, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_THEME between", value1, value2, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeNotBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_THEME not between", value1, value2, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXIsNull() {
            addCriterion("ETP_INFO_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXIsNotNull() {
            addCriterion("ETP_INFO_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_X =", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXNotEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_X <>", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXGreaterThan(Short value) {
            addCriterion("ETP_INFO_SIZE_X >", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_X >=", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXLessThan(Short value) {
            addCriterion("ETP_INFO_SIZE_X <", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXLessThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_X <=", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXIn(List<Short> values) {
            addCriterion("ETP_INFO_SIZE_X in", values, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXNotIn(List<Short> values) {
            addCriterion("ETP_INFO_SIZE_X not in", values, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_SIZE_X between", value1, value2, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXNotBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_SIZE_X not between", value1, value2, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYIsNull() {
            addCriterion("ETP_INFO_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYIsNotNull() {
            addCriterion("ETP_INFO_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_Y =", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYNotEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_Y <>", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYGreaterThan(Short value) {
            addCriterion("ETP_INFO_SIZE_Y >", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_Y >=", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYLessThan(Short value) {
            addCriterion("ETP_INFO_SIZE_Y <", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYLessThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_SIZE_Y <=", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYIn(List<Short> values) {
            addCriterion("ETP_INFO_SIZE_Y in", values, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYNotIn(List<Short> values) {
            addCriterion("ETP_INFO_SIZE_Y not in", values, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_SIZE_Y between", value1, value2, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYNotBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_SIZE_Y not between", value1, value2, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXIsNull() {
            addCriterion("ETP_INFO_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXIsNotNull() {
            addCriterion("ETP_INFO_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_X =", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXNotEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_X <>", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXGreaterThan(Short value) {
            addCriterion("ETP_INFO_POS_X >", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_X >=", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXLessThan(Short value) {
            addCriterion("ETP_INFO_POS_X <", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXLessThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_X <=", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXIn(List<Short> values) {
            addCriterion("ETP_INFO_POS_X in", values, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXNotIn(List<Short> values) {
            addCriterion("ETP_INFO_POS_X not in", values, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_POS_X between", value1, value2, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXNotBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_POS_X not between", value1, value2, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYIsNull() {
            addCriterion("ETP_INFO_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYIsNotNull() {
            addCriterion("ETP_INFO_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_Y =", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYNotEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_Y <>", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYGreaterThan(Short value) {
            addCriterion("ETP_INFO_POS_Y >", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_Y >=", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYLessThan(Short value) {
            addCriterion("ETP_INFO_POS_Y <", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYLessThanOrEqualTo(Short value) {
            addCriterion("ETP_INFO_POS_Y <=", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYIn(List<Short> values) {
            addCriterion("ETP_INFO_POS_Y in", values, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYNotIn(List<Short> values) {
            addCriterion("ETP_INFO_POS_Y not in", values, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_POS_Y between", value1, value2, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYNotBetween(Short value1, Short value2) {
            addCriterion("ETP_INFO_POS_Y not between", value1, value2, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentIsNull() {
            addCriterion("SVC_LIST is null");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentIsNotNull() {
            addCriterion("SVC_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentEqualTo(Integer value) {
            addCriterion("SVC_LIST =", value, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentNotEqualTo(Integer value) {
            addCriterion("SVC_LIST <>", value, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentGreaterThan(Integer value) {
            addCriterion("SVC_LIST >", value, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST >=", value, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentLessThan(Integer value) {
            addCriterion("SVC_LIST <", value, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST <=", value, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentIn(List<Integer> values) {
            addCriterion("SVC_LIST in", values, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentNotIn(List<Integer> values) {
            addCriterion("SVC_LIST not in", values, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentBetween(Integer value1, Integer value2) {
            addCriterion("SVC_LIST between", value1, value2, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("SVC_LIST not between", value1, value2, "svcListComponent");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeIsNull() {
            addCriterion("SVC_LIST_THEME is null");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeIsNotNull() {
            addCriterion("SVC_LIST_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeEqualTo(Short value) {
            addCriterion("SVC_LIST_THEME =", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeNotEqualTo(Short value) {
            addCriterion("SVC_LIST_THEME <>", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeGreaterThan(Short value) {
            addCriterion("SVC_LIST_THEME >", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_THEME >=", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeLessThan(Short value) {
            addCriterion("SVC_LIST_THEME <", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeLessThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_THEME <=", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeIn(List<Short> values) {
            addCriterion("SVC_LIST_THEME in", values, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeNotIn(List<Short> values) {
            addCriterion("SVC_LIST_THEME not in", values, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_THEME between", value1, value2, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeNotBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_THEME not between", value1, value2, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXIsNull() {
            addCriterion("SVC_LIST_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXIsNotNull() {
            addCriterion("SVC_LIST_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_X =", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXNotEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_X <>", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXGreaterThan(Short value) {
            addCriterion("SVC_LIST_SIZE_X >", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_X >=", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXLessThan(Short value) {
            addCriterion("SVC_LIST_SIZE_X <", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXLessThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_X <=", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXIn(List<Short> values) {
            addCriterion("SVC_LIST_SIZE_X in", values, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXNotIn(List<Short> values) {
            addCriterion("SVC_LIST_SIZE_X not in", values, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_SIZE_X between", value1, value2, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXNotBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_SIZE_X not between", value1, value2, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYIsNull() {
            addCriterion("SVC_LIST_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYIsNotNull() {
            addCriterion("SVC_LIST_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_Y =", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYNotEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_Y <>", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYGreaterThan(Short value) {
            addCriterion("SVC_LIST_SIZE_Y >", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_Y >=", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYLessThan(Short value) {
            addCriterion("SVC_LIST_SIZE_Y <", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYLessThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_SIZE_Y <=", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYIn(List<Short> values) {
            addCriterion("SVC_LIST_SIZE_Y in", values, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYNotIn(List<Short> values) {
            addCriterion("SVC_LIST_SIZE_Y not in", values, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_SIZE_Y between", value1, value2, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYNotBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_SIZE_Y not between", value1, value2, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXIsNull() {
            addCriterion("SVC_LIST_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXIsNotNull() {
            addCriterion("SVC_LIST_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_X =", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXNotEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_X <>", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXGreaterThan(Short value) {
            addCriterion("SVC_LIST_POS_X >", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_X >=", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXLessThan(Short value) {
            addCriterion("SVC_LIST_POS_X <", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXLessThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_X <=", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXIn(List<Short> values) {
            addCriterion("SVC_LIST_POS_X in", values, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXNotIn(List<Short> values) {
            addCriterion("SVC_LIST_POS_X not in", values, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_POS_X between", value1, value2, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXNotBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_POS_X not between", value1, value2, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYIsNull() {
            addCriterion("SVC_LIST_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYIsNotNull() {
            addCriterion("SVC_LIST_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_Y =", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYNotEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_Y <>", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYGreaterThan(Short value) {
            addCriterion("SVC_LIST_POS_Y >", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_Y >=", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYLessThan(Short value) {
            addCriterion("SVC_LIST_POS_Y <", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYLessThanOrEqualTo(Short value) {
            addCriterion("SVC_LIST_POS_Y <=", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYIn(List<Short> values) {
            addCriterion("SVC_LIST_POS_Y in", values, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYNotIn(List<Short> values) {
            addCriterion("SVC_LIST_POS_Y not in", values, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_POS_Y between", value1, value2, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYNotBetween(Short value1, Short value2) {
            addCriterion("SVC_LIST_POS_Y not between", value1, value2, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentIsNull() {
            addCriterion("GALLERY is null");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentIsNotNull() {
            addCriterion("GALLERY is not null");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentEqualTo(Integer value) {
            addCriterion("GALLERY =", value, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentNotEqualTo(Integer value) {
            addCriterion("GALLERY <>", value, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentGreaterThan(Integer value) {
            addCriterion("GALLERY >", value, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("GALLERY >=", value, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentLessThan(Integer value) {
            addCriterion("GALLERY <", value, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentLessThanOrEqualTo(Integer value) {
            addCriterion("GALLERY <=", value, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentIn(List<Integer> values) {
            addCriterion("GALLERY in", values, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentNotIn(List<Integer> values) {
            addCriterion("GALLERY not in", values, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentBetween(Integer value1, Integer value2) {
            addCriterion("GALLERY between", value1, value2, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("GALLERY not between", value1, value2, "galleryComponent");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeIsNull() {
            addCriterion("GALLERY_THEME is null");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeIsNotNull() {
            addCriterion("GALLERY_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeEqualTo(Short value) {
            addCriterion("GALLERY_THEME =", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeNotEqualTo(Short value) {
            addCriterion("GALLERY_THEME <>", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeGreaterThan(Short value) {
            addCriterion("GALLERY_THEME >", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("GALLERY_THEME >=", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeLessThan(Short value) {
            addCriterion("GALLERY_THEME <", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeLessThanOrEqualTo(Short value) {
            addCriterion("GALLERY_THEME <=", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeIn(List<Short> values) {
            addCriterion("GALLERY_THEME in", values, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeNotIn(List<Short> values) {
            addCriterion("GALLERY_THEME not in", values, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeBetween(Short value1, Short value2) {
            addCriterion("GALLERY_THEME between", value1, value2, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeNotBetween(Short value1, Short value2) {
            addCriterion("GALLERY_THEME not between", value1, value2, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXIsNull() {
            addCriterion("GALLERY_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXIsNotNull() {
            addCriterion("GALLERY_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_X =", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXNotEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_X <>", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXGreaterThan(Short value) {
            addCriterion("GALLERY_SIZE_X >", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_X >=", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXLessThan(Short value) {
            addCriterion("GALLERY_SIZE_X <", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXLessThanOrEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_X <=", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXIn(List<Short> values) {
            addCriterion("GALLERY_SIZE_X in", values, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXNotIn(List<Short> values) {
            addCriterion("GALLERY_SIZE_X not in", values, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXBetween(Short value1, Short value2) {
            addCriterion("GALLERY_SIZE_X between", value1, value2, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXNotBetween(Short value1, Short value2) {
            addCriterion("GALLERY_SIZE_X not between", value1, value2, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYIsNull() {
            addCriterion("GALLERY_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYIsNotNull() {
            addCriterion("GALLERY_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_Y =", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYNotEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_Y <>", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYGreaterThan(Short value) {
            addCriterion("GALLERY_SIZE_Y >", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_Y >=", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYLessThan(Short value) {
            addCriterion("GALLERY_SIZE_Y <", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYLessThanOrEqualTo(Short value) {
            addCriterion("GALLERY_SIZE_Y <=", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYIn(List<Short> values) {
            addCriterion("GALLERY_SIZE_Y in", values, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYNotIn(List<Short> values) {
            addCriterion("GALLERY_SIZE_Y not in", values, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYBetween(Short value1, Short value2) {
            addCriterion("GALLERY_SIZE_Y between", value1, value2, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYNotBetween(Short value1, Short value2) {
            addCriterion("GALLERY_SIZE_Y not between", value1, value2, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXIsNull() {
            addCriterion("GALLERY_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXIsNotNull() {
            addCriterion("GALLERY_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXEqualTo(Short value) {
            addCriterion("GALLERY_POS_X =", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXNotEqualTo(Short value) {
            addCriterion("GALLERY_POS_X <>", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXGreaterThan(Short value) {
            addCriterion("GALLERY_POS_X >", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("GALLERY_POS_X >=", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXLessThan(Short value) {
            addCriterion("GALLERY_POS_X <", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXLessThanOrEqualTo(Short value) {
            addCriterion("GALLERY_POS_X <=", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXIn(List<Short> values) {
            addCriterion("GALLERY_POS_X in", values, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXNotIn(List<Short> values) {
            addCriterion("GALLERY_POS_X not in", values, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXBetween(Short value1, Short value2) {
            addCriterion("GALLERY_POS_X between", value1, value2, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXNotBetween(Short value1, Short value2) {
            addCriterion("GALLERY_POS_X not between", value1, value2, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYIsNull() {
            addCriterion("GALLERY_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYIsNotNull() {
            addCriterion("GALLERY_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYEqualTo(Short value) {
            addCriterion("GALLERY_POS_Y =", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYNotEqualTo(Short value) {
            addCriterion("GALLERY_POS_Y <>", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYGreaterThan(Short value) {
            addCriterion("GALLERY_POS_Y >", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("GALLERY_POS_Y >=", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYLessThan(Short value) {
            addCriterion("GALLERY_POS_Y <", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYLessThanOrEqualTo(Short value) {
            addCriterion("GALLERY_POS_Y <=", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYIn(List<Short> values) {
            addCriterion("GALLERY_POS_Y in", values, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYNotIn(List<Short> values) {
            addCriterion("GALLERY_POS_Y not in", values, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYBetween(Short value1, Short value2) {
            addCriterion("GALLERY_POS_Y between", value1, value2, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYNotBetween(Short value1, Short value2) {
            addCriterion("GALLERY_POS_Y not between", value1, value2, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andLocationComponentIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationComponentIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationComponentEqualTo(Integer value) {
            addCriterion("LOCATION =", value, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentNotEqualTo(Integer value) {
            addCriterion("LOCATION <>", value, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentGreaterThan(Integer value) {
            addCriterion("LOCATION >", value, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCATION >=", value, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentLessThan(Integer value) {
            addCriterion("LOCATION <", value, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentLessThanOrEqualTo(Integer value) {
            addCriterion("LOCATION <=", value, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentIn(List<Integer> values) {
            addCriterion("LOCATION in", values, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentNotIn(List<Integer> values) {
            addCriterion("LOCATION not in", values, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION between", value1, value2, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION not between", value1, value2, "locationComponent");
            return (Criteria) this;
        }

        public Criteria andLocationThemeIsNull() {
            addCriterion("LOCATION_THEME is null");
            return (Criteria) this;
        }

        public Criteria andLocationThemeIsNotNull() {
            addCriterion("LOCATION_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andLocationThemeEqualTo(Short value) {
            addCriterion("LOCATION_THEME =", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeNotEqualTo(Short value) {
            addCriterion("LOCATION_THEME <>", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeGreaterThan(Short value) {
            addCriterion("LOCATION_THEME >", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("LOCATION_THEME >=", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeLessThan(Short value) {
            addCriterion("LOCATION_THEME <", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeLessThanOrEqualTo(Short value) {
            addCriterion("LOCATION_THEME <=", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeIn(List<Short> values) {
            addCriterion("LOCATION_THEME in", values, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeNotIn(List<Short> values) {
            addCriterion("LOCATION_THEME not in", values, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeBetween(Short value1, Short value2) {
            addCriterion("LOCATION_THEME between", value1, value2, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeNotBetween(Short value1, Short value2) {
            addCriterion("LOCATION_THEME not between", value1, value2, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXIsNull() {
            addCriterion("LOCATION_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXIsNotNull() {
            addCriterion("LOCATION_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_X =", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXNotEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_X <>", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXGreaterThan(Short value) {
            addCriterion("LOCATION_SIZE_X >", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_X >=", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXLessThan(Short value) {
            addCriterion("LOCATION_SIZE_X <", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXLessThanOrEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_X <=", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXIn(List<Short> values) {
            addCriterion("LOCATION_SIZE_X in", values, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXNotIn(List<Short> values) {
            addCriterion("LOCATION_SIZE_X not in", values, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXBetween(Short value1, Short value2) {
            addCriterion("LOCATION_SIZE_X between", value1, value2, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXNotBetween(Short value1, Short value2) {
            addCriterion("LOCATION_SIZE_X not between", value1, value2, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYIsNull() {
            addCriterion("LOCATION_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYIsNotNull() {
            addCriterion("LOCATION_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_Y =", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYNotEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_Y <>", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYGreaterThan(Short value) {
            addCriterion("LOCATION_SIZE_Y >", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_Y >=", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYLessThan(Short value) {
            addCriterion("LOCATION_SIZE_Y <", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYLessThanOrEqualTo(Short value) {
            addCriterion("LOCATION_SIZE_Y <=", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYIn(List<Short> values) {
            addCriterion("LOCATION_SIZE_Y in", values, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYNotIn(List<Short> values) {
            addCriterion("LOCATION_SIZE_Y not in", values, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYBetween(Short value1, Short value2) {
            addCriterion("LOCATION_SIZE_Y between", value1, value2, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYNotBetween(Short value1, Short value2) {
            addCriterion("LOCATION_SIZE_Y not between", value1, value2, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationPosXIsNull() {
            addCriterion("LOCATION_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andLocationPosXIsNotNull() {
            addCriterion("LOCATION_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andLocationPosXEqualTo(Short value) {
            addCriterion("LOCATION_POS_X =", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXNotEqualTo(Short value) {
            addCriterion("LOCATION_POS_X <>", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXGreaterThan(Short value) {
            addCriterion("LOCATION_POS_X >", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("LOCATION_POS_X >=", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXLessThan(Short value) {
            addCriterion("LOCATION_POS_X <", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXLessThanOrEqualTo(Short value) {
            addCriterion("LOCATION_POS_X <=", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXIn(List<Short> values) {
            addCriterion("LOCATION_POS_X in", values, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXNotIn(List<Short> values) {
            addCriterion("LOCATION_POS_X not in", values, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXBetween(Short value1, Short value2) {
            addCriterion("LOCATION_POS_X between", value1, value2, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXNotBetween(Short value1, Short value2) {
            addCriterion("LOCATION_POS_X not between", value1, value2, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosYIsNull() {
            addCriterion("LOCATION_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andLocationPosYIsNotNull() {
            addCriterion("LOCATION_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andLocationPosYEqualTo(Short value) {
            addCriterion("LOCATION_POS_Y =", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYNotEqualTo(Short value) {
            addCriterion("LOCATION_POS_Y <>", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYGreaterThan(Short value) {
            addCriterion("LOCATION_POS_Y >", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("LOCATION_POS_Y >=", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYLessThan(Short value) {
            addCriterion("LOCATION_POS_Y <", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYLessThanOrEqualTo(Short value) {
            addCriterion("LOCATION_POS_Y <=", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYIn(List<Short> values) {
            addCriterion("LOCATION_POS_Y in", values, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYNotIn(List<Short> values) {
            addCriterion("LOCATION_POS_Y not in", values, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYBetween(Short value1, Short value2) {
            addCriterion("LOCATION_POS_Y between", value1, value2, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYNotBetween(Short value1, Short value2) {
            addCriterion("LOCATION_POS_Y not between", value1, value2, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andReviewComponentIsNull() {
            addCriterion("REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andReviewComponentIsNotNull() {
            addCriterion("REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andReviewComponentEqualTo(Integer value) {
            addCriterion("REVIEW =", value, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentNotEqualTo(Integer value) {
            addCriterion("REVIEW <>", value, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentGreaterThan(Integer value) {
            addCriterion("REVIEW >", value, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW >=", value, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentLessThan(Integer value) {
            addCriterion("REVIEW <", value, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW <=", value, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentIn(List<Integer> values) {
            addCriterion("REVIEW in", values, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentNotIn(List<Integer> values) {
            addCriterion("REVIEW not in", values, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW between", value1, value2, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewComponentNotBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW not between", value1, value2, "reviewComponent");
            return (Criteria) this;
        }

        public Criteria andReviewThemeIsNull() {
            addCriterion("REVIEW_THEME is null");
            return (Criteria) this;
        }

        public Criteria andReviewThemeIsNotNull() {
            addCriterion("REVIEW_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andReviewThemeEqualTo(Short value) {
            addCriterion("REVIEW_THEME =", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeNotEqualTo(Short value) {
            addCriterion("REVIEW_THEME <>", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeGreaterThan(Short value) {
            addCriterion("REVIEW_THEME >", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("REVIEW_THEME >=", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeLessThan(Short value) {
            addCriterion("REVIEW_THEME <", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeLessThanOrEqualTo(Short value) {
            addCriterion("REVIEW_THEME <=", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeIn(List<Short> values) {
            addCriterion("REVIEW_THEME in", values, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeNotIn(List<Short> values) {
            addCriterion("REVIEW_THEME not in", values, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeBetween(Short value1, Short value2) {
            addCriterion("REVIEW_THEME between", value1, value2, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeNotBetween(Short value1, Short value2) {
            addCriterion("REVIEW_THEME not between", value1, value2, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXIsNull() {
            addCriterion("REVIEW_SIZE_X is null");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXIsNotNull() {
            addCriterion("REVIEW_SIZE_X is not null");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_X =", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXNotEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_X <>", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXGreaterThan(Short value) {
            addCriterion("REVIEW_SIZE_X >", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXGreaterThanOrEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_X >=", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXLessThan(Short value) {
            addCriterion("REVIEW_SIZE_X <", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXLessThanOrEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_X <=", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXIn(List<Short> values) {
            addCriterion("REVIEW_SIZE_X in", values, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXNotIn(List<Short> values) {
            addCriterion("REVIEW_SIZE_X not in", values, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXBetween(Short value1, Short value2) {
            addCriterion("REVIEW_SIZE_X between", value1, value2, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXNotBetween(Short value1, Short value2) {
            addCriterion("REVIEW_SIZE_X not between", value1, value2, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYIsNull() {
            addCriterion("REVIEW_SIZE_Y is null");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYIsNotNull() {
            addCriterion("REVIEW_SIZE_Y is not null");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_Y =", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYNotEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_Y <>", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYGreaterThan(Short value) {
            addCriterion("REVIEW_SIZE_Y >", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYGreaterThanOrEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_Y >=", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYLessThan(Short value) {
            addCriterion("REVIEW_SIZE_Y <", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYLessThanOrEqualTo(Short value) {
            addCriterion("REVIEW_SIZE_Y <=", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYIn(List<Short> values) {
            addCriterion("REVIEW_SIZE_Y in", values, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYNotIn(List<Short> values) {
            addCriterion("REVIEW_SIZE_Y not in", values, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYBetween(Short value1, Short value2) {
            addCriterion("REVIEW_SIZE_Y between", value1, value2, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYNotBetween(Short value1, Short value2) {
            addCriterion("REVIEW_SIZE_Y not between", value1, value2, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewPosXIsNull() {
            addCriterion("REVIEW_POS_X is null");
            return (Criteria) this;
        }

        public Criteria andReviewPosXIsNotNull() {
            addCriterion("REVIEW_POS_X is not null");
            return (Criteria) this;
        }

        public Criteria andReviewPosXEqualTo(Short value) {
            addCriterion("REVIEW_POS_X =", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXNotEqualTo(Short value) {
            addCriterion("REVIEW_POS_X <>", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXGreaterThan(Short value) {
            addCriterion("REVIEW_POS_X >", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXGreaterThanOrEqualTo(Short value) {
            addCriterion("REVIEW_POS_X >=", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXLessThan(Short value) {
            addCriterion("REVIEW_POS_X <", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXLessThanOrEqualTo(Short value) {
            addCriterion("REVIEW_POS_X <=", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXIn(List<Short> values) {
            addCriterion("REVIEW_POS_X in", values, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXNotIn(List<Short> values) {
            addCriterion("REVIEW_POS_X not in", values, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXBetween(Short value1, Short value2) {
            addCriterion("REVIEW_POS_X between", value1, value2, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXNotBetween(Short value1, Short value2) {
            addCriterion("REVIEW_POS_X not between", value1, value2, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosYIsNull() {
            addCriterion("REVIEW_POS_Y is null");
            return (Criteria) this;
        }

        public Criteria andReviewPosYIsNotNull() {
            addCriterion("REVIEW_POS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andReviewPosYEqualTo(Short value) {
            addCriterion("REVIEW_POS_Y =", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYNotEqualTo(Short value) {
            addCriterion("REVIEW_POS_Y <>", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYGreaterThan(Short value) {
            addCriterion("REVIEW_POS_Y >", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYGreaterThanOrEqualTo(Short value) {
            addCriterion("REVIEW_POS_Y >=", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYLessThan(Short value) {
            addCriterion("REVIEW_POS_Y <", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYLessThanOrEqualTo(Short value) {
            addCriterion("REVIEW_POS_Y <=", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYIn(List<Short> values) {
            addCriterion("REVIEW_POS_Y in", values, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYNotIn(List<Short> values) {
            addCriterion("REVIEW_POS_Y not in", values, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYBetween(Short value1, Short value2) {
            addCriterion("REVIEW_POS_Y between", value1, value2, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYNotBetween(Short value1, Short value2) {
            addCriterion("REVIEW_POS_Y not between", value1, value2, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeIsNull() {
            addCriterion("BACKGROUND_THEME is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeIsNotNull() {
            addCriterion("BACKGROUND_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeEqualTo(Short value) {
            addCriterion("BACKGROUND_THEME =", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeNotEqualTo(Short value) {
            addCriterion("BACKGROUND_THEME <>", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeGreaterThan(Short value) {
            addCriterion("BACKGROUND_THEME >", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeGreaterThanOrEqualTo(Short value) {
            addCriterion("BACKGROUND_THEME >=", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeLessThan(Short value) {
            addCriterion("BACKGROUND_THEME <", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeLessThanOrEqualTo(Short value) {
            addCriterion("BACKGROUND_THEME <=", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeIn(List<Short> values) {
            addCriterion("BACKGROUND_THEME in", values, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeNotIn(List<Short> values) {
            addCriterion("BACKGROUND_THEME not in", values, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeBetween(Short value1, Short value2) {
            addCriterion("BACKGROUND_THEME between", value1, value2, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeNotBetween(Short value1, Short value2) {
            addCriterion("BACKGROUND_THEME not between", value1, value2, "backgroundTheme");
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