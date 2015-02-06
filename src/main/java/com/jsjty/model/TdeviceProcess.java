package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TdeviceProcess {
    private String deviceid;
    private String periodtype;
    private Integer periodcount;
    private Integer process;
    private Integer inspectcount;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getPeriodtype() {
        return periodtype;
    }

    public void setPeriodtype(String periodtype) {
        this.periodtype = periodtype;
    }

    public Integer getPeriodcount() {
        return periodcount;
    }

    public void setPeriodcount(Integer periodcount) {
        this.periodcount = periodcount;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public Integer getInspectcount() {
        return inspectcount;
    }

    public void setInspectcount(Integer inspectcount) {
        this.inspectcount = inspectcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TdeviceProcess that = (TdeviceProcess) o;

        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (inspectcount != null ? !inspectcount.equals(that.inspectcount) : that.inspectcount != null) return false;
        if (periodcount != null ? !periodcount.equals(that.periodcount) : that.periodcount != null) return false;
        if (periodtype != null ? !periodtype.equals(that.periodtype) : that.periodtype != null) return false;
        if (process != null ? !process.equals(that.process) : that.process != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deviceid != null ? deviceid.hashCode() : 0;
        result = 31 * result + (periodtype != null ? periodtype.hashCode() : 0);
        result = 31 * result + (periodcount != null ? periodcount.hashCode() : 0);
        result = 31 * result + (process != null ? process.hashCode() : 0);
        result = 31 * result + (inspectcount != null ? inspectcount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TdeviceProcess{");
        sb.append("deviceid='").append(deviceid).append('\'');
        sb.append(", periodtype='").append(periodtype).append('\'');
        sb.append(", periodcount=").append(periodcount);
        sb.append(", process=").append(process);
        sb.append(", inspectcount=").append(inspectcount);
        sb.append('}');
        return sb.toString();
    }
}
