package Exe_3;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumStep = 0;

        while (n != 1) {

            if (n % 2 == 0) {
                System.out.println("" + n + " is even so i take half : " + (n / 2));
                n /= 2;
            } else {
                System.out.println("" + n + " is odd so i make 3n+1 : " + (n * 3) + 1);
                n = (n * 3) + 1;
            }
            sumStep++;
        }

        System.out.println("There are total " + sumStep + " steps to reach 1");

        sc.close();

    }

}
