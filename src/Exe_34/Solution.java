package Exe_34;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		StudentRecords<Student> records = new StudentRecords<Student>();

		while (true) {

			System.out.println("\nEnter choice : ");
			System.out.println("1) Add student record");
			System.out.println("2) Sort student name based on branch name");
			System.out.println("3) Sort student based on ID");
			System.out.println("4) Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				addStudent(records);
				break;
			case 2:
				records.sortBasedOnBranch(records);
				records.printRecords(records);
				break;

			case 3:
				records.sortBasedOnID(records);
				records.printRecords(records);
				break;

			default:
				System.exit(0);
			}
		}

	}

	public static void addStudent(ArrayList<Student> records) {

		System.out.println("Enter student ID : ");
		int studentId = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter student name");
		String studentName = sc.nextLine();

		System.out.println("Enter student branch");
		String studentBranch = sc.next();

		records.add(new Student(studentId, studentName, studentBranch));
	}

}
