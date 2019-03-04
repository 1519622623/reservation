package com.market.starmedia.logic.creative.datasource.controlTimeLimited.dao;

import com.market.starmedia.logic.creative.datasource.controlTimeLimited.pojo.ControlTimeLimited;

public interface ControlTimeLimitedMapper {
    int insert(ControlTimeLimited record);

    int insertSelective(ControlTimeLimited record);
}