package com.market.starmedia.logic.creative.datasource.adSlotFormat.dao;

import com.market.starmedia.logic.creative.datasource.adSlotFormat.pojo.AdSlotFormat;

public interface AdSlotFormatMapper {
    int deleteByPrimaryKey(Long slot_format_id);

    int insert(AdSlotFormat record);

    int insertSelective(AdSlotFormat record);

    AdSlotFormat selectByPrimaryKey(Long slot_format_id);

    int updateByPrimaryKeySelective(AdSlotFormat record);

    int updateByPrimaryKeyWithBLOBs(AdSlotFormat record);

    int updateByPrimaryKey(AdSlotFormat record);
}