package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tweightversion {
    private Timestamp versionid;
    private String weightid;
    private String weightname;
    private String weightparent;
    private Float weightnum;

    public Timestamp getVersionid() {
        return versionid;
    }

    public void setVersionid(Timestamp versionid) {
        this.versionid = versionid;
    }

    public String getWeightid() {
        return weightid;
    }

    public void setWeightid(String weightid) {
        this.weightid = weightid;
    }

    public String getWeightname() {
        return weightname;
    }

    public void setWeightname(String weightname) {
        this.weightname = weightname;
    }

    public String getWeightparent() {
        return weightparent;
    }

    public void setWeightparent(String weightparent) {
        this.weightparent = weightparent;
    }

    public Float getWeightnum() {
        return weightnum;
    }

    public void setWeightnum(Float weightnum) {
        this.weightnum = weightnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tweightversion that = (Tweightversion) o;

        if (versionid != null ? !versionid.equals(that.versionid) : that.versionid != null) return false;
        if (weightid != null ? !weightid.equals(that.weightid) : that.weightid != null) return false;
        if (weightname != null ? !weightname.equals(that.weightname) : that.weightname != null) return false;
        if (weightnum != null ? !weightnum.equals(that.weightnum) : that.weightnum != null) return false;
        if (weightparent != null ? !weightparent.equals(that.weightparent) : that.weightparent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = versionid != null ? versionid.hashCode() : 0;
        result = 31 * result + (weightid != null ? weightid.hashCode() : 0);
        result = 31 * result + (weightname != null ? weightname.hashCode() : 0);
        result = 31 * result + (weightparent != null ? weightparent.hashCode() : 0);
        result = 31 * result + (weightnum != null ? weightnum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tweightversion{");
        sb.append("versionid=").append(versionid);
        sb.append(", weightid='").append(weightid).append('\'');
        sb.append(", weightname='").append(weightname).append('\'');
        sb.append(", weightparent='").append(weightparent).append('\'');
        sb.append(", weightnum=").append(weightnum);
        sb.append('}');
        return sb.toString();
    }
}
