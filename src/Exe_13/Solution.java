package Exe_13;

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

        System.out.println("Enter the key");
        int key = sc.nextInt();

        bubbleSort(array);
        int found = binarySearch(key, array, 0, N - 1);

        if (found != -1)
            System.out.println("true");
        else
            System.out.println("false");

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

    public static int binarySearch(int key, int[] array, int low, int high) {

        if (low <= high) {
            int mid = Math.round((low + high) / 2);

            if (array[mid] == key)
                return mid;
            else if (array[mid] > key)
                return binarySearch(key, array, low, mid - 1);
            else
                return binarySearch(key, array, mid + 1, high);
        } else
            return -1;

    }

}
