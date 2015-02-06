package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TinspectRecords {
    private String contentid;
    private String userid;
    private String username;
    private String lteid;
    private String deviceid;
    private String devicename;
    private String deptid;
    private String deptname;
    private String standardid;
    private String inspectresult;
    private Timestamp devicecreatedate;
    private Timestamp syscreatedate;
    private String imageurl;
    private String videourl;
    private String remark;

    public String getContentid() {
        return contentid;
    }

    public void setContentid(String contentid) {
        this.contentid = contentid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLteid() {
        return lteid;
    }

    public void setLteid(String lteid) {
        this.lteid = lteid;
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

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getStandardid() {
        return standardid;
    }

    public void setStandardid(String standardid) {
        this.standardid = standardid;
    }

    public String getInspectresult() {
        return inspectresult;
    }

    public void setInspectresult(String inspectresult) {
        this.inspectresult = inspectresult;
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

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
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

        TinspectRecords that = (TinspectRecords) o;

        if (contentid != null ? !contentid.equals(that.contentid) : that.contentid != null) return false;
        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (deptname != null ? !deptname.equals(that.deptname) : that.deptname != null) return false;
        if (devicecreatedate != null ? !devicecreatedate.equals(that.devicecreatedate) : that.devicecreatedate != null)
            return false;
        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (devicename != null ? !devicename.equals(that.devicename) : that.devicename != null) return false;
        if (imageurl != null ? !imageurl.equals(that.imageurl) : that.imageurl != null) return false;
        if (inspectresult != null ? !inspectresult.equals(that.inspectresult) : that.inspectresult != null)
            return false;
        if (lteid != null ? !lteid.equals(that.lteid) : that.lteid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (standardid != null ? !standardid.equals(that.standardid) : that.standardid != null) return false;
        if (syscreatedate != null ? !syscreatedate.equals(that.syscreatedate) : that.syscreatedate != null)
            return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (videourl != null ? !videourl.equals(that.videourl) : that.videourl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentid != null ? contentid.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (lteid != null ? lteid.hashCode() : 0);
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        result = 31 * result + (devicename != null ? devicename.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (deptname != null ? deptname.hashCode() : 0);
        result = 31 * result + (standardid != null ? standardid.hashCode() : 0);
        result = 31 * result + (inspectresult != null ? inspectresult.hashCode() : 0);
        result = 31 * result + (devicecreatedate != null ? devicecreatedate.hashCode() : 0);
        result = 31 * result + (syscreatedate != null ? syscreatedate.hashCode() : 0);
        result = 31 * result + (imageurl != null ? imageurl.hashCode() : 0);
        result = 31 * result + (videourl != null ? videourl.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TinspectRecords{");
        sb.append("contentid='").append(contentid).append('\'');
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", lteid='").append(lteid).append('\'');
        sb.append(", deviceid='").append(deviceid).append('\'');
        sb.append(", devicename='").append(devicename).append('\'');
        sb.append(", deptid='").append(deptid).append('\'');
        sb.append(", deptname='").append(deptname).append('\'');
        sb.append(", standardid='").append(standardid).append('\'');
        sb.append(", inspectresult='").append(inspectresult).append('\'');
        sb.append(", devicecreatedate=").append(devicecreatedate);
        sb.append(", syscreatedate=").append(syscreatedate);
        sb.append(", imageurl='").append(imageurl).append('\'');
        sb.append(", videourl='").append(videourl).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
