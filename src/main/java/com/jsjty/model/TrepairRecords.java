package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TrepairRecords {
    private String questionid;

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    private String lteid;

    public String getLteid() {
        return lteid;
    }

    public void setLteid(String lteid) {
        this.lteid = lteid;
    }

    private String phoneid;

    public String getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(String phoneid) {
        this.phoneid = phoneid;
    }

    private String deviceid;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    private String devicename;

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private Integer handle;

    public Integer getHandle() {
        return handle;
    }

    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    private String repairtype;

    public String getRepairtype() {
        return repairtype;
    }

    public void setRepairtype(String repairtype) {
        this.repairtype = repairtype;
    }

    private Integer maintainstatus;

    public Integer getMaintainstatus() {
        return maintainstatus;
    }

    public void setMaintainstatus(Integer maintainstatus) {
        this.maintainstatus = maintainstatus;
    }

    private String imgurl;

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    private String videourl;

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    private Timestamp reportdate;

    public Timestamp getReportdate() {
        return reportdate;
    }

    public void setReportdate(Timestamp reportdate) {
        this.reportdate = reportdate;
    }

    private Timestamp finddate;

    public Timestamp getFinddate() {
        return finddate;
    }

    public void setFinddate(Timestamp finddate) {
        this.finddate = finddate;
    }

    private Timestamp modifydate;

    public Timestamp getModifydate() {
        return modifydate;
    }

    public void setModifydate(Timestamp modifydate) {
        this.modifydate = modifydate;
    }

    private Double maintaincost;

    public Double getMaintaincost() {
        return maintaincost;
    }

    public void setMaintaincost(Double maintaincost) {
        this.maintaincost = maintaincost;
    }

    private Integer severitylevel;

    public Integer getSeveritylevel() {
        return severitylevel;
    }

    public void setSeveritylevel(Integer severitylevel) {
        this.severitylevel = severitylevel;
    }

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String deptid;

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrepairRecords that = (TrepairRecords) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (devicename != null ? !devicename.equals(that.devicename) : that.devicename != null) return false;
        if (finddate != null ? !finddate.equals(that.finddate) : that.finddate != null) return false;
        if (handle != null ? !handle.equals(that.handle) : that.handle != null) return false;
        if (imgurl != null ? !imgurl.equals(that.imgurl) : that.imgurl != null) return false;
        if (lteid != null ? !lteid.equals(that.lteid) : that.lteid != null) return false;
        if (maintaincost != null ? !maintaincost.equals(that.maintaincost) : that.maintaincost != null) return false;
        if (maintainstatus != null ? !maintainstatus.equals(that.maintainstatus) : that.maintainstatus != null)
            return false;
        if (modifydate != null ? !modifydate.equals(that.modifydate) : that.modifydate != null) return false;
        if (phoneid != null ? !phoneid.equals(that.phoneid) : that.phoneid != null) return false;
        if (questionid != null ? !questionid.equals(that.questionid) : that.questionid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (repairtype != null ? !repairtype.equals(that.repairtype) : that.repairtype != null) return false;
        if (reportdate != null ? !reportdate.equals(that.reportdate) : that.reportdate != null) return false;
        if (severitylevel != null ? !severitylevel.equals(that.severitylevel) : that.severitylevel != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (videourl != null ? !videourl.equals(that.videourl) : that.videourl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questionid != null ? questionid.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (lteid != null ? lteid.hashCode() : 0);
        result = 31 * result + (phoneid != null ? phoneid.hashCode() : 0);
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        result = 31 * result + (devicename != null ? devicename.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (handle != null ? handle.hashCode() : 0);
        result = 31 * result + (repairtype != null ? repairtype.hashCode() : 0);
        result = 31 * result + (maintainstatus != null ? maintainstatus.hashCode() : 0);
        result = 31 * result + (imgurl != null ? imgurl.hashCode() : 0);
        result = 31 * result + (videourl != null ? videourl.hashCode() : 0);
        result = 31 * result + (reportdate != null ? reportdate.hashCode() : 0);
        result = 31 * result + (finddate != null ? finddate.hashCode() : 0);
        result = 31 * result + (modifydate != null ? modifydate.hashCode() : 0);
        result = 31 * result + (maintaincost != null ? maintaincost.hashCode() : 0);
        result = 31 * result + (severitylevel != null ? severitylevel.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrepairRecords{");
        sb.append("questionid='").append(questionid).append('\'');
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", lteid='").append(lteid).append('\'');
        sb.append(", phoneid='").append(phoneid).append('\'');
        sb.append(", deviceid='").append(deviceid).append('\'');
        sb.append(", devicename='").append(devicename).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", handle=").append(handle);
        sb.append(", repairtype='").append(repairtype).append('\'');
        sb.append(", maintainstatus=").append(maintainstatus);
        sb.append(", imgurl='").append(imgurl).append('\'');
        sb.append(", videourl='").append(videourl).append('\'');
        sb.append(", reportdate=").append(reportdate);
        sb.append(", finddate=").append(finddate);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", maintaincost=").append(maintaincost);
        sb.append(", severitylevel=").append(severitylevel);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", deptid='").append(deptid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
