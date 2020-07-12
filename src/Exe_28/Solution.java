package Exe_28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	static Map<String, Book> bookstore = new HashMap<String, Book>() {
		{
			put("Robinson Crusoe", new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719));
			put("Heart of Darkness", new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902));
			put("Beach Music", new Book("Pat Conroy", "Beach Music", 9.50, 1996));

		}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the book name : ");
		String bookName = sc.nextLine();

		if (bookstore.containsKey(bookName)) {
			System.out.println(bookstore.get(bookName));
		}

		sc.close();
	}

}
