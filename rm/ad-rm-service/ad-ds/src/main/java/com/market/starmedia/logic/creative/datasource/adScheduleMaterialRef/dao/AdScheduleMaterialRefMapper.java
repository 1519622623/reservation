package com.market.starmedia.logic.creative.datasource.adScheduleMaterialRef.dao;

import com.market.starmedia.logic.creative.datasource.adScheduleMaterialRef.pojo.AdScheduleMaterialRef;

public interface AdScheduleMaterialRefMapper {
    int insert(AdScheduleMaterialRef record);

    int insertSelective(AdScheduleMaterialRef record);
}