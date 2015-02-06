package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tstockuse {
    private String stockuseid;
    private String materialid;
    private Integer count;
    private String useparent;
    private String usedept;
    private Timestamp usetime;
    private Timestamp systime;
    private String remark;

    public String getStockuseid() {
        return stockuseid;
    }

    public void setStockuseid(String stockuseid) {
        this.stockuseid = stockuseid;
    }

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUseparent() {
        return useparent;
    }

    public void setUseparent(String useparent) {
        this.useparent = useparent;
    }

    public String getUsedept() {
        return usedept;
    }

    public void setUsedept(String usedept) {
        this.usedept = usedept;
    }

    public Timestamp getUsetime() {
        return usetime;
    }

    public void setUsetime(Timestamp usetime) {
        this.usetime = usetime;
    }

    public Timestamp getSystime() {
        return systime;
    }

    public void setSystime(Timestamp systime) {
        this.systime = systime;
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

        Tstockuse tstockuse = (Tstockuse) o;

        if (count != null ? !count.equals(tstockuse.count) : tstockuse.count != null) return false;
        if (materialid != null ? !materialid.equals(tstockuse.materialid) : tstockuse.materialid != null) return false;
        if (remark != null ? !remark.equals(tstockuse.remark) : tstockuse.remark != null) return false;
        if (stockuseid != null ? !stockuseid.equals(tstockuse.stockuseid) : tstockuse.stockuseid != null) return false;
        if (systime != null ? !systime.equals(tstockuse.systime) : tstockuse.systime != null) return false;
        if (usedept != null ? !usedept.equals(tstockuse.usedept) : tstockuse.usedept != null) return false;
        if (useparent != null ? !useparent.equals(tstockuse.useparent) : tstockuse.useparent != null) return false;
        if (usetime != null ? !usetime.equals(tstockuse.usetime) : tstockuse.usetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockuseid != null ? stockuseid.hashCode() : 0;
        result = 31 * result + (materialid != null ? materialid.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (useparent != null ? useparent.hashCode() : 0);
        result = 31 * result + (usedept != null ? usedept.hashCode() : 0);
        result = 31 * result + (usetime != null ? usetime.hashCode() : 0);
        result = 31 * result + (systime != null ? systime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tstockuse{");
        sb.append("stockuseid='").append(stockuseid).append('\'');
        sb.append(", materialid='").append(materialid).append('\'');
        sb.append(", count=").append(count);
        sb.append(", useparent='").append(useparent).append('\'');
        sb.append(", usedept='").append(usedept).append('\'');
        sb.append(", usetime=").append(usetime);
        sb.append(", systime=").append(systime);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
