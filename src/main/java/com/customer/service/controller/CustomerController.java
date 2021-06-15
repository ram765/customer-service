package com.customer.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.service.client.AccountServiceClient;

@RestController
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AccountServiceClient client;
	
	@GetMapping("/get")
	public String getMethod() {
		
		ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:8765/account/get", String.class);
		
		return "Hello Customer Service"+result.getBody();
	}
	
	@GetMapping("/getAccount")
	public String getAccount() {		
		String str = client.getMethod();		
		return str;
	}

}



