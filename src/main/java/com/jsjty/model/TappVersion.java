package com.jsjty.model;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TappVersion {
    private String versionid;
    private Integer versioncode;
    private String versionname;
    private String updatcontent;
    private Timestamp updatedate;
    private String updateurl;
    private Integer filesize;

    public String getVersionid() {
        return versionid;
    }

    public void setVersionid(String versionid) {
        this.versionid = versionid;
    }

    public Integer getVersioncode() {
        return versioncode;
    }

    public void setVersioncode(Integer versioncode) {
        this.versioncode = versioncode;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public String getUpdatcontent() {
        return updatcontent;
    }

    public void setUpdatcontent(String updatcontent) {
        this.updatcontent = updatcontent;
    }

    public Timestamp getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    public String getUpdateurl() {
        return updateurl;
    }

    public void setUpdateurl(String updateurl) {
        this.updateurl = updateurl;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TappVersion that = (TappVersion) o;

        if (filesize != null ? !filesize.equals(that.filesize) : that.filesize != null) return false;
        if (updatcontent != null ? !updatcontent.equals(that.updatcontent) : that.updatcontent != null) return false;
        if (updatedate != null ? !updatedate.equals(that.updatedate) : that.updatedate != null) return false;
        if (updateurl != null ? !updateurl.equals(that.updateurl) : that.updateurl != null) return false;
        if (versioncode != null ? !versioncode.equals(that.versioncode) : that.versioncode != null) return false;
        if (versionid != null ? !versionid.equals(that.versionid) : that.versionid != null) return false;
        if (versionname != null ? !versionname.equals(that.versionname) : that.versionname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = versionid != null ? versionid.hashCode() : 0;
        result = 31 * result + (versioncode != null ? versioncode.hashCode() : 0);
        result = 31 * result + (versionname != null ? versionname.hashCode() : 0);
        result = 31 * result + (updatcontent != null ? updatcontent.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + (updateurl != null ? updateurl.hashCode() : 0);
        result = 31 * result + (filesize != null ? filesize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TappVersion{");
        sb.append("versionid='").append(versionid).append('\'');
        sb.append(", versioncode=").append(versioncode);
        sb.append(", versionname='").append(versionname).append('\'');
        sb.append(", updatcontent='").append(updatcontent).append('\'');
        sb.append(", updatedate=").append(updatedate);
        sb.append(", updateurl='").append(updateurl).append('\'');
        sb.append(", filesize=").append(filesize);
        sb.append('}');
        return sb.toString();
    }
}
