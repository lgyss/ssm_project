package com.newer.hysc.data.dao;

import com.newer.hysc.data.entity.LeaveMessage;
import com.newer.hysc.data.entity.LeaveMessageExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int countByExample(LeaveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int deleteByExample(LeaveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int insert(LeaveMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int insertSelective(LeaveMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    List<LeaveMessage> selectByExample(LeaveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    LeaveMessage selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int updateByExampleSelective(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int updateByExample(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int updateByPrimaryKeySelective(LeaveMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LEAVE_MESSAGE
     *
     * @mbggenerated Tue Jul 07 18:48:20 CST 2020
     */
    int updateByPrimaryKey(LeaveMessage record);
}