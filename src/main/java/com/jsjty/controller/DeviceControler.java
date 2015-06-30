package com.jsjty.controller;

import com.jsjty.model.Tdevice;
import com.jsjty.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 马英虎 on 2014/11/19.
 */
@Controller
@RequestMapping("/")
public class DeviceControler extends BaseController {

    @Autowired
    private IDeviceService deviceService;


    @RequestMapping("{deviceId}")
    @ResponseBody
    public Tdevice getDevice(@PathVariable String deviceId){
        return deviceService.selectById(deviceId);
    }

    @RequestMapping("deviceAll")
    @ResponseBody
    public List<Tdevice> selectALL() throws SQLException {
        //throw new SQLException("数据库异常。");
        return deviceService.selectALL();
    }
}
