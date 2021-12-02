
public class Account {
	
	private double balance=100;
	private String accountNumber;
	
	private boolean firstTime=true;
	
	public Account(String acc) {
		accountNumber=acc;
	}
	
	public Account(double bal, String acc) {
		if(bal>=100) {
			balance=bal;
		}else
		{
			balance=100;
		}
		accountNumber=acc;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println(amount +"Rs. successfully deposited in your account.\n Current Balance After Deposit : "+balance);
		}
		else
		{
			System.out.println("Pl Ensure Amount should not be in Negative");
		}
	}
	
	public void withdraw(double amount)
	{
		
		if(amount>=0) {
			
			if(firstTime==true) {
				
				double tempBalance=balance;
				
				tempBalance=tempBalance-amount;
				
				if(tempBalance>=100) {
					
					balance=balance-amount;
					System.out.println(amount +"Rs. successfully withdraw from your account.\n Current Balance After Withdraw : "+balance);
				}
				else
				{
					System.err.println("Insufficient Balance to remove : "+amount);
				}
				firstTime=false;
			}
			
			else
			{
				
				Bank bank=new Bank();
				double tempBalance=balance;
				
				tempBalance=tempBalance-amount-bank.getTransactionsFees();
				
				if(tempBalance>=100) {
					balance=balance-amount-bank.getTransactionsFees();
					System.out.println(amount +"Rs. successfully withdraw from your account.\n Current Balance After Withdraw : "+balance);
				}
				else
				{
					System.err.println("Insufficient Balance to remove : "+amount);
				}
			}
		}
		
		else
		{
			System.err.println("Pl Ensure Amount should not be in Negative");
		}
		
	
		
	}
	
	public double getBalance() {
		
		return balance;
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

}
