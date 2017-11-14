package student.database;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		System.out.print("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		// sc.close();
		Student[] students = new Student[numOfStudents];
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTution();
		}
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].showInfo());
		}
	}

}
