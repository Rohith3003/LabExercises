package streamApiCaseStudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	List<Employee> employees = new ArrayList<Employee>();
	void createEmployee(int empId,String firstName, String lastName, String email, String phnNo, LocalDate hireDate,
			String designation, double salary, int managerId, Department dept)
	{
		Employee emp = new Employee(empId,firstName, lastName, email, phnNo, hireDate, designation, salary, managerId,dept);
		employees.add(emp);
	}

}
