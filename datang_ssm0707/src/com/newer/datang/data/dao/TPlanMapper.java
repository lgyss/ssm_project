package com.newer.datang.data.dao;

import com.newer.datang.data.entity.TPlan;
import com.newer.datang.data.entity.TPlanExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int countByExample(TPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int deleteByExample(TPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int deleteByPrimaryKey(BigDecimal planId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int insert(TPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int insertSelective(TPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    List<TPlan> selectByExample(TPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    TPlan selectByPrimaryKey(BigDecimal planId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") TPlan record, @Param("example") TPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int updateByExample(@Param("record") TPlan record, @Param("example") TPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int updateByPrimaryKeySelective(TPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_PLAN
     *
     * @mbggenerated Wed Jul 08 19:18:53 CST 2020
     */
    int updateByPrimaryKey(TPlan record);
}