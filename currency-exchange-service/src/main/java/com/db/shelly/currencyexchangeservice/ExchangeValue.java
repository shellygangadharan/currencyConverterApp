package com.db.shelly.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ExchangeValue {
	
	
	@Id
	private Long id;
	@Column(name="from_currency")
	private String from;
	@Column(name="to_currency")
	private String to;
	private BigDecimal conversionMultiple;
	private Integer port;
	

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}



public ExchangeValue(Long id, String from, String to , BigDecimal conversionMultiple){
super();
this.id = id;
this.to= to;
this.from = from;
this.conversionMultiple = conversionMultiple;
}

public ExchangeValue(){
	
	
}
}
