package com.jsjty.model;

/**
 * Created by Administrator on 2015/2/6.
 */
public class Tweight {
    private String weightid;
    private String weightname;
    private String weightparent;
    private Float weightnum;
    private Float score;

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

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tweight tweight = (Tweight) o;

        if (score != null ? !score.equals(tweight.score) : tweight.score != null) return false;
        if (weightid != null ? !weightid.equals(tweight.weightid) : tweight.weightid != null) return false;
        if (weightname != null ? !weightname.equals(tweight.weightname) : tweight.weightname != null) return false;
        if (weightnum != null ? !weightnum.equals(tweight.weightnum) : tweight.weightnum != null) return false;
        if (weightparent != null ? !weightparent.equals(tweight.weightparent) : tweight.weightparent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = weightid != null ? weightid.hashCode() : 0;
        result = 31 * result + (weightname != null ? weightname.hashCode() : 0);
        result = 31 * result + (weightparent != null ? weightparent.hashCode() : 0);
        result = 31 * result + (weightnum != null ? weightnum.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tweight{");
        sb.append("weightid='").append(weightid).append('\'');
        sb.append(", weightname='").append(weightname).append('\'');
        sb.append(", weightparent='").append(weightparent).append('\'');
        sb.append(", weightnum=").append(weightnum);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}
