package com.market.starmedia.feign;


import com.market.starmedia.logic.pojo.AdScheduleSw;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="creative-service")
public interface CreativeService {
    @RequestMapping(path = "/ad/save")
    String save(@RequestBody AdScheduleSw query);
}
