package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tqrcodemap {
    private String mapperid;
    private String qrcodeid;
    private String deviceid;

    public String getMapperid() {
        return mapperid;
    }

    public void setMapperid(String mapperid) {
        this.mapperid = mapperid;
    }

    public String getQrcodeid() {
        return qrcodeid;
    }

    public void setQrcodeid(String qrcodeid) {
        this.qrcodeid = qrcodeid;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tqrcodemap that = (Tqrcodemap) o;

        if (deviceid != null ? !deviceid.equals(that.deviceid) : that.deviceid != null) return false;
        if (mapperid != null ? !mapperid.equals(that.mapperid) : that.mapperid != null) return false;
        if (qrcodeid != null ? !qrcodeid.equals(that.qrcodeid) : that.qrcodeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mapperid != null ? mapperid.hashCode() : 0;
        result = 31 * result + (qrcodeid != null ? qrcodeid.hashCode() : 0);
        result = 31 * result + (deviceid != null ? deviceid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tqrcodemap{");
        sb.append("mapperid='").append(mapperid).append('\'');
        sb.append(", qrcodeid='").append(qrcodeid).append('\'');
        sb.append(", deviceid='").append(deviceid).append('\'');
        sb.append('}');
        return sb.toString();

    }
}
