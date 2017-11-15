package bankaccountapp;

public abstract class Account implements IBaseRate {
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	protected double rate;
	static int index = 10000;

	public Account(String name, String sSN, double initDeposit) {
		index++;
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		this.accountNumber = setAccountNumber();
		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;
	}

	public void compound() {
		double accuredInterest = balance * (rate / 100);
		balance = balance + accuredInterest;
		System.out.println("Accured Interest: $" + accuredInterest);
		printBalance();
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing: $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing: $" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering: $" + amount + "to" + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	public void showInfo() {
		System.out.println("Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance + "\nRate: "
				+ rate + "%");
	}
}
