package lab4.Exercise1;

public class CurrentAccount extends Account{
	CurrentAccount(double balance) {
		super(balance);
	}
	final double overdraftLimit = 20000;
	public void withdrawl(double amount)
	{
		double amt = this.getBalance();
		if(amount<amt)
		{
			if(amount<this.overdraftLimit)
			{
				amt=amt-amount;
				this.setBalance(amt);
			}
		}
		else
		{
			System.out.println("Overdraft Limit reached");
		}
	}

}
