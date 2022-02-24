package streamApiCaseStudy;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeService {
	static EmployeeRepository er = new EmployeeRepository();
	
	public static void main(String[] args) {
		er.createEmployee(123654, "Rohith", "Sai", "rohith@gmail.com", "9439202022", LocalDate.of(2022, 4, 2), "Senior Analyst", 62000, 125312, new Department(531351,"API development",777832));
		er.createEmployee(123442, "Abhishek", "Kumar", "abhishek@gmail.com", "9439275435", LocalDate.of(2022, 8, 2), "Senior Analyst", 62000, 125312, new Department(531351,"API development",777832));
		er.createEmployee(123454, "Kiran", "babu", "Kiran@gmail.com", "9539204242", LocalDate.of(2022, 1, 2), "Senior Analyst", 62000, 125312, new Department(531351,"API development",777832));
		er.createEmployee(132644, "Sai", "Sreeram", "sreeram@gmail.com", "9429202532", LocalDate.of(2022, 11, 2), "Senior Analyst", 62000, 125312, new Department(531351,"API development",777832));
		er.createEmployee(126393, "prasad", "varma", "prasad@gmail.com", "9479202432", LocalDate.of(2022, 14, 2), "Senior Analyst", 62000, 125312, new Department(531351,"API development",777832));
		Integer sum = 0;
	}
}
