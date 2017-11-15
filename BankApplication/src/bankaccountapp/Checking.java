package bankaccountapp;

public class Checking extends Account {
	int debitCardNumber;
	int debitCardPIN;

	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setdebitCard();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}

	private void setdebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features" + "\nDebit Card Number: " + debitCardNumber
				+ "\nDebit Card PIN: " + debitCardPIN);

	}
}
