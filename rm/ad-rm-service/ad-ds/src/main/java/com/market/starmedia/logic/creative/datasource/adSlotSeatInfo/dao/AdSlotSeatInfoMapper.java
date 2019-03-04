package com.market.starmedia.logic.creative.datasource.adSlotSeatInfo.dao;

import com.market.starmedia.logic.creative.datasource.adSlotSeatInfo.pojo.AdSlotSeatInfo;

public interface AdSlotSeatInfoMapper {
    int deleteByPrimaryKey(Long slot_id);

    int insert(AdSlotSeatInfo record);

    int insertSelective(AdSlotSeatInfo record);

    AdSlotSeatInfo selectByPrimaryKey(Long slot_id);

    int updateByPrimaryKeySelective(AdSlotSeatInfo record);

    int updateByPrimaryKey(AdSlotSeatInfo record);
}