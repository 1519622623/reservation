package com.market.starmedia.logic.material.datasource.matrialSlotRef.dao;

import com.market.starmedia.logic.material.datasource.matrialSlotRef.pojo.MatrialSlotRef;
import com.market.starmedia.logic.material.datasource.matrialSlotRef.pojo.MatrialSlotRefKey;

public interface MatrialSlotRefMapper {
    int deleteByPrimaryKey(MatrialSlotRefKey key);

    int insert(MatrialSlotRef record);

    int insertSelective(MatrialSlotRef record);

    MatrialSlotRef selectByPrimaryKey(MatrialSlotRefKey key);

    int updateByPrimaryKeySelective(MatrialSlotRef record);

    int updateByPrimaryKey(MatrialSlotRef record);
}