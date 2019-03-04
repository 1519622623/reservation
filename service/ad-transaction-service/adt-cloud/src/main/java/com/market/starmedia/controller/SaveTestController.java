package com.market.starmedia.controller;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.market.starmedia.feign.CreativeService;
import com.market.starmedia.feign.MaterialService;
import com.market.starmedia.logic.query.AdMatrialForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveTestController {

    @Autowired
    private CreativeService creativeService;
    @Autowired
    private MaterialService materialService;
    @GlobalTransactional(timeoutMills = 300000, name = "spring-cloud-demo-tx")
    @RequestMapping(value = "/material/save", method = RequestMethod.GET)
    public String save(@RequestBody AdMatrialForm form) {

        creativeService.save(form.getAd());
        materialService.save(form.getMaterial());
        return "hello Nacos Discovery ";
    }
}
