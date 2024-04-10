package com.kaique.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	/*
	 * 
	 * O RestTemplate é uma classe fornecida pelo Spring Framework para fazer
	 * chamadas de API RESTful em Java de forma simplificada. Ele permite realizar
	 * operações HTTP, como GET, POST, PUT e DELETE, e mapear as respostas para
	 * objetos Java, facilitando a integração de serviços web em aplicativos Spring.
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}