package com.market.starmedia.logic.creative.datasource.adEffect.dao;

import com.market.starmedia.logic.creative.datasource.adEffect.pojo.AdEffect;

public interface AdEffectMapper {
    int deleteByPrimaryKey (Long aid);

    int insert (AdEffect record);

    int insertSelective (AdEffect record);

    AdEffect selectByPrimaryKey (Long aid);

    int updateByPrimaryKeySelective (AdEffect record);

    int updateByPrimaryKey (AdEffect record);
}