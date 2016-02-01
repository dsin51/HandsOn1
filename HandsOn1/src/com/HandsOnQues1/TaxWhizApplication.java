package com.HandsOnQues1;

import java.util.Scanner;

public class TaxWhizApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the purchase amount:");
		double purchase;
		Scanner sin = new Scanner(System.in);
		purchase = sin.nextDouble();
		TaxWhiz obj = new TaxWhiz(0.12);
		double value = obj.calcTax(purchase);
		System.out.println("Sales Tax:"+value);
	}

}
