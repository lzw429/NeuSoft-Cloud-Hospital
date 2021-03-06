package com.neusoft.medical.dao;

import com.neusoft.medical.bean.Examination;
import com.neusoft.medical.bean.ExaminationExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ExaminationMapper {
    long countByExample(ExaminationExample example);

    int deleteByExample(ExaminationExample example);

    @Delete({
        "delete from hospital.examination",
        "where examination_id = #{examinationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer examinationId);

    @Insert({
        "insert into hospital.examination (registration_id, patient_name, ",
        "doctor_id, department_id, ",
        "save_state, pay_state, ",
        "execution_state, exam_name, ",
        "clinical_impression, requirement, ",
        "exam_result, valid, ",
        "reserve1, reserve2, ",
        "reserve3)",
        "values (#{registrationId,jdbcType=INTEGER}, #{patientName,jdbcType=VARCHAR}, ",
        "#{doctorId,jdbcType=INTEGER}, #{departmentId,jdbcType=INTEGER}, ",
        "#{saveState,jdbcType=INTEGER}, #{payState,jdbcType=INTEGER}, ",
        "#{executionState,jdbcType=INTEGER}, #{examName,jdbcType=VARCHAR}, ",
        "#{clinicalImpression,jdbcType=VARCHAR}, #{requirement,jdbcType=VARCHAR}, ",
        "#{examResult,jdbcType=VARCHAR}, #{valid,jdbcType=INTEGER}, ",
        "#{reserve1,jdbcType=VARCHAR}, #{reserve2,jdbcType=VARCHAR}, ",
        "#{reserve3,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="examinationId", before=false, resultType=Integer.class)
    int insert(Examination record);

    int insertSelective(Examination record);

    List<Examination> selectByExample(ExaminationExample example);

    @Select({
        "select",
        "examination_id, registration_id, patient_name, doctor_id, department_id, save_state, ",
        "pay_state, execution_state, exam_name, clinical_impression, requirement, exam_result, ",
        "valid, reserve1, reserve2, reserve3",
        "from hospital.examination",
        "where examination_id = #{examinationId,jdbcType=INTEGER}"
    })
    @ResultMap("com.neusoft.medical.dao.ExaminationMapper.BaseResultMap")
    Examination selectByPrimaryKey(Integer examinationId);

    int updateByExampleSelective(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByExample(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByPrimaryKeySelective(Examination record);

    @Update({
        "update hospital.examination",
        "set registration_id = #{registrationId,jdbcType=INTEGER},",
          "patient_name = #{patientName,jdbcType=VARCHAR},",
          "doctor_id = #{doctorId,jdbcType=INTEGER},",
          "department_id = #{departmentId,jdbcType=INTEGER},",
          "save_state = #{saveState,jdbcType=INTEGER},",
          "pay_state = #{payState,jdbcType=INTEGER},",
          "execution_state = #{executionState,jdbcType=INTEGER},",
          "exam_name = #{examName,jdbcType=VARCHAR},",
          "clinical_impression = #{clinicalImpression,jdbcType=VARCHAR},",
          "requirement = #{requirement,jdbcType=VARCHAR},",
          "exam_result = #{examResult,jdbcType=VARCHAR},",
          "valid = #{valid,jdbcType=INTEGER},",
          "reserve1 = #{reserve1,jdbcType=VARCHAR},",
          "reserve2 = #{reserve2,jdbcType=VARCHAR},",
          "reserve3 = #{reserve3,jdbcType=VARCHAR}",
        "where examination_id = #{examinationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Examination record);
}