package Exe_10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++)
            if (isPrime(num))
                System.out.print(num + " ");

        sc.close();
    }

    private static boolean isPrime(double n) {

        if (n % 2 == 0 || n < 2)
            return false;
        for (double i = 3; i <= n/2; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
