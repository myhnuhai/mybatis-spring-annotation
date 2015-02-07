package com.jsjty;

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

/**
 * Created by 马英虎 on 2014/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ehcache.xml","classpath:spring-context.xml","classpath:spring-mybatis.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CacheTest {
    private final static Logger logger = LoggerFactory.getLogger(CacheTest.class);
    @Autowired
    private IDeviceService deviceService;

    @Test
    public void atestInsertDevice(){
        long cur = System.currentTimeMillis();
        logger.info("耗时：" + cur);
        logger.info(deviceService.selectById("01101").toString());
        logger.info("耗时：" + (System.currentTimeMillis() - cur));
       logger.info(deviceService.selectById("01101").toString());
        logger.info("耗时：" + (System.currentTimeMillis() - cur));
        logger.info(deviceService.selectById("01101").toString());
        logger.info("耗时：" + (System.currentTimeMillis() - cur));
    }
}
