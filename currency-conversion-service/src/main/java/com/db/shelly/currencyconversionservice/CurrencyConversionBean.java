package com.db.shelly.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

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

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quanity) {
		this.quantity = quanity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	Long id;
	String from;
	String to;
	BigDecimal conversionMultiple;
	BigDecimal quantity;
	BigDecimal totalCalculatedAmount;
	int port;
	
	public CurrencyConversionBean(){
		
	}
	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple,BigDecimal quantity, int port ){
		this.id = id;
		this.from = from;
		this.to= to;
		this.conversionMultiple= conversionMultiple;
		this.quantity = quantity;
		this.port = port;
	}
}
