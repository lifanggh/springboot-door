package com.zhiyou100.pojo;

public class goods {
  private Integer gid;
  private String gname;
  private double gprice;
  private double gnum;
  private  String gkind;
  private  String gpin;
  private Integer gtype;

    public Integer getGtype() {
        return gtype;
    }

    public void setGtype(Integer gtype) {
        this.gtype = gtype;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getGprice() {
        return gprice;
    }

    public void setGprice(double gprice) {
        this.gprice = gprice;
    }

    public double getGnum() {
        return gnum;
    }

    public void setGnum(double gnum) {
        this.gnum = gnum;
    }

    public String getGkind() {
        return gkind;
    }

    public void setGkind(String gkind) {
        this.gkind = gkind;
    }

    public String getGpin() {
        return gpin;
    }

    public void setGpin(String gpin) {
        this.gpin = gpin;
    }

    @Override
    public String toString() {
        return "goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gprice=" + gprice +
                ", gnum=" + gnum +
                ", gkind='" + gkind + '\'' +
                ", gpin='" + gpin + '\'' +
                '}';
    }
}
