package com.market.starmedia.logic.creative.datasource.aidGenerator.dao;

import com.market.starmedia.logic.creative.datasource.aidGenerator.pojo.AidGenerator;

public interface AidGeneratorMapper {
    int deleteByPrimaryKey(Long aid);

    int insert(AidGenerator record);

    int insertSelective(AidGenerator record);
}