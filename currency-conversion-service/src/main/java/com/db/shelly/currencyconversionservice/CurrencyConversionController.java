package com.db.shelly.currencyconversionservice;

import java.math.BigDecimal;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy ccyProxy;
	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping(value="/currency/exchange/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		CurrencyConversionBean bean = null;		
		bean = new CurrencyConversionBean(1L,from,to,BigDecimal.ONE,quantity,0) ;		
		bean.setConversionMultiple(new BigDecimal(25));
		bean.setTotalCalculatedAmount(quantity.multiply( bean.getConversionMultiple()));
		logger.info(" respose is {} "+ bean);
		return bean;
	}
	
	@GetMapping(value="/feign-client/currency/exchange/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyByFeignClient(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		CurrencyConversionBean bean =ccyProxy.retriveExchangeValue(from, to);
		
		bean.setTotalCalculatedAmount(quantity.multiply( bean.getConversionMultiple()));
		logger.info(" respose is {} "+ bean);
		
		return bean;
	}

}
