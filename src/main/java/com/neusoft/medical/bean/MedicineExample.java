package com.neusoft.medical.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        public Criteria andMedicineIdIsNull() {
            addCriterion("medicine_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNotNull() {
            addCriterion("medicine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdEqualTo(Integer value) {
            addCriterion("medicine_id =", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotEqualTo(Integer value) {
            addCriterion("medicine_id <>", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThan(Integer value) {
            addCriterion("medicine_id >", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_id >=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThan(Integer value) {
            addCriterion("medicine_id <", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_id <=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIn(List<Integer> values) {
            addCriterion("medicine_id in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotIn(List<Integer> values) {
            addCriterion("medicine_id not in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id not between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeIsNull() {
            addCriterion("medicine_code is null");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeIsNotNull() {
            addCriterion("medicine_code is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeEqualTo(String value) {
            addCriterion("medicine_code =", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeNotEqualTo(String value) {
            addCriterion("medicine_code <>", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeGreaterThan(String value) {
            addCriterion("medicine_code >", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_code >=", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeLessThan(String value) {
            addCriterion("medicine_code <", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeLessThanOrEqualTo(String value) {
            addCriterion("medicine_code <=", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeLike(String value) {
            addCriterion("medicine_code like", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeNotLike(String value) {
            addCriterion("medicine_code not like", value, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeIn(List<String> values) {
            addCriterion("medicine_code in", values, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeNotIn(List<String> values) {
            addCriterion("medicine_code not in", values, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeBetween(String value1, String value2) {
            addCriterion("medicine_code between", value1, value2, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andMedicineCodeNotBetween(String value1, String value2) {
            addCriterion("medicine_code not between", value1, value2, "medicineCode");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNull() {
            addCriterion("name_zh is null");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNotNull() {
            addCriterion("name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhEqualTo(String value) {
            addCriterion("name_zh =", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotEqualTo(String value) {
            addCriterion("name_zh <>", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThan(String value) {
            addCriterion("name_zh >", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("name_zh >=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThan(String value) {
            addCriterion("name_zh <", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThanOrEqualTo(String value) {
            addCriterion("name_zh <=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLike(String value) {
            addCriterion("name_zh like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotLike(String value) {
            addCriterion("name_zh not like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhIn(List<String> values) {
            addCriterion("name_zh in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotIn(List<String> values) {
            addCriterion("name_zh not in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhBetween(String value1, String value2) {
            addCriterion("name_zh between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotBetween(String value1, String value2) {
            addCriterion("name_zh not between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationIsNull() {
            addCriterion("medicine_specification is null");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationIsNotNull() {
            addCriterion("medicine_specification is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationEqualTo(String value) {
            addCriterion("medicine_specification =", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotEqualTo(String value) {
            addCriterion("medicine_specification <>", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationGreaterThan(String value) {
            addCriterion("medicine_specification >", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_specification >=", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationLessThan(String value) {
            addCriterion("medicine_specification <", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationLessThanOrEqualTo(String value) {
            addCriterion("medicine_specification <=", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationLike(String value) {
            addCriterion("medicine_specification like", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotLike(String value) {
            addCriterion("medicine_specification not like", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationIn(List<String> values) {
            addCriterion("medicine_specification in", values, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotIn(List<String> values) {
            addCriterion("medicine_specification not in", values, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationBetween(String value1, String value2) {
            addCriterion("medicine_specification between", value1, value2, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotBetween(String value1, String value2) {
            addCriterion("medicine_specification not between", value1, value2, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitIsNull() {
            addCriterion("medicine_unit is null");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitIsNotNull() {
            addCriterion("medicine_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitEqualTo(String value) {
            addCriterion("medicine_unit =", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitNotEqualTo(String value) {
            addCriterion("medicine_unit <>", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitGreaterThan(String value) {
            addCriterion("medicine_unit >", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_unit >=", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitLessThan(String value) {
            addCriterion("medicine_unit <", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitLessThanOrEqualTo(String value) {
            addCriterion("medicine_unit <=", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitLike(String value) {
            addCriterion("medicine_unit like", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitNotLike(String value) {
            addCriterion("medicine_unit not like", value, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitIn(List<String> values) {
            addCriterion("medicine_unit in", values, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitNotIn(List<String> values) {
            addCriterion("medicine_unit not in", values, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitBetween(String value1, String value2) {
            addCriterion("medicine_unit between", value1, value2, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineUnitNotBetween(String value1, String value2) {
            addCriterion("medicine_unit not between", value1, value2, "medicineUnit");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerIsNull() {
            addCriterion("medicine_manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerIsNotNull() {
            addCriterion("medicine_manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerEqualTo(String value) {
            addCriterion("medicine_manufacturer =", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotEqualTo(String value) {
            addCriterion("medicine_manufacturer <>", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerGreaterThan(String value) {
            addCriterion("medicine_manufacturer >", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_manufacturer >=", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerLessThan(String value) {
            addCriterion("medicine_manufacturer <", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerLessThanOrEqualTo(String value) {
            addCriterion("medicine_manufacturer <=", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerLike(String value) {
            addCriterion("medicine_manufacturer like", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotLike(String value) {
            addCriterion("medicine_manufacturer not like", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerIn(List<String> values) {
            addCriterion("medicine_manufacturer in", values, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotIn(List<String> values) {
            addCriterion("medicine_manufacturer not in", values, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerBetween(String value1, String value2) {
            addCriterion("medicine_manufacturer between", value1, value2, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotBetween(String value1, String value2) {
            addCriterion("medicine_manufacturer not between", value1, value2, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdIsNull() {
            addCriterion("medicine_dosage_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdIsNotNull() {
            addCriterion("medicine_dosage_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdEqualTo(Integer value) {
            addCriterion("medicine_dosage_id =", value, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdNotEqualTo(Integer value) {
            addCriterion("medicine_dosage_id <>", value, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdGreaterThan(Integer value) {
            addCriterion("medicine_dosage_id >", value, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_dosage_id >=", value, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdLessThan(Integer value) {
            addCriterion("medicine_dosage_id <", value, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_dosage_id <=", value, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdIn(List<Integer> values) {
            addCriterion("medicine_dosage_id in", values, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdNotIn(List<Integer> values) {
            addCriterion("medicine_dosage_id not in", values, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdBetween(Integer value1, Integer value2) {
            addCriterion("medicine_dosage_id between", value1, value2, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_dosage_id not between", value1, value2, "medicineDosageId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdIsNull() {
            addCriterion("medicine_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdIsNotNull() {
            addCriterion("medicine_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdEqualTo(Integer value) {
            addCriterion("medicine_type_id =", value, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdNotEqualTo(Integer value) {
            addCriterion("medicine_type_id <>", value, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdGreaterThan(Integer value) {
            addCriterion("medicine_type_id >", value, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_type_id >=", value, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdLessThan(Integer value) {
            addCriterion("medicine_type_id <", value, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_type_id <=", value, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdIn(List<Integer> values) {
            addCriterion("medicine_type_id in", values, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdNotIn(List<Integer> values) {
            addCriterion("medicine_type_id not in", values, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("medicine_type_id between", value1, value2, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicineTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_type_id not between", value1, value2, "medicineTypeId");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceIsNull() {
            addCriterion("medicine_price is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceIsNotNull() {
            addCriterion("medicine_price is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceEqualTo(Double value) {
            addCriterion("medicine_price =", value, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceNotEqualTo(Double value) {
            addCriterion("medicine_price <>", value, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceGreaterThan(Double value) {
            addCriterion("medicine_price >", value, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("medicine_price >=", value, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceLessThan(Double value) {
            addCriterion("medicine_price <", value, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceLessThanOrEqualTo(Double value) {
            addCriterion("medicine_price <=", value, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceIn(List<Double> values) {
            addCriterion("medicine_price in", values, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceNotIn(List<Double> values) {
            addCriterion("medicine_price not in", values, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceBetween(Double value1, Double value2) {
            addCriterion("medicine_price between", value1, value2, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePriceNotBetween(Double value1, Double value2) {
            addCriterion("medicine_price not between", value1, value2, "medicinePrice");
            return (Criteria) this;
        }

        public Criteria andNamePinyinIsNull() {
            addCriterion("name_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andNamePinyinIsNotNull() {
            addCriterion("name_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andNamePinyinEqualTo(String value) {
            addCriterion("name_pinyin =", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotEqualTo(String value) {
            addCriterion("name_pinyin <>", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinGreaterThan(String value) {
            addCriterion("name_pinyin >", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("name_pinyin >=", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinLessThan(String value) {
            addCriterion("name_pinyin <", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("name_pinyin <=", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinLike(String value) {
            addCriterion("name_pinyin like", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotLike(String value) {
            addCriterion("name_pinyin not like", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinIn(List<String> values) {
            addCriterion("name_pinyin in", values, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotIn(List<String> values) {
            addCriterion("name_pinyin not in", values, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinBetween(String value1, String value2) {
            addCriterion("name_pinyin between", value1, value2, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotBetween(String value1, String value2) {
            addCriterion("name_pinyin not between", value1, value2, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterionForJDBCDate("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterionForJDBCDate("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterionForJDBCDate("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creation_time not between", value1, value2, "creationTime");
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

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
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