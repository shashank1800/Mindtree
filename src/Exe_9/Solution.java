package Exe_9;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        boolean isPrimeNumber = isPrime(n);
        System.out.println(isPrimeNumber);

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

// 2, 3, 5, 7, 11, 13, 17, 19, 23 ......