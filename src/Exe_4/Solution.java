package Exe_4;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int N = sc.nextInt();

        System.out.println("Enter the array elements with space between then");

        int[] array = new int[N];

        for (int i = 0; i < N; i++)
            array[i] = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += array[i];
        
        System.out.println("Sum = "+ sum);
        
        sc.close();
    }

}
