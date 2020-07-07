package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AuAuthority {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_AUTHORITY.ID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_AUTHORITY.ROLEID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    private BigDecimal roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_AUTHORITY.FUNCTIONID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    private BigDecimal functionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_AUTHORITY.USERTYPEID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    private BigDecimal usertypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_AUTHORITY.CREATIONTIME
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    private Date creationtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AU_AUTHORITY.CREATEDBY
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    private String createdby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_AUTHORITY.ID
     *
     * @return the value of AU_AUTHORITY.ID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_AUTHORITY.ID
     *
     * @param id the value for AU_AUTHORITY.ID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_AUTHORITY.ROLEID
     *
     * @return the value of AU_AUTHORITY.ROLEID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public BigDecimal getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_AUTHORITY.ROLEID
     *
     * @param roleid the value for AU_AUTHORITY.ROLEID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_AUTHORITY.FUNCTIONID
     *
     * @return the value of AU_AUTHORITY.FUNCTIONID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public BigDecimal getFunctionid() {
        return functionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_AUTHORITY.FUNCTIONID
     *
     * @param functionid the value for AU_AUTHORITY.FUNCTIONID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public void setFunctionid(BigDecimal functionid) {
        this.functionid = functionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_AUTHORITY.USERTYPEID
     *
     * @return the value of AU_AUTHORITY.USERTYPEID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public BigDecimal getUsertypeid() {
        return usertypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_AUTHORITY.USERTYPEID
     *
     * @param usertypeid the value for AU_AUTHORITY.USERTYPEID
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public void setUsertypeid(BigDecimal usertypeid) {
        this.usertypeid = usertypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_AUTHORITY.CREATIONTIME
     *
     * @return the value of AU_AUTHORITY.CREATIONTIME
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_AUTHORITY.CREATIONTIME
     *
     * @param creationtime the value for AU_AUTHORITY.CREATIONTIME
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AU_AUTHORITY.CREATEDBY
     *
     * @return the value of AU_AUTHORITY.CREATEDBY
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AU_AUTHORITY.CREATEDBY
     *
     * @param createdby the value for AU_AUTHORITY.CREATEDBY
     *
     * @mbggenerated Tue Jul 07 18:45:27 CST 2020
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }
}