package com.market.starmedia.logic.material.datasource.materialConvertMapping.dao;

import com.market.starmedia.logic.material.datasource.materialConvertMapping.pojo.MaterialConvertMapping;

public interface MaterialConvertMappingMapper {
    int deleteByPrimaryKey(Long mappring_id);

    int insert(MaterialConvertMapping record);

    int insertSelective(MaterialConvertMapping record);

    MaterialConvertMapping selectByPrimaryKey(Long mappring_id);

    int updateByPrimaryKeySelective(MaterialConvertMapping record);

    int updateByPrimaryKeyWithBLOBs(MaterialConvertMapping record);

    int updateByPrimaryKey(MaterialConvertMapping record);
}