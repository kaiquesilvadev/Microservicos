package com.kaique.hrApiGatewayZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZuulApplication.class, args);
	}

}