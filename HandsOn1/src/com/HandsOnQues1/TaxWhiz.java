package com.HandsOnQues1;

public class TaxWhiz {
	private double taxRate;

	public TaxWhiz(double taxRate) {
		super();
		this.taxRate = taxRate;
	}
	
	public double calcTax(double purchase) {
		return purchase*taxRate;
	}
}
