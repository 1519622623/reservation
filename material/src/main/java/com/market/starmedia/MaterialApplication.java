package com.market.starmedia;

import com.alibaba.fastjson.JSON;
import com.market.starmedia.logic.material.datasource.materialInfo.dao.MaterialInfoMapper;
import com.market.starmedia.logic.material.datasource.materialInfo.pojo.MaterialInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.market.starmedia.logic.materia.datasource.materialInfo.dao")
public class MaterialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaterialApplication.class, args);
	}


	@RestController
	class EchoController {

		@Autowired
		private MaterialInfoMapper materialInfoMapper;
		@RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
		public String echo(@PathVariable String string) {

			MaterialInfo result = materialInfoMapper.selectByPrimaryKey((long) 1);
			return "hello Nacos Discovery " + string+ JSON.toJSONString(result);
		}

		@RequestMapping(value = "/divide", method = RequestMethod.GET)
		public String divide(@RequestParam Integer a, @RequestParam Integer b) {
			return String.valueOf(a / b);
		}
	}
}
