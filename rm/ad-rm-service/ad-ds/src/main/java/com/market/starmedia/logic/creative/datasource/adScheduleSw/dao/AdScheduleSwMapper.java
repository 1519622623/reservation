package com.market.starmedia.logic.creative.datasource.adScheduleSw.dao;

import com.market.starmedia.logic.creative.datasource.adScheduleSw.pojo.AdScheduleSw;

public interface AdScheduleSwMapper {
    int deleteByPrimaryKey(Long aid);

    int insert(AdScheduleSw record);

    int insertSelective(AdScheduleSw record);

    AdScheduleSw selectByPrimaryKey(Long aid);

    int updateByPrimaryKeySelective(AdScheduleSw record);

    int updateByPrimaryKeyWithBLOBs(AdScheduleSw record);

    int updateByPrimaryKey(AdScheduleSw record);
}