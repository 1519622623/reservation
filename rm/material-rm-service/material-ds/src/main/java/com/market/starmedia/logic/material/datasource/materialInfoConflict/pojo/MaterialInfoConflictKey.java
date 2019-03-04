package com.market.starmedia.logic.material.datasource.materialInfoConflict.pojo;

public class MaterialInfoConflictKey {
    private Long material_id;

    private Integer conflict_type;

    public Long getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(Long material_id) {
        this.material_id = material_id;
    }

    public Integer getConflict_type() {
        return conflict_type;
    }

    public void setConflict_type(Integer conflict_type) {
        this.conflict_type = conflict_type;
    }
}