package com.neusoft.medical.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchedulingRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSchedulingRuleIdIsNull() {
            addCriterion("scheduling_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdIsNotNull() {
            addCriterion("scheduling_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdEqualTo(Integer value) {
            addCriterion("scheduling_rule_id =", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdNotEqualTo(Integer value) {
            addCriterion("scheduling_rule_id <>", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdGreaterThan(Integer value) {
            addCriterion("scheduling_rule_id >", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduling_rule_id >=", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdLessThan(Integer value) {
            addCriterion("scheduling_rule_id <", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("scheduling_rule_id <=", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdIn(List<Integer> values) {
            addCriterion("scheduling_rule_id in", values, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdNotIn(List<Integer> values) {
            addCriterion("scheduling_rule_id not in", values, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_rule_id between", value1, value2, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_rule_id not between", value1, value2, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNull() {
            addCriterion("weekday is null");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNotNull() {
            addCriterion("weekday is not null");
            return (Criteria) this;
        }

        public Criteria andWeekdayEqualTo(Integer value) {
            addCriterion("weekday =", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotEqualTo(Integer value) {
            addCriterion("weekday <>", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThan(Integer value) {
            addCriterion("weekday >", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekday >=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThan(Integer value) {
            addCriterion("weekday <", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThanOrEqualTo(Integer value) {
            addCriterion("weekday <=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayIn(List<Integer> values) {
            addCriterion("weekday in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotIn(List<Integer> values) {
            addCriterion("weekday not in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayBetween(Integer value1, Integer value2) {
            addCriterion("weekday between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotBetween(Integer value1, Integer value2) {
            addCriterion("weekday not between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdIsNull() {
            addCriterion("registration_category_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdIsNotNull() {
            addCriterion("registration_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdEqualTo(Integer value) {
            addCriterion("registration_category_id =", value, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdNotEqualTo(Integer value) {
            addCriterion("registration_category_id <>", value, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdGreaterThan(Integer value) {
            addCriterion("registration_category_id >", value, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_category_id >=", value, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdLessThan(Integer value) {
            addCriterion("registration_category_id <", value, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("registration_category_id <=", value, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdIn(List<Integer> values) {
            addCriterion("registration_category_id in", values, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdNotIn(List<Integer> values) {
            addCriterion("registration_category_id not in", values, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("registration_category_id between", value1, value2, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_category_id not between", value1, value2, "registrationCategoryId");
            return (Criteria) this;
        }

        public Criteria andNoonIsNull() {
            addCriterion("noon is null");
            return (Criteria) this;
        }

        public Criteria andNoonIsNotNull() {
            addCriterion("noon is not null");
            return (Criteria) this;
        }

        public Criteria andNoonEqualTo(Integer value) {
            addCriterion("noon =", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotEqualTo(Integer value) {
            addCriterion("noon <>", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThan(Integer value) {
            addCriterion("noon >", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThanOrEqualTo(Integer value) {
            addCriterion("noon >=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThan(Integer value) {
            addCriterion("noon <", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThanOrEqualTo(Integer value) {
            addCriterion("noon <=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonIn(List<Integer> values) {
            addCriterion("noon in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotIn(List<Integer> values) {
            addCriterion("noon not in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonBetween(Integer value1, Integer value2) {
            addCriterion("noon between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotBetween(Integer value1, Integer value2) {
            addCriterion("noon not between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andLimitationIsNull() {
            addCriterion("limitation is null");
            return (Criteria) this;
        }

        public Criteria andLimitationIsNotNull() {
            addCriterion("limitation is not null");
            return (Criteria) this;
        }

        public Criteria andLimitationEqualTo(Integer value) {
            addCriterion("limitation =", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationNotEqualTo(Integer value) {
            addCriterion("limitation <>", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationGreaterThan(Integer value) {
            addCriterion("limitation >", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitation >=", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationLessThan(Integer value) {
            addCriterion("limitation <", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationLessThanOrEqualTo(Integer value) {
            addCriterion("limitation <=", value, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationIn(List<Integer> values) {
            addCriterion("limitation in", values, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationNotIn(List<Integer> values) {
            addCriterion("limitation not in", values, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationBetween(Integer value1, Integer value2) {
            addCriterion("limitation between", value1, value2, "limitation");
            return (Criteria) this;
        }

        public Criteria andLimitationNotBetween(Integer value1, Integer value2) {
            addCriterion("limitation not between", value1, value2, "limitation");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdIsNull() {
            addCriterion("operation_account_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdIsNotNull() {
            addCriterion("operation_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdEqualTo(Integer value) {
            addCriterion("operation_account_id =", value, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdNotEqualTo(Integer value) {
            addCriterion("operation_account_id <>", value, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdGreaterThan(Integer value) {
            addCriterion("operation_account_id >", value, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_account_id >=", value, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdLessThan(Integer value) {
            addCriterion("operation_account_id <", value, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("operation_account_id <=", value, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdIn(List<Integer> values) {
            addCriterion("operation_account_id in", values, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdNotIn(List<Integer> values) {
            addCriterion("operation_account_id not in", values, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("operation_account_id between", value1, value2, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_account_id not between", value1, value2, "operationAccountId");
            return (Criteria) this;
        }

        public Criteria andOperationDateIsNull() {
            addCriterion("operation_date is null");
            return (Criteria) this;
        }

        public Criteria andOperationDateIsNotNull() {
            addCriterion("operation_date is not null");
            return (Criteria) this;
        }

        public Criteria andOperationDateEqualTo(Date value) {
            addCriterionForJDBCDate("operation_date =", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("operation_date <>", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("operation_date >", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("operation_date >=", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateLessThan(Date value) {
            addCriterionForJDBCDate("operation_date <", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("operation_date <=", value, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateIn(List<Date> values) {
            addCriterionForJDBCDate("operation_date in", values, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("operation_date not in", values, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("operation_date between", value1, value2, "operationDate");
            return (Criteria) this;
        }

        public Criteria andOperationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("operation_date not between", value1, value2, "operationDate");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}