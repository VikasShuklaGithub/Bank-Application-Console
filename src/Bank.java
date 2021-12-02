
public class Bank {

	
	private double interestRate=8.5;
	private double transactionsFees=50;
	private Customer[] customers=new Customer[1000];
	
	public void calculateInterest(Customer customer)
	{
		
		Account a=customer.getAccount();
		double bal=a.getBalance();
		double interestAmount=bal*interestRate/100;
		double totalBalance=bal+interestAmount;
		System.out.println("Interest Amount : \n"+interestAmount+ " Total Balance After adding Interest Amount : "+totalBalance);
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getTransactionsFees()
	{
		return transactionsFees;
	}
	
	public Customer[] getCustomer() {
		return customers;
	}
}
