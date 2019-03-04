package com.market.starmedia.logic.creative.datasource.adSlot.pojo;

import java.util.Date;

public class AdSlot {
    private Long slot_id;

    private String slot_name;

    private Byte is_open;

    private Integer slot_type;

    private String slot_size;

    private String position_desc;

    private String remote_slot_id;

    private Long slot_format_id;

    private Integer platform;

    private Date update_time;

    public Long getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(Long slot_id) {
        this.slot_id = slot_id;
    }

    public String getSlot_name() {
        return slot_name;
    }

    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    public Byte getIs_open() {
        return is_open;
    }

    public void setIs_open(Byte is_open) {
        this.is_open = is_open;
    }

    public Integer getSlot_type() {
        return slot_type;
    }

    public void setSlot_type(Integer slot_type) {
        this.slot_type = slot_type;
    }

    public String getSlot_size() {
        return slot_size;
    }

    public void setSlot_size(String slot_size) {
        this.slot_size = slot_size;
    }

    public String getPosition_desc() {
        return position_desc;
    }

    public void setPosition_desc(String position_desc) {
        this.position_desc = position_desc;
    }

    public String getRemote_slot_id() {
        return remote_slot_id;
    }

    public void setRemote_slot_id(String remote_slot_id) {
        this.remote_slot_id = remote_slot_id;
    }

    public Long getSlot_format_id() {
        return slot_format_id;
    }

    public void setSlot_format_id(Long slot_format_id) {
        this.slot_format_id = slot_format_id;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}