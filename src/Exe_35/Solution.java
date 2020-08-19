package Exe_35;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(1, "Ram", "CSE", 45));
		list.add(new Student(2, "Sham", "ISE", 40));
		list.add(new Student(3, "Raj", "MECH", 79));
		list.add(new Student(4, "Shashank", "CSE", 74));
		list.add(new Student(5, "Manju", "ECE", 49));

		if (list.size() > 0)
			System.out.println(getHighestMarks(list));
		else {
			System.out.println("Empty list");
		}

		sc.close();
	}

	private static Student getHighestMarks(ArrayList<Student> list) {

		Student maxMarks = list.get(0);

		for (Student student : list) {
			if (student.getStudentScore() > maxMarks.getStudentScore())
				maxMarks = student;
		}

		return maxMarks;
	}

}
