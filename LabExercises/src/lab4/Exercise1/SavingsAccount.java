package lab4.Exercise1;

public class SavingsAccount extends Account {
	SavingsAccount(double balance) {
		super(balance);
	}
	public final double minBalance=1100;
	public void withdrawl(double amount)
	{
		double amt = this.getBalance();
		if(amount<amt-minBalance)
		{
			amt = amt - amount;
			this.setBalance(amt);
		}
	}


}
