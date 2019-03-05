package com.market.starmedia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.market.starmedia.logic.creative.datasource.*.dao")
public class CreativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreativeApplication.class, args);
	}
}
