package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tdevice {
    private String parentid;
    private String deviceid;
    private String devicename;
    private String devicetype;
    private String position;
    private Integer devicegrade;
    private String remark;
    private Integer importance;
    private Integer maintain;
    private Float weight;
    private String picspath;
    private String periodtype;
    private Integer periodcount;

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        this.remark = remark;
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
        this.picspath = picspath;
    }

    public String getPeriodtype() {
        return periodtype;
    }

    public void setPeriodtype(String periodtype) {
        this.periodtype = periodtype;
    }

    public Integer getPeriodcount() {
        return periodcount;
    }

    public void setPeriodcount(Integer periodcount) {
        this.periodcount = periodcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tdevice tdevice = (Tdevice) o;

        if (devicegrade != null ? !devicegrade.equals(tdevice.devicegrade) : tdevice.devicegrade != null) return false;
        if (deviceid != null ? !deviceid.equals(tdevice.deviceid) : tdevice.deviceid != null) return false;
        if (devicename != null ? !devicename.equals(tdevice.devicename) : tdevice.devicename != null) return false;
        if (devicetype != null ? !devicetype.equals(tdevice.devicetype) : tdevice.devicetype != null) return false;
        if (importance != null ? !importance.equals(tdevice.importance) : tdevice.importance != null) return false;
        if (maintain != null ? !maintain.equals(tdevice.maintain) : tdevice.maintain != null) return false;
        if (parentid != null ? !parentid.equals(tdevice.parentid) : tdevice.parentid != null) return false;
        if (periodcount != null ? !periodcount.equals(tdevice.periodcount) : tdevice.periodcount != null) return false;
        if (periodtype != null ? !periodtype.equals(tdevice.periodtype) : tdevice.periodtype != null) return false;
        if (picspath != null ? !picspath.equals(tdevice.picspath) : tdevice.picspath != null) return false;
        if (position != null ? !position.equals(tdevice.position) : tdevice.position != null) return false;
        if (remark != null ? !remark.equals(tdevice.remark) : tdevice.remark != null) return false;
        if (weight != null ? !weight.equals(tdevice.weight) : tdevice.weight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = parentid != null ? parentid.hashCode() : 0;
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        result = 31 * result + (devicename != null ? devicename.hashCode() : 0);
        result = 31 * result + (devicetype != null ? devicetype.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (devicegrade != null ? devicegrade.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (importance != null ? importance.hashCode() : 0);
        result = 31 * result + (maintain != null ? maintain.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (picspath != null ? picspath.hashCode() : 0);
        result = 31 * result + (periodtype != null ? periodtype.hashCode() : 0);
        result = 31 * result + (periodcount != null ? periodcount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tdevice{");
        sb.append("parentid='").append(parentid).append('\'');
        sb.append(", deviceid='").append(deviceid).append('\'');
        sb.append(", devicename='").append(devicename).append('\'');
        sb.append(", devicetype='").append(devicetype).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", devicegrade=").append(devicegrade);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", importance=").append(importance);
        sb.append(", maintain=").append(maintain);
        sb.append(", weight=").append(weight);
        sb.append(", picspath='").append(picspath).append('\'');
        sb.append(", periodtype='").append(periodtype).append('\'');
        sb.append(", periodcount=").append(periodcount);
        sb.append('}');
        return sb.toString();
    }
}
