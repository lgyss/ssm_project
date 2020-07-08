package com.newer.datang.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TPlan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.PLAN_ID
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private BigDecimal planId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.PLAN_NAME
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private String planName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.STATUS
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.IS_FEEDBACK
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private String isFeedback;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.BEGIN_DATE
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private Date beginDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.END_DATE
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private Date endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.TASK_ID
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private BigDecimal taskId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.FEEDBACK_INFO
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private String feedbackInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN.PLAN_DESC
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    private String planDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.PLAN_ID
     *
     * @return the value of T_PLAN.PLAN_ID
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public BigDecimal getPlanId() {
        return planId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.PLAN_ID
     *
     * @param planId the value for T_PLAN.PLAN_ID
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setPlanId(BigDecimal planId) {
        this.planId = planId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.PLAN_NAME
     *
     * @return the value of T_PLAN.PLAN_NAME
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.PLAN_NAME
     *
     * @param planName the value for T_PLAN.PLAN_NAME
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.STATUS
     *
     * @return the value of T_PLAN.STATUS
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.STATUS
     *
     * @param status the value for T_PLAN.STATUS
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.IS_FEEDBACK
     *
     * @return the value of T_PLAN.IS_FEEDBACK
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public String getIsFeedback() {
        return isFeedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.IS_FEEDBACK
     *
     * @param isFeedback the value for T_PLAN.IS_FEEDBACK
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setIsFeedback(String isFeedback) {
        this.isFeedback = isFeedback == null ? null : isFeedback.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.BEGIN_DATE
     *
     * @return the value of T_PLAN.BEGIN_DATE
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.BEGIN_DATE
     *
     * @param beginDate the value for T_PLAN.BEGIN_DATE
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.END_DATE
     *
     * @return the value of T_PLAN.END_DATE
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.END_DATE
     *
     * @param endDate the value for T_PLAN.END_DATE
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.TASK_ID
     *
     * @return the value of T_PLAN.TASK_ID
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public BigDecimal getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.TASK_ID
     *
     * @param taskId the value for T_PLAN.TASK_ID
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setTaskId(BigDecimal taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.FEEDBACK_INFO
     *
     * @return the value of T_PLAN.FEEDBACK_INFO
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public String getFeedbackInfo() {
        return feedbackInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.FEEDBACK_INFO
     *
     * @param feedbackInfo the value for T_PLAN.FEEDBACK_INFO
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setFeedbackInfo(String feedbackInfo) {
        this.feedbackInfo = feedbackInfo == null ? null : feedbackInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN.PLAN_DESC
     *
     * @return the value of T_PLAN.PLAN_DESC
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public String getPlanDesc() {
        return planDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN.PLAN_DESC
     *
     * @param planDesc the value for T_PLAN.PLAN_DESC
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    public void setPlanDesc(String planDesc) {
        this.planDesc = planDesc == null ? null : planDesc.trim();
    }
}