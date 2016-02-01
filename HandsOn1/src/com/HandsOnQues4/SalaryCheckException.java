package com.HandsOnQues4;

public class SalaryCheckException extends Exception {
	
	private int salary;
	private String msg;
	public SalaryCheckException(int salary, String msg) {
		// TODO Auto-generated constructor stub
		this.salary = salary;
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}

}
