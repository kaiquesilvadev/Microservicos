package com.kaique.hrApiGatewayZuul.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
@EnableZuulProxy
 public  class ZuulConfig {
	 @Bean
	    public ZuulProperties zuulProperties() {
	        return new ZuulProperties();
	    }
	}