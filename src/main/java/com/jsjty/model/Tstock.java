package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tstock {
    private String materialid;
    private String materialname;
    private Integer count;
    private String remark;
    private String materialtype;
    private String materiallevel;

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname;
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

    public String getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(String materialtype) {
        this.materialtype = materialtype;
    }

    public String getMateriallevel() {
        return materiallevel;
    }

    public void setMateriallevel(String materiallevel) {
        this.materiallevel = materiallevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tstock tstock = (Tstock) o;

        if (count != null ? !count.equals(tstock.count) : tstock.count != null) return false;
        if (materialid != null ? !materialid.equals(tstock.materialid) : tstock.materialid != null) return false;
        if (materiallevel != null ? !materiallevel.equals(tstock.materiallevel) : tstock.materiallevel != null)
            return false;
        if (materialname != null ? !materialname.equals(tstock.materialname) : tstock.materialname != null)
            return false;
        if (materialtype != null ? !materialtype.equals(tstock.materialtype) : tstock.materialtype != null)
            return false;
        if (remark != null ? !remark.equals(tstock.remark) : tstock.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialid != null ? materialid.hashCode() : 0;
        result = 31 * result + (materialname != null ? materialname.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (materialtype != null ? materialtype.hashCode() : 0);
        result = 31 * result + (materiallevel != null ? materiallevel.hashCode() : 0);
        return result;
    }

    @Override
    public String
    toString() {
        final StringBuffer sb = new StringBuffer("Tstock{");
        sb.append("materialid='").append(materialid).append('\'');
        sb.append(", materialname='").append(materialname).append('\'');
        sb.append(", count=").append(count);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", materialtype='").append(materialtype).append('\'');
        sb.append(", materiallevel='").append(materiallevel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
