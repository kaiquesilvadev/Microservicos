package com.kaique.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kaique.hrpayroll.entities.dto.Worker;

@Component

//@FeignClient é uma anotação do Spring Cloud Feign que marca uma interface como um cliente Feign.
//Isso significa que essa interface será usada para fazer chamadas a um serviço REST específico.
//O parâmetro 'name' define um nome único para o cliente Feign, enquanto 'path' especifica o contexto do caminho base para todas as solicitações.
//Neste exemplo, estamos definindo um cliente Feign chamado "hr-worker" que fará solicitações para o contexto "/workers" em sua URL base.
@FeignClient(name = "hr-worker" ,  path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}
