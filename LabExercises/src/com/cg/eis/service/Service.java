package com.cg.eis.service;
import java.util.*;
import com.cg.eis.bean.*;
interface EmployeeService 
{
	void getDetails();
	void findScheme(Employee emp,double salary);
	void displayDetails();
}
public class Service implements EmployeeService {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer,Employee> employees = new HashMap<Integer,Employee>();
	@Override
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of employee:");
		String name = sc.nextLine();
		System.out.println("Enter the employee id:");
		int id = sc.nextInt();
		System.out.println("Enter the salary of employee:");
		double salary = sc.nextDouble();
		System.out.println("Enter the designation:");
		sc.nextLine();
		String designation = sc.nextLine();
		Employee emp = new Employee(id,name,salary,designation);
		System.out.println("Please wait while we are processing your details");
		findScheme(emp,salary);
		employees.put(id, emp);
	}
	@Override
	public void findScheme(Employee emp,double salary) {
		if(salary>5000 && salary<20000)
		{
			System.out.println("You are eligible for Scheme C Would you like to map the scheme to your profile (Yes/No)?");
			String choice = sc.next().toLowerCase();
			if(choice.equals("yes"))
			{
				emp.insuranceScheme = "Scheme C";
				System.out.println("Scheme C is mapped to your profile and your profile created successfully.");
			}
			else if(choice.equals("no"))
			{
				System.out.println("Thank you. You can also update your scheme in future.");
			}
		}
		else if(salary>=20000 && salary<40000)
		{
			System.out.println("You are eligible for Scheme B Would you like to map the scheme to your profile (Yes/No)?");
			String choice = sc.next().toLowerCase();
			if(choice.equals("yes"))
			{
				emp.insuranceScheme = "Scheme B";
				System.out.println("Scheme B is mapped to your profile successfulyy.");
			}
			else if(choice.equals("no"))
			{
				System.out.println("Thank you. You can also update your scheme in future.");
			}
		}
		else if(salary>=40000)
		{
			System.out.println("You are eligible for Scheme A Would you like to map the scheme to your profile (Yes/No)?");
			String choice = sc.next().toLowerCase();
			if(choice.equals("yes"))
			{
				emp.insuranceScheme = "Scheme A";
				System.out.println("Scheme A is mapped to your profile successfully.");
			}
			else if(choice.equals("no"))
			{
				System.out.println("Thank you. You can also update your scheme in future.");
			}
		}
		else
		{
			System.out.println("You are not elgible for any scheme at this moment.");
		}
	}
	@Override
	public void displayDetails() {
		System.out.println("Enter your employee id");
		int id = sc.nextInt();
		if(employees.containsKey(id))
			System.out.println(employees.get(id));
		else
			System.out.println("Employee id not found");
	}

}
