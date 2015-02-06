package com.jsjty.model;

import java.sql.Date;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TrepairTaskFeedback {
    private String taskid;
    private String taskname;
    private Date finishtime;
    private Date systime;
    private Double realcost;
    private String remark;
    private String imgurl;
    private String fileurl;
    private String videourl;
    private String feedbackid;
    private String userid;
    private String username;
    private String content;

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

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Date getSystime() {
        return systime;
    }

    public void setSystime(Date systime) {
        this.systime = systime;
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

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(String feedbackid) {
        this.feedbackid = feedbackid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrepairTaskFeedback that = (TrepairTaskFeedback) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (feedbackid != null ? !feedbackid.equals(that.feedbackid) : that.feedbackid != null) return false;
        if (fileurl != null ? !fileurl.equals(that.fileurl) : that.fileurl != null) return false;
        if (finishtime != null ? !finishtime.equals(that.finishtime) : that.finishtime != null) return false;
        if (imgurl != null ? !imgurl.equals(that.imgurl) : that.imgurl != null) return false;
        if (realcost != null ? !realcost.equals(that.realcost) : that.realcost != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (systime != null ? !systime.equals(that.systime) : that.systime != null) return false;
        if (taskid != null ? !taskid.equals(that.taskid) : that.taskid != null) return false;
        if (taskname != null ? !taskname.equals(that.taskname) : that.taskname != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (videourl != null ? !videourl.equals(that.videourl) : that.videourl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskid != null ? taskid.hashCode() : 0;
        result = 31 * result + (taskname != null ? taskname.hashCode() : 0);
        result = 31 * result + (finishtime != null ? finishtime.hashCode() : 0);
        result = 31 * result + (systime != null ? systime.hashCode() : 0);
        result = 31 * result + (realcost != null ? realcost.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (imgurl != null ? imgurl.hashCode() : 0);
        result = 31 * result + (fileurl != null ? fileurl.hashCode() : 0);
        result = 31 * result + (videourl != null ? videourl.hashCode() : 0);
        result = 31 * result + (feedbackid != null ? feedbackid.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrepairTaskFeedback{");
        sb.append("taskid='").append(taskid).append('\'');
        sb.append(", taskname='").append(taskname).append('\'');
        sb.append(", finishtime=").append(finishtime);
        sb.append(", systime=").append(systime);
        sb.append(", realcost=").append(realcost);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", imgurl='").append(imgurl).append('\'');
        sb.append(", fileurl='").append(fileurl).append('\'');
        sb.append(", videourl='").append(videourl).append('\'');
        sb.append(", feedbackid='").append(feedbackid).append('\'');
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
