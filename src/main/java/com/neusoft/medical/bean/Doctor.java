package com.neusoft.medical.bean;

import java.io.Serializable;

public class Doctor implements Serializable {
    private Integer doctorId;

    private String doctorName;

    private Integer departmentId;

    private String jobTitle;

    private Integer accountId;

    private String accountType;

    private Integer doctorScheduling;

    private Integer valid;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private static final long serialVersionUID = 1L;

    public Doctor(Integer doctorId, String doctorName, Integer departmentId, String jobTitle, Integer accountId, String accountType, Integer doctorScheduling, Integer valid, String reserve1, String reserve2, String reserve3) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.departmentId = departmentId;
        this.jobTitle = jobTitle;
        this.accountId = accountId;
        this.accountType = accountType;
        this.doctorScheduling = doctorScheduling;
        this.valid = valid;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    public Doctor() {
        super();
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public Integer getDoctorScheduling() {
        return doctorScheduling;
    }

    public void setDoctorScheduling(Integer doctorScheduling) {
        this.doctorScheduling = doctorScheduling;
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