package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tdeviceweight {
    private Timestamp versionid;
    private String deviceid;
    private Byte importance;
    private Byte maintain;
    private Float weight;
    private String deviceweghtid;
    private String remark;
    private Double weightvalue;
    public Timestamp getVersionid() {
        return versionid;
    }

    public void setVersionid(Timestamp versionid) {
        this.versionid = versionid;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public Byte getImportance() {
        return importance;
    }

    public void setImportance(Byte importance) {
        this.importance = importance;
    }

    public Byte getMaintain() {
        return maintain;
    }

    public void setMaintain(Byte maintain) {
        this.maintain = maintain;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getDeviceweghtid() {
        return deviceweghtid;
    }

    public void setDeviceweghtid(String deviceweghtid) {
        this.deviceweghtid = deviceweghtid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getWeightvalue() {
        return weightvalue;
    }

    public void setWeightvalue(Double weightvalue) {
        this.weightvalue = weightvalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tdeviceweight that = (Tdeviceweight) o;

        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (deviceweghtid != null ? !deviceweghtid.equals(that.deviceweghtid) : that.deviceweghtid != null)
            return false;
        if (importance != null ? !importance.equals(that.importance) : that.importance != null) return false;
        if (maintain != null ? !maintain.equals(that.maintain) : that.maintain != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (versionid != null ? !versionid.equals(that.versionid) : that.versionid != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (weightvalue != null ? !weightvalue.equals(that.weightvalue) : that.weightvalue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = versionid != null ? versionid.hashCode() : 0;
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        result = 31 * result + (importance != null ? importance.hashCode() : 0);
        result = 31 * result + (maintain != null ? maintain.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (deviceweghtid != null ? deviceweghtid.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (weightvalue != null ? weightvalue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tdeviceweight{");
        sb.append("versionid=").append(versionid);
        sb.append(", deviceid='").append(deviceid).append('\'');
        sb.append(", importance=").append(importance);
        sb.append(", maintain=").append(maintain);
        sb.append(", weight=").append(weight);
        sb.append(", deviceweghtid='").append(deviceweghtid).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", weightvalue=").append(weightvalue);
        sb.append('}');
        return sb.toString();
    }
}
