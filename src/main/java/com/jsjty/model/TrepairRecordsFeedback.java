package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TrepairRecordsFeedback {
    private String feedbackid;
    private String questionid;
    private String phoneid;
    private String title;
    private String content;
    private Double maintaincost;
    private String userid;
    private Timestamp finishdate;
    private Timestamp feedbackdate;
    private String fileurl;
    private String imgurl;
    private String videourl;
    private String remark;

    public String getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(String feedbackid) {
        this.feedbackid = feedbackid;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(String phoneid) {
        this.phoneid = phoneid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getMaintaincost() {
        return maintaincost;
    }

    public void setMaintaincost(Double maintaincost) {
        this.maintaincost = maintaincost;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Timestamp getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Timestamp finishdate) {
        this.finishdate = finishdate;
    }

    public Timestamp getFeedbackdate() {
        return feedbackdate;
    }

    public void setFeedbackdate(Timestamp feedbackdate) {
        this.feedbackdate = feedbackdate;
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

        TrepairRecordsFeedback that = (TrepairRecordsFeedback) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (feedbackdate != null ? !feedbackdate.equals(that.feedbackdate) : that.feedbackdate != null) return false;
        if (feedbackid != null ? !feedbackid.equals(that.feedbackid) : that.feedbackid != null) return false;
        if (fileurl != null ? !fileurl.equals(that.fileurl) : that.fileurl != null) return false;
        if (finishdate != null ? !finishdate.equals(that.finishdate) : that.finishdate != null) return false;
        if (imgurl != null ? !imgurl.equals(that.imgurl) : that.imgurl != null) return false;
        if (maintaincost != null ? !maintaincost.equals(that.maintaincost) : that.maintaincost != null) return false;
        if (phoneid != null ? !phoneid.equals(that.phoneid) : that.phoneid != null) return false;
        if (questionid != null ? !questionid.equals(that.questionid) : that.questionid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (videourl != null ? !videourl.equals(that.videourl) : that.videourl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = feedbackid != null ? feedbackid.hashCode() : 0;
        result = 31 * result + (questionid != null ? questionid.hashCode() : 0);
        result = 31 * result + (phoneid != null ? phoneid.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (maintaincost != null ? maintaincost.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (finishdate != null ? finishdate.hashCode() : 0);
        result = 31 * result + (feedbackdate != null ? feedbackdate.hashCode() : 0);
        result = 31 * result + (fileurl != null ? fileurl.hashCode() : 0);
        result = 31 * result + (imgurl != null ? imgurl.hashCode() : 0);
        result = 31 * result + (videourl != null ? videourl.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrepairRecordsFeedback{");
        sb.append("feedbackid='").append(feedbackid).append('\'');
        sb.append(", questionid='").append(questionid).append('\'');
        sb.append(", phoneid='").append(phoneid).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", maintaincost=").append(maintaincost);
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", finishdate=").append(finishdate);
        sb.append(", feedbackdate=").append(feedbackdate);
        sb.append(", fileurl='").append(fileurl).append('\'');
        sb.append(", imgurl='").append(imgurl).append('\'');
        sb.append(", videourl='").append(videourl).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
