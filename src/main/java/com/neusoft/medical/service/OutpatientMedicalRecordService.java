package com.neusoft.medical.service;

import com.neusoft.medical.bean.Registration;

import java.util.List;

/**
 * 门诊医生工作站
 * 门诊病历首页
 */
public interface OutpatientMedicalRecordService {
    /**
     * 获取医生的待诊患者列表
     *
     * @param registrationScope 查询的挂号范围
     * @param doctorId          医生编号
     * @return 待诊患者列表
     */
    List<Registration> waitingRegistrationList(int registrationScope, int doctorId);

    /**
     * 获取医生的已诊患者列表
     *
     * @param registrationScope 查询的挂号范围
     * @param doctorId          医生编号
     * @return 已诊患者列表
     */
    List<Registration> visitedRegistrationList(int registrationScope, int doctorId);

    /**
     * 保存门诊病历信息
     * 保存状态是暂存或正式提交
     * 在正式提交后之后，医生才可以进行检查、检验、处置、开立处方等操作
     *
     * @param medicalRecordJson 病历记录 json 字符串
     * @return 保存成功 true；保存失败 false
     */
    boolean saveMedicalRecord(String medicalRecordJson);

    /**
     * 将门诊病历信息存为模板
     *
     * @param mainInfo       主诉
     * @param currentDisease 现病史
     * @param pastDisease    既往史
     * @param physicalExam   体格检查
     * @param auxiliaryExam  辅助检查
     * @param opinion        处理意见
     * @param saveState      保存状态
     * @return 操作结果
     */
    boolean saveMedicalRecordAsTemplate(String mainInfo, String currentDisease, String pastDisease, String physicalExam, String auxiliaryExam, String opinion, int saveState);

    /**
     * 诊断结束
     * 结束看诊之后，针对该患者不能再进行任何检查、检验的申请以及药品的开立、收费等
     *
     * @param registrationId 挂号编号
     * @return 操作结果
     */
    boolean endRegistration(int registrationId);
}
