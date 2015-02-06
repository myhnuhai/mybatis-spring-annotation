package com.jsjty;

import com.jsjty.model.Tdevice;
import com.jsjty.service.IDeviceService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 马英虎 on 2014/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml","classpath:spring-mybatis.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeviceTest {
    private final static Logger logger = LoggerFactory.getLogger(DeviceTest.class);
    @Autowired
    private IDeviceService deviceService;

    @Test
    public void atestInsert(){
       Tdevice tdevice = new Tdevice();
        tdevice.setRemark("123");
        tdevice.setDevicegrade(8);
        tdevice.setDeviceid("100");
        tdevice.setDevicename("测试设备");
        tdevice.setDevicetype("强电");
        tdevice.setImportance(0);
        tdevice.setMaintain(2);
        tdevice.setParentid("");
        tdevice.setWeight(2.5f);
        tdevice.setPeriodcount(1);
        tdevice.setPeriodtype("天");
        int sum = deviceService.insert(tdevice);
        System.out.println("提交成功:" + sum);
    }

    @Test
    public void atestSelectAll(){
        List<Tdevice> tdeviceList = deviceService.selectALL();
        for (Tdevice tdevice : tdeviceList) {
            logger.info(tdevice.toString());
        }
    }

    @Test
    public void btestSelectDevice(){
        Tdevice tdevice = deviceService.selectByPrimaryKey("100");
        logger.info(tdevice.toString());
    }

    @Test
    public void ctestDeleteDevice(){
        int temp = deviceService.deleteByPrimaryKey("100");
        logger.info(String.valueOf(temp));
    }
}
