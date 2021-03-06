package com.neusoft.medical.service.impl;

import com.neusoft.medical.bean.Registration;
import com.neusoft.medical.dao.RegistrationMapper;
import com.neusoft.medical.service.registration.RegistrationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistrationServiceImplTest {

    @Resource
    RegistrationService registrationService;

    @Test
    public void addRegistration(){
        Date birthday = new Date(1994, Calendar.FEBRUARY,1);
        Date visitDate = new Date(2019, Calendar.FEBRUARY,1);
        Date registrationDate = new Date(2019, Calendar.JULY,30);
        Registration registration = new Registration(15,15,"name",15,"男",10,birthday,"medicalCategory","identityCardNo","registrationStatus",visitDate,registrationDate,1,1,"Sorce",1,"yes","dbdx0",4,1,1,null,null,null);
        try {
            registrationService.addRegistration(registration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listRegistration() {
        registrationService.listRegistration(1,20);
    }

    @Test
    public void selectRegistrationByPrimaryKey() {
        registrationService.selectRegistrationByPrimaryKey(5);
    }

    @Test
    public void historyRegistrationList() {
        registrationService.historyRegistrationList(5);
    }

    @Test
    public void historyRegistrationIdList() {
        registrationService.historyRegistrationIdList(5);
    }

    @Test
    public void selectPatientByRegistrationId() {
        registrationService.selectPatientByRegistrationId(5);
    }
}