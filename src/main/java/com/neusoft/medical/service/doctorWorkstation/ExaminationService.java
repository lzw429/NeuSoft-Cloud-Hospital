package com.neusoft.medical.service.doctorWorkstation;

import com.neusoft.medical.bean.ChargeItem;
import com.neusoft.medical.bean.Examination;

import java.util.List;

public interface ExaminationService {

    /**
     * 新增检查检验项目
     *
     * @param examinationJson 检查检验项目信息，json 字符串
     * @return 操作结果
     * examinationJson 中包含的属性如下：
     * - registrationId 挂号单编号
     * - saveState 保存状态（暂存 0；正式提交 1；全院模板 2；科室模板 3；医生个人模板 4）
     * - examName 检查名称
     * - clinicalImpression 临床印象
     * - requirement 目的和要求
     * - examResult 检验报告
     * - chargeEntryList 收费项目列表，以 json 数组表示
     * chargeEntryList 数组中的每项元素包含的属性如下：
     * - registrationId 挂号单编号
     * - chargeItemId 收费项目编号
     * - nums 收费项目计数
     * - collectorId 收费员编号
     * - doctorAdvice 医嘱
     */
    boolean addExamination(String examinationJson);

    /**
     * 根据科室编号获取收费项目中的检查项目
     *
     * @param departmentId 科室编号
     * @return 指定科室的收费项目中的检查项目列表
     */
    List<ChargeItem> selectExamListInChargeItemByDepartmentId(Integer departmentId);

    /**
     * 按挂号单编号获取历史检查项目（所有检查状态）
     *
     * @param registrationId 挂号单编号
     * @return 历史检查项目，json 数组
     */
    String selectHistoryExam(Integer registrationId);

    /**
     * 按挂号单编号获取待支付检查项目
     *
     * @param registrationId 挂号单编号
     * @return 待支付检查项目，json 数组
     */
    String selectUnpaidExam(Integer registrationId);

    /**
     * 获取检查项目
     *
     * @param registrationId 挂号单编号
     * @param payStateList   支付状态列表
     * @return 检查项目，json 数组
     */
    String selectExam(Integer registrationId, List<Integer> payStateList);

    /**
     * 执行检查
     * 更改检查状态，提交检查结果
     * <p>
     * 修改检查的临床印象、检查结果
     * 修改收费项目的尚未交付数量
     *
     * @param examinationJson 检查信息，json 字符串
     * @return 操作结果
     * <p>
     * examinationJson 中的属性包括：
     * - examinationId      检查检验编号
     * - clinicalImpression 临床印象
     * - examResult         检查结果
     * <p>
     * examinationJson 中包含的收费项目列表，属性名为 chargeEntryList
     * - chargeEntryId 收费项目编号
     * - notGivenNums  在执行检查检验后，尚未交付的项目数量
     */
    boolean updateExamResult(String examinationJson);

    /**
     * 删除检查项目
     * 由医生执行
     * 只有未支付的项目可删除
     *
     * @param chargeEntryIdList 删除的检查项目编号列表
     * @return 操作结果
     */
    boolean deleteUnpaidChargeEntry(List<Integer> chargeEntryIdList);

    /**
     * 删除检查单
     * 这将删除检查单上的所有检查项目
     *
     * @param examinationIdList 检查单编号列表
     * @return 操作结果
     */
    boolean deleteExaminationList(List<Integer> examinationIdList);

    /**
     * 获取检查单模板
     *
     * @param examinationScope 查询的检查单模板范围（全院模板 2；科室模板 3；医生个人模板 4）
     * @param doctorId         医生编号
     * @return 检查单模板列表，json 字符串
     */
    String selectExaminationTemplate(Integer examinationScope, Integer doctorId);

    /**
     * 由检查单列表获取检查单信息 json 字符串
     * 字符串中除检查单基本信息外，还包括检查项目列表的信息
     *
     * @param examinationList 检查单列表
     * @return 包含检查项目信息的检查单信息，json 字符串
     */
    String examinationListToJson(List<Examination> examinationList);

    /**
     * 获取检查单的基本信息
     * 不包含检查单上的检查项目
     *
     * @param examinationId 检查单编号
     * @return 检查单基本信息
     */
    Examination selectExaminationAbstract(Integer examinationId);

    /**
     * 修改检查单基本信息
     * 检查单上的检查项目保持不变
     *
     * @param examinationJson 检查单基本信息，json 字符串
     * @return 操作结果
     */
    Boolean updateExaminationAbstract(String examinationJson);
}
