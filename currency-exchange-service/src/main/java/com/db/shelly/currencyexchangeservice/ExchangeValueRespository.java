package com.db.shelly.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRespository extends JpaRepository<ExchangeValue,Long>{
	public ExchangeValue findByFromAndTo(String from, String to) ;

}
