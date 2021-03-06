package com.neusoft.medical.bean;

import java.io.Serializable;
import java.util.Date;

public class Registration implements Serializable {
    private Integer registrationId;

    private Integer patientId;

    private String patientName;

    private Integer registrationCategoryId;

    private String gender;

    private Integer age;

    private Date birthday;

    private String medicalCategory;

    private String identityCardNo;

    private String registrationStatus;

    private Date visitDate;

    private Date registrationDate;

    private Integer departmentId;

    private Integer doctorId;

    private String registrationSource;

    private Integer settlementCategoryId;

    private String isVisited;

    private String familyAddress;

    private Integer collectorId;

    private Integer totalCharge;

    private Integer valid;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Registration(Integer registrationId, Integer patientId, String patientName, Integer registrationCategoryId, String gender, Integer age, Date birthday, String medicalCategory, String identityCardNo, String registrationStatus, Date visitDate, Date registrationDate, Integer departmentId, Integer doctorId, String registrationSource, Integer settlementCategoryId, String isVisited, String familyAddress, Integer collectorId, Integer totalCharge, Integer valid, String reserve1, String reserve2, String reserve3) {
        this.registrationId = registrationId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.registrationCategoryId = registrationCategoryId;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
        this.medicalCategory = medicalCategory;
        this.identityCardNo = identityCardNo;
        this.registrationStatus = registrationStatus;
        this.visitDate = visitDate;
        this.registrationDate = registrationDate;
        this.departmentId = departmentId;
        this.doctorId = doctorId;
        this.registrationSource = registrationSource;
        this.settlementCategoryId = settlementCategoryId;
        this.isVisited = isVisited;
        this.familyAddress = familyAddress;
        this.collectorId = collectorId;
        this.totalCharge = totalCharge;
        this.valid = valid;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public Registration() {
        super();
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public Integer getRegistrationCategoryId() {
        return registrationCategoryId;
    }

    public void setRegistrationCategoryId(Integer registrationCategoryId) {
        this.registrationCategoryId = registrationCategoryId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMedicalCategory() {
        return medicalCategory;
    }

    public void setMedicalCategory(String medicalCategory) {
        this.medicalCategory = medicalCategory == null ? null : medicalCategory.trim();
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo == null ? null : identityCardNo.trim();
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus == null ? null : registrationStatus.trim();
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getRegistrationSource() {
        return registrationSource;
    }

    public void setRegistrationSource(String registrationSource) {
        this.registrationSource = registrationSource == null ? null : registrationSource.trim();
    }

    public Integer getSettlementCategoryId() {
        return settlementCategoryId;
    }

    public void setSettlementCategoryId(Integer settlementCategoryId) {
        this.settlementCategoryId = settlementCategoryId;
    }

    public String getIsVisited() {
        return isVisited;
    }

    public void setIsVisited(String isVisited) {
        this.isVisited = isVisited == null ? null : isVisited.trim();
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress == null ? null : familyAddress.trim();
    }

    public Integer getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
    }

    public Integer getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Integer totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }
}