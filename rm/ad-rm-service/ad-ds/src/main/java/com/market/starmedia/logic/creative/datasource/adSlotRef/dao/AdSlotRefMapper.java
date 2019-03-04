package com.market.starmedia.logic.creative.datasource.adSlotRef.dao;

import com.market.starmedia.logic.creative.datasource.adSlotRef.pojo.AdSlotRef;
import com.market.starmedia.logic.creative.datasource.adSlotRef.pojo.AdSlotRefKey;

public interface AdSlotRefMapper {
    int deleteByPrimaryKey(AdSlotRefKey key);

    int insert(AdSlotRef record);

    int insertSelective(AdSlotRef record);

    AdSlotRef selectByPrimaryKey(AdSlotRefKey key);

    int updateByPrimaryKeySelective(AdSlotRef record);

    int updateByPrimaryKeyWithBLOBs(AdSlotRef record);

    int updateByPrimaryKey(AdSlotRef record);
}