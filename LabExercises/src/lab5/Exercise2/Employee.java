package lab5.Exercise2;

public class Employee {
	Employee(String firstName,String lastName) throws InvalidNameException
	{
		if(firstName.equals(""))
			throw new InvalidNameException("First Name cannot be blank");
		else if(lastName.equals(""))
			throw new InvalidNameException("Last Name cannot be blank");
		else
			System.out.println("Employee name is validated successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee emp1 = new Employee("Rohith","Sai");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Outside Catch");
	}

}
