package com.neusoft.medical.bean;

public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..account.account_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private Integer accountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..account.user_name
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..account.user_password
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..account.valid
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private Integer valid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..account.reserve1
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String reserve1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..account.reserve2
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String reserve2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital..account.reserve3
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    private String reserve3;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..account
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public Account(Integer accountId, String userName, String userPassword, Integer valid, String reserve1, String reserve2, String reserve3) {
        this.accountId = accountId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.valid = valid;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital..account
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public Account() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..account.account_id
     *
     * @return the value of hospital..account.account_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..account.account_id
     *
     * @param accountId the value for hospital..account.account_id
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..account.user_name
     *
     * @return the value of hospital..account.user_name
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..account.user_name
     *
     * @param userName the value for hospital..account.user_name
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..account.user_password
     *
     * @return the value of hospital..account.user_password
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..account.user_password
     *
     * @param userPassword the value for hospital..account.user_password
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..account.valid
     *
     * @return the value of hospital..account.valid
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..account.valid
     *
     * @param valid the value for hospital..account.valid
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..account.reserve1
     *
     * @return the value of hospital..account.reserve1
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..account.reserve1
     *
     * @param reserve1 the value for hospital..account.reserve1
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..account.reserve2
     *
     * @return the value of hospital..account.reserve2
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..account.reserve2
     *
     * @param reserve2 the value for hospital..account.reserve2
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital..account.reserve3
     *
     * @return the value of hospital..account.reserve3
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital..account.reserve3
     *
     * @param reserve3 the value for hospital..account.reserve3
     *
     * @mbggenerated Tue Jun 04 11:21:04 CST 2019
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }
}