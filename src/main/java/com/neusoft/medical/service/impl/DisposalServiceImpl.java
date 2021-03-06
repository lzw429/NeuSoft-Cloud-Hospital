package com.neusoft.medical.service.impl;

import com.google.gson.*;
import com.neusoft.medical.Util.MathUtil;
import com.neusoft.medical.bean.*;
import com.neusoft.medical.dao.*;
import com.neusoft.medical.service.ConstantService;
import com.neusoft.medical.service.doctorWorkstation.DisposalService;
import com.neusoft.medical.service.doctorWorkstation.ExaminationService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.neusoft.medical.service.ConstantService.*;

@Service
public class DisposalServiceImpl implements DisposalService {
    private Logger logger = Logger.getLogger(DisposalService.class);

    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private ChargeItemMapper chargeItemMapper;
    @Resource
    private ChargeFormMapper chargeFormMapper;
    @Resource
    private ChargeEntryMapper chargeEntryMapper;
    @Resource
    private RegistrationMapper registrationMapper;
    @Resource
    private ExaminationService examinationService;

    private Gson gson = new Gson();

    @Override
    public boolean saveDisposal(String disposalJson) {
        try {
            // 首先获取 json 字符串中的属性值，然后将提交的信息加入到 charge_form 表和 charge_entry 表
            JsonObject disposalJsonObject = new JsonParser().parse(disposalJson).getAsJsonObject();
            Integer chargeFormId = null;  // 新增时不填，更新时必填
            Integer registrationId = null;  // 新增模板时必填，暂存/正式提交时必填

            try {
                chargeFormId = disposalJsonObject.get("chargeFormId").getAsInt();
            } catch (Exception ignore) {
            }
            try {
                registrationId = disposalJsonObject.get("registrationId").getAsInt();
            } catch (Exception ignore) {
            }

            String chargeFormName = disposalJsonObject.get("chargeFormName").getAsString();
            int saveState = disposalJsonObject.get("saveState").getAsInt();
            JsonArray chargeEntryListJsonArray = disposalJsonObject.get("chargeEntryList").getAsJsonArray();

            Registration registration = registrationMapper.selectByPrimaryKey(registrationId);
            ChargeForm chargeFormRecord = new ChargeForm(null, chargeFormName, registrationId, saveState, ConstantService.PAY_STATE_NOT_CHARGED, ConstantService.EXEC_NOT_DONE, 1, null, null, null);
            if (chargeFormId == null) {
                // 新增处置项目
                chargeFormMapper.insert(chargeFormRecord);
                chargeFormId = chargeFormRecord.getChargeFormId();

            } else {
                // 更新处置项目
                chargeFormMapper.updateByPrimaryKey(chargeFormRecord);
                // 使之前所有收费项目失效
                ChargeEntryExample chargeEntryExample = new ChargeEntryExample();
                chargeEntryExample.or().andValidEqualTo(1).andChargeFormIdEqualTo(chargeFormId);
                ChargeEntry chargeEntryRecord = new ChargeEntry();
                chargeEntryRecord.setValid(0);
                chargeEntryMapper.updateByExampleSelective(chargeEntryRecord, chargeEntryExample);
            }

            for (JsonElement chargeEntryJsonElement : chargeEntryListJsonArray) {
                JsonObject chargeEntryJsonObject = chargeEntryJsonElement.getAsJsonObject();
                int chargeItemId = chargeEntryJsonObject.get("chargeItemId").getAsInt();
                int nums = chargeEntryJsonObject.get("nums").getAsInt();
                String doctorAdvice = chargeEntryJsonObject.get("doctorAdvice").getAsString();

                ChargeItem chargeItemRecord = chargeItemMapper.selectByPrimaryKey(chargeItemId);
                double unitPrice = MathUtil.doubleSetScale(chargeItemRecord.getPrice(), 2);
                double totalPrice = MathUtil.doubleSetScale(unitPrice, 2);
                ChargeEntry chargeEntryRecord = new ChargeEntry(null, registrationId, chargeFormId, chargeItemId, null, unitPrice, totalPrice, nums, nums, nums, ConstantService.PAY_STATE_NOT_CHARGED, new Date(), null, null, null, 1, doctorAdvice, null, null, null);
                if (registration != null) {
                    chargeEntryRecord.setDepartmentId(registration.getDepartmentId());
                    chargeEntryRecord.setDoctorId(registration.getDoctorId());
                }
                chargeEntryMapper.insert(chargeEntryRecord);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<ChargeItem> selectDisposalItemListInChargeItemByDepartmentId(int departmentId) {
        ChargeItemExample chargeItemExample = new ChargeItemExample();
        ChargeItemExample.Criteria criteria = chargeItemExample.createCriteria();
        criteria.andValidEqualTo(1);
        criteria.andDepartmentIdEqualTo(departmentId);
        criteria.andExpenseCategoryIdEqualTo(EXPENSE_CATEGORY_DISPOSAL);

        return chargeItemMapper.selectByExample(chargeItemExample);
    }

    @Override
    public String selectHistoryDisposal(Integer registrationId) {
        return selectDisposal(registrationId, null);
    }

    @Override
    public String selectUnpaidDisposal(Integer registrationId) {
        List<Integer> payStateList = new CopyOnWriteArrayList<>();
        payStateList.add(PAY_STATE_NOT_CHARGED);
        return selectDisposal(registrationId, payStateList);
    }

    @Override
    public String selectDisposal(Integer registrationId, List<Integer> payStateList) {
        ChargeFormExample chargeFormExample = new ChargeFormExample();
        chargeFormExample.or().andValidEqualTo(1).andRegistrationIdEqualTo(registrationId);  // 本次挂号的收费单

        List<ChargeForm> chargeFormList = chargeFormMapper.selectByExample(chargeFormExample);
        JsonArray chargeFormJsonArray = gson.toJsonTree(chargeFormList).getAsJsonArray();
        for (JsonElement chargeFormJsonElement : chargeFormJsonArray) {
            JsonObject chargeFormJsonObject = chargeFormJsonElement.getAsJsonObject();

            int chargeFormId = chargeFormJsonObject.get("chargeFormId").getAsInt();

            // 针对每项处置项目单，找到其处置项目列表
            ChargeEntryExample chargeEntryExample = new ChargeEntryExample();
            ChargeEntryExample.Criteria chargeEntryCriteria = chargeEntryExample.createCriteria();
            chargeEntryCriteria.andValidEqualTo(1).andRegistrationIdEqualTo(registrationId).andChargeFormIdEqualTo(chargeFormId);
            if (payStateList != null && !payStateList.isEmpty()) {  // 指定了支付状态
                chargeEntryCriteria.andPayStateIn(payStateList);
            }
            List<ChargeEntry> chargeEntryList = chargeEntryMapper.selectByExample(chargeEntryExample);
            JsonArray chargeEntryListJsonArray = gson.toJsonTree(chargeEntryList).getAsJsonArray();
            for (JsonElement chargeEntryJsonElement : chargeEntryListJsonArray) {
                JsonObject chargeEntryJsonObject = chargeEntryJsonElement.getAsJsonObject();
                ChargeItem chargeItem = chargeItemMapper.selectByPrimaryKey(chargeEntryJsonObject.get("chargeItemId").getAsInt());
                chargeEntryJsonObject.add("chargeItem", gson.toJsonTree(chargeItem));
            }

            chargeFormJsonObject.add("chargeEntryList", chargeEntryListJsonArray);
        }
        return chargeFormJsonArray.toString();
    }

    @Override
    public boolean updateDisposal(String disposalJson) {
        try {
            JsonObject disposalJsonObject = new JsonParser().parse(disposalJson).getAsJsonObject();
            int chargeFormId = disposalJsonObject.get("chargeFormId").getAsInt();

            JsonArray chargeEntryList = disposalJsonObject.get("chargeEntryList").getAsJsonArray();
            for (JsonElement chargeEntryJsonElement : chargeEntryList) {
                JsonObject chargeEntryJsonObject = chargeEntryJsonElement.getAsJsonObject();
                int chargeEntryId = chargeEntryJsonObject.get("chargeEntryId").getAsInt();
                int notGivenNums = chargeEntryJsonObject.get("notGivenNums").getAsInt();
                ChargeEntry chargeEntryRecord = new ChargeEntry();
                chargeEntryRecord.setChargeEntryId(chargeEntryId);
                chargeEntryRecord.setNotGivenNums(notGivenNums);
                chargeEntryMapper.updateByPrimaryKeySelective(chargeEntryRecord);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteDisposalEntry(List<Integer> chargeEntryIdList) {
        return examinationService.deleteUnpaidChargeEntry(chargeEntryIdList);
    }

    @Override
    public boolean deleteDisposal(List<Integer> chargeFormIdList) {
        try {
            ChargeFormExample chargeFormExample = new ChargeFormExample();
            chargeFormExample.or().andValidEqualTo(1).andChargeFormIdIn(chargeFormIdList);
            List<ChargeForm> chargeFormList = chargeFormMapper.selectByExample(chargeFormExample);

            for (ChargeForm chargeForm : chargeFormList) {
                if (chargeForm.getSaveState().equals(SAVE_FORMAL) && chargeForm.getExecutionState().equals(ConstantService.EXEC_DONE))
                    continue;

                ChargeEntryExample chargeEntryExample = new ChargeEntryExample();
                chargeEntryExample.or().andValidEqualTo(1).andChargeFormIdEqualTo(chargeForm.getChargeFormId());

                ChargeEntry chargeEntryRecord = new ChargeEntry();
                chargeEntryRecord.setValid(0);
                chargeEntryMapper.updateByExampleSelective(chargeEntryRecord, chargeEntryExample);

                chargeForm.setValid(0);
                chargeFormMapper.updateByPrimaryKey(chargeForm);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String selectDisposalTemplate(Integer disposalScope, Integer doctorId) {
        String res = null;
        try {
            if (disposalScope != SAVE_HOSPITAL_TEMPLATE && disposalScope != SAVE_DEPART_TEMPLATE && disposalScope != SAVE_DOCTOR_TEMPLATE) {
                // 模板范围 参数非法
                logger.error("The search scope for templates is illegal");
                return null;
            }

            ChargeFormExample chargeFormExample = new ChargeFormExample();
            ChargeFormExample.Criteria chargeFormExampleCriteria = chargeFormExample.createCriteria();
            chargeFormExampleCriteria.andValidEqualTo(1).andSaveStateEqualTo(disposalScope);
//            if (disposalScope == SAVE_DEPART_TEMPLATE) {
//                // 科室模板
//
//                // 找到由该医生所在科室的所有医生创建的模板
//            }
//            else if (disposalScope == SAVE_DOCTOR_TEMPLATE) {
//                // 医生个人模板
//            }

            List<ChargeForm> chargeFormList = chargeFormMapper.selectByExample(chargeFormExample);
            res = chargeFormListToJson(chargeFormList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public String chargeFormListToJson(List<ChargeForm> chargeFormList) {
        String res = null;
        try {
            JsonArray chargeFormWithEntryJsonArray = new JsonArray();
            for (ChargeForm chargeForm : chargeFormList) {
                JsonObject chargeFormJsonObject = gson.toJsonTree(chargeForm).getAsJsonObject();

                // 找到每张收费单对应的收费项目
                ChargeEntryExample chargeEntryExample = new ChargeEntryExample();
                chargeEntryExample.or().andValidEqualTo(1).andChargeFormIdEqualTo(chargeForm.getChargeFormId());
                List<ChargeEntry> chargeEntryList = chargeEntryMapper.selectByExample(chargeEntryExample);
                JsonArray chargeEntryListJsonArray = gson.toJsonTree(chargeEntryList).getAsJsonArray();
                for (JsonElement chargeEntryJsonElement : chargeEntryListJsonArray) {
                    JsonObject chargeEntryJsonObject = chargeEntryJsonElement.getAsJsonObject();
                    chargeEntryJsonObject.add("chargeItem", gson.toJsonTree(chargeItemMapper.selectByPrimaryKey(chargeEntryJsonObject.get("chargeItemId").getAsInt())));
                }

                chargeFormJsonObject.add("chargeEntryList", chargeEntryListJsonArray);
                chargeFormWithEntryJsonArray.add(chargeFormJsonObject);
            }
            res = chargeFormWithEntryJsonArray.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
