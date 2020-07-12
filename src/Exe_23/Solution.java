package Exe_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		printConsecutiveCharacters(input);

		sc.close();

	}

	public static void printConsecutiveCharacters(String input) {

		HashMap<String, Integer> consec = new HashMap<String, Integer>();

		for (int i = 0; i < input.length() - 1; i++) {

			char currChar = input.charAt(i);
			char nextChar = input.charAt(i + 1);

			if (!Character.isAlphabetic(currChar))
				continue;

			else {
				if (!Character.isUpperCase(currChar))
					currChar = (char) (currChar - 32);
				if (!Character.isUpperCase(nextChar))
					nextChar = (char) (nextChar - 32);
			}

			if ((nextChar - currChar) == 1) {
				String bothAttached = "" + currChar + nextChar;
				if (consec.containsKey(bothAttached)) {
					consec.put(bothAttached, consec.get(bothAttached) + 1);
				} else {
					consec.put(bothAttached, 1);
				}
				i++;
			}
		}

		for (Map.Entry<String, Integer> entry : consec.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());

	}

}
