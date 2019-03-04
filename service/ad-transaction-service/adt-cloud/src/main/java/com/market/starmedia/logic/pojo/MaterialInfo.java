package com.market.starmedia.logic.pojo;

import java.util.Date;

public class MaterialInfo {
    private Long material_id;

    private String material_name;

    private Long material_format_id;

    private String update_user;

    private Date update_time;

    private Byte is_delete;

    private Byte is_stop;

    private String material_format_content;

    public Long getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(Long material_id) {
        this.material_id = material_id;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

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

    public Byte getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Byte is_delete) {
        this.is_delete = is_delete;
    }

    public Byte getIs_stop() {
        return is_stop;
    }

    public void setIs_stop(Byte is_stop) {
        this.is_stop = is_stop;
    }

    public String getMaterial_format_content() {
        return material_format_content;
    }

    public void setMaterial_format_content(String material_format_content) {
        this.material_format_content = material_format_content;
    }
}