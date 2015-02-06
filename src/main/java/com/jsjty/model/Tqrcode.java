package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tqrcode {
    private String qrcodeid;
    private String qrcodename;
    private String title;
    private String content;
    private Float latitude;
    private Float longitude;
    private String region;
    private String position;
    private String remark;

    public String getQrcodeid() {
        return qrcodeid;
    }

    public void setQrcodeid(String qrcodeid) {
        this.qrcodeid = qrcodeid;
    }

    public String getQrcodename() {
        return qrcodename;
    }

    public void setQrcodename(String qrcodename) {
        this.qrcodename = qrcodename;
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

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

        Tqrcode tqrcode = (Tqrcode) o;

        if (content != null ? !content.equals(tqrcode.content) : tqrcode.content != null) return false;
        if (latitude != null ? !latitude.equals(tqrcode.latitude) : tqrcode.latitude != null) return false;
        if (longitude != null ? !longitude.equals(tqrcode.longitude) : tqrcode.longitude != null) return false;
        if (position != null ? !position.equals(tqrcode.position) : tqrcode.position != null) return false;
        if (qrcodeid != null ? !qrcodeid.equals(tqrcode.qrcodeid) : tqrcode.qrcodeid != null) return false;
        if (qrcodename != null ? !qrcodename.equals(tqrcode.qrcodename) : tqrcode.qrcodename != null) return false;
        if (region != null ? !region.equals(tqrcode.region) : tqrcode.region != null) return false;
        if (remark != null ? !remark.equals(tqrcode.remark) : tqrcode.remark != null) return false;
        if (title != null ? !title.equals(tqrcode.title) : tqrcode.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qrcodeid != null ? qrcodeid.hashCode() : 0;
        result = 31 * result + (qrcodename != null ? qrcodename.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tqrcode{");
        sb.append("qrcodeid='").append(qrcodeid).append('\'');
        sb.append(", qrcodename='").append(qrcodename).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", region='").append(region).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
