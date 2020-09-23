package Exe_27;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Enter employee ID");
		employee.setEmpId(sc.nextInt());
		sc.nextLine();
		
		while(true) {
		    System.out.println("Enter employee Name");
		    boolean isNull = employee.setEmpName(sc.nextLine());
		    if(!isNull)
		        break;
		}

		while(true) {
		    System.out.println("Enter employee Designation \nDeveloper, Tester, Lead, Manager");
	        boolean isValid = employee.setEmpDesig(sc.nextLine());
	        
	        if(isValid)
	            break;
        }
		
		while(true) {
		    System.out.println("Enter employee Department \nTTH, RCM, Digital, DevOps");
	        boolean isValid = employee.setEmpDept(sc.nextLine());
            
            if(isValid)
                break;
        }
		
		sc.close();
	}
}
