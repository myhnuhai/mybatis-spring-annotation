package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Ttask {
    private String taskid;
    private String taskname;
    private String qrcodeids;
    private String taskstatus;
    private String tasktype;
    private String periodtype;
    private String periodcount;
    private String remark;
    private String region;

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

    public String getQrcodeids() {
        return qrcodeids;
    }

    public void setQrcodeids(String qrcodeids) {
        this.qrcodeids = qrcodeids;
    }

    public String getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    public String getPeriodtype() {
        return periodtype;
    }

    public void setPeriodtype(String periodtype) {
        this.periodtype = periodtype;
    }

    public String getPeriodcount() {
        return periodcount;
    }

    public void setPeriodcount(String periodcount) {
        this.periodcount = periodcount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ttask ttask = (Ttask) o;

        if (periodcount != null ? !periodcount.equals(ttask.periodcount) : ttask.periodcount != null) return false;
        if (periodtype != null ? !periodtype.equals(ttask.periodtype) : ttask.periodtype != null) return false;
        if (qrcodeids != null ? !qrcodeids.equals(ttask.qrcodeids) : ttask.qrcodeids != null) return false;
        if (region != null ? !region.equals(ttask.region) : ttask.region != null) return false;
        if (remark != null ? !remark.equals(ttask.remark) : ttask.remark != null) return false;
        if (taskid != null ? !taskid.equals(ttask.taskid) : ttask.taskid != null) return false;
        if (taskname != null ? !taskname.equals(ttask.taskname) : ttask.taskname != null) return false;
        if (taskstatus != null ? !taskstatus.equals(ttask.taskstatus) : ttask.taskstatus != null) return false;
        if (tasktype != null ? !tasktype.equals(ttask.tasktype) : ttask.tasktype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskid != null ? taskid.hashCode() : 0;
        result = 31 * result + (taskname != null ? taskname.hashCode() : 0);
        result = 31 * result + (qrcodeids != null ? qrcodeids.hashCode() : 0);
        result = 31 * result + (taskstatus != null ? taskstatus.hashCode() : 0);
        result = 31 * result + (tasktype != null ? tasktype.hashCode() : 0);
        result = 31 * result + (periodtype != null ? periodtype.hashCode() : 0);
        result = 31 * result + (periodcount != null ? periodcount.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ttask{");
        sb.append("taskid='").append(taskid).append('\'');
        sb.append(", taskname='").append(taskname).append('\'');
        sb.append(", qrcodeids='").append(qrcodeids).append('\'');
        sb.append(", taskstatus='").append(taskstatus).append('\'');
        sb.append(", tasktype='").append(tasktype).append('\'');
        sb.append(", periodtype='").append(periodtype).append('\'');
        sb.append(", periodcount='").append(periodcount).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
