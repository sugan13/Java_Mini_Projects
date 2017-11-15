package bankaccountapp;

public class Savings extends Account {
	int safetyDepositBoxID;
	int safetyDepositBoxKey;

	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setsafetyDepositBox();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}

	public void setsafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Your savings account features" + "\nSafety Deposit Box ID: " + safetyDepositBoxID
				+ "\nSafety Deposit Box Key: " + safetyDepositBoxKey);

	}
}
