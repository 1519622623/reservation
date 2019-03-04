package com.market.starmedia.logic.material.datasource.materialSlotInfo.pojo;

import java.util.Date;

public class MaterialSlotInfo extends MaterialSlotInfoKey {
    private Long material_format_id;

    private String update_user;

    private Date update_time;

    private String slot_format_content;

    public Long getMaterial_format_id() {
        return material_format_id;
    }

    public void setMaterial_format_id(Long material_format_id) {
        this.material_format_id = material_format_id;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getSlot_format_content() {
        return slot_format_content;
    }

    public void setSlot_format_content(String slot_format_content) {
        this.slot_format_content = slot_format_content;
    }
}