package com.HandsOnQues4;

public class Employee {
	String name;
	String skillLevel;
	int salary;
	
	public Employee(String name, String skillLevel, int salary) throws SalaryCheckException {
		super();
		this.name = name;
		this.skillLevel = skillLevel;

		if(this.skillLevel == "unskilled") {
			if(salary < 8500) throw new SalaryCheckException(salary,"Salary should be greater than 8500/-");
		}
		else this.salary = salary;
		
		if(this.skillLevel == "semi-skilled") {
			if(salary < 9500) throw new SalaryCheckException(salary,"Salary should be greater than 9500/-");
		}
		else this.salary = salary;
		
		if(this.skillLevel == "skilled") {
			if(salary < 10500) throw new SalaryCheckException(salary,"Salary should be greater than 10500/-");
		}
		else this.salary = salary;
		
	}
	public String showEmployee() {
		return "Name:" + name + "\nSkill Level:" + skillLevel + "\nSalary:" + salary;
	}
	
}
