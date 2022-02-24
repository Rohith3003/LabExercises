package lab4.Exercise1;
import java.util.Random;
public class Account {
	private long accNum;
	private double balance;
	Random random = new Random(); 
	Account(double balance)
	{
		this.accNum = random.nextLong();
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void deposit(double amount)
	{
		this.balance = this.balance+amount;
		System.out.println("Successfully deposited "+amount+" available balance is: "+this.balance);
	}
	public void withdrawl(double amount)
	{
		if(this.balance>amount)
		{
			System.out.println("Amount withdrawed:"+amount);
			this.balance = this.balance-amount;
		    System.out.println("Available Balance is: "+this.balance);
		}
		else
			System.out.println("Insufficient funds");
	}
	public void setBalance(double amount)
	{
		this.balance = this.balance+amount;
		System.out.println("Available Balance is: "+this.balance);
	}
	public double getBalance()
	{
		return this.balance;
	}

}
