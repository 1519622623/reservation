package com.market.starmedia.logic.creative.datasource.adSlot.dao;

import com.market.starmedia.logic.creative.datasource.adSlot.pojo.AdSlot;

public interface AdSlotMapper {
    int deleteByPrimaryKey(Long slot_id);

    int insert(AdSlot record);

    int insertSelective(AdSlot record);

    AdSlot selectByPrimaryKey(Long slot_id);

    int updateByPrimaryKeySelective(AdSlot record);

    int updateByPrimaryKey(AdSlot record);
}