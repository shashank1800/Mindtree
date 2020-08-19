package Exe_12;

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

        System.out.println("1) Bubble Sort");
        System.out.println("2) Insertion Sort");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bubbleSort(array);
                break;
            case 2:
                insertionSort(array);
                break;
            default:
                return;
        }

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        sc.close();

    }

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = key;
        }
    }

}
