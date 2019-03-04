package com.market.starmedia.logic.creative.datasource.adScheduleSw.pojo;

import java.util.Date;

public class AdScheduleSw {
    private Long aid;

    private Date begin_date;

    private Date end_date;

    private String desc_info;

    private String creative_user;

    private Date create_time;

    private Date update_time;

    private String update_user;

    private Boolean is_stop;

    private Boolean is_delete;

    private Integer perform_status;

    private Date version;

    private String ad_name;

    private Integer ad_type;

    private String ad_strategy;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getDesc_info() {
        return desc_info;
    }

    public void setDesc_info(String desc_info) {
        this.desc_info = desc_info;
    }

    public String getCreative_user() {
        return creative_user;
    }

    public void setCreative_user(String creative_user) {
        this.creative_user = creative_user;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public Boolean getIs_stop() {
        return is_stop;
    }

    public void setIs_stop(Boolean is_stop) {
        this.is_stop = is_stop;
    }

    public Boolean getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Integer getPerform_status() {
        return perform_status;
    }

    public void setPerform_status(Integer perform_status) {
        this.perform_status = perform_status;
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public Integer getAd_type() {
        return ad_type;
    }

    public void setAd_type(Integer ad_type) {
        this.ad_type = ad_type;
    }

    public String getAd_strategy() {
        return ad_strategy;
    }

    public void setAd_strategy(String ad_strategy) {
        this.ad_strategy = ad_strategy;
    }
}