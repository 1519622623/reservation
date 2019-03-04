package com.market.starmedia.controller;

import com.market.starmedia.logic.material.datasource.materialInfo.pojo.MaterialInfo;
import com.market.starmedia.logic.material.service.MaterialInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MaterialInfoController {

    @Autowired
    private MaterialInfoService materialInfoService;
    @RequestMapping(value = "/material/save", method = RequestMethod.GET)
    public String save(@RequestBody MaterialInfo query) {

        materialInfoService.save(query);
        return "hello Nacos Discovery ";
    }
}
