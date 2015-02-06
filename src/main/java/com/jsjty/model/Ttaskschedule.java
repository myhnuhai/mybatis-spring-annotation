package com.jsjty.model;

import java.sql.Date;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Ttaskschedule {
    private String scheduleid;
    private String userid;
    private String username;
    private String taskid;
    private String taskname;
    private Date startdate;
    private String remark;
    private Date createdate;
    private Integer taskstatus;

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
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

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(Integer taskstatus) {
        this.taskstatus = taskstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ttaskschedule that = (Ttaskschedule) o;

        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (scheduleid != null ? !scheduleid.equals(that.scheduleid) : that.scheduleid != null) return false;
        if (startdate != null ? !startdate.equals(that.startdate) : that.startdate != null) return false;
        if (taskid != null ? !taskid.equals(that.taskid) : that.taskid != null) return false;
        if (taskname != null ? !taskname.equals(that.taskname) : that.taskname != null) return false;
        if (taskstatus != null ? !taskstatus.equals(that.taskstatus) : that.taskstatus != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scheduleid != null ? scheduleid.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (taskid != null ? taskid.hashCode() : 0);
        result = 31 * result + (taskname != null ? taskname.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (taskstatus != null ? taskstatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ttaskschedule{");
        sb.append("scheduleid='").append(scheduleid).append('\'');
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", taskid='").append(taskid).append('\'');
        sb.append(", taskname='").append(taskname).append('\'');
        sb.append(", startdate=").append(startdate);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", createdate=").append(createdate);
        sb.append(", taskstatus=").append(taskstatus);
        sb.append('}');
        return sb.toString();
    }
}
