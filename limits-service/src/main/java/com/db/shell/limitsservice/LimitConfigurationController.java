package com.db.shell.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping(value="/limits")
	@HystrixCommand(fallbackMethod="defaultLimits")
	public LimitConfiguration retrieveLimitsFromConfiguration(){
		return new LimitConfiguration(configuration.getMin(), configuration.getMax());
	} 
	
	
	@GetMapping(value="/wrong/limits")
	@HystrixCommand(fallbackMethod="defaultLimits")
	public LimitConfiguration retrieveWrongLimitsFromConfiguration(){
		throw new RuntimeException(" ot ");
	} 
	
	public LimitConfiguration defaultLimits(){
		return new LimitConfiguration(10, 10);
	} 

}
