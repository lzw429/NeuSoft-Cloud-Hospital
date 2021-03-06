package com.neusoft.medical.controller.basicInfo;

import com.github.pagehelper.PageInfo;
import com.neusoft.medical.bean.Doctor;
import com.neusoft.medical.dto.ResultDTO;
import com.neusoft.medical.service.basicInfo.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * 用户管理控制器
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    private AccountService accountService;

    /**
     * 分页、分类查找帐号信息
     *
     * @param currentPage  当前页码
     * @param pageSize     页面大小
     * @param accountScope 查找的帐号范围，字符串数组
     *                     门诊医生 00
     *                     医技医生 01
     *                     医院收费员 10
     *                     药房操作员 11
     *                     财务管理员 12
     *                     挂号收费员 13
     * @return 指定范围的帐号信息
     */
    @GetMapping("/select_account")
    public ResultDTO<PageInfo<String>> selectAccount(
            @RequestParam(value = "currentPage") Integer currentPage,
            @RequestParam(value = "pageSize") Integer pageSize,
            @RequestParam(value = "accountScope[]") String[] accountScope
    ) {
        PageInfo<String> accountPageInfo = null;
        try {
            accountPageInfo = accountService.selectAccount(currentPage, pageSize, Arrays.asList(accountScope));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(accountPageInfo);
    }

    /**
     * 分页、分类查找医生信息
     *
     * @param currentPage  当前页码
     * @param pageSize     页面大小
     * @param accountScope 查找的帐号范围，字符串数组
     *                     门诊医生 00
     *                     医技医生 01
     * @return 指定范围的帐号信息
     */
    @GetMapping("/select_doctor")
    public ResultDTO<PageInfo<Doctor>> selectDoctor(
            @RequestParam(value = "currentPage") Integer currentPage,
            @RequestParam(value = "pageSize") Integer pageSize,
            @RequestParam(value = "accountScope[]") String[] accountScope
    ) {
        PageInfo<Doctor> doctorPageInfo = null;
        try {
            doctorPageInfo = accountService.selectDoctor(currentPage, pageSize, Arrays.asList(accountScope));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultDTO<>(doctorPageInfo);
    }

    /**
     * 新增用户信息
     *
     * @param userName         用户名
     * @param userPassword     密码
     * @param accountType      用户类型
     * @param realName         用户的真实姓名
     * @param departmentId     科室编号
     * @param jobTitle         医生职称
     * @param doctorScheduling 医生是否参与排班
     * @return 操作结果
     */
    @PostMapping("/add_account")
    public ResultDTO<Boolean> addAccount(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "userPassword") String userPassword,
            @RequestParam(value = "accountType") String accountType,
            @RequestParam(value = "realName") String realName,
            @RequestParam(value = "departmentId", required = false) Integer departmentId,
            @RequestParam(value = "jobTitle", required = false) String jobTitle,
            @RequestParam(value = "doctorScheduling", required = false) Integer doctorScheduling
    ) {
        try {
            if (doctorScheduling == null) doctorScheduling = -1;
            accountService.addAccount(userName, userPassword, accountType, realName, departmentId, jobTitle, doctorScheduling);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDTO<>(Boolean.FALSE);
        }
        return new ResultDTO<>(Boolean.TRUE);
    }

    /**
     * 修改用户信息
     *
     * @param accountId        帐号编号
     * @param userName         用户名
     * @param userPassword     密码
     * @param realName         用户的真实姓名
     * @param departmentId     科室编号
     * @param jobTitle         医生职称
     * @param doctorScheduling 医生是否参与排班
     * @return 操作结果
     */
    @PutMapping("/update_account")
    public ResultDTO<Boolean> updateAccount(
            @RequestParam(value = "accountId") Integer accountId,
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "userPassword") String userPassword,
            @RequestParam(value = "realName") String realName,
            @RequestParam(value = "departmentId") Integer departmentId,
            @RequestParam(value = "jobTitle", required = false) String jobTitle,
            @RequestParam(value = "doctorScheduling", required = false) Integer doctorScheduling
    ) {
        try {
            if (doctorScheduling == null) doctorScheduling = -1;
            accountService.updateAccount(accountId, userName, userPassword, realName, departmentId, jobTitle, doctorScheduling);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDTO<>(Boolean.FALSE);
        }
        return new ResultDTO<>(Boolean.TRUE);
    }

    /**
     * 删除用户信息
     *
     * @param accountIdList 帐号编号列表
     * @return 操作结果
     */
    @DeleteMapping("/delete_account")
    public ResultDTO<Boolean> deleteAccount(
            @RequestParam(value = "accountIdList[]") Integer[] accountIdList
    ) {
        try {
            accountService.deleteAccount(Arrays.asList(accountIdList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDTO<>(Boolean.FALSE);
        }
        return new ResultDTO<>(Boolean.TRUE);
    }
}
