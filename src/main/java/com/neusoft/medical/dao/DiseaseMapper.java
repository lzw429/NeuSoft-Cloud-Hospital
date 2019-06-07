package com.neusoft.medical.dao;

import com.neusoft.medical.bean.Disease;
import com.neusoft.medical.bean.DiseaseExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DiseaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    int countByExample(DiseaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    int deleteByExample(DiseaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    @Delete({
            "delete from hospital.disease",
            "where disease_id = #{diseaseId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer diseaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    @Insert({
            "insert into hospital.disease (disease_id, disease_code, ",
            "disease_name, disease_ICD, ",
            "disease_category, valid)",
            "values (#{diseaseId,jdbcType=INTEGER}, #{diseaseCode,jdbcType=VARCHAR}, ",
            "#{diseaseName,jdbcType=VARCHAR}, #{diseaseIcd,jdbcType=VARCHAR}, ",
            "#{diseaseCategory,jdbcType=INTEGER}, #{valid,jdbcType=INTEGER})"
    })
    int insert(Disease record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    int insertSelective(Disease record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    List<Disease> selectByExample(DiseaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    @Select({
            "select",
            "disease_id, disease_code, disease_name, disease_ICD, disease_category, valid",
            "from hospital.disease",
            "where disease_id = #{diseaseId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Disease selectByPrimaryKey(Integer diseaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") Disease record, @Param("example") DiseaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    int updateByExample(@Param("record") Disease record, @Param("example") DiseaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    int updateByPrimaryKeySelective(Disease record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital.disease
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    @Update({
            "update hospital.disease",
            "set disease_code = #{diseaseCode,jdbcType=VARCHAR},",
            "disease_name = #{diseaseName,jdbcType=VARCHAR},",
            "disease_ICD = #{diseaseIcd,jdbcType=VARCHAR},",
            "disease_category = #{diseaseCategory,jdbcType=INTEGER},",
            "valid = #{valid,jdbcType=INTEGER}",
            "where disease_id = #{diseaseId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Disease record);


    /**
     * This method was generated manually by Shu Yiheng.
     * This method is used for testing and works with PageHelper.
     *
     * @return A list of DiseaseCategory
     */
    List<Disease> selectByPageAndSelections();
}