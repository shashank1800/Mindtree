package Exe_50;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = false;

        while (true) {

            System.out.println();
            System.out.println("1-Number palindrome or not ");
            System.out.println("2-String palindrome or not ");
            System.out.println("3-Exit ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.println("Enter a number");
                isPalindrome = numberPalindrome(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter a string");
                sc.nextLine();
                isPalindrome = stringPalindrome(sc.nextLine());
                break;
            default:
                sc.close();
                System.exit(0);
            }

            if (isPalindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not palindrome");
            }
        }

    }

    private static boolean numberPalindrome(int input) {
        int reverse = reverseNumber(input);
        return reverse == input;
    }

    private static boolean stringPalindrome(String input) {
        String reverse = reverseString(input);
        return reverse.equals(input);
    }

    public static String reverseString(String input) {

        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--)
            reverse += input.charAt(i);

        return reverse;
    }

    public static int reverseNumber(int input) {

        int reverse = 0;
        while (input != 0) {
            int rem = input % 10;
            reverse = reverse * 10 + rem;
            input /= 10;
        }
        return reverse;
    }

}
