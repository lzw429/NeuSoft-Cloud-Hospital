package com.neusoft.medical.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.medical.bean.Department;
import com.neusoft.medical.bean.DepartmentExample;
import com.neusoft.medical.dao.DepartmentMapper;
import com.neusoft.medical.service.basicInfo.DepartmentService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Future;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    @Async("asyncServiceExecutor")
    public Future<List<Department>> findAllDepartment() {
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andValidEqualTo(1);
        return AsyncResult.forValue(departmentMapper.selectByExample(departmentExample));
    }

    @Override
    @Async("asyncServiceExecutor")
    public Future<PageInfo<Department>> selectDepartment(Integer currentPage, Integer pageSize, List<Integer> departmentCategory) {
        PageHelper.startPage(currentPage, pageSize);

        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andValidEqualTo(1);
        if (departmentCategory != null) { // 查找指定科室类别的科室信息
            criteria.andCategoryIn(departmentCategory);
        }

        List<Department> departmentList = departmentMapper.selectByExample(departmentExample);

        return AsyncResult.forValue(new PageInfo<>(departmentList));
    }

    @Override
    public Department addDepartment(Department record) {
        int effectRow = departmentMapper.insert(record);
        System.out.println("addDepartment 新增记录 " + effectRow + " 项");
        return departmentMapper.selectByPrimaryKey(record.getDepartmentId());
    }

    @Override
    public int deleteDepartmentByPrimaryKey(List<Integer> departmentIdList) {
        Department record = new Department();
        record.setValid(0);

        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andDepartmentIdIn(departmentIdList);
        criteria.andValidEqualTo(1);  // 仅查找有效的记录

        int effectRow = departmentMapper.updateByExampleSelective(record, departmentExample);
        System.out.println("deleteDepartmentByPrimaryKey 删除记录 " + effectRow + " 项");
        return effectRow;
    }

    @Override
    public Department updateDepartmentByPrimaryKey(Department record) {
        if (record.getValid() == 0)  // 记录无效，不更新
            return record;
        int effectRow = departmentMapper.updateByPrimaryKey(record);
        System.out.println("updateDepartmentByPrimaryKey 修改记录 " + effectRow + " 项");
        return departmentMapper.selectByPrimaryKey(record.getDepartmentId());
    }
}
