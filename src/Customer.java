
public class Customer {
	
	private  String name;
	private  Account account;
	
	public Customer(String n,Account ac) {
		
		name=n;
		account=ac;
	}
	
	public void display() {
		System.out.println("Name : "+name+ "Account Details : \n Account Number : "+account.getAccountNumber()+ " and Balance : "+account.getBalance());
	}
	
	public String getName() {
		return name;
	}
	
	public Account getAccount() {
		return account;
	}

}
