package com.jsjty.service;

import com.jsjty.model.Tdevice;

/**
 * Created by 马英虎 on 2014/11/19.
 */
public interface IDeviceService {

    public Tdevice selectByPrimaryKey(String deviceId);

    int deleteByPrimaryKey( String deviceid);

    int insert(Tdevice record);

    int updateByPrimaryKey(Tdevice record);
}
