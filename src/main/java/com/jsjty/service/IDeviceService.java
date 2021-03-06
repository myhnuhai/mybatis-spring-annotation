package com.jsjty.service;

import com.jsjty.model.Tdevice;

import java.util.List;

/**
 * Created by 马英虎 on 2014/11/19.
 */
public interface IDeviceService {

    public Tdevice selectById(String deviceId);

    int deleteById( String deviceid);

    public List<Tdevice> selectALL();

    int insert(Tdevice record);

    int update(Tdevice record);
}
