package Exe_27;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.println("Enter empID");
		emp.setEmpId(sc.nextInt());

		System.out.println("Enter empName");
		emp.setEmpName(sc.nextLine());

		System.out.println("Enter empDesig");
		emp.setEmpDesig(sc.nextLine());

		System.out.println("Enter empDepartment");
		emp.setEmpDept(sc.nextLine());

		sc.close();
	}
}
