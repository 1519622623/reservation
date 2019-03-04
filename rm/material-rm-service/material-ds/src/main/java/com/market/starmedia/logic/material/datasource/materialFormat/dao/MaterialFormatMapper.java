package com.market.starmedia.logic.material.datasource.materialFormat.dao;

import com.market.starmedia.logic.material.datasource.materialFormat.pojo.MaterialFormat;

public interface MaterialFormatMapper {
    int deleteByPrimaryKey(Long material_format_id);

    int insert(MaterialFormat record);

    int insertSelective(MaterialFormat record);

    MaterialFormat selectByPrimaryKey(Long material_format_id);

    int updateByPrimaryKeySelective(MaterialFormat record);

    int updateByPrimaryKeyWithBLOBs(MaterialFormat record);

    int updateByPrimaryKey(MaterialFormat record);
}