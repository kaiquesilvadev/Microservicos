package com.kaique.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaique.hrpayroll.entities.Payment;
import com.kaique.hrpayroll.entities.dto.Worker;
import com.kaique.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, Integer days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome() , days);
	}
	
	
	/* busca com restTemplate , mais informações na classe de configuração 
	@Value("${RestTemplate-test}")
	private String Host;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(Long workerId, Integer days) {
		
		Host += "/workers" + "/" + workerId;
		Worker worker = restTemplate.getForObject(Host , Worker.class);
		return new Payment(worker.getName(), worker.getDailyIncome() , days);
	}
	*/
}