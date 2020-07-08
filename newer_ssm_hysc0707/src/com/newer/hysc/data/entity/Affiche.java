package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Affiche {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.ID
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.CODE
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.TITLE
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.CONTENT
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.PUBLISHER
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private String publisher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.PUBLISHTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private Date publishtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.STARTTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFFICHE.ENDTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    private Date endtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.ID
     *
     * @return the value of AFFICHE.ID
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.ID
     *
     * @param id the value for AFFICHE.ID
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.CODE
     *
     * @return the value of AFFICHE.CODE
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.CODE
     *
     * @param code the value for AFFICHE.CODE
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.TITLE
     *
     * @return the value of AFFICHE.TITLE
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.TITLE
     *
     * @param title the value for AFFICHE.TITLE
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.CONTENT
     *
     * @return the value of AFFICHE.CONTENT
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.CONTENT
     *
     * @param content the value for AFFICHE.CONTENT
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.PUBLISHER
     *
     * @return the value of AFFICHE.PUBLISHER
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.PUBLISHER
     *
     * @param publisher the value for AFFICHE.PUBLISHER
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.PUBLISHTIME
     *
     * @return the value of AFFICHE.PUBLISHTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public Date getPublishtime() {
        return publishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.PUBLISHTIME
     *
     * @param publishtime the value for AFFICHE.PUBLISHTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.STARTTIME
     *
     * @return the value of AFFICHE.STARTTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.STARTTIME
     *
     * @param starttime the value for AFFICHE.STARTTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFFICHE.ENDTIME
     *
     * @return the value of AFFICHE.ENDTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFFICHE.ENDTIME
     *
     * @param endtime the value for AFFICHE.ENDTIME
     *
     * @mbggenerated Tue Jul 07 18:45:14 CST 2020
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}