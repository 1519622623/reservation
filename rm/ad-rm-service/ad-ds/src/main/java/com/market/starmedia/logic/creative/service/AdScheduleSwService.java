package com.market.starmedia.logic.creative.service;

import com.market.starmedia.logic.creative.datasource.adScheduleSw.dao.AdScheduleSwMapper;
import com.market.starmedia.logic.creative.datasource.adScheduleSw.pojo.AdScheduleSw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdScheduleSwService {


    @Autowired
    private AdScheduleSwMapper adScheduleSwMapper;

    public void save (AdScheduleSw query) {
        adScheduleSwMapper.insert(query);
    }
}
