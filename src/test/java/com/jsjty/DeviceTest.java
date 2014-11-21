package com.jsjty;

import com.jsjty.model.Tdevice;
import com.jsjty.service.IDeviceService;
import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 马英虎 on 2014/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml","classpath:spring-mybatis.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeviceTest {
    private final static Logger logger = Logger.getLogger(DeviceTest.class);
    @Autowired
    private IDeviceService deviceService;



    @Test
    public void atestInsertDevice(){
        Tdevice tdevice = new Tdevice();
        tdevice.setRemark("");
        tdevice.setPosition("江苏");
        tdevice.setParentid("50001");
        tdevice.setDeviceid("5001001");
        tdevice.setDevicegrade(0);
        tdevice.setDevicename("测试设备");
        tdevice.setDevicetype("弱电");
        tdevice.setImportance(2);
        tdevice.setWeight(2.6F);
        tdevice.setMaintain(2);
        tdevice.setPicspath("本地");
        int temp = deviceService.insert(tdevice);
        logger.info(temp);
    }

    @Test
    public void btestSelectDevice(){
        Tdevice tdevice = deviceService.selectByPrimaryKey("5001001");
        logger.info(tdevice.toString());
    }

    @Test
    public void ctestDeleteDevice(){
        int temp = deviceService.deleteByPrimaryKey("5001001");
        logger.info(temp);
    }
}
