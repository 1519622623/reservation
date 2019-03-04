package com.market.starmedia.logic.material.datasource.materialFormat.pojo;

import java.util.Date;

public class MaterialFormat {
    private Long material_format_id;

    private String material_format_name;

    private Date update_time;

    private String material_format;

    public Long getMaterial_format_id() {
        return material_format_id;
    }

    public void setMaterial_format_id(Long material_format_id) {
        this.material_format_id = material_format_id;
    }

    public String getMaterial_format_name() {
        return material_format_name;
    }

    public void setMaterial_format_name(String material_format_name) {
        this.material_format_name = material_format_name;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getMaterial_format() {
        return material_format;
    }

    public void setMaterial_format(String material_format) {
        this.material_format = material_format;
    }
}