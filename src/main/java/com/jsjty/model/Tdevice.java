package com.jsjty.model;

import java.io.Serializable;

public class Tdevice implements Serializable {
    private String deviceid;

    private String parentid;

    private String devicename;

    private String devicetype;

    private String position;

    private Integer devicegrade;

    private String remark;

    private Integer importance;

    private Integer maintain;

    private Float weight;
    
    private String picspath;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype == null ? null : devicetype.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getDevicegrade() {
        return devicegrade;
    }

    public void setDevicegrade(Integer devicegrade) {
        this.devicegrade = devicegrade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public Integer getMaintain() {
        return maintain;
    }

    public void setMaintain(Integer maintain) {
        this.maintain = maintain;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getPicspath() {
        return picspath;
    }

    public void setPicspath(String picspath) {
        this.picspath = picspath == null ? null : picspath.trim();
    }


    @Override
    public String toString() {
        return "Tdevice{" +
                "deviceid='" + deviceid + '\'' +
                ", parentid='" + parentid + '\'' +
                ", devicename='" + devicename + '\'' +
                ", devicetype='" + devicetype + '\'' +
                ", position='" + position + '\'' +
                ", devicegrade=" + devicegrade +
                ", remark='" + remark + '\'' +
                ", importance=" + importance +
                ", maintain=" + maintain +
                ", weight=" + weight +
                ", picspath='" + picspath + '\'' +
                '}';
    }
}