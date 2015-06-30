package com.jsjty.service.impl;

import com.jsjty.mapper.TdeviceMapper;
import com.jsjty.model.Tdevice;
import com.jsjty.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 马英虎 on 2014/11/19.
 */
@Service
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private TdeviceMapper deviceMapper;

    @Override
    @Cacheable(value = "selectByPrimaryKeyCache",key = "#deviceId")
    public Tdevice selectById(String deviceId) {
        return deviceMapper.selectById(deviceId);
    }

    @Override
    public int deleteById( String deviceid) {
        return deviceMapper.deleteById(deviceid);
    }

    @Override
    public List<Tdevice> selectALL() {
        return deviceMapper.selectAll();
    }

    @Override
    public int insert(Tdevice record) {
        return deviceMapper.insert(record);
    }

    @Override
    public int update(Tdevice record) {
        return deviceMapper.update(record);
    }
}
