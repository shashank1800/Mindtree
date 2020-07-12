package Exe_24;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.next();
		
		String compressedData = compress(new StringBuffer(data));
		System.out.println(compressedData);
		
		sc.close();
	}

	private static String compress(StringBuffer data) {

		for(int i=0;i<data.length();i++) {
			if(Character.isUpperCase(data.charAt(i)))
				data.replace(i, i+1, String.valueOf((char)(data.charAt(i)+32)));
		}
		
		StringBuffer compressed = new StringBuffer();
		
		int count = 1;
		for(int i=0;i<data.length()-1;i++) {
			if(data.charAt(i)==data.charAt(i+1))
				count++;
			else {
				compressed.append(data.charAt(i)).append(count);
				count = 1;
			}	
		}
		
		compressed.append(data.charAt(data.length()-1)).append(count);
		
		return compressed.toString();
	}

}
