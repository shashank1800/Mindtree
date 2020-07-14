package Exe_7;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A :");
        int a = sc.nextInt();

        System.out.println("Enter B :");
        int b = sc.nextInt();

        System.out.println("Enter C :");
        int c = sc.nextInt();

        int max = getMax(a, b, c);
        System.out.println(max);

        sc.close();
    }

    private static int getMax(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

}
