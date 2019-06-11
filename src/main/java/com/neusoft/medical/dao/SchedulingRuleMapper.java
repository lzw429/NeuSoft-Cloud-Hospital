package com.neusoft.medical.dao;

import com.neusoft.medical.bean.SchedulingRule;
import com.neusoft.medical.bean.SchedulingRuleExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SchedulingRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    long countByExample(SchedulingRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    int deleteByExample(SchedulingRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    @Delete({
        "delete from hospital.scheduling_rule",
        "where scheduling_rule_id = #{schedulingRuleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer schedulingRuleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    @Insert({
        "insert into hospital.scheduling_rule (scheduling_rule_id, week_day, ",
        "department_id, department_name, ",
        "doctor_id, doctor_name, ",
        "type, valid, period, ",
        "limitation, operator_id, ",
        "operator_name, operating_date)",
        "values (#{schedulingRuleId,jdbcType=INTEGER}, #{weekDay,jdbcType=VARCHAR}, ",
        "#{departmentId,jdbcType=INTEGER}, #{departmentName,jdbcType=VARCHAR}, ",
        "#{doctorId,jdbcType=INTEGER}, #{doctorName,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{valid,jdbcType=INTEGER}, #{period,jdbcType=VARCHAR}, ",
        "#{limitation,jdbcType=INTEGER}, #{operatorId,jdbcType=INTEGER}, ",
        "#{operatorName,jdbcType=VARCHAR}, #{operatingDate,jdbcType=DATE})"
    })
    int insert(SchedulingRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    int insertSelective(SchedulingRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    List<SchedulingRule> selectByExample(SchedulingRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    @Select({
        "select",
        "scheduling_rule_id, week_day, department_id, department_name, doctor_id, doctor_name, ",
        "type, valid, period, limitation, operator_id, operator_name, operating_date",
        "from hospital.scheduling_rule",
        "where scheduling_rule_id = #{schedulingRuleId,jdbcType=INTEGER}"
    })
    @ResultMap("com.neusoft.medical.dao.SchedulingRuleMapper.BaseResultMap")
    SchedulingRule selectByPrimaryKey(Integer schedulingRuleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    int updateByExampleSelective(@Param("record") SchedulingRule record, @Param("example") SchedulingRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    int updateByExample(@Param("record") SchedulingRule record, @Param("example") SchedulingRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    int updateByPrimaryKeySelective(SchedulingRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.scheduling_rule
     *
     * @mbg.generated Mon Jun 10 18:44:57 CST 2019
     */
    @Update({
        "update hospital.scheduling_rule",
        "set week_day = #{weekDay,jdbcType=VARCHAR},",
          "department_id = #{departmentId,jdbcType=INTEGER},",
          "department_name = #{departmentName,jdbcType=VARCHAR},",
          "doctor_id = #{doctorId,jdbcType=INTEGER},",
          "doctor_name = #{doctorName,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "valid = #{valid,jdbcType=INTEGER},",
          "period = #{period,jdbcType=VARCHAR},",
          "limitation = #{limitation,jdbcType=INTEGER},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "operator_name = #{operatorName,jdbcType=VARCHAR},",
          "operating_date = #{operatingDate,jdbcType=DATE}",
        "where scheduling_rule_id = #{schedulingRuleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SchedulingRule record);
}