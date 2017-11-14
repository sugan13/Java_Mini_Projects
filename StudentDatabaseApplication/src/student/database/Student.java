package student.database;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = null;
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	private String studentID;

	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = sc.nextLine();
		System.out.print("Enter student last name: ");
		this.lastName = sc.nextLine();
		System.out.print("1 - Fresher\n2 - Junior\n3 - Senior\n4 - SuperSenior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		setStudentID();
		// sc.close();
		// System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
		// studentID);
	}

	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = "\n" + course;
				tutionBalance += costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);

		// System.out.println("Enrolled in: " + courses);
		// System.out.println("TutionBalance: " + tutionBalance);
	}

	public void viewBalance() {
		System.out.println("Your balance is: $" + tutionBalance);
	}

	public void payTution() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your payment: $");
		int payment = sc.nextInt();
		// sc.close();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thankyou for your payment of $" + payment);
		viewBalance();
	}

	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
				+ "\nCourses Enrolled: " + courses + "\nBalance: $" + tutionBalance;
	}
}
