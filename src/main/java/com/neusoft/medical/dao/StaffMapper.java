package com.neusoft.medical.dao;

import com.neusoft.medical.bean.Staff;
import com.neusoft.medical.bean.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StaffMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    int countByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    int deleteByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    @Delete({
        "delete from hospital..staff",
        "where staff_id = #{staffId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    @Insert({
        "insert into hospital..staff (staff_id, department_name, ",
        "account_id, department_id, ",
        "type, valid, reserve1, ",
        "reserve2, reserve3)",
        "values (#{staffId,jdbcType=INTEGER}, #{departmentName,jdbcType=VARCHAR}, ",
        "#{accountId,jdbcType=INTEGER}, #{departmentId,jdbcType=INTEGER}, ",
        "#{type,jdbcType=INTEGER}, #{valid,jdbcType=INTEGER}, #{reserve1,jdbcType=VARCHAR}, ",
        "#{reserve2,jdbcType=VARCHAR}, #{reserve3,jdbcType=VARCHAR})"
    })
    int insert(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    int insertSelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    List<Staff> selectByExample(StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    @Select({
        "select",
        "staff_id, department_name, account_id, department_id, type, valid, reserve1, ",
        "reserve2, reserve3",
        "from hospital..staff",
        "where staff_id = #{staffId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Staff selectByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    int updateByPrimaryKeySelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..staff
     *
     * @mbggenerated Tue Jun 04 18:07:53 CST 2019
     */
    @Update({
        "update hospital..staff",
        "set department_name = #{departmentName,jdbcType=VARCHAR},",
          "account_id = #{accountId,jdbcType=INTEGER},",
          "department_id = #{departmentId,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "valid = #{valid,jdbcType=INTEGER},",
          "reserve1 = #{reserve1,jdbcType=VARCHAR},",
          "reserve2 = #{reserve2,jdbcType=VARCHAR},",
          "reserve3 = #{reserve3,jdbcType=VARCHAR}",
        "where staff_id = #{staffId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Staff record);
}