package com.neusoft.medical.bean;

public class MedicalRecords {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.medical_records_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private Integer medicalRecordsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.registration_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private Integer registrationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.main_info
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String mainInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.current_disease
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String currentDisease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.current_treatment
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String currentTreatment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.preliminary_western
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String preliminaryWestern;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.preliminary_chinese
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String preliminaryChinese;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.valid
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private Integer valid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.reserve1
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String reserve1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.reserve2
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String reserve2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..medical_records.reserve3
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String reserve3;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..medical_records
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public MedicalRecords(Integer medicalRecordsId, Integer registrationId, String mainInfo, String currentDisease, String currentTreatment, String preliminaryWestern, String preliminaryChinese, Integer valid, String reserve1, String reserve2, String reserve3) {
        this.medicalRecordsId = medicalRecordsId;
        this.registrationId = registrationId;
        this.mainInfo = mainInfo;
        this.currentDisease = currentDisease;
        this.currentTreatment = currentTreatment;
        this.preliminaryWestern = preliminaryWestern;
        this.preliminaryChinese = preliminaryChinese;
        this.valid = valid;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..medical_records
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public MedicalRecords() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.medical_records_id
     *
     * @return the value of hospital..medical_records.medical_records_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public Integer getMedicalRecordsId() {
        return medicalRecordsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.medical_records_id
     *
     * @param medicalRecordsId the value for hospital..medical_records.medical_records_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setMedicalRecordsId(Integer medicalRecordsId) {
        this.medicalRecordsId = medicalRecordsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.registration_id
     *
     * @return the value of hospital..medical_records.registration_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public Integer getRegistrationId() {
        return registrationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.registration_id
     *
     * @param registrationId the value for hospital..medical_records.registration_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.main_info
     *
     * @return the value of hospital..medical_records.main_info
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getMainInfo() {
        return mainInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.main_info
     *
     * @param mainInfo the value for hospital..medical_records.main_info
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setMainInfo(String mainInfo) {
        this.mainInfo = mainInfo == null ? null : mainInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.current_disease
     *
     * @return the value of hospital..medical_records.current_disease
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getCurrentDisease() {
        return currentDisease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.current_disease
     *
     * @param currentDisease the value for hospital..medical_records.current_disease
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setCurrentDisease(String currentDisease) {
        this.currentDisease = currentDisease == null ? null : currentDisease.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.current_treatment
     *
     * @return the value of hospital..medical_records.current_treatment
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getCurrentTreatment() {
        return currentTreatment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.current_treatment
     *
     * @param currentTreatment the value for hospital..medical_records.current_treatment
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setCurrentTreatment(String currentTreatment) {
        this.currentTreatment = currentTreatment == null ? null : currentTreatment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.preliminary_western
     *
     * @return the value of hospital..medical_records.preliminary_western
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getPreliminaryWestern() {
        return preliminaryWestern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.preliminary_western
     *
     * @param preliminaryWestern the value for hospital..medical_records.preliminary_western
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setPreliminaryWestern(String preliminaryWestern) {
        this.preliminaryWestern = preliminaryWestern == null ? null : preliminaryWestern.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.preliminary_chinese
     *
     * @return the value of hospital..medical_records.preliminary_chinese
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getPreliminaryChinese() {
        return preliminaryChinese;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.preliminary_chinese
     *
     * @param preliminaryChinese the value for hospital..medical_records.preliminary_chinese
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setPreliminaryChinese(String preliminaryChinese) {
        this.preliminaryChinese = preliminaryChinese == null ? null : preliminaryChinese.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.valid
     *
     * @return the value of hospital..medical_records.valid
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.valid
     *
     * @param valid the value for hospital..medical_records.valid
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.reserve1
     *
     * @return the value of hospital..medical_records.reserve1
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.reserve1
     *
     * @param reserve1 the value for hospital..medical_records.reserve1
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.reserve2
     *
     * @return the value of hospital..medical_records.reserve2
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.reserve2
     *
     * @param reserve2 the value for hospital..medical_records.reserve2
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..medical_records.reserve3
     *
     * @return the value of hospital..medical_records.reserve3
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..medical_records.reserve3
     *
     * @param reserve3 the value for hospital..medical_records.reserve3
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }
}