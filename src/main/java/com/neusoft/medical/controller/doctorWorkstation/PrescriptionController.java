package com.neusoft.medical.controller.doctorWorkstation;

import com.neusoft.medical.bean.Medicine;
import com.neusoft.medical.dto.ResultDTO;
import com.neusoft.medical.service.doctorWorkstation.PrescriptionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 成药处方、草药处方 控制器
 */
@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
    @Resource
    private PrescriptionService prescriptionService;

    /**
     * 获取所有药品列表
     * 药品数量较多，可能增加网络和浏览器的负担
     *
     * @return 包含所有药品信息的列表
     */
    @GetMapping("/list_medicine")
    public ResultDTO<List<Medicine>> selectMedicine() {
        List<Medicine> medicineList = null;
        try {
            medicineList = prescriptionService.selectMedicine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(medicineList);
    }

    /**
     * 通过中文名称或拼音搜索药品信息
     *
     * @param resultNumber 最大结果数量
     * @param query        搜索关键词
     * @return 药品信息列表
     */
    @GetMapping("/search_medicine")
    public ResultDTO<List<Medicine>> searchMedicine(
            @RequestParam(value = "resultNumber") Integer resultNumber,
            @RequestParam(value = "query") String query
    ) {
        List<Medicine> medicineList = null;
        try {
            medicineList = prescriptionService.searchMedicine(resultNumber, query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(medicineList);
    }

    /**
     * 保存处方（三种保存状态：暂存、提交、存为模板）
     *
     * @param prescriptionJson 表示处方信息的 json 字符串
     * @return 操作结果
     * 该 json 字符串包含的属性：
     * - prescriptionId 处方编号（新增时填 -1，更新时填被更新的编号）
     * - prescriptionName 处方名称
     * - registrationId 挂号单编号（暂存或正式提交 必填，模板 可空）
     * - doctorId 创建模板的医生编号（暂存或正式提交 可空，模板 必填）
     * - saveState 保存状态（暂存 0；正式提交 1；全院模板 2；科室模板 3；医生个人模板 4）
     * - medicine 处方中包含的药物清单，json 数组
     * <p>
     * - medicine 数组中每个元素包含的属性：
     * - medicineId 处方药品编号
     * - unitPrice 药品单价
     * - nums 药品数量
     * - medicineUsage 药品用途
     * - medicineDosage 药品用量
     * - medicineFrequency 药品使用频率
     * - medicineNumberDay 药品使用天数
     * - skinTest 皮试
     * - skinTestResult 皮试结果
     * - doctorAdvice 医嘱
     */
    @PostMapping("/save_prescription")
    public ResultDTO<Boolean> savePrescription(
            @RequestParam(value = "prescriptionJson") String prescriptionJson
    ) {
        try {
            prescriptionService.savePrescription(prescriptionJson);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDTO<>(Boolean.FALSE);
        }
        return new ResultDTO<>(Boolean.TRUE);
    }

    /**
     * 获取常用药品
     *
     * @param medicineNumber 常用药品的数量
     * @return 常用药品信息列表
     */
    @GetMapping("/common_medicine")
    public ResultDTO<List<Medicine>> commonMedicine(@RequestParam(value = "medicineNumber") Integer medicineNumber) {
        List<Medicine> medicineList = null;
        try {
            medicineList = prescriptionService.commonMedicine(medicineNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(medicineList);
    }

    /**
     * 获取历史处方（暂存 或 正式提交）
     *
     * @param registrationId 挂号单编号
     * @return 历史处方列表，json 字符串
     */
    @GetMapping("/history_prescription")
    public ResultDTO<String> selectHistoryPrescription(
            @RequestParam(value = "registrationId") Integer registrationId
    ) {
        String historyPrescriptionJsonList = null;
        try {
            historyPrescriptionJsonList = prescriptionService.selectHistoryPrescription(registrationId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(historyPrescriptionJsonList);
    }

    /**
     * 获取待支付处方
     * 不包含已退费的处方
     *
     * @param registrationId 挂号单编号
     * @return 待支付处方列表，json 字符串
     */
    @GetMapping("/unpaid_prescription")
    public ResultDTO<String> selectUnpaidPrescription(
            @RequestParam(value = "registrationId") Integer registrationId
    ) {
        String unpaidPrescriptionJsonList = null;
        try {
            unpaidPrescriptionJsonList = prescriptionService.selectUnpaidPrescription(registrationId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(unpaidPrescriptionJsonList);
    }

    /**
     * 查询处方模板
     *
     * @param prescriptionScope 查询的处方模板的范围（全院模板 2；科室模板 3；医生个人模板 4）
     * @param doctorId          医生编号
     * @return 处方模板列表，json 字符串
     */
    @GetMapping("/prescription_template")
    public ResultDTO<String> selectPrescriptionTemplate(
            @RequestParam(value = "prescriptionScope") Integer prescriptionScope,
            @RequestParam(value = "doctorId") Integer doctorId
    ) {
        String res = null;
        try {
            res = prescriptionService.selectPrescriptionTemplate(prescriptionScope, doctorId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(res);
    }

    /**
     * 删除处方记录
     *
     * @param prescriptionIdList 处方编号列表
     * @return 操作结果
     */
    @DeleteMapping("/delete_prescription")
    public ResultDTO<Boolean> deletePrescription(
            @RequestParam(value = "prescriptionIdList[]") Integer[] prescriptionIdList
    ) {
        try {
            prescriptionService.deletePrescription(Arrays.asList(prescriptionIdList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDTO<>(Boolean.FALSE);
        }
        return new ResultDTO<>(Boolean.TRUE);
    }
}