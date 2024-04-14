package com.kaique.hrpayroll.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaique.hrpayroll.entities.Payment;
import com.kaique.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	@Autowired
	private PaymentService service;

	@GetMapping("/{workerId}/days/{days}")
	public Payment getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		return service.getPayment(workerId, days);
	}


}
