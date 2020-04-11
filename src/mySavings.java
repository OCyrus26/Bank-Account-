public class mySavings 
{
	private double balance;
	
	public mySavings()
	{   
		balance = 1000;
	}

	public mySavings(double initialBalance)
	{   
		balance = initialBalance;
	}
	
	public void withdraw(double amount)
	{   
		if (balance < amount) 
		{
			System.out.println("Insuffcient funds, your available balance is: "+balance);   
		}

		balance = balance - amount;
	}
	
	public void deposit(double amount)
	{  
		balance = balance + amount;
	}
	
	public double getBalance()
	{   
		return balance;
	}
}
