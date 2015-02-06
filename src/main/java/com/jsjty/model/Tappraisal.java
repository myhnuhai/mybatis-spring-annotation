package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tappraisal {
    private String appraisalid;
    private String title;
    private Integer appraisaltype;
    private Float detcash;
    private Float detmarks;
    private Timestamp finddate;
    private Timestamp sysdate;
    private String deptid;
    private String createuserid;
    private String question;
    private Integer appraisalkind;
    private Float detmark;
    private Integer detmarkcount;

    public String getAppraisalid() {
        return appraisalid;
    }

    public void setAppraisalid(String appraisalid) {
        this.appraisalid = appraisalid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAppraisaltype() {
        return appraisaltype;
    }

    public void setAppraisaltype(Integer appraisaltype) {
        this.appraisaltype = appraisaltype;
    }

    public Float getDetcash() {
        return detcash;
    }

    public void setDetcash(Float detcash) {
        this.detcash = detcash;
    }

    public Float getDetmarks() {
        return detmarks;
    }

    public void setDetmarks(Float detmarks) {
        this.detmarks = detmarks;
    }

    public Timestamp getFinddate() {
        return finddate;
    }

    public void setFinddate(Timestamp finddate) {
        this.finddate = finddate;
    }

    public Timestamp getSysdate() {
        return sysdate;
    }

    public void setSysdate(Timestamp sysdate) {
        this.sysdate = sysdate;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getAppraisalkind() {
        return appraisalkind;
    }

    public void setAppraisalkind(Integer appraisalkind) {
        this.appraisalkind = appraisalkind;
    }

    public Float getDetmark() {
        return detmark;
    }

    public void setDetmark(Float detmark) {
        this.detmark = detmark;
    }

    public Integer getDetmarkcount() {
        return detmarkcount;
    }

    public void setDetmarkcount(Integer detmarkcount) {
        this.detmarkcount = detmarkcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tappraisal that = (Tappraisal) o;

        if (appraisalid != null ? !appraisalid.equals(that.appraisalid) : that.appraisalid != null) return false;
        if (appraisalkind != null ? !appraisalkind.equals(that.appraisalkind) : that.appraisalkind != null)
            return false;
        if (appraisaltype != null ? !appraisaltype.equals(that.appraisaltype) : that.appraisaltype != null)
            return false;
        if (createuserid != null ? !createuserid.equals(that.createuserid) : that.createuserid != null) return false;
        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (detcash != null ? !detcash.equals(that.detcash) : that.detcash != null) return false;
        if (detmark != null ? !detmark.equals(that.detmark) : that.detmark != null) return false;
        if (detmarkcount != null ? !detmarkcount.equals(that.detmarkcount) : that.detmarkcount != null) return false;
        if (detmarks != null ? !detmarks.equals(that.detmarks) : that.detmarks != null) return false;
        if (finddate != null ? !finddate.equals(that.finddate) : that.finddate != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (sysdate != null ? !sysdate.equals(that.sysdate) : that.sysdate != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appraisalid != null ? appraisalid.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (appraisaltype != null ? appraisaltype.hashCode() : 0);
        result = 31 * result + (detcash != null ? detcash.hashCode() : 0);
        result = 31 * result + (detmarks != null ? detmarks.hashCode() : 0);
        result = 31 * result + (finddate != null ? finddate.hashCode() : 0);
        result = 31 * result + (sysdate != null ? sysdate.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (createuserid != null ? createuserid.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (appraisalkind != null ? appraisalkind.hashCode() : 0);
        result = 31 * result + (detmark != null ? detmark.hashCode() : 0);
        result = 31 * result + (detmarkcount != null ? detmarkcount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tappraisal{");
        sb.append("appraisalid='").append(appraisalid).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", appraisaltype=").append(appraisaltype);
        sb.append(", detcash=").append(detcash);
        sb.append(", detmarks=").append(detmarks);
        sb.append(", finddate=").append(finddate);
        sb.append(", sysdate=").append(sysdate);
        sb.append(", deptid='").append(deptid).append('\'');
        sb.append(", createuserid='").append(createuserid).append('\'');
        sb.append(", question='").append(question).append('\'');
        sb.append(", appraisalkind=").append(appraisalkind);
        sb.append(", detmark=").append(detmark);
        sb.append(", detmarkcount=").append(detmarkcount);
        sb.append('}');
        return sb.toString();
    }
}
