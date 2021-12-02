import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;

public class AbcBank {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberofCustomers = 0;
		Bank bank = new Bank();
		Customer[] c = bank.getCustomer();
		while (true) {
			System.out.println("Pl Enter Your Choice : ");
			System.out.println("1 : Add Customer");
			System.out.println("2 : Deposit Amount");
			System.out.println("3 : Withdraw Amount");
			System.out.println("4 : Check Balance");
			System.out.println("5 : Calculate Interest");
			System.out.println("6 : Exit");

			int choice = Integer.parseInt(br.readLine());

			switch (choice) {

			case 1:

				System.out.println("Create an Account");

				System.out.println("Enter Initial Amount in your account");
				double bal = Double.parseDouble(br.readLine());

				System.out.println("Enter Account Number");
				String acc = br.readLine();

				Account ac = new Account(bal, acc);

				System.out.println("Enter your name");
				String name = br.readLine();

				Customer cust = new Customer(name, ac);
				c[numberofCustomers] = cust;
				numberofCustomers++;

				System.out.println("Customer Name : " + cust.getName() + " and Balance : " + ac.getBalance()
						+ " and Account Number : " + ac.getAccountNumber());
				break;
			case 2:

				System.out.println("Enter Account Number to Deposit Money");
				acc = br.readLine();

				if (numberofCustomers == 0) {
					System.out.println("No Account Found");
				} else {
					boolean found = false;
					for (int i = 0; i < numberofCustomers; i++) {
						Account temp = c[i].getAccount();
						String accountNumberTemp = temp.getAccountNumber();
						// System.out.println(accountNumberTemp);
						if (accountNumberTemp.equals(acc)) {
							System.out.println("Enter Amount to deposit");
							double money = Double.parseDouble(br.readLine());
							temp.deposit(money);
							found = true;
						}

					}
					if (found == false) {
						System.err.println("Account not Found");
					}

				}

				break;

			case 3:

				System.out.println("Enter Account Number to Withdraw Money");
				acc = br.readLine();

				if (numberofCustomers == 0) {
					System.out.println("No Account Found");
				} else {
					boolean found = false;
					for (int i = 0; i < numberofCustomers; i++) {
						Account temp = c[i].getAccount();
						String accountNumberTemp = temp.getAccountNumber();
						if (accountNumberTemp.equals(acc)) {
							System.out.println("Enter Amount to Withdraw");
							double money = Double.parseDouble(br.readLine());
							temp.withdraw(money);
							found = true;
						}

					}
					if (found == false) {
						System.err.println("Account not Found");
					}

				}

				break;
			case 4:

				System.out.println("Enter Account Number to Check Balance");
				acc = br.readLine();

				if (numberofCustomers == 0) {
					System.out.println("No Account Found");
				} else {
					boolean found = false;
					for (int i = 0; i < numberofCustomers; i++) {
						Account temp = c[i].getAccount();
						String accountNumberTemp = temp.getAccountNumber();
						// System.out.println(accountNumberTemp);
						if (accountNumberTemp.equals(acc)) {

							System.out.println(
									"Balance of account no : " + accountNumberTemp + " is : " + temp.getBalance());
							found = true;
						}

					}
					if (found == false) {
						System.err.println("Account not Found");
					}

				}
				break;
			case 5:

				System.out.println("Enter Account Number to Calculate Interest");
				acc = br.readLine();

				if (numberofCustomers == 0) {
					System.out.println("No Account Found");
				} else {
					boolean found = false;
					for (int i = 0; i < numberofCustomers; i++) {
						Account temp = c[i].getAccount();
						String accountNumberTemp = temp.getAccountNumber();
						if (accountNumberTemp.equals(acc)) {

							bank.calculateInterest(c[i]);
							found = true;
						}

					}
					if (found == false) {
						System.err.println("Account not Found");
					}

				}

				break;
			case 6:
				System.exit(0);
				break;

			}
		}

	}

}
