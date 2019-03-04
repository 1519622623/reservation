package com.market.starmedia.logic.material.datasource.materialInfoConflict.dao;

import com.market.starmedia.logic.material.datasource.materialInfoConflict.pojo.MaterialInfoConflict;
import com.market.starmedia.logic.material.datasource.materialInfoConflict.pojo.MaterialInfoConflictKey;

public interface MaterialInfoConflictMapper {
    int deleteByPrimaryKey(MaterialInfoConflictKey key);

    int insert(MaterialInfoConflict record);

    int insertSelective(MaterialInfoConflict record);

    MaterialInfoConflict selectByPrimaryKey(MaterialInfoConflictKey key);

    int updateByPrimaryKeySelective(MaterialInfoConflict record);

    int updateByPrimaryKey(MaterialInfoConflict record);
}