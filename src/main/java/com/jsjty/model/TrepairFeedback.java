package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TrepairFeedback {
    private String taskid;
    private String fileurl;
    private Timestamp finishtime;
    private String questionid;
    private Double realcost;
    private String remark;
    private Timestamp systime;
    private String taskname;
    private String username;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public Timestamp getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Timestamp finishtime) {
        this.finishtime = finishtime;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public Double getRealcost() {
        return realcost;
    }

    public void setRealcost(Double realcost) {
        this.realcost = realcost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getSystime() {
        return systime;
    }

    public void setSystime(Timestamp systime) {
        this.systime = systime;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrepairFeedback that = (TrepairFeedback) o;

        if (fileurl != null ? !fileurl.equals(that.fileurl) : that.fileurl != null) return false;
        if (finishtime != null ? !finishtime.equals(that.finishtime) : that.finishtime != null) return false;
        if (questionid != null ? !questionid.equals(that.questionid) : that.questionid != null) return false;
        if (realcost != null ? !realcost.equals(that.realcost) : that.realcost != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (systime != null ? !systime.equals(that.systime) : that.systime != null) return false;
        if (taskid != null ? !taskid.equals(that.taskid) : that.taskid != null) return false;
        if (taskname != null ? !taskname.equals(that.taskname) : that.taskname != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskid != null ? taskid.hashCode() : 0;
        result = 31 * result + (fileurl != null ? fileurl.hashCode() : 0);
        result = 31 * result + (finishtime != null ? finishtime.hashCode() : 0);
        result = 31 * result + (questionid != null ? questionid.hashCode() : 0);
        result = 31 * result + (realcost != null ? realcost.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (systime != null ? systime.hashCode() : 0);
        result = 31 * result + (taskname != null ? taskname.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrepairFeedback{");
        sb.append("taskid='").append(taskid).append('\'');
        sb.append(", fileurl='").append(fileurl).append('\'');
        sb.append(", finishtime=").append(finishtime);
        sb.append(", questionid='").append(questionid).append('\'');
        sb.append(", realcost=").append(realcost);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", systime=").append(systime);
        sb.append(", taskname='").append(taskname).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
