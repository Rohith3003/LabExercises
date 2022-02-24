package lab5.Exercise1;

public class Person {
	int age;
	Person()
	{
		
	}
	Person(int age) throws InvalidAgeException
	{
		this.age=age;
		if(age<=15)
			throw new InvalidAgeException("Age of the person must be above 15");
		else
			System.out.println("Person age is validated successfully.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Person p = new Person(16);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
