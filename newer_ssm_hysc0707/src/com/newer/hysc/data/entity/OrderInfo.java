package com.newer.hysc.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.ORDER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.LIST_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String listId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.ORDER_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.ORDER_SN
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.PICK_USER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String pickUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.REPEAT_PV
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private BigDecimal repeatPv;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.BASE_PV
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private BigDecimal basePv;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.SERVICE_FEE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private BigDecimal serviceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.SHIP_FRE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private BigDecimal shipFre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.TAX
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private BigDecimal tax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.COUNTRY
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.TEL
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.MOBILE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.EMAIL
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.USER_ADDRESS
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String userAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.POSTCODE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String postcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.STAT
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private Integer stat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.SHIP_TYPE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String shipType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.SHIP_NUM
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String shipNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.SHIP_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private Date shipTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.RECEIVE_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private Date receiveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.SHIP_NOTE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String shipNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_INFO.BUY_USER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    private String buyUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.ORDER_ID
     *
     * @return the value of ORDER_INFO.ORDER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.ORDER_ID
     *
     * @param orderId the value for ORDER_INFO.ORDER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.LIST_ID
     *
     * @return the value of ORDER_INFO.LIST_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getListId() {
        return listId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.LIST_ID
     *
     * @param listId the value for ORDER_INFO.LIST_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setListId(String listId) {
        this.listId = listId == null ? null : listId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.ORDER_TIME
     *
     * @return the value of ORDER_INFO.ORDER_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.ORDER_TIME
     *
     * @param orderTime the value for ORDER_INFO.ORDER_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.ORDER_SN
     *
     * @return the value of ORDER_INFO.ORDER_SN
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.ORDER_SN
     *
     * @param orderSn the value for ORDER_INFO.ORDER_SN
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.PICK_USER_ID
     *
     * @return the value of ORDER_INFO.PICK_USER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getPickUserId() {
        return pickUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.PICK_USER_ID
     *
     * @param pickUserId the value for ORDER_INFO.PICK_USER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setPickUserId(String pickUserId) {
        this.pickUserId = pickUserId == null ? null : pickUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.REPEAT_PV
     *
     * @return the value of ORDER_INFO.REPEAT_PV
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public BigDecimal getRepeatPv() {
        return repeatPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.REPEAT_PV
     *
     * @param repeatPv the value for ORDER_INFO.REPEAT_PV
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setRepeatPv(BigDecimal repeatPv) {
        this.repeatPv = repeatPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.BASE_PV
     *
     * @return the value of ORDER_INFO.BASE_PV
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public BigDecimal getBasePv() {
        return basePv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.BASE_PV
     *
     * @param basePv the value for ORDER_INFO.BASE_PV
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setBasePv(BigDecimal basePv) {
        this.basePv = basePv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.SERVICE_FEE
     *
     * @return the value of ORDER_INFO.SERVICE_FEE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.SERVICE_FEE
     *
     * @param serviceFee the value for ORDER_INFO.SERVICE_FEE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.SHIP_FRE
     *
     * @return the value of ORDER_INFO.SHIP_FRE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public BigDecimal getShipFre() {
        return shipFre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.SHIP_FRE
     *
     * @param shipFre the value for ORDER_INFO.SHIP_FRE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setShipFre(BigDecimal shipFre) {
        this.shipFre = shipFre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.TAX
     *
     * @return the value of ORDER_INFO.TAX
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.TAX
     *
     * @param tax the value for ORDER_INFO.TAX
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.COUNTRY
     *
     * @return the value of ORDER_INFO.COUNTRY
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.COUNTRY
     *
     * @param country the value for ORDER_INFO.COUNTRY
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.TEL
     *
     * @return the value of ORDER_INFO.TEL
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.TEL
     *
     * @param tel the value for ORDER_INFO.TEL
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.MOBILE
     *
     * @return the value of ORDER_INFO.MOBILE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.MOBILE
     *
     * @param mobile the value for ORDER_INFO.MOBILE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.EMAIL
     *
     * @return the value of ORDER_INFO.EMAIL
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.EMAIL
     *
     * @param email the value for ORDER_INFO.EMAIL
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.USER_ADDRESS
     *
     * @return the value of ORDER_INFO.USER_ADDRESS
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.USER_ADDRESS
     *
     * @param userAddress the value for ORDER_INFO.USER_ADDRESS
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.POSTCODE
     *
     * @return the value of ORDER_INFO.POSTCODE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.POSTCODE
     *
     * @param postcode the value for ORDER_INFO.POSTCODE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.STAT
     *
     * @return the value of ORDER_INFO.STAT
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.STAT
     *
     * @param stat the value for ORDER_INFO.STAT
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.SHIP_TYPE
     *
     * @return the value of ORDER_INFO.SHIP_TYPE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.SHIP_TYPE
     *
     * @param shipType the value for ORDER_INFO.SHIP_TYPE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setShipType(String shipType) {
        this.shipType = shipType == null ? null : shipType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.SHIP_NUM
     *
     * @return the value of ORDER_INFO.SHIP_NUM
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getShipNum() {
        return shipNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.SHIP_NUM
     *
     * @param shipNum the value for ORDER_INFO.SHIP_NUM
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setShipNum(String shipNum) {
        this.shipNum = shipNum == null ? null : shipNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.SHIP_TIME
     *
     * @return the value of ORDER_INFO.SHIP_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.SHIP_TIME
     *
     * @param shipTime the value for ORDER_INFO.SHIP_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.RECEIVE_TIME
     *
     * @return the value of ORDER_INFO.RECEIVE_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.RECEIVE_TIME
     *
     * @param receiveTime the value for ORDER_INFO.RECEIVE_TIME
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.SHIP_NOTE
     *
     * @return the value of ORDER_INFO.SHIP_NOTE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getShipNote() {
        return shipNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.SHIP_NOTE
     *
     * @param shipNote the value for ORDER_INFO.SHIP_NOTE
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setShipNote(String shipNote) {
        this.shipNote = shipNote == null ? null : shipNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_INFO.BUY_USER_ID
     *
     * @return the value of ORDER_INFO.BUY_USER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public String getBuyUserId() {
        return buyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_INFO.BUY_USER_ID
     *
     * @param buyUserId the value for ORDER_INFO.BUY_USER_ID
     *
     * @mbggenerated Tue Jul 07 18:38:53 CST 2020
     */
    public void setBuyUserId(String buyUserId) {
        this.buyUserId = buyUserId == null ? null : buyUserId.trim();
    }
}