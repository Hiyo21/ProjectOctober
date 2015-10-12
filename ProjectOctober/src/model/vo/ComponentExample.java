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

        public Criteria andLogoThemeEqualTo(Integer value) {
            addCriterion("LOGO_THEME =", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeNotEqualTo(Integer value) {
            addCriterion("LOGO_THEME <>", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeGreaterThan(Integer value) {
            addCriterion("LOGO_THEME >", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGO_THEME >=", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeLessThan(Integer value) {
            addCriterion("LOGO_THEME <", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeLessThanOrEqualTo(Integer value) {
            addCriterion("LOGO_THEME <=", value, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeIn(List<Integer> values) {
            addCriterion("LOGO_THEME in", values, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeNotIn(List<Integer> values) {
            addCriterion("LOGO_THEME not in", values, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeBetween(Integer value1, Integer value2) {
            addCriterion("LOGO_THEME between", value1, value2, "logoTheme");
            return (Criteria) this;
        }

        public Criteria andLogoThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLogoSizeXEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_X =", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXNotEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_X <>", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXGreaterThan(Integer value) {
            addCriterion("LOGO_SIZE_X >", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_X >=", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXLessThan(Integer value) {
            addCriterion("LOGO_SIZE_X <", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_X <=", value, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXIn(List<Integer> values) {
            addCriterion("LOGO_SIZE_X in", values, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXNotIn(List<Integer> values) {
            addCriterion("LOGO_SIZE_X not in", values, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXBetween(Integer value1, Integer value2) {
            addCriterion("LOGO_SIZE_X between", value1, value2, "logoSizeX");
            return (Criteria) this;
        }

        public Criteria andLogoSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLogoSizeYEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_Y =", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYNotEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_Y <>", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYGreaterThan(Integer value) {
            addCriterion("LOGO_SIZE_Y >", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_Y >=", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYLessThan(Integer value) {
            addCriterion("LOGO_SIZE_Y <", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("LOGO_SIZE_Y <=", value, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYIn(List<Integer> values) {
            addCriterion("LOGO_SIZE_Y in", values, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYNotIn(List<Integer> values) {
            addCriterion("LOGO_SIZE_Y not in", values, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYBetween(Integer value1, Integer value2) {
            addCriterion("LOGO_SIZE_Y between", value1, value2, "logoSizeY");
            return (Criteria) this;
        }

        public Criteria andLogoSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLogoPosXEqualTo(Integer value) {
            addCriterion("LOGO_POS_X =", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXNotEqualTo(Integer value) {
            addCriterion("LOGO_POS_X <>", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXGreaterThan(Integer value) {
            addCriterion("LOGO_POS_X >", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGO_POS_X >=", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXLessThan(Integer value) {
            addCriterion("LOGO_POS_X <", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXLessThanOrEqualTo(Integer value) {
            addCriterion("LOGO_POS_X <=", value, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXIn(List<Integer> values) {
            addCriterion("LOGO_POS_X in", values, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXNotIn(List<Integer> values) {
            addCriterion("LOGO_POS_X not in", values, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXBetween(Integer value1, Integer value2) {
            addCriterion("LOGO_POS_X between", value1, value2, "logoPosX");
            return (Criteria) this;
        }

        public Criteria andLogoPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLogoPosYEqualTo(Integer value) {
            addCriterion("LOGO_POS_Y =", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYNotEqualTo(Integer value) {
            addCriterion("LOGO_POS_Y <>", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYGreaterThan(Integer value) {
            addCriterion("LOGO_POS_Y >", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGO_POS_Y >=", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYLessThan(Integer value) {
            addCriterion("LOGO_POS_Y <", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYLessThanOrEqualTo(Integer value) {
            addCriterion("LOGO_POS_Y <=", value, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYIn(List<Integer> values) {
            addCriterion("LOGO_POS_Y in", values, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYNotIn(List<Integer> values) {
            addCriterion("LOGO_POS_Y not in", values, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYBetween(Integer value1, Integer value2) {
            addCriterion("LOGO_POS_Y between", value1, value2, "logoPosY");
            return (Criteria) this;
        }

        public Criteria andLogoPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andOutlineThemeEqualTo(Integer value) {
            addCriterion("OUTLINE_THEME =", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeNotEqualTo(Integer value) {
            addCriterion("OUTLINE_THEME <>", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeGreaterThan(Integer value) {
            addCriterion("OUTLINE_THEME >", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_THEME >=", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeLessThan(Integer value) {
            addCriterion("OUTLINE_THEME <", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeLessThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_THEME <=", value, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeIn(List<Integer> values) {
            addCriterion("OUTLINE_THEME in", values, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeNotIn(List<Integer> values) {
            addCriterion("OUTLINE_THEME not in", values, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeBetween(Integer value1, Integer value2) {
            addCriterion("OUTLINE_THEME between", value1, value2, "outlineTheme");
            return (Criteria) this;
        }

        public Criteria andOutlineThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andOutlineSizeXEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_X =", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXNotEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_X <>", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXGreaterThan(Integer value) {
            addCriterion("OUTLINE_SIZE_X >", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_X >=", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXLessThan(Integer value) {
            addCriterion("OUTLINE_SIZE_X <", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_X <=", value, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXIn(List<Integer> values) {
            addCriterion("OUTLINE_SIZE_X in", values, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXNotIn(List<Integer> values) {
            addCriterion("OUTLINE_SIZE_X not in", values, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXBetween(Integer value1, Integer value2) {
            addCriterion("OUTLINE_SIZE_X between", value1, value2, "outlineSizeX");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andOutlineSizeYEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_Y =", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYNotEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_Y <>", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYGreaterThan(Integer value) {
            addCriterion("OUTLINE_SIZE_Y >", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_Y >=", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYLessThan(Integer value) {
            addCriterion("OUTLINE_SIZE_Y <", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_SIZE_Y <=", value, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYIn(List<Integer> values) {
            addCriterion("OUTLINE_SIZE_Y in", values, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYNotIn(List<Integer> values) {
            addCriterion("OUTLINE_SIZE_Y not in", values, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYBetween(Integer value1, Integer value2) {
            addCriterion("OUTLINE_SIZE_Y between", value1, value2, "outlineSizeY");
            return (Criteria) this;
        }

        public Criteria andOutlineSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andOutlinePosXEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_X =", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXNotEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_X <>", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXGreaterThan(Integer value) {
            addCriterion("OUTLINE_POS_X >", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_X >=", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXLessThan(Integer value) {
            addCriterion("OUTLINE_POS_X <", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXLessThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_X <=", value, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXIn(List<Integer> values) {
            addCriterion("OUTLINE_POS_X in", values, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXNotIn(List<Integer> values) {
            addCriterion("OUTLINE_POS_X not in", values, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXBetween(Integer value1, Integer value2) {
            addCriterion("OUTLINE_POS_X between", value1, value2, "outlinePosX");
            return (Criteria) this;
        }

        public Criteria andOutlinePosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andOutlinePosYEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_Y =", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYNotEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_Y <>", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYGreaterThan(Integer value) {
            addCriterion("OUTLINE_POS_Y >", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_Y >=", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYLessThan(Integer value) {
            addCriterion("OUTLINE_POS_Y <", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYLessThanOrEqualTo(Integer value) {
            addCriterion("OUTLINE_POS_Y <=", value, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYIn(List<Integer> values) {
            addCriterion("OUTLINE_POS_Y in", values, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYNotIn(List<Integer> values) {
            addCriterion("OUTLINE_POS_Y not in", values, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYBetween(Integer value1, Integer value2) {
            addCriterion("OUTLINE_POS_Y between", value1, value2, "outlinePosY");
            return (Criteria) this;
        }

        public Criteria andOutlinePosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvMgmThemeEqualTo(Integer value) {
            addCriterion("RSV_MGM_THEME =", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeNotEqualTo(Integer value) {
            addCriterion("RSV_MGM_THEME <>", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeGreaterThan(Integer value) {
            addCriterion("RSV_MGM_THEME >", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_THEME >=", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeLessThan(Integer value) {
            addCriterion("RSV_MGM_THEME <", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_THEME <=", value, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeIn(List<Integer> values) {
            addCriterion("RSV_MGM_THEME in", values, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeNotIn(List<Integer> values) {
            addCriterion("RSV_MGM_THEME not in", values, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeBetween(Integer value1, Integer value2) {
            addCriterion("RSV_MGM_THEME between", value1, value2, "rsvMgmTheme");
            return (Criteria) this;
        }

        public Criteria andRsvMgmThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvMgmSizeXEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_X =", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXNotEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_X <>", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXGreaterThan(Integer value) {
            addCriterion("RSV_MGM_SIZE_X >", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_X >=", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXLessThan(Integer value) {
            addCriterion("RSV_MGM_SIZE_X <", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_X <=", value, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXIn(List<Integer> values) {
            addCriterion("RSV_MGM_SIZE_X in", values, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXNotIn(List<Integer> values) {
            addCriterion("RSV_MGM_SIZE_X not in", values, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXBetween(Integer value1, Integer value2) {
            addCriterion("RSV_MGM_SIZE_X between", value1, value2, "rsvMgmSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvMgmSizeYEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_Y =", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYNotEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_Y <>", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYGreaterThan(Integer value) {
            addCriterion("RSV_MGM_SIZE_Y >", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_Y >=", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYLessThan(Integer value) {
            addCriterion("RSV_MGM_SIZE_Y <", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_SIZE_Y <=", value, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYIn(List<Integer> values) {
            addCriterion("RSV_MGM_SIZE_Y in", values, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYNotIn(List<Integer> values) {
            addCriterion("RSV_MGM_SIZE_Y not in", values, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYBetween(Integer value1, Integer value2) {
            addCriterion("RSV_MGM_SIZE_Y between", value1, value2, "rsvMgmSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvMgmPosXEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_X =", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXNotEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_X <>", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXGreaterThan(Integer value) {
            addCriterion("RSV_MGM_POS_X >", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_X >=", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXLessThan(Integer value) {
            addCriterion("RSV_MGM_POS_X <", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_X <=", value, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXIn(List<Integer> values) {
            addCriterion("RSV_MGM_POS_X in", values, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXNotIn(List<Integer> values) {
            addCriterion("RSV_MGM_POS_X not in", values, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXBetween(Integer value1, Integer value2) {
            addCriterion("RSV_MGM_POS_X between", value1, value2, "rsvMgmPosX");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvMgmPosYEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_Y =", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYNotEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_Y <>", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYGreaterThan(Integer value) {
            addCriterion("RSV_MGM_POS_Y >", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_Y >=", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYLessThan(Integer value) {
            addCriterion("RSV_MGM_POS_Y <", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_MGM_POS_Y <=", value, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYIn(List<Integer> values) {
            addCriterion("RSV_MGM_POS_Y in", values, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYNotIn(List<Integer> values) {
            addCriterion("RSV_MGM_POS_Y not in", values, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYBetween(Integer value1, Integer value2) {
            addCriterion("RSV_MGM_POS_Y between", value1, value2, "rsvMgmPosY");
            return (Criteria) this;
        }

        public Criteria andRsvMgmPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMiscSettingThemeEqualTo(Integer value) {
            addCriterion("MISC_SETTING_THEME =", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeNotEqualTo(Integer value) {
            addCriterion("MISC_SETTING_THEME <>", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeGreaterThan(Integer value) {
            addCriterion("MISC_SETTING_THEME >", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_THEME >=", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeLessThan(Integer value) {
            addCriterion("MISC_SETTING_THEME <", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeLessThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_THEME <=", value, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeIn(List<Integer> values) {
            addCriterion("MISC_SETTING_THEME in", values, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeNotIn(List<Integer> values) {
            addCriterion("MISC_SETTING_THEME not in", values, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeBetween(Integer value1, Integer value2) {
            addCriterion("MISC_SETTING_THEME between", value1, value2, "miscSettingTheme");
            return (Criteria) this;
        }

        public Criteria andMiscSettingThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMiscSettingSizeXEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_X =", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXNotEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_X <>", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXGreaterThan(Integer value) {
            addCriterion("MISC_SETTING_SIZE_X >", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_X >=", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXLessThan(Integer value) {
            addCriterion("MISC_SETTING_SIZE_X <", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_X <=", value, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXIn(List<Integer> values) {
            addCriterion("MISC_SETTING_SIZE_X in", values, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXNotIn(List<Integer> values) {
            addCriterion("MISC_SETTING_SIZE_X not in", values, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXBetween(Integer value1, Integer value2) {
            addCriterion("MISC_SETTING_SIZE_X between", value1, value2, "miscSettingSizeX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMiscSettingSizeYEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_Y =", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYNotEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_Y <>", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYGreaterThan(Integer value) {
            addCriterion("MISC_SETTING_SIZE_Y >", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_Y >=", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYLessThan(Integer value) {
            addCriterion("MISC_SETTING_SIZE_Y <", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_SIZE_Y <=", value, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYIn(List<Integer> values) {
            addCriterion("MISC_SETTING_SIZE_Y in", values, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYNotIn(List<Integer> values) {
            addCriterion("MISC_SETTING_SIZE_Y not in", values, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYBetween(Integer value1, Integer value2) {
            addCriterion("MISC_SETTING_SIZE_Y between", value1, value2, "miscSettingSizeY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMiscSettingPosXEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_X =", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXNotEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_X <>", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXGreaterThan(Integer value) {
            addCriterion("MISC_SETTING_POS_X >", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_X >=", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXLessThan(Integer value) {
            addCriterion("MISC_SETTING_POS_X <", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXLessThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_X <=", value, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXIn(List<Integer> values) {
            addCriterion("MISC_SETTING_POS_X in", values, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXNotIn(List<Integer> values) {
            addCriterion("MISC_SETTING_POS_X not in", values, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXBetween(Integer value1, Integer value2) {
            addCriterion("MISC_SETTING_POS_X between", value1, value2, "miscSettingPosX");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMiscSettingPosYEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_Y =", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYNotEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_Y <>", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYGreaterThan(Integer value) {
            addCriterion("MISC_SETTING_POS_Y >", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_Y >=", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYLessThan(Integer value) {
            addCriterion("MISC_SETTING_POS_Y <", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYLessThanOrEqualTo(Integer value) {
            addCriterion("MISC_SETTING_POS_Y <=", value, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYIn(List<Integer> values) {
            addCriterion("MISC_SETTING_POS_Y in", values, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYNotIn(List<Integer> values) {
            addCriterion("MISC_SETTING_POS_Y not in", values, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYBetween(Integer value1, Integer value2) {
            addCriterion("MISC_SETTING_POS_Y between", value1, value2, "miscSettingPosY");
            return (Criteria) this;
        }

        public Criteria andMiscSettingPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvBtnBarThemeEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_THEME =", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeNotEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_THEME <>", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeGreaterThan(Integer value) {
            addCriterion("RSV_BTN_BAR_THEME >", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_THEME >=", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeLessThan(Integer value) {
            addCriterion("RSV_BTN_BAR_THEME <", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_THEME <=", value, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_THEME in", values, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeNotIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_THEME not in", values, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeBetween(Integer value1, Integer value2) {
            addCriterion("RSV_BTN_BAR_THEME between", value1, value2, "rsvBtnBarTheme");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvBtnBarSizeXEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_X =", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXNotEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_X <>", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXGreaterThan(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_X >", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_X >=", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXLessThan(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_X <", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_X <=", value, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_SIZE_X in", values, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXNotIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_SIZE_X not in", values, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXBetween(Integer value1, Integer value2) {
            addCriterion("RSV_BTN_BAR_SIZE_X between", value1, value2, "rsvBtnBarSizeX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvBtnBarSizeYEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y =", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYNotEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y <>", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYGreaterThan(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y >", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y >=", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYLessThan(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y <", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_SIZE_Y <=", value, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_SIZE_Y in", values, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYNotIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_SIZE_Y not in", values, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYBetween(Integer value1, Integer value2) {
            addCriterion("RSV_BTN_BAR_SIZE_Y between", value1, value2, "rsvBtnBarSizeY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvBtnBarPosXEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_X =", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXNotEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_X <>", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXGreaterThan(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_X >", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_X >=", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXLessThan(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_X <", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_X <=", value, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_POS_X in", values, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXNotIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_POS_X not in", values, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXBetween(Integer value1, Integer value2) {
            addCriterion("RSV_BTN_BAR_POS_X between", value1, value2, "rsvBtnBarPosX");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRsvBtnBarPosYEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_Y =", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYNotEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_Y <>", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYGreaterThan(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_Y >", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_Y >=", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYLessThan(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_Y <", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYLessThanOrEqualTo(Integer value) {
            addCriterion("RSV_BTN_BAR_POS_Y <=", value, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_POS_Y in", values, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYNotIn(List<Integer> values) {
            addCriterion("RSV_BTN_BAR_POS_Y not in", values, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYBetween(Integer value1, Integer value2) {
            addCriterion("RSV_BTN_BAR_POS_Y between", value1, value2, "rsvBtnBarPosY");
            return (Criteria) this;
        }

        public Criteria andRsvBtnBarPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andEtpInfoThemeEqualTo(Integer value) {
            addCriterion("ETP_INFO_THEME =", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeNotEqualTo(Integer value) {
            addCriterion("ETP_INFO_THEME <>", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeGreaterThan(Integer value) {
            addCriterion("ETP_INFO_THEME >", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_THEME >=", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeLessThan(Integer value) {
            addCriterion("ETP_INFO_THEME <", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_THEME <=", value, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeIn(List<Integer> values) {
            addCriterion("ETP_INFO_THEME in", values, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeNotIn(List<Integer> values) {
            addCriterion("ETP_INFO_THEME not in", values, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeBetween(Integer value1, Integer value2) {
            addCriterion("ETP_INFO_THEME between", value1, value2, "etpInfoTheme");
            return (Criteria) this;
        }

        public Criteria andEtpInfoThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andEtpInfoSizeXEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_X =", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXNotEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_X <>", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXGreaterThan(Integer value) {
            addCriterion("ETP_INFO_SIZE_X >", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_X >=", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXLessThan(Integer value) {
            addCriterion("ETP_INFO_SIZE_X <", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_X <=", value, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXIn(List<Integer> values) {
            addCriterion("ETP_INFO_SIZE_X in", values, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXNotIn(List<Integer> values) {
            addCriterion("ETP_INFO_SIZE_X not in", values, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXBetween(Integer value1, Integer value2) {
            addCriterion("ETP_INFO_SIZE_X between", value1, value2, "etpInfoSizeX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andEtpInfoSizeYEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_Y =", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYNotEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_Y <>", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYGreaterThan(Integer value) {
            addCriterion("ETP_INFO_SIZE_Y >", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_Y >=", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYLessThan(Integer value) {
            addCriterion("ETP_INFO_SIZE_Y <", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_SIZE_Y <=", value, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYIn(List<Integer> values) {
            addCriterion("ETP_INFO_SIZE_Y in", values, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYNotIn(List<Integer> values) {
            addCriterion("ETP_INFO_SIZE_Y not in", values, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYBetween(Integer value1, Integer value2) {
            addCriterion("ETP_INFO_SIZE_Y between", value1, value2, "etpInfoSizeY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andEtpInfoPosXEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_X =", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXNotEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_X <>", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXGreaterThan(Integer value) {
            addCriterion("ETP_INFO_POS_X >", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_X >=", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXLessThan(Integer value) {
            addCriterion("ETP_INFO_POS_X <", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_X <=", value, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXIn(List<Integer> values) {
            addCriterion("ETP_INFO_POS_X in", values, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXNotIn(List<Integer> values) {
            addCriterion("ETP_INFO_POS_X not in", values, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXBetween(Integer value1, Integer value2) {
            addCriterion("ETP_INFO_POS_X between", value1, value2, "etpInfoPosX");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andEtpInfoPosYEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_Y =", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYNotEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_Y <>", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYGreaterThan(Integer value) {
            addCriterion("ETP_INFO_POS_Y >", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_Y >=", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYLessThan(Integer value) {
            addCriterion("ETP_INFO_POS_Y <", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYLessThanOrEqualTo(Integer value) {
            addCriterion("ETP_INFO_POS_Y <=", value, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYIn(List<Integer> values) {
            addCriterion("ETP_INFO_POS_Y in", values, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYNotIn(List<Integer> values) {
            addCriterion("ETP_INFO_POS_Y not in", values, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYBetween(Integer value1, Integer value2) {
            addCriterion("ETP_INFO_POS_Y between", value1, value2, "etpInfoPosY");
            return (Criteria) this;
        }

        public Criteria andEtpInfoPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSvcListThemeEqualTo(Integer value) {
            addCriterion("SVC_LIST_THEME =", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeNotEqualTo(Integer value) {
            addCriterion("SVC_LIST_THEME <>", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeGreaterThan(Integer value) {
            addCriterion("SVC_LIST_THEME >", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_THEME >=", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeLessThan(Integer value) {
            addCriterion("SVC_LIST_THEME <", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_THEME <=", value, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeIn(List<Integer> values) {
            addCriterion("SVC_LIST_THEME in", values, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeNotIn(List<Integer> values) {
            addCriterion("SVC_LIST_THEME not in", values, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeBetween(Integer value1, Integer value2) {
            addCriterion("SVC_LIST_THEME between", value1, value2, "svcListTheme");
            return (Criteria) this;
        }

        public Criteria andSvcListThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSvcListSizeXEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_X =", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXNotEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_X <>", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXGreaterThan(Integer value) {
            addCriterion("SVC_LIST_SIZE_X >", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_X >=", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXLessThan(Integer value) {
            addCriterion("SVC_LIST_SIZE_X <", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_X <=", value, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXIn(List<Integer> values) {
            addCriterion("SVC_LIST_SIZE_X in", values, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXNotIn(List<Integer> values) {
            addCriterion("SVC_LIST_SIZE_X not in", values, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXBetween(Integer value1, Integer value2) {
            addCriterion("SVC_LIST_SIZE_X between", value1, value2, "svcListSizeX");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSvcListSizeYEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_Y =", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYNotEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_Y <>", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYGreaterThan(Integer value) {
            addCriterion("SVC_LIST_SIZE_Y >", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_Y >=", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYLessThan(Integer value) {
            addCriterion("SVC_LIST_SIZE_Y <", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_SIZE_Y <=", value, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYIn(List<Integer> values) {
            addCriterion("SVC_LIST_SIZE_Y in", values, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYNotIn(List<Integer> values) {
            addCriterion("SVC_LIST_SIZE_Y not in", values, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYBetween(Integer value1, Integer value2) {
            addCriterion("SVC_LIST_SIZE_Y between", value1, value2, "svcListSizeY");
            return (Criteria) this;
        }

        public Criteria andSvcListSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSvcListPosXEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_X =", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXNotEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_X <>", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXGreaterThan(Integer value) {
            addCriterion("SVC_LIST_POS_X >", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_X >=", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXLessThan(Integer value) {
            addCriterion("SVC_LIST_POS_X <", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_X <=", value, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXIn(List<Integer> values) {
            addCriterion("SVC_LIST_POS_X in", values, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXNotIn(List<Integer> values) {
            addCriterion("SVC_LIST_POS_X not in", values, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXBetween(Integer value1, Integer value2) {
            addCriterion("SVC_LIST_POS_X between", value1, value2, "svcListPosX");
            return (Criteria) this;
        }

        public Criteria andSvcListPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSvcListPosYEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_Y =", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYNotEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_Y <>", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYGreaterThan(Integer value) {
            addCriterion("SVC_LIST_POS_Y >", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_Y >=", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYLessThan(Integer value) {
            addCriterion("SVC_LIST_POS_Y <", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_LIST_POS_Y <=", value, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYIn(List<Integer> values) {
            addCriterion("SVC_LIST_POS_Y in", values, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYNotIn(List<Integer> values) {
            addCriterion("SVC_LIST_POS_Y not in", values, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYBetween(Integer value1, Integer value2) {
            addCriterion("SVC_LIST_POS_Y between", value1, value2, "svcListPosY");
            return (Criteria) this;
        }

        public Criteria andSvcListPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andGalleryThemeEqualTo(Integer value) {
            addCriterion("GALLERY_THEME =", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeNotEqualTo(Integer value) {
            addCriterion("GALLERY_THEME <>", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeGreaterThan(Integer value) {
            addCriterion("GALLERY_THEME >", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_THEME >=", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeLessThan(Integer value) {
            addCriterion("GALLERY_THEME <", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeLessThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_THEME <=", value, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeIn(List<Integer> values) {
            addCriterion("GALLERY_THEME in", values, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeNotIn(List<Integer> values) {
            addCriterion("GALLERY_THEME not in", values, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeBetween(Integer value1, Integer value2) {
            addCriterion("GALLERY_THEME between", value1, value2, "galleryTheme");
            return (Criteria) this;
        }

        public Criteria andGalleryThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andGallerySizeXEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_X =", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXNotEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_X <>", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXGreaterThan(Integer value) {
            addCriterion("GALLERY_SIZE_X >", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_X >=", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXLessThan(Integer value) {
            addCriterion("GALLERY_SIZE_X <", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXLessThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_X <=", value, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXIn(List<Integer> values) {
            addCriterion("GALLERY_SIZE_X in", values, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXNotIn(List<Integer> values) {
            addCriterion("GALLERY_SIZE_X not in", values, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXBetween(Integer value1, Integer value2) {
            addCriterion("GALLERY_SIZE_X between", value1, value2, "gallerySizeX");
            return (Criteria) this;
        }

        public Criteria andGallerySizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andGallerySizeYEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_Y =", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYNotEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_Y <>", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYGreaterThan(Integer value) {
            addCriterion("GALLERY_SIZE_Y >", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_Y >=", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYLessThan(Integer value) {
            addCriterion("GALLERY_SIZE_Y <", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYLessThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_SIZE_Y <=", value, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYIn(List<Integer> values) {
            addCriterion("GALLERY_SIZE_Y in", values, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYNotIn(List<Integer> values) {
            addCriterion("GALLERY_SIZE_Y not in", values, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYBetween(Integer value1, Integer value2) {
            addCriterion("GALLERY_SIZE_Y between", value1, value2, "gallerySizeY");
            return (Criteria) this;
        }

        public Criteria andGallerySizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andGalleryPosXEqualTo(Integer value) {
            addCriterion("GALLERY_POS_X =", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXNotEqualTo(Integer value) {
            addCriterion("GALLERY_POS_X <>", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXGreaterThan(Integer value) {
            addCriterion("GALLERY_POS_X >", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_POS_X >=", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXLessThan(Integer value) {
            addCriterion("GALLERY_POS_X <", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXLessThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_POS_X <=", value, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXIn(List<Integer> values) {
            addCriterion("GALLERY_POS_X in", values, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXNotIn(List<Integer> values) {
            addCriterion("GALLERY_POS_X not in", values, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXBetween(Integer value1, Integer value2) {
            addCriterion("GALLERY_POS_X between", value1, value2, "galleryPosX");
            return (Criteria) this;
        }

        public Criteria andGalleryPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andGalleryPosYEqualTo(Integer value) {
            addCriterion("GALLERY_POS_Y =", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYNotEqualTo(Integer value) {
            addCriterion("GALLERY_POS_Y <>", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYGreaterThan(Integer value) {
            addCriterion("GALLERY_POS_Y >", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_POS_Y >=", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYLessThan(Integer value) {
            addCriterion("GALLERY_POS_Y <", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYLessThanOrEqualTo(Integer value) {
            addCriterion("GALLERY_POS_Y <=", value, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYIn(List<Integer> values) {
            addCriterion("GALLERY_POS_Y in", values, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYNotIn(List<Integer> values) {
            addCriterion("GALLERY_POS_Y not in", values, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYBetween(Integer value1, Integer value2) {
            addCriterion("GALLERY_POS_Y between", value1, value2, "galleryPosY");
            return (Criteria) this;
        }

        public Criteria andGalleryPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLocationThemeEqualTo(Integer value) {
            addCriterion("LOCATION_THEME =", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeNotEqualTo(Integer value) {
            addCriterion("LOCATION_THEME <>", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeGreaterThan(Integer value) {
            addCriterion("LOCATION_THEME >", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_THEME >=", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeLessThan(Integer value) {
            addCriterion("LOCATION_THEME <", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeLessThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_THEME <=", value, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeIn(List<Integer> values) {
            addCriterion("LOCATION_THEME in", values, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeNotIn(List<Integer> values) {
            addCriterion("LOCATION_THEME not in", values, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION_THEME between", value1, value2, "locationTheme");
            return (Criteria) this;
        }

        public Criteria andLocationThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLocationSizeXEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_X =", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXNotEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_X <>", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXGreaterThan(Integer value) {
            addCriterion("LOCATION_SIZE_X >", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_X >=", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXLessThan(Integer value) {
            addCriterion("LOCATION_SIZE_X <", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_X <=", value, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXIn(List<Integer> values) {
            addCriterion("LOCATION_SIZE_X in", values, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXNotIn(List<Integer> values) {
            addCriterion("LOCATION_SIZE_X not in", values, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION_SIZE_X between", value1, value2, "locationSizeX");
            return (Criteria) this;
        }

        public Criteria andLocationSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLocationSizeYEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_Y =", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYNotEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_Y <>", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYGreaterThan(Integer value) {
            addCriterion("LOCATION_SIZE_Y >", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_Y >=", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYLessThan(Integer value) {
            addCriterion("LOCATION_SIZE_Y <", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_SIZE_Y <=", value, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYIn(List<Integer> values) {
            addCriterion("LOCATION_SIZE_Y in", values, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYNotIn(List<Integer> values) {
            addCriterion("LOCATION_SIZE_Y not in", values, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION_SIZE_Y between", value1, value2, "locationSizeY");
            return (Criteria) this;
        }

        public Criteria andLocationSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLocationPosXEqualTo(Integer value) {
            addCriterion("LOCATION_POS_X =", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXNotEqualTo(Integer value) {
            addCriterion("LOCATION_POS_X <>", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXGreaterThan(Integer value) {
            addCriterion("LOCATION_POS_X >", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_POS_X >=", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXLessThan(Integer value) {
            addCriterion("LOCATION_POS_X <", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXLessThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_POS_X <=", value, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXIn(List<Integer> values) {
            addCriterion("LOCATION_POS_X in", values, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXNotIn(List<Integer> values) {
            addCriterion("LOCATION_POS_X not in", values, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION_POS_X between", value1, value2, "locationPosX");
            return (Criteria) this;
        }

        public Criteria andLocationPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLocationPosYEqualTo(Integer value) {
            addCriterion("LOCATION_POS_Y =", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYNotEqualTo(Integer value) {
            addCriterion("LOCATION_POS_Y <>", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYGreaterThan(Integer value) {
            addCriterion("LOCATION_POS_Y >", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_POS_Y >=", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYLessThan(Integer value) {
            addCriterion("LOCATION_POS_Y <", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYLessThanOrEqualTo(Integer value) {
            addCriterion("LOCATION_POS_Y <=", value, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYIn(List<Integer> values) {
            addCriterion("LOCATION_POS_Y in", values, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYNotIn(List<Integer> values) {
            addCriterion("LOCATION_POS_Y not in", values, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION_POS_Y between", value1, value2, "locationPosY");
            return (Criteria) this;
        }

        public Criteria andLocationPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andReviewThemeEqualTo(Integer value) {
            addCriterion("REVIEW_THEME =", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeNotEqualTo(Integer value) {
            addCriterion("REVIEW_THEME <>", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeGreaterThan(Integer value) {
            addCriterion("REVIEW_THEME >", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_THEME >=", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeLessThan(Integer value) {
            addCriterion("REVIEW_THEME <", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_THEME <=", value, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeIn(List<Integer> values) {
            addCriterion("REVIEW_THEME in", values, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeNotIn(List<Integer> values) {
            addCriterion("REVIEW_THEME not in", values, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_THEME between", value1, value2, "reviewTheme");
            return (Criteria) this;
        }

        public Criteria andReviewThemeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andReviewSizeXEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_X =", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXNotEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_X <>", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXGreaterThan(Integer value) {
            addCriterion("REVIEW_SIZE_X >", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_X >=", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXLessThan(Integer value) {
            addCriterion("REVIEW_SIZE_X <", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_X <=", value, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXIn(List<Integer> values) {
            addCriterion("REVIEW_SIZE_X in", values, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXNotIn(List<Integer> values) {
            addCriterion("REVIEW_SIZE_X not in", values, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_SIZE_X between", value1, value2, "reviewSizeX");
            return (Criteria) this;
        }

        public Criteria andReviewSizeXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andReviewSizeYEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_Y =", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYNotEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_Y <>", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYGreaterThan(Integer value) {
            addCriterion("REVIEW_SIZE_Y >", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_Y >=", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYLessThan(Integer value) {
            addCriterion("REVIEW_SIZE_Y <", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_SIZE_Y <=", value, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYIn(List<Integer> values) {
            addCriterion("REVIEW_SIZE_Y in", values, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYNotIn(List<Integer> values) {
            addCriterion("REVIEW_SIZE_Y not in", values, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_SIZE_Y between", value1, value2, "reviewSizeY");
            return (Criteria) this;
        }

        public Criteria andReviewSizeYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andReviewPosXEqualTo(Integer value) {
            addCriterion("REVIEW_POS_X =", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXNotEqualTo(Integer value) {
            addCriterion("REVIEW_POS_X <>", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXGreaterThan(Integer value) {
            addCriterion("REVIEW_POS_X >", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_POS_X >=", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXLessThan(Integer value) {
            addCriterion("REVIEW_POS_X <", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_POS_X <=", value, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXIn(List<Integer> values) {
            addCriterion("REVIEW_POS_X in", values, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXNotIn(List<Integer> values) {
            addCriterion("REVIEW_POS_X not in", values, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_POS_X between", value1, value2, "reviewPosX");
            return (Criteria) this;
        }

        public Criteria andReviewPosXNotBetween(Integer value1, Integer value2) {
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

        public Criteria andReviewPosYEqualTo(Integer value) {
            addCriterion("REVIEW_POS_Y =", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYNotEqualTo(Integer value) {
            addCriterion("REVIEW_POS_Y <>", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYGreaterThan(Integer value) {
            addCriterion("REVIEW_POS_Y >", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_POS_Y >=", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYLessThan(Integer value) {
            addCriterion("REVIEW_POS_Y <", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_POS_Y <=", value, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYIn(List<Integer> values) {
            addCriterion("REVIEW_POS_Y in", values, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYNotIn(List<Integer> values) {
            addCriterion("REVIEW_POS_Y not in", values, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_POS_Y between", value1, value2, "reviewPosY");
            return (Criteria) this;
        }

        public Criteria andReviewPosYNotBetween(Integer value1, Integer value2) {
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

        public Criteria andBackgroundThemeEqualTo(Integer value) {
            addCriterion("BACKGROUND_THEME =", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeNotEqualTo(Integer value) {
            addCriterion("BACKGROUND_THEME <>", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeGreaterThan(Integer value) {
            addCriterion("BACKGROUND_THEME >", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BACKGROUND_THEME >=", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeLessThan(Integer value) {
            addCriterion("BACKGROUND_THEME <", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeLessThanOrEqualTo(Integer value) {
            addCriterion("BACKGROUND_THEME <=", value, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeIn(List<Integer> values) {
            addCriterion("BACKGROUND_THEME in", values, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeNotIn(List<Integer> values) {
            addCriterion("BACKGROUND_THEME not in", values, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeBetween(Integer value1, Integer value2) {
            addCriterion("BACKGROUND_THEME between", value1, value2, "backgroundTheme");
            return (Criteria) this;
        }

        public Criteria andBackgroundThemeNotBetween(Integer value1, Integer value2) {
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