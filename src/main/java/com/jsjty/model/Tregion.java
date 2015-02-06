package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tregion {
    private String parentid;
    private String regionid;
    private String regionname;
    private String position;
    private String region;

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

        Tregion tregion = (Tregion) o;

        if (parentid != null ? !parentid.equals(tregion.parentid) : tregion.parentid != null) return false;
        if (position != null ? !position.equals(tregion.position) : tregion.position != null) return false;
        if (region != null ? !region.equals(tregion.region) : tregion.region != null) return false;
        if (regionid != null ? !regionid.equals(tregion.regionid) : tregion.regionid != null) return false;
        if (regionname != null ? !regionname.equals(tregion.regionname) : tregion.regionname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = parentid != null ? parentid.hashCode() : 0;
        result = 31 * result + (regionid != null ? regionid.hashCode() : 0);
        result = 31 * result + (regionname != null ? regionname.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tregion{");
        sb.append("parentid='").append(parentid).append('\'');
        sb.append(", regionid='").append(regionid).append('\'');
        sb.append(", regionname='").append(regionname).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
