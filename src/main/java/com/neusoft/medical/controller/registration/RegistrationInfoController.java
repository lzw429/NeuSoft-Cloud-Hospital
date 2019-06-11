package com.neusoft.medical.controller.registration;

import com.neusoft.medical.bean.Department;
import com.neusoft.medical.bean.Doctor;
import com.neusoft.medical.bean.Patient;
import com.neusoft.medical.dto.ResultDTO;
import com.neusoft.medical.service.DepartmentService;
import com.neusoft.medical.service.DoctorService;
import com.neusoft.medical.service.PatientService;
import com.neusoft.medical.service.RegistrationInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 挂号信息控制器
 */
@Controller
@RequestMapping("/registration")
public class RegistrationInfoController {
    @Resource
    private RegistrationInfoService registrationInfoService;

    @Resource
    private DoctorService doctorService;

    @Resource
    private DepartmentService departmentService;

    @Resource
    private PatientService patientService;


    /**
     * 获取挂号科室列表
     *
     * @return 可挂号的科室列表
     */
    @RequestMapping("/department_list")
    public ResultDTO<List<Department>> departmentList() {
        System.out.println("RegistrationInfoController 获取挂号科室列表");
        List<Department> departmentList = departmentService.findAllDepartment();
        return new ResultDTO<>(departmentList);
    }

    /**
     * 获取挂号医生列表
     *
     * @return 可挂号的医生列表
     */
    @RequestMapping("/doctor_list")
    public ResultDTO<List<Doctor>> doctorList() {
// todo
        System.out.println("RegistrationInfoController 获取挂号医生列表");

        return null;

    }

    /**
     * 获取患者个人信息
     *
     * @param identifyCardNO 患者身份证号
     * @return 如果找到，返回信息；如果未找到，被封装的患者信息为 null
     */
    @GetMapping("/patient_info")
    public ResultDTO<Patient> patient(@RequestParam(value = "identify_card_no") String identifyCardNO) {
        System.out.println("获取患者信息 身份证号：" + identifyCardNO);
        Patient patient = patientService.selectPatientByIdentifyCardNo(identifyCardNO);
        return new ResultDTO<>(patient);
    }

    /**
     * 提交挂号信息
     */
    @PostMapping("/register")
    public ResultDTO<Boolean> register(
            @RequestParam(value = "registrationId") Integer registrationId,
            @RequestParam(value = "patientName") String patientName,
            @RequestParam(value = "gender") String gender,
            @RequestParam(value = "age") Integer age,
            @RequestParam(value = "birthday") Date birthday,
            @RequestParam(value = "registrationCategory") String registrationCategory,
            @RequestParam(value = "medicalCategory") String medicalCategory,
            @RequestParam(value = "identityCardNo") String identityCardNo,
            @RequestParam(value = "registrationStatus") String registrationStatus,
            @RequestParam(value = "visitDate") Date visitDate,
            @RequestParam(value = "registrationDate") Date registrationDate,
            @RequestParam(value = "departmentId") Integer departmentId,
            @RequestParam(value = "doctorId") Integer doctorId,
            @RequestParam(value = "registrationSource") String registrationSource,
            @RequestParam(value = "settleAccountsCategory") String settleAccountsCategory,
            @RequestParam(value = "isVisited") String isVisited,
            @RequestParam(value = "familyAddress") String familyAddress,
            @RequestParam(value = "collectorId") String collectorId) {
        System.out.println("提交挂号信息");
// todo

        return null;
    }
}
