package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		String file = "C:\\Users\\acer\\Downloads\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error reading account type");
			}
		}
		for (Account acc : accounts) {
			System.out.println("**************");
			acc.showInfo();
		}

	}

}
