package com.neusoft.medical.controller.doctorWorkstation;

import com.neusoft.medical.bean.Registration;
import com.neusoft.medical.dto.ResultDTO;
import com.neusoft.medical.service.OutpatientMedicalRecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/doctor_work")
public class MedicalRecordController {
    @Resource
    private OutpatientMedicalRecordService outpatientMedicalRecordService;

    /**
     * 获取医生的待诊患者列表
     *
     * @param registrationScope 查询的挂号范围：0 所有；1 医生本人；2 医生所在科室
     * @param doctorId          医生编号
     * @return 待诊患者列表
     */
    @GetMapping("/waiting_registration")
    public ResultDTO<List<Registration>> waitingRegistrationList(
            @RequestParam(value = "registrationScope") Integer registrationScope,
            @RequestParam(value = "doctorId") Integer doctorId
    ) {
        return new ResultDTO<>(outpatientMedicalRecordService.waitingRegistrationList(registrationScope, doctorId));
    }

    /**
     * 获取医生的已诊患者列表
     *
     * @param registrationScope 查询的挂号范围：0 所有；1 医生本人；2 医生所在科室
     * @param doctorId          医生编号
     * @return 已诊患者列表
     */
    @GetMapping("/visited_registration")
    public ResultDTO<List<Registration>> visitedRegistrationList(
            @RequestParam(value = "registrationScope") int registrationScope,
            @RequestParam(value = "doctorId") int doctorId) {
        return new ResultDTO<>(outpatientMedicalRecordService.visitedRegistrationList(registrationScope, doctorId));

    }

    /**
     * 保存门诊病历信息
     * 保存状态是暂存或正式提交
     * 在正式提交后之后，医生才可以进行检查、检验、处置、开立处方等操作
     * <p>
     * 病历记录包含的元素有：
     * - registrationId 挂号单编号
     * - mainInfo 主诉
     * - currentDisease 现病史
     * - pastDisease 既往史
     * - physicalExam 体格检查
     * - auxiliaryExam 辅助检查
     * - opinion 处理意见
     * - saveState 保存状态（暂存0 正式提交1）
     * - disease 评估/诊断（嵌套）
     * <p>
     * 其中，disease元素中包含的元素有：
     * - diseaseId 诊断目录中的编号
     * - mainDisease 主诊（是1 否0）
     * - suspect 疑似（是1 否0）
     * - incidenceDate 发病日期
     *
     * @param medicalRecordJson 病历记录 json 字符串
     * @return 保存成功 true；保存失败 false
     */
    @RequestMapping("/save_record")
    public ResultDTO<Boolean> saveMedicalRecord(@RequestParam(value = "medicalRecordJson") String medicalRecordJson) {
        try {
            outpatientMedicalRecordService.saveMedicalRecord(medicalRecordJson);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDTO<>(Boolean.FALSE);
        }
        return new ResultDTO<>(Boolean.TRUE);
    }
}
