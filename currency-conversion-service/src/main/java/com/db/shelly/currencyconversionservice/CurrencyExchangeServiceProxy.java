package com.db.shelly.currencyconversionservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="netflix-zuul-apigateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping(value="/currency-exchange-service/currency/exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retriveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) ;
	

}
