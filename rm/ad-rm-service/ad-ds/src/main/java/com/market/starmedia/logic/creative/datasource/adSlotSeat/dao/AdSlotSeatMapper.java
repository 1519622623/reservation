package com.market.starmedia.logic.creative.datasource.adSlotSeat.dao;

import com.market.starmedia.logic.creative.datasource.adSlotSeat.pojo.AdSlotSeat;

public interface AdSlotSeatMapper {
    int deleteByPrimaryKey(Long seat_id);

    int insert(AdSlotSeat record);

    int insertSelective(AdSlotSeat record);

    AdSlotSeat selectByPrimaryKey(Long seat_id);

    int updateByPrimaryKeySelective(AdSlotSeat record);

    int updateByPrimaryKeyWithBLOBs(AdSlotSeat record);

    int updateByPrimaryKey(AdSlotSeat record);
}