package streamApiCaseStudy;

import java.time.LocalDate;

public class Employee {
	int empId;
	String firstName;
	String lastName;
	String email;
	String phnNo;
	LocalDate hireDate;
	String designation;
	double salary;
	int managerId;
	Department dept;
	public Employee(int empId,String firstName, String lastName, String email, String phnNo, LocalDate hireDate,
			String designation, double salary, int managerId, Department dept) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phnNo = phnNo;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.dept = dept;
	}

}
