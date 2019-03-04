package com.market.starmedia;

import com.alibaba.fastjson.JSON;
import com.market.starmedia.logic.creative.datasource.adEffect.dao.AdEffectMapper;
import com.market.starmedia.logic.creative.datasource.adEffect.pojo.AdEffect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.market.starmedia.logic.creative.datasource.*.dao")
public class CreativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreativeApplication.class, args);
	}
	@RestController
	class EchoController {

		@Autowired
		private AdEffectMapper adEffectmapper;
		@GlobalTransactional(timeoutMills = 300000, name = "spring-cloud-demo-tx")
		@RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
		public String echo(@PathVariable String string) {

			AdEffect result = adEffectmapper.selectByPrimaryKey((long) 10542);
			return "hello Nacos Discoveryfdsdf " + string+ JSON.toJSONString(result);
		}

		@RequestMapping(value = "/divide", method = RequestMethod.GET)
		public String divide(@RequestParam Integer a, @RequestParam Integer b) {
			return String.valueOf(a / b);
		}
	}

}
