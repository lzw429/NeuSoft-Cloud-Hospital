package com.neusoft.medical.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargeEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeEntryExample() {
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

        public Criteria andChargeEntryIdIsNull() {
            addCriterion("charge_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdIsNotNull() {
            addCriterion("charge_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdEqualTo(Integer value) {
            addCriterion("charge_entry_id =", value, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdNotEqualTo(Integer value) {
            addCriterion("charge_entry_id <>", value, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdGreaterThan(Integer value) {
            addCriterion("charge_entry_id >", value, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_entry_id >=", value, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdLessThan(Integer value) {
            addCriterion("charge_entry_id <", value, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_entry_id <=", value, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdIn(List<Integer> values) {
            addCriterion("charge_entry_id in", values, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdNotIn(List<Integer> values) {
            addCriterion("charge_entry_id not in", values, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_entry_id between", value1, value2, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_entry_id not between", value1, value2, "chargeEntryId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIsNull() {
            addCriterion("registration_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIsNotNull() {
            addCriterion("registration_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdEqualTo(Integer value) {
            addCriterion("registration_id =", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotEqualTo(Integer value) {
            addCriterion("registration_id <>", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThan(Integer value) {
            addCriterion("registration_id >", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_id >=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThan(Integer value) {
            addCriterion("registration_id <", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThanOrEqualTo(Integer value) {
            addCriterion("registration_id <=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIn(List<Integer> values) {
            addCriterion("registration_id in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotIn(List<Integer> values) {
            addCriterion("registration_id not in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdBetween(Integer value1, Integer value2) {
            addCriterion("registration_id between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_id not between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdIsNull() {
            addCriterion("charge_form_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdIsNotNull() {
            addCriterion("charge_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdEqualTo(Integer value) {
            addCriterion("charge_form_id =", value, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdNotEqualTo(Integer value) {
            addCriterion("charge_form_id <>", value, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdGreaterThan(Integer value) {
            addCriterion("charge_form_id >", value, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_form_id >=", value, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdLessThan(Integer value) {
            addCriterion("charge_form_id <", value, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_form_id <=", value, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdIn(List<Integer> values) {
            addCriterion("charge_form_id in", values, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdNotIn(List<Integer> values) {
            addCriterion("charge_form_id not in", values, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_form_id between", value1, value2, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_form_id not between", value1, value2, "chargeFormId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdIsNull() {
            addCriterion("charge_item_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdIsNotNull() {
            addCriterion("charge_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdEqualTo(Integer value) {
            addCriterion("charge_item_id =", value, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdNotEqualTo(Integer value) {
            addCriterion("charge_item_id <>", value, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdGreaterThan(Integer value) {
            addCriterion("charge_item_id >", value, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_item_id >=", value, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdLessThan(Integer value) {
            addCriterion("charge_item_id <", value, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_item_id <=", value, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdIn(List<Integer> values) {
            addCriterion("charge_item_id in", values, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdNotIn(List<Integer> values) {
            addCriterion("charge_item_id not in", values, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_item_id between", value1, value2, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andChargeItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_item_id not between", value1, value2, "chargeItemId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIsNull() {
            addCriterion("examination_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIsNotNull() {
            addCriterion("examination_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdEqualTo(Integer value) {
            addCriterion("examination_id =", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotEqualTo(Integer value) {
            addCriterion("examination_id <>", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThan(Integer value) {
            addCriterion("examination_id >", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_id >=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThan(Integer value) {
            addCriterion("examination_id <", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThanOrEqualTo(Integer value) {
            addCriterion("examination_id <=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIn(List<Integer> values) {
            addCriterion("examination_id in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotIn(List<Integer> values) {
            addCriterion("examination_id not in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdBetween(Integer value1, Integer value2) {
            addCriterion("examination_id between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_id not between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Double value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Double value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Double value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Double value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Double> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Double> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Double value1, Double value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andNumsIsNull() {
            addCriterion("nums is null");
            return (Criteria) this;
        }

        public Criteria andNumsIsNotNull() {
            addCriterion("nums is not null");
            return (Criteria) this;
        }

        public Criteria andNumsEqualTo(Integer value) {
            addCriterion("nums =", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsNotEqualTo(Integer value) {
            addCriterion("nums <>", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsGreaterThan(Integer value) {
            addCriterion("nums >", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("nums >=", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsLessThan(Integer value) {
            addCriterion("nums <", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsLessThanOrEqualTo(Integer value) {
            addCriterion("nums <=", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsIn(List<Integer> values) {
            addCriterion("nums in", values, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsNotIn(List<Integer> values) {
            addCriterion("nums not in", values, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsBetween(Integer value1, Integer value2) {
            addCriterion("nums between", value1, value2, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("nums not between", value1, value2, "nums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsIsNull() {
            addCriterion("uncharged_nums is null");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsIsNotNull() {
            addCriterion("uncharged_nums is not null");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsEqualTo(Integer value) {
            addCriterion("uncharged_nums =", value, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsNotEqualTo(Integer value) {
            addCriterion("uncharged_nums <>", value, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsGreaterThan(Integer value) {
            addCriterion("uncharged_nums >", value, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("uncharged_nums >=", value, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsLessThan(Integer value) {
            addCriterion("uncharged_nums <", value, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsLessThanOrEqualTo(Integer value) {
            addCriterion("uncharged_nums <=", value, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsIn(List<Integer> values) {
            addCriterion("uncharged_nums in", values, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsNotIn(List<Integer> values) {
            addCriterion("uncharged_nums not in", values, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsBetween(Integer value1, Integer value2) {
            addCriterion("uncharged_nums between", value1, value2, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andUnchargedNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("uncharged_nums not between", value1, value2, "unchargedNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsIsNull() {
            addCriterion("not_given_nums is null");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsIsNotNull() {
            addCriterion("not_given_nums is not null");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsEqualTo(Integer value) {
            addCriterion("not_given_nums =", value, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsNotEqualTo(Integer value) {
            addCriterion("not_given_nums <>", value, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsGreaterThan(Integer value) {
            addCriterion("not_given_nums >", value, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_given_nums >=", value, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsLessThan(Integer value) {
            addCriterion("not_given_nums <", value, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsLessThanOrEqualTo(Integer value) {
            addCriterion("not_given_nums <=", value, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsIn(List<Integer> values) {
            addCriterion("not_given_nums in", values, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsNotIn(List<Integer> values) {
            addCriterion("not_given_nums not in", values, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsBetween(Integer value1, Integer value2) {
            addCriterion("not_given_nums between", value1, value2, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andNotGivenNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("not_given_nums not between", value1, value2, "notGivenNums");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(Integer value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(Integer value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(Integer value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(Integer value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<Integer> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<Integer> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(Integer value1, Integer value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andMadeTimeIsNull() {
            addCriterion("made_time is null");
            return (Criteria) this;
        }

        public Criteria andMadeTimeIsNotNull() {
            addCriterion("made_time is not null");
            return (Criteria) this;
        }

        public Criteria andMadeTimeEqualTo(Date value) {
            addCriterion("made_time =", value, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeNotEqualTo(Date value) {
            addCriterion("made_time <>", value, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeGreaterThan(Date value) {
            addCriterion("made_time >", value, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("made_time >=", value, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeLessThan(Date value) {
            addCriterion("made_time <", value, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeLessThanOrEqualTo(Date value) {
            addCriterion("made_time <=", value, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeIn(List<Date> values) {
            addCriterion("made_time in", values, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeNotIn(List<Date> values) {
            addCriterion("made_time not in", values, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeBetween(Date value1, Date value2) {
            addCriterion("made_time between", value1, value2, "madeTime");
            return (Criteria) this;
        }

        public Criteria andMadeTimeNotBetween(Date value1, Date value2) {
            addCriterion("made_time not between", value1, value2, "madeTime");
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

        public Criteria andCollectorIdIsNull() {
            addCriterion("collector_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectorIdIsNotNull() {
            addCriterion("collector_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectorIdEqualTo(Integer value) {
            addCriterion("collector_id =", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdNotEqualTo(Integer value) {
            addCriterion("collector_id <>", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdGreaterThan(Integer value) {
            addCriterion("collector_id >", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collector_id >=", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdLessThan(Integer value) {
            addCriterion("collector_id <", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdLessThanOrEqualTo(Integer value) {
            addCriterion("collector_id <=", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdIn(List<Integer> values) {
            addCriterion("collector_id in", values, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdNotIn(List<Integer> values) {
            addCriterion("collector_id not in", values, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdBetween(Integer value1, Integer value2) {
            addCriterion("collector_id between", value1, value2, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collector_id not between", value1, value2, "collectorId");
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

        public Criteria andDoctorAdviceIsNull() {
            addCriterion("doctor_advice is null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIsNotNull() {
            addCriterion("doctor_advice is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceEqualTo(String value) {
            addCriterion("doctor_advice =", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotEqualTo(String value) {
            addCriterion("doctor_advice <>", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThan(String value) {
            addCriterion("doctor_advice >", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_advice >=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThan(String value) {
            addCriterion("doctor_advice <", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThanOrEqualTo(String value) {
            addCriterion("doctor_advice <=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLike(String value) {
            addCriterion("doctor_advice like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotLike(String value) {
            addCriterion("doctor_advice not like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIn(List<String> values) {
            addCriterion("doctor_advice in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotIn(List<String> values) {
            addCriterion("doctor_advice not in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceBetween(String value1, String value2) {
            addCriterion("doctor_advice between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotBetween(String value1, String value2) {
            addCriterion("doctor_advice not between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNull() {
            addCriterion("reserve1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("reserve1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("reserve1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("reserve1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("reserve1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("reserve1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("reserve1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("reserve1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("reserve1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("reserve1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("reserve1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("reserve1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("reserve1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("reserve1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("reserve2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("reserve2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("reserve2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("reserve2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("reserve2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("reserve2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("reserve2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("reserve2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("reserve2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("reserve2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("reserve2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("reserve2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("reserve2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("reserve2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("reserve3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("reserve3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("reserve3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("reserve3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("reserve3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("reserve3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("reserve3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("reserve3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("reserve3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("reserve3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("reserve3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("reserve3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("reserve3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("reserve3 not between", value1, value2, "reserve3");
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