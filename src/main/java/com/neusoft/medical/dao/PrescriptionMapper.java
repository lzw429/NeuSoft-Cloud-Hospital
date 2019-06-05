package com.neusoft.medical.dao;

import com.neusoft.medical.bean.Prescription;
import com.neusoft.medical.bean.PrescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PrescriptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    int countByExample(PrescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    int deleteByExample(PrescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    @Delete({
        "delete from hospital..prescription",
        "where presciption_id = #{presciptionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer presciptionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    @Insert({
        "insert into hospital..prescription (presciption_id, registration_id, ",
        "registration_name, doctor_id, ",
        "content, valid, ",
        "reserve1, reserve2, ",
        "reserve3)",
        "values (#{presciptionId,jdbcType=INTEGER}, #{registrationId,jdbcType=INTEGER}, ",
        "#{registrationName,jdbcType=VARCHAR}, #{doctorId,jdbcType=INTEGER}, ",
        "#{content,jdbcType=VARCHAR}, #{valid,jdbcType=INTEGER}, ",
        "#{reserve1,jdbcType=VARCHAR}, #{reserve2,jdbcType=VARCHAR}, ",
        "#{reserve3,jdbcType=VARCHAR})"
    })
    int insert(Prescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    int insertSelective(Prescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    List<Prescription> selectByExample(PrescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    @Select({
        "select",
        "presciption_id, registration_id, registration_name, doctor_id, content, valid, ",
        "reserve1, reserve2, reserve3",
        "from hospital..prescription",
        "where presciption_id = #{presciptionId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Prescription selectByPrimaryKey(Integer presciptionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    int updateByExample(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    int updateByPrimaryKeySelective(Prescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..prescription
     *
     * @mbggenerated Wed Jun 05 11:28:51 CST 2019
     */
    @Update({
        "update hospital..prescription",
        "set registration_id = #{registrationId,jdbcType=INTEGER},",
          "registration_name = #{registrationName,jdbcType=VARCHAR},",
          "doctor_id = #{doctorId,jdbcType=INTEGER},",
          "content = #{content,jdbcType=VARCHAR},",
          "valid = #{valid,jdbcType=INTEGER},",
          "reserve1 = #{reserve1,jdbcType=VARCHAR},",
          "reserve2 = #{reserve2,jdbcType=VARCHAR},",
          "reserve3 = #{reserve3,jdbcType=VARCHAR}",
        "where presciption_id = #{presciptionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Prescription record);
}