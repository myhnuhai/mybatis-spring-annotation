package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tfeedback {
    private String feedbackid;
    private String userid;
    private String username;
    private String title;
    private String content;
    private Timestamp feedbackdate;

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

    public Timestamp getFeedbackdate() {
        return feedbackdate;
    }

    public void setFeedbackdate(Timestamp feedbackdate) {
        this.feedbackdate = feedbackdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tfeedback tfeedback = (Tfeedback) o;

        if (content != null ? !content.equals(tfeedback.content) : tfeedback.content != null) return false;
        if (feedbackdate != null ? !feedbackdate.equals(tfeedback.feedbackdate) : tfeedback.feedbackdate != null)
            return false;
        if (feedbackid != null ? !feedbackid.equals(tfeedback.feedbackid) : tfeedback.feedbackid != null) return false;
        if (title != null ? !title.equals(tfeedback.title) : tfeedback.title != null) return false;
        if (userid != null ? !userid.equals(tfeedback.userid) : tfeedback.userid != null) return false;
        if (username != null ? !username.equals(tfeedback.username) : tfeedback.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = feedbackid != null ? feedbackid.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (feedbackdate != null ? feedbackdate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tfeedback{");
        sb.append("feedbackid='").append(feedbackid).append('\'');
        sb.append(", userid='").append(userid).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", feedbackdate=").append(feedbackdate);
        sb.append('}');
        return sb.toString();
    }
}
