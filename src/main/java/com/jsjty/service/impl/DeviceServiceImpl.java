package com.jsjty.service.impl;

import com.jsjty.mapper.TdeviceMapper;
import com.jsjty.model.Tdevice;
import com.jsjty.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by 马英虎 on 2014/11/19.
 */
@Service
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private TdeviceMapper deviceMapper;

    @Override
    @Cacheable(key = "#deviceId",value = "selectByPrimaryKeyCache")
    public Tdevice selectByPrimaryKey(String deviceId) {
        return deviceMapper.selectByPrimaryKey(deviceId);
    }
    @Override
    public int deleteByPrimaryKey( String deviceid) {
        return deviceMapper.deleteByPrimaryKey(deviceid);
    }

    @Override
    public int insert(Tdevice record) {
        return deviceMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Tdevice record) {
        return deviceMapper.updateByPrimaryKey(record);
    }
}
