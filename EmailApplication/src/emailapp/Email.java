package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 8;
	private String email;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private String companySuffix = "anycompany.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		this.department = setDepartment();
		// System.out.println("Department: " + this.department);
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("YOUR PASSWORD IS: " + this.password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("YOUR EMAIL IS: " + email);
	}

	private String setDepartment() {
		System.out.print("New Worker :" + firstName + ". "
				+ "Department Codes:\n1. SALES\n2. DEVELOPMENT\n3. ACCOUNTING\nEnter Department Code:");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		sc.close();
		if (deptChoice == 1) {
			return "sales";
		} else if (deptChoice == 2) {
			return "dev";
		} else if (deptChoice == 3) {
			return "acct";
		} else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*qwertyuiopasdfghjklzxcvbnm";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public void changePassword(String pass) {
		this.password = pass;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + "mb";
	}
}
