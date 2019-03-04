package com.market.starmedia.logic.material.datasource.materialSlotInfo.dao;

import com.market.starmedia.logic.material.datasource.materialSlotInfo.pojo.MaterialSlotInfo;
import com.market.starmedia.logic.material.datasource.materialSlotInfo.pojo.MaterialSlotInfoKey;

public interface MaterialSlotInfoMapper {
    int deleteByPrimaryKey(MaterialSlotInfoKey key);

    int insert(MaterialSlotInfo record);

    int insertSelective(MaterialSlotInfo record);

    MaterialSlotInfo selectByPrimaryKey(MaterialSlotInfoKey key);

    int updateByPrimaryKeySelective(MaterialSlotInfo record);

    int updateByPrimaryKeyWithBLOBs(MaterialSlotInfo record);

    int updateByPrimaryKey(MaterialSlotInfo record);
}