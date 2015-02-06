package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TinspectStandard {
    private String standardid;
    private String deviceid;
    private String inspectcontent;
    private String inspectstandard;
    private String inspectresult;
    private String periodtype;
    private String periodcount;
    private String datatype;
    private String remark;

    public String getStandardid() {
        return standardid;
    }

    public void setStandardid(String standardid) {
        this.standardid = standardid;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getInspectcontent() {
        return inspectcontent;
    }

    public void setInspectcontent(String inspectcontent) {
        this.inspectcontent = inspectcontent;
    }

    public String getInspectstandard() {
        return inspectstandard;
    }

    public void setInspectstandard(String inspectstandard) {
        this.inspectstandard = inspectstandard;
    }

    public String getInspectresult() {
        return inspectresult;
    }

    public void setInspectresult(String inspectresult) {
        this.inspectresult = inspectresult;
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

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
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

        TinspectStandard that = (TinspectStandard) o;

        if (datatype != null ? !datatype.equals(that.datatype) : that.datatype != null) return false;
        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (inspectcontent != null ? !inspectcontent.equals(that.inspectcontent) : that.inspectcontent != null)
            return false;
        if (inspectresult != null ? !inspectresult.equals(that.inspectresult) : that.inspectresult != null)
            return false;
        if (inspectstandard != null ? !inspectstandard.equals(that.inspectstandard) : that.inspectstandard != null)
            return false;
        if (periodcount != null ? !periodcount.equals(that.periodcount) : that.periodcount != null) return false;
        if (periodtype != null ? !periodtype.equals(that.periodtype) : that.periodtype != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (standardid != null ? !standardid.equals(that.standardid) : that.standardid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = standardid != null ? standardid.hashCode() : 0;
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        result = 31 * result + (inspectcontent != null ? inspectcontent.hashCode() : 0);
        result = 31 * result + (inspectstandard != null ? inspectstandard.hashCode() : 0);
        result = 31 * result + (inspectresult != null ? inspectresult.hashCode() : 0);
        result = 31 * result + (periodtype != null ? periodtype.hashCode() : 0);
        result = 31 * result + (periodcount != null ? periodcount.hashCode() : 0);
        result = 31 * result + (datatype != null ? datatype.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TinspectStandard{");
        sb.append("standardid='").append(standardid).append('\'');
        sb.append(", deviceid='").append(deviceid).append('\'');
        sb.append(", inspectcontent='").append(inspectcontent).append('\'');
        sb.append(", inspectstandard='").append(inspectstandard).append('\'');
        sb.append(", inspectresult='").append(inspectresult).append('\'');
        sb.append(", periodtype='").append(periodtype).append('\'');
        sb.append(", periodcount='").append(periodcount).append('\'');
        sb.append(", datatype='").append(datatype).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
