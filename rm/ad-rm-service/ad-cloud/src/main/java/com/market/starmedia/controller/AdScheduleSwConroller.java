package com.market.starmedia.controller;

import com.market.starmedia.logic.creative.datasource.adScheduleSw.pojo.AdScheduleSw;
import com.market.starmedia.logic.creative.service.AdScheduleSwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdScheduleSwConroller {

    @Autowired
    private AdScheduleSwService adScheduleSwService;
    @RequestMapping(value = "/ad/save", method = RequestMethod.POST)
    public String save(@RequestBody AdScheduleSw query) {

        adScheduleSwService.save(query);
        return "hello Nacos Discovery ";
    }
}
