package com.jsjty.controller;

import com.jsjty.model.Tdevice;
import com.jsjty.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 马英虎 on 2014/11/19.
 */
@Controller
@RequestMapping("/")
public class DeviceControler {

    @Autowired
    private IDeviceService deviceService;


    @RequestMapping("{deviceId}")
    @ResponseBody
    public Tdevice getDevice(@PathVariable String deviceId){
        return deviceService.selectByPrimaryKey(deviceId);
    }
}
