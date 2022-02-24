package lab4.Exercise1;

import java.util.*;

public class Person {
	String name;
	int age;
	Account acc;
	Scanner sc = new Scanner(System.in);

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void createAccount(double amount)
	{
		System.out.println("Enter the type of account you want to create");
		String accType = sc.next().toLowerCase();
		switch(accType)
		{
			case "savings": 
				SavingsAccount acc = new SavingsAccount(amount);
				if(amount>acc.minBalance)
			    {
				    this.acc = acc;
					System.out.println("Savings Account Created Successfully with a balance of: "+amount);
				}
				else
				{
					System.out.println("Account Creation request cannot be proccessed minimum balance of: "+acc.minBalance+" is required");
					acc=null;
				}
				break;
			case "current" : 
				CurrentAccount acc1 = new CurrentAccount(amount);
				if(amount>500)
				{
					this.acc = acc1;
					System.out.println("Current Account Created Successfully with a balance of: "+amount);
				}
				else
				{
					System.out.println("Account Creation request cannot be proccessed minimum balance of:  is required");
					acc1=null;
				}
				break;
			default : System.out.println("Enter valid account type");
			 		  break;
		
		}
	}

}
