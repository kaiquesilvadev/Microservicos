package com.kaique.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Com o uso apenas do Eureka, não é necessário utilizar o Ribbon para realizar o balanceamento de carga entre os serviços. 
 * O Eureka já fornece uma funcionalidade de descoberta de serviços e distribuição de carga integrada, 
 * o que elimina a necessidade de utilizar o Ribbon separadamente para essa finalidade.
 */

//@RibbonClient(name = "hr-worker")

/*
A anotação @EnableCircuitBreaker é usada para habilitar o suporte ao Hystrix no Spring Boot. Ela é parte do Spring Cloud, uma extensão do Spring Boot que facilita a integração de aplicativos com serviços de nuvem.
A partir do Spring Cloud Netflix versão 1.4.0, a anotação @EnableCircuitBreaker foi substituída pela anotação @EnableCircuitBreaker e @EnableHystrix.*/
@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
