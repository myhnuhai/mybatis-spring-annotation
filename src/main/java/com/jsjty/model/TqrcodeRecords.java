package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TqrcodeRecords {
    private String recodeid;
    private String qrcodeid;
    private String userid;
    private String deptid;
    private String lteid;
    private String phoneid;
    private Timestamp devicecreatedate;
    private Timestamp syscreatedate;
    private String remark;

    public String getRecodeid() {
        return recodeid;
    }

    public void setRecodeid(String recodeid) {
        this.recodeid = recodeid;
    }

    public String getQrcodeid() {
        return qrcodeid;
    }

    public void setQrcodeid(String qrcodeid) {
        this.qrcodeid = qrcodeid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getLteid() {
        return lteid;
    }

    public void setLteid(String lteid) {
        this.lteid = lteid;
    }

    public String getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(String phoneid) {
        this.phoneid = phoneid;
    }

    public Timestamp getDevicecreatedate() {
        return devicecreatedate;
    }

    public void setDevicecreatedate(Timestamp devicecreatedate) {
        this.devicecreatedate = devicecreatedate;
    }

    public Timestamp getSyscreatedate() {
        return syscreatedate;
    }

    public void setSyscreatedate(Timestamp syscreatedate) {
        this.syscreatedate = syscreatedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TqrcodeRecords that = (TqrcodeRecords) o;

        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (devicecreatedate != null ? !devicecreatedate.equals(that.devicecreatedate) : that.devicecreatedate != null)
            return false;
        if (lteid != null ? !lteid.equals(that.lteid) : that.lteid != null) return false;
        if (phoneid != null ? !phoneid.equals(that.phoneid) : that.phoneid != null) return false;
        if (qrcodeid != null ? !qrcodeid.equals(that.qrcodeid) : that.qrcodeid != null) return false;
        if (recodeid != null ? !recodeid.equals(that.recodeid) : that.recodeid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (syscreatedate != null ? !syscreatedate.equals(that.syscreatedate) : that.syscreatedate != null)
            return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recodeid != null ? recodeid.hashCode() : 0;
        result = 31 * result + (qrcodeid != null ? qrcodeid.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (lteid != null ? lteid.hashCode() : 0);
        result = 31 * result + (phoneid != null ? phoneid.hashCode() : 0);
        result = 31 * result + (devicecreatedate != null ? devicecreatedate.hashCode() : 0);
        result = 31 * result + (syscreatedate != null ? syscreatedate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TqrcodeRecords{");
        sb.append("recodeid='").append(recodeid).append('\'');
        sb.append(", qrcodeid='").append(qrcodeid).append('\'');
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", deptid='").append(deptid).append('\'');
        sb.append(", lteid='").append(lteid).append('\'');
        sb.append(", phoneid='").append(phoneid).append('\'');
        sb.append(", devicecreatedate=").append(devicecreatedate);
        sb.append(", syscreatedate=").append(syscreatedate);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
