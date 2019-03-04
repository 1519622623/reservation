package com.market.starmedia.logic.material.datasource.materialFormatSlotFormat_ref.dao;

import com.market.starmedia.logic.material.datasource.materialFormatSlotFormat_ref.pojo.MaterialFormatSlotFormatRef;
import com.market.starmedia.logic.material.datasource.materialFormatSlotFormat_ref.pojo.MaterialFormatSlotFormatRefKey;

public interface MaterialFormatSlotFormatRefMapper {
    int deleteByPrimaryKey(MaterialFormatSlotFormatRefKey key);

    int insert(MaterialFormatSlotFormatRef record);

    int insertSelective(MaterialFormatSlotFormatRef record);

    MaterialFormatSlotFormatRef selectByPrimaryKey(MaterialFormatSlotFormatRefKey key);

    int updateByPrimaryKeySelective(MaterialFormatSlotFormatRef record);

    int updateByPrimaryKey(MaterialFormatSlotFormatRef record);
}