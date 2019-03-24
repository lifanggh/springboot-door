package com.zhiyou100.pojo;

import java.util.Date;

public class Dingdan {
    private Integer did;
    private Integer dgid;
    private Integer duid;
    private String dtime;
    private Integer dnum;
    private Integer dyh;
    private  double dmany;

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    public double getDmany() {
        return dmany;
    }

    public void setDmany(double dmany) {
        this.dmany = dmany;
    }

    private Integer type;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getDgid() {
        return dgid;
    }

    public void setDgid(Integer dgid) {
        this.dgid = dgid;
    }

    public Integer getDuid() {
        return duid;
    }

    public void setDuid(Integer duid) {
        this.duid = duid;
    }



    public Integer getDnum() {
        return dnum;
    }

    public void setDnum(Integer dnum) {
        this.dnum = dnum;
    }

    public Integer getDyh() {
        return dyh;
    }

    public void setDyh(Integer dyh) {
        this.dyh = dyh;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
