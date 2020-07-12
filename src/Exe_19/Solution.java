package Exe_19;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	
	/*
	 * 1) Input name1 and name 2
	 * 2) Split the name1 and name2 where it has space using StringTokenizer()
	 * 3) Join them using StringBuffer (Less complexity compared to String concatenation)
	 *
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first person name : ");
		String name1 = sc.nextLine();

		System.out.println("Enter second person name : ");
		String name2 = sc.nextLine();

		String[] bothNames = swapLastName(name1, name2);

		System.out.println(bothNames[0]);
		System.out.println(bothNames[1]);

		sc.close();
	}

	public static String[] swapLastName(String name1, String name2) {

		StringTokenizer st1 = new StringTokenizer(name1);
		StringTokenizer st2 = new StringTokenizer(name2);

		StringBuffer temp1 = new StringBuffer(st1.nextToken());
		StringBuffer temp2 = new StringBuffer(st2.nextToken());

		temp1.append(" ").append(st2.nextToken());
		temp2.append(" ").append(st1.nextToken());

		return new String[]{temp1.toString(), temp2.toString()};
	}

}
