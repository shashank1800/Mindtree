package Exe_31;

import java.util.Scanner;

public class Solution {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of customers : ");
		int N = sc.nextInt();
		
		Customer []list = new Customer[N];
	
		for(int i=0;i<N;i++) {
			
			System.out.println("Enter the customer name : ");
			String name = sc.next();
			
			System.out.println("Enter the mobile number : ");
			String mobNo = sc.next();
			
			System.out.println("Enter the feedback : ");
			double feedbackRating = sc.nextDouble();
			
			list[i] = new Customer(name, mobNo, feedbackRating);
		}
		
		sc.close();
	}

}
