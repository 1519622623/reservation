package com.market.starmedia.logic.creative.datasource.controlTimeLimited.pojo;

import java.util.Date;

public class ControlTimeLimited {
    private Long aid;

    private Integer limited_type;

    private Date begin_time;

    private Date end_time;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Integer getLimited_type() {
        return limited_type;
    }

    public void setLimited_type(Integer limited_type) {
        this.limited_type = limited_type;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
}