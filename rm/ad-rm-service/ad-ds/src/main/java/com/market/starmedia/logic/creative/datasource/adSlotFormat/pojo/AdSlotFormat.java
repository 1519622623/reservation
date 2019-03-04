package com.market.starmedia.logic.creative.datasource.adSlotFormat.pojo;

import java.util.Date;

public class AdSlotFormat {
    private Long slot_format_id;

    private String slot_format_id_remote;

    private String slot_format_type_name;

    private Integer platform;

    private Integer slot_format_type_category;

    private String slot_format_type_category_name;

    private Date update_time;

    private String slot_format;

    public Long getSlot_format_id() {
        return slot_format_id;
    }

    public void setSlot_format_id(Long slot_format_id) {
        this.slot_format_id = slot_format_id;
    }

    public String getSlot_format_id_remote() {
        return slot_format_id_remote;
    }

    public void setSlot_format_id_remote(String slot_format_id_remote) {
        this.slot_format_id_remote = slot_format_id_remote;
    }

    public String getSlot_format_type_name() {
        return slot_format_type_name;
    }

    public void setSlot_format_type_name(String slot_format_type_name) {
        this.slot_format_type_name = slot_format_type_name;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getSlot_format_type_category() {
        return slot_format_type_category;
    }

    public void setSlot_format_type_category(Integer slot_format_type_category) {
        this.slot_format_type_category = slot_format_type_category;
    }

    public String getSlot_format_type_category_name() {
        return slot_format_type_category_name;
    }

    public void setSlot_format_type_category_name(String slot_format_type_category_name) {
        this.slot_format_type_category_name = slot_format_type_category_name;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getSlot_format() {
        return slot_format;
    }

    public void setSlot_format(String slot_format) {
        this.slot_format = slot_format;
    }
}