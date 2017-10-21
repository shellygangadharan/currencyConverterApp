package com.db.shell.limitsservice;

public class LimitConfiguration {
	
	
	public LimitConfiguration(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	protected LimitConfiguration(){
		
	}
	
	private int min;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	private int max;

}
