package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tstockin {
    private String materialid;
    private Timestamp intime;
    private Integer count;
    private String remark;
    private String stockinid;

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid;
    }

    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStockinid() {
        return stockinid;
    }

    public void setStockinid(String stockinid) {
        this.stockinid = stockinid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tstockin tstockin = (Tstockin) o;

        if (count != null ? !count.equals(tstockin.count) : tstockin.count != null) return false;
        if (intime != null ? !intime.equals(tstockin.intime) : tstockin.intime != null) return false;
        if (materialid != null ? !materialid.equals(tstockin.materialid) : tstockin.materialid != null) return false;
        if (remark != null ? !remark.equals(tstockin.remark) : tstockin.remark != null) return false;
        if (stockinid != null ? !stockinid.equals(tstockin.stockinid) : tstockin.stockinid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialid != null ? materialid.hashCode() : 0;
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (stockinid != null ? stockinid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tstockin{");
        sb.append("materialid='").append(materialid).append('\'');
        sb.append(", intime=").append(intime);
        sb.append(", count=").append(count);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", stockinid='").append(stockinid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
