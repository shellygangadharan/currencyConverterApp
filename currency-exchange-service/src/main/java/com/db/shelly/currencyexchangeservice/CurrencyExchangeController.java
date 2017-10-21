package com.db.shelly.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	
	@Autowired
	private Environment env;
	@Autowired
	private ExchangeValueRespository repository;
	@GetMapping(value="/currency/exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		
		ExchangeValue value= repository.findByFromAndTo(from, to);
		 String port = env.getProperty("server.port");
		 System.out.println(" port ="+port);
		 value.setPort(Integer.parseInt(port));
		 
		 return value;
	}
}
