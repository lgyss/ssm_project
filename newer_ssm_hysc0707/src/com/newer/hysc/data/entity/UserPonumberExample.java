package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPonumberExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public UserPonumberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
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

        public Criteria andPonumberIdIsNull() {
            addCriterion("PONUMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPonumberIdIsNotNull() {
            addCriterion("PONUMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPonumberIdEqualTo(String value) {
            addCriterion("PONUMBER_ID =", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdNotEqualTo(String value) {
            addCriterion("PONUMBER_ID <>", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdGreaterThan(String value) {
            addCriterion("PONUMBER_ID >", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdGreaterThanOrEqualTo(String value) {
            addCriterion("PONUMBER_ID >=", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdLessThan(String value) {
            addCriterion("PONUMBER_ID <", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdLessThanOrEqualTo(String value) {
            addCriterion("PONUMBER_ID <=", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdLike(String value) {
            addCriterion("PONUMBER_ID like", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdNotLike(String value) {
            addCriterion("PONUMBER_ID not like", value, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdIn(List<String> values) {
            addCriterion("PONUMBER_ID in", values, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdNotIn(List<String> values) {
            addCriterion("PONUMBER_ID not in", values, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdBetween(String value1, String value2) {
            addCriterion("PONUMBER_ID between", value1, value2, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andPonumberIdNotBetween(String value1, String value2) {
            addCriterion("PONUMBER_ID not between", value1, value2, "ponumberId");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNull() {
            addCriterion("BUY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("BUY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(Date value) {
            addCriterion("BUY_TIME =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(Date value) {
            addCriterion("BUY_TIME <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(Date value) {
            addCriterion("BUY_TIME >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUY_TIME >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(Date value) {
            addCriterion("BUY_TIME <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUY_TIME <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<Date> values) {
            addCriterion("BUY_TIME in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<Date> values) {
            addCriterion("BUY_TIME not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(Date value1, Date value2) {
            addCriterion("BUY_TIME between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUY_TIME not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdIsNull() {
            addCriterion("BONUS_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdIsNotNull() {
            addCriterion("BONUS_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdEqualTo(String value) {
            addCriterion("BONUS_USER_ID =", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotEqualTo(String value) {
            addCriterion("BONUS_USER_ID <>", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdGreaterThan(String value) {
            addCriterion("BONUS_USER_ID >", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_USER_ID >=", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdLessThan(String value) {
            addCriterion("BONUS_USER_ID <", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdLessThanOrEqualTo(String value) {
            addCriterion("BONUS_USER_ID <=", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdLike(String value) {
            addCriterion("BONUS_USER_ID like", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotLike(String value) {
            addCriterion("BONUS_USER_ID not like", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdIn(List<String> values) {
            addCriterion("BONUS_USER_ID in", values, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotIn(List<String> values) {
            addCriterion("BONUS_USER_ID not in", values, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdBetween(String value1, String value2) {
            addCriterion("BONUS_USER_ID between", value1, value2, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotBetween(String value1, String value2) {
            addCriterion("BONUS_USER_ID not between", value1, value2, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNull() {
            addCriterion("BUY_PV is null");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNotNull() {
            addCriterion("BUY_PV is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPvEqualTo(BigDecimal value) {
            addCriterion("BUY_PV =", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <>", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThan(BigDecimal value) {
            addCriterion("BUY_PV >", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV >=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThan(BigDecimal value) {
            addCriterion("BUY_PV <", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvIn(List<BigDecimal> values) {
            addCriterion("BUY_PV in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotIn(List<BigDecimal> values) {
            addCriterion("BUY_PV not in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV not between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBonusRateIsNull() {
            addCriterion("BONUS_RATE is null");
            return (Criteria) this;
        }

        public Criteria andBonusRateIsNotNull() {
            addCriterion("BONUS_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andBonusRateEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE =", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE <>", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateGreaterThan(BigDecimal value) {
            addCriterion("BONUS_RATE >", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE >=", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateLessThan(BigDecimal value) {
            addCriterion("BONUS_RATE <", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE <=", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateIn(List<BigDecimal> values) {
            addCriterion("BONUS_RATE in", values, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotIn(List<BigDecimal> values) {
            addCriterion("BONUS_RATE not in", values, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_RATE between", value1, value2, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_RATE not between", value1, value2, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusPvIsNull() {
            addCriterion("BONUS_PV is null");
            return (Criteria) this;
        }

        public Criteria andBonusPvIsNotNull() {
            addCriterion("BONUS_PV is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPvEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV =", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvNotEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV <>", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvGreaterThan(BigDecimal value) {
            addCriterion("BONUS_PV >", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV >=", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvLessThan(BigDecimal value) {
            addCriterion("BONUS_PV <", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV <=", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvIn(List<BigDecimal> values) {
            addCriterion("BONUS_PV in", values, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvNotIn(List<BigDecimal> values) {
            addCriterion("BONUS_PV not in", values, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_PV between", value1, value2, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_PV not between", value1, value2, "bonusPv");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 07 18:43:53 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_PONUMBER
     *
     * @mbggenerated Tue Jul 07 18:43:53 CST 2020
     */
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