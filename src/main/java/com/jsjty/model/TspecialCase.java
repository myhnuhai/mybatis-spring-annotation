package com.jsjty.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/2/6.
 */
public class TspecialCase {
    private String guid;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    private Date casedate;

    public Date getCasedate() {
        return casedate;
    }

    public void setCasedate(Date casedate) {
        this.casedate = casedate;
    }

    private Integer accidentN;

    public Integer getAccidentN() {
        return accidentN;
    }

    public void setAccidentN(Integer accidentN) {
        this.accidentN = accidentN;
    }

    private Integer accidentP;

    public Integer getAccidentP() {
        return accidentP;
    }

    public void setAccidentP(Integer accidentP) {
        this.accidentP = accidentP;
    }

    private Integer anchorN;

    public Integer getAnchorN() {
        return anchorN;
    }

    public void setAnchorN(Integer anchorN) {
        this.anchorN = anchorN;
    }

    private Integer anchorP;

    public Integer getAnchorP() {
        return anchorP;
    }

    public void setAnchorP(Integer anchorP) {
        this.anchorP = anchorP;
    }

    private Integer abnormalN;

    public Integer getAbnormalN() {
        return abnormalN;
    }

    public void setAbnormalN(Integer abnormalN) {
        this.abnormalN = abnormalN;
    }

    private Integer abnormalP;

    public Integer getAbnormalP() {
        return abnormalP;
    }

    public void setAbnormalP(Integer abnormalP) {
        this.abnormalP = abnormalP;
    }

    private Integer nonvehicleBlockN;

    public Integer getNonvehicleBlockN() {
        return nonvehicleBlockN;
    }

    public void setNonvehicleBlockN(Integer nonvehicleBlockN) {
        this.nonvehicleBlockN = nonvehicleBlockN;
    }

    private Integer nonvehicleBlockP;

    public Integer getNonvehicleBlockP() {
        return nonvehicleBlockP;
    }

    public void setNonvehicleBlockP(Integer nonvehicleBlockP) {
        this.nonvehicleBlockP = nonvehicleBlockP;
    }

    private Integer nonvehiclePassN;

    public Integer getNonvehiclePassN() {
        return nonvehiclePassN;
    }

    public void setNonvehiclePassN(Integer nonvehiclePassN) {
        this.nonvehiclePassN = nonvehiclePassN;
    }

    private Integer nonvehiclePassP;

    public Integer getNonvehiclePassP() {
        return nonvehiclePassP;
    }

    public void setNonvehiclePassP(Integer nonvehiclePassP) {
        this.nonvehiclePassP = nonvehiclePassP;
    }

    private Integer pedestrianBlockN;

    public Integer getPedestrianBlockN() {
        return pedestrianBlockN;
    }

    public void setPedestrianBlockN(Integer pedestrianBlockN) {
        this.pedestrianBlockN = pedestrianBlockN;
    }

    private Integer pedestrianBlockP;

    public Integer getPedestrianBlockP() {
        return pedestrianBlockP;
    }

    public void setPedestrianBlockP(Integer pedestrianBlockP) {
        this.pedestrianBlockP = pedestrianBlockP;
    }

    private Integer pedestrianPassN;

    public Integer getPedestrianPassN() {
        return pedestrianPassN;
    }

    public void setPedestrianPassN(Integer pedestrianPassN) {
        this.pedestrianPassN = pedestrianPassN;
    }

    private Integer pedestrianPassP;

    public Integer getPedestrianPassP() {
        return pedestrianPassP;
    }

    public void setPedestrianPassP(Integer pedestrianPassP) {
        this.pedestrianPassP = pedestrianPassP;
    }

    private Integer overrunvehicleN;

    public Integer getOverrunvehicleN() {
        return overrunvehicleN;
    }

    public void setOverrunvehicleN(Integer overrunvehicleN) {
        this.overrunvehicleN = overrunvehicleN;
    }

    private Integer muckcarN;

    public Integer getMuckcarN() {
        return muckcarN;
    }

    public void setMuckcarN(Integer muckcarN) {
        this.muckcarN = muckcarN;
    }

    private Integer muckcarP;

    public Integer getMuckcarP() {
        return muckcarP;
    }

    public void setMuckcarP(Integer muckcarP) {
        this.muckcarP = muckcarP;
    }

    private Timestamp syscreatedate;

    public Timestamp getSyscreatedate() {
        return syscreatedate;
    }

    public void setSyscreatedate(Timestamp syscreatedate) {
        this.syscreatedate = syscreatedate;
    }

    private String remark;

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

        TspecialCase that = (TspecialCase) o;

        if (abnormalN != null ? !abnormalN.equals(that.abnormalN) : that.abnormalN != null) return false;
        if (abnormalP != null ? !abnormalP.equals(that.abnormalP) : that.abnormalP != null) return false;
        if (accidentN != null ? !accidentN.equals(that.accidentN) : that.accidentN != null) return false;
        if (accidentP != null ? !accidentP.equals(that.accidentP) : that.accidentP != null) return false;
        if (anchorN != null ? !anchorN.equals(that.anchorN) : that.anchorN != null) return false;
        if (anchorP != null ? !anchorP.equals(that.anchorP) : that.anchorP != null) return false;
        if (casedate != null ? !casedate.equals(that.casedate) : that.casedate != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (muckcarN != null ? !muckcarN.equals(that.muckcarN) : that.muckcarN != null) return false;
        if (muckcarP != null ? !muckcarP.equals(that.muckcarP) : that.muckcarP != null) return false;
        if (nonvehicleBlockN != null ? !nonvehicleBlockN.equals(that.nonvehicleBlockN) : that.nonvehicleBlockN != null)
            return false;
        if (nonvehicleBlockP != null ? !nonvehicleBlockP.equals(that.nonvehicleBlockP) : that.nonvehicleBlockP != null)
            return false;
        if (nonvehiclePassN != null ? !nonvehiclePassN.equals(that.nonvehiclePassN) : that.nonvehiclePassN != null)
            return false;
        if (nonvehiclePassP != null ? !nonvehiclePassP.equals(that.nonvehiclePassP) : that.nonvehiclePassP != null)
            return false;
        if (overrunvehicleN != null ? !overrunvehicleN.equals(that.overrunvehicleN) : that.overrunvehicleN != null)
            return false;
        if (pedestrianBlockN != null ? !pedestrianBlockN.equals(that.pedestrianBlockN) : that.pedestrianBlockN != null)
            return false;
        if (pedestrianBlockP != null ? !pedestrianBlockP.equals(that.pedestrianBlockP) : that.pedestrianBlockP != null)
            return false;
        if (pedestrianPassN != null ? !pedestrianPassN.equals(that.pedestrianPassN) : that.pedestrianPassN != null)
            return false;
        if (pedestrianPassP != null ? !pedestrianPassP.equals(that.pedestrianPassP) : that.pedestrianPassP != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (syscreatedate != null ? !syscreatedate.equals(that.syscreatedate) : that.syscreatedate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (casedate != null ? casedate.hashCode() : 0);
        result = 31 * result + (accidentN != null ? accidentN.hashCode() : 0);
        result = 31 * result + (accidentP != null ? accidentP.hashCode() : 0);
        result = 31 * result + (anchorN != null ? anchorN.hashCode() : 0);
        result = 31 * result + (anchorP != null ? anchorP.hashCode() : 0);
        result = 31 * result + (abnormalN != null ? abnormalN.hashCode() : 0);
        result = 31 * result + (abnormalP != null ? abnormalP.hashCode() : 0);
        result = 31 * result + (nonvehicleBlockN != null ? nonvehicleBlockN.hashCode() : 0);
        result = 31 * result + (nonvehicleBlockP != null ? nonvehicleBlockP.hashCode() : 0);
        result = 31 * result + (nonvehiclePassN != null ? nonvehiclePassN.hashCode() : 0);
        result = 31 * result + (nonvehiclePassP != null ? nonvehiclePassP.hashCode() : 0);
        result = 31 * result + (pedestrianBlockN != null ? pedestrianBlockN.hashCode() : 0);
        result = 31 * result + (pedestrianBlockP != null ? pedestrianBlockP.hashCode() : 0);
        result = 31 * result + (pedestrianPassN != null ? pedestrianPassN.hashCode() : 0);
        result = 31 * result + (pedestrianPassP != null ? pedestrianPassP.hashCode() : 0);
        result = 31 * result + (overrunvehicleN != null ? overrunvehicleN.hashCode() : 0);
        result = 31 * result + (muckcarN != null ? muckcarN.hashCode() : 0);
        result = 31 * result + (muckcarP != null ? muckcarP.hashCode() : 0);
        result = 31 * result + (syscreatedate != null ? syscreatedate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TspecialCase{");
        sb.append("guid='").append(guid).append('\'');
        sb.append(", casedate=").append(casedate);
        sb.append(", accidentN=").append(accidentN);
        sb.append(", accidentP=").append(accidentP);
        sb.append(", anchorN=").append(anchorN);
        sb.append(", anchorP=").append(anchorP);
        sb.append(", abnormalN=").append(abnormalN);
        sb.append(", abnormalP=").append(abnormalP);
        sb.append(", nonvehicleBlockN=").append(nonvehicleBlockN);
        sb.append(", nonvehicleBlockP=").append(nonvehicleBlockP);
        sb.append(", nonvehiclePassN=").append(nonvehiclePassN);
        sb.append(", nonvehiclePassP=").append(nonvehiclePassP);
        sb.append(", pedestrianBlockN=").append(pedestrianBlockN);
        sb.append(", pedestrianBlockP=").append(pedestrianBlockP);
        sb.append(", pedestrianPassN=").append(pedestrianPassN);
        sb.append(", pedestrianPassP=").append(pedestrianPassP);
        sb.append(", overrunvehicleN=").append(overrunvehicleN);
        sb.append(", muckcarN=").append(muckcarN);
        sb.append(", muckcarP=").append(muckcarP);
        sb.append(", syscreatedate=").append(syscreatedate);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
