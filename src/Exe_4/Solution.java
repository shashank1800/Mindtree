package Exe_4;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements with space between them");

        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum += array[i];
        
        System.out.println("Sum = "+ sum);
        
        sc.close();
    }

}
