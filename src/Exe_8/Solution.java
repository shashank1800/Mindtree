package Exe_8;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        reverseNumber(number);

        sc.close();
    }

    private static void reverseNumber(int number) {

        int reverse;
        for (reverse = 0; number != 0; number /= 10) {
            int rem = number % 10;
            reverse = (reverse * 10) + rem;
        }

        System.out.println(reverse);
    }

}
