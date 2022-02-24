package com.cg.eis.exception;

public class Employee {
	String firstName,lastName;
	Double salary;
	Employee(String firstName,String lastName,Double salary) throws EmployeeException
	{
		if(salary<3000)
			throw new EmployeeException("Employee salary cannot be less than 3000");
		else
		{
			this.firstName = firstName;
		    this.lastName = lastName;
		    this.salary = salary;
			System.out.println(firstName+" "+lastName+" "+"salary is "+salary);
		}
	}

	public static void main(String[] args) {
		try {
			Employee emp1 = new Employee("Rohith","Sai",2000.0);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}

	}

}
