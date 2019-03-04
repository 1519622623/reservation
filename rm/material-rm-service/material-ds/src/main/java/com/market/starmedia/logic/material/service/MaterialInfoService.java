package com.market.starmedia.logic.material.service;

import com.market.starmedia.logic.material.datasource.materialInfo.dao.MaterialInfoMapper;
import com.market.starmedia.logic.material.datasource.materialInfo.pojo.MaterialInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialInfoService {


    @Autowired
    private MaterialInfoMapper materialInfoMapper;
    public void save (MaterialInfo query) {
        materialInfoMapper.insert(query);
    }
}
