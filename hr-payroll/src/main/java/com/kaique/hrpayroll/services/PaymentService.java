package com.kaique.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kaique.hrpayroll.entities.Payment;
import com.kaique.hrpayroll.entities.dto.Worker;

@Service
public class PaymentService {
	
	@Value("${RestTemplate-test}")
	private String Host;
	
	@Autowired
	private RestTemplate restTemplate;

	// busca com restTemplate , mais informações na classe de configuração 
	public Payment getPayment(Long workerId, Integer days) {
		System.out.println(Host);
		
		Host += "/workers" + "/" + workerId;
		Worker worker = restTemplate.getForObject(Host , Worker.class);
		return new Payment(worker.getName(), worker.getDailyIncome() , days);
	}
}