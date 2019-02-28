package com.market.starmedia.logic.material.datasource.materialInfo.dao;

import com.market.starmedia.logic.material.datasource.materialInfo.pojo.MaterialInfo;

public interface MaterialInfoMapper {
    int deleteByPrimaryKey(Long material_id);

    int insert(MaterialInfo record);

    int insertSelective(MaterialInfo record);

    MaterialInfo selectByPrimaryKey(Long material_id);

    int updateByPrimaryKeySelective(MaterialInfo record);

    int updateByPrimaryKeyWithBLOBs(MaterialInfo record);

    int updateByPrimaryKey(MaterialInfo record);
}