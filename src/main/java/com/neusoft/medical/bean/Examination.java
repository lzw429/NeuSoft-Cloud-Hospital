package com.neusoft.medical.bean;

public class Examination {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.examination_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private Integer examinationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.registration_name
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private String registrationName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.registration_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private Integer registrationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.charge_item_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private Integer chargeItemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.result
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private String result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.doctor_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private Integer doctorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.department_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private Integer departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.reserve1
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private String reserve1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.reserve2
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private String reserve2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.reserve3
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private String reserve3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..examination.valid
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    private Integer valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..examination
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Examination(Integer examinationId, String registrationName, Integer registrationId, Integer chargeItemId, String result, Integer doctorId, Integer departmentId, String reserve1, String reserve2, String reserve3, Integer valid) {
        this.examinationId = examinationId;
        this.registrationName = registrationName;
        this.registrationId = registrationId;
        this.chargeItemId = chargeItemId;
        this.result = result;
        this.doctorId = doctorId;
        this.departmentId = departmentId;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..examination
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Examination() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.examination_id
     *
     * @return the value of hospital..examination.examination_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Integer getExaminationId() {
        return examinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.examination_id
     *
     * @param examinationId the value for hospital..examination.examination_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.registration_name
     *
     * @return the value of hospital..examination.registration_name
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public String getRegistrationName() {
        return registrationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.registration_name
     *
     * @param registrationName the value for hospital..examination.registration_name
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName == null ? null : registrationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.registration_id
     *
     * @return the value of hospital..examination.registration_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Integer getRegistrationId() {
        return registrationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.registration_id
     *
     * @param registrationId the value for hospital..examination.registration_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.charge_item_id
     *
     * @return the value of hospital..examination.charge_item_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Integer getChargeItemId() {
        return chargeItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.charge_item_id
     *
     * @param chargeItemId the value for hospital..examination.charge_item_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setChargeItemId(Integer chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.result
     *
     * @return the value of hospital..examination.result
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.result
     *
     * @param result the value for hospital..examination.result
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.doctor_id
     *
     * @return the value of hospital..examination.doctor_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Integer getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.doctor_id
     *
     * @param doctorId the value for hospital..examination.doctor_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.department_id
     *
     * @return the value of hospital..examination.department_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.department_id
     *
     * @param departmentId the value for hospital..examination.department_id
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.reserve1
     *
     * @return the value of hospital..examination.reserve1
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.reserve1
     *
     * @param reserve1 the value for hospital..examination.reserve1
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.reserve2
     *
     * @return the value of hospital..examination.reserve2
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.reserve2
     *
     * @param reserve2 the value for hospital..examination.reserve2
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.reserve3
     *
     * @return the value of hospital..examination.reserve3
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.reserve3
     *
     * @param reserve3 the value for hospital..examination.reserve3
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..examination.valid
     *
     * @return the value of hospital..examination.valid
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..examination.valid
     *
     * @param valid the value for hospital..examination.valid
     *
     * @mbggenerated Wed Jun 05 11:50:09 CST 2019
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }
}