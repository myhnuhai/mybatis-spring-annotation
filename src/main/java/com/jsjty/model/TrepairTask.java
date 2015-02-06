package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TrepairTask {
    private String taskid;
    private Double ygcost;
    private Timestamp wctime;
    private String deptid;
    private String deptname;
    private String title;
    private Integer tasktype;
    private Integer taskstatus;
    private String fileurl;
    private String imgurl;
    private String questionid;
    private String createuserid;
    private Timestamp sysdate;
    private String content;
    private String remark;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public Double getYgcost() {
        return ygcost;
    }

    public void setYgcost(Double ygcost) {
        this.ygcost = ygcost;
    }

    public Timestamp getWctime() {
        return wctime;
    }

    public void setWctime(Timestamp wctime) {
        this.wctime = wctime;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTasktype() {
        return tasktype;
    }

    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
    }

    public Integer getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(Integer taskstatus) {
        this.taskstatus = taskstatus;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public Timestamp getSysdate() {
        return sysdate;
    }

    public void setSysdate(Timestamp sysdate) {
        this.sysdate = sysdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

        TrepairTask that = (TrepairTask) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createuserid != null ? !createuserid.equals(that.createuserid) : that.createuserid != null) return false;
        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (deptname != null ? !deptname.equals(that.deptname) : that.deptname != null) return false;
        if (fileurl != null ? !fileurl.equals(that.fileurl) : that.fileurl != null) return false;
        if (imgurl != null ? !imgurl.equals(that.imgurl) : that.imgurl != null) return false;
        if (questionid != null ? !questionid.equals(that.questionid) : that.questionid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (sysdate != null ? !sysdate.equals(that.sysdate) : that.sysdate != null) return false;
        if (taskid != null ? !taskid.equals(that.taskid) : that.taskid != null) return false;
        if (taskstatus != null ? !taskstatus.equals(that.taskstatus) : that.taskstatus != null) return false;
        if (tasktype != null ? !tasktype.equals(that.tasktype) : that.tasktype != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (wctime != null ? !wctime.equals(that.wctime) : that.wctime != null) return false;
        if (ygcost != null ? !ygcost.equals(that.ygcost) : that.ygcost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskid != null ? taskid.hashCode() : 0;
        result = 31 * result + (ygcost != null ? ygcost.hashCode() : 0);
        result = 31 * result + (wctime != null ? wctime.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (deptname != null ? deptname.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (tasktype != null ? tasktype.hashCode() : 0);
        result = 31 * result + (taskstatus != null ? taskstatus.hashCode() : 0);
        result = 31 * result + (fileurl != null ? fileurl.hashCode() : 0);
        result = 31 * result + (imgurl != null ? imgurl.hashCode() : 0);
        result = 31 * result + (questionid != null ? questionid.hashCode() : 0);
        result = 31 * result + (createuserid != null ? createuserid.hashCode() : 0);
        result = 31 * result + (sysdate != null ? sysdate.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrepairTask{");
        sb.append("taskid='").append(taskid).append('\'');
        sb.append(", ygcost=").append(ygcost);
        sb.append(", wctime=").append(wctime);
        sb.append(", deptid='").append(deptid).append('\'');
        sb.append(", deptname='").append(deptname).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", tasktype=").append(tasktype);
        sb.append(", taskstatus=").append(taskstatus);
        sb.append(", fileurl='").append(fileurl).append('\'');
        sb.append(", imgurl='").append(imgurl).append('\'');
        sb.append(", questionid='").append(questionid).append('\'');
        sb.append(", createuserid='").append(createuserid).append('\'');
        sb.append(", sysdate=").append(sysdate);
        sb.append(", content='").append(content).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
