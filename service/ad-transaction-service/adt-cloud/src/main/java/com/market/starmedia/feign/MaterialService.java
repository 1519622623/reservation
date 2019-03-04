package com.market.starmedia.feign;

import com.market.starmedia.logic.pojo.AdScheduleSw;
import com.market.starmedia.logic.pojo.MaterialInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="material-service")
public interface MaterialService {
    @RequestMapping(path = "/material/save")
    String save(@RequestBody MaterialInfo query);

}