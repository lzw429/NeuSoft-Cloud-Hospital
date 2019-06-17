package com.neusoft.medical.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.medical.bean.SettlementCategory;
import com.neusoft.medical.example.SettlementCategoryExample;
import com.neusoft.medical.dao.SettlementCategoryMapper;
import com.neusoft.medical.service.basicInfo.SettlementCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SettlementCategoryServiceImpl implements SettlementCategoryService {
    @Resource
    private SettlementCategoryMapper settlementCategoryMapper;

    @Override
    public PageInfo<SettlementCategory> selectSettlementCategory(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        SettlementCategoryExample settlementCategoryExample = new SettlementCategoryExample();
        SettlementCategoryExample.Criteria criteria = settlementCategoryExample.createCriteria();
        criteria.andValidEqualTo(1);
        return new PageInfo<>(settlementCategoryMapper.selectByExample(settlementCategoryExample));
    }

    @Override
    public boolean addSettlementCategory(String settlementCategoryName) {
        try {
            settlementCategoryMapper.insert(new SettlementCategory(null, settlementCategoryName, 1, null, null, null));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateSettlementCategory(int settlementCategoryId, String settlementCategoryName) {
        try {
            SettlementCategoryExample settlementCategoryExample = new SettlementCategoryExample();
            SettlementCategoryExample.Criteria criteria = settlementCategoryExample.createCriteria();
            criteria.andValidEqualTo(1);
            criteria.andSettlementCategoryIdEqualTo(settlementCategoryId);

            SettlementCategory record = new SettlementCategory();
            record.setSettlementCategoryName(settlementCategoryName);
            settlementCategoryMapper.updateByExampleSelective(record, settlementCategoryExample);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteSettlementCategory(List<Integer> settlementCategoryIdList) {
        try {
            SettlementCategory record = new SettlementCategory();
            record.setValid(0); // 置为无效

            SettlementCategoryExample settlementCategoryExample = new SettlementCategoryExample();
            SettlementCategoryExample.Criteria criteria = settlementCategoryExample.createCriteria();
            criteria.andValidEqualTo(1);
            criteria.andSettlementCategoryIdIn(settlementCategoryIdList);
            settlementCategoryMapper.updateByExampleSelective(record, settlementCategoryExample);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
