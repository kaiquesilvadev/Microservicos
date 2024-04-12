package com.kaique.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Com o uso apenas do Eureka, não é necessário utilizar o Ribbon para realizar o balanceamento de carga entre os serviços. 
 * O Eureka já fornece uma funcionalidade de descoberta de serviços e distribuição de carga integrada, 
 * o que elimina a necessidade de utilizar o Ribbon separadamente para essa finalidade.
 */

//@RibbonClient(name = "hr-worker")
@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
