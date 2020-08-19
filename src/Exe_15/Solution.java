package Exe_15;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array;

        System.out.println("Enter the array size : ");
        int N = sc.nextInt();

        array = new int[N];

        System.out.println("Enter the array items with space between them");
        for (int i = 0; i < N; i++)
            array[i] = sc.nextInt();

        insertionSort(array);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        sc.close();
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
