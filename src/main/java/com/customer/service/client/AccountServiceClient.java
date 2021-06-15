package com.customer.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "account-service")
public interface AccountServiceClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/account/get", produces = "application/json")
	public String getMethod();

}


