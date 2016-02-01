package com.HandsOnQues4;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Employee emp = new Employee("Ramesh", "unskilled", 4000);
		System.out.println(emp.showEmployee());
		}catch(SalaryCheckException e) { System.out.println(e.getMessage()); }
		
	}

}
