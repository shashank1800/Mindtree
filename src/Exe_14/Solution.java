package Exe_14;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1) Binary search for Integer elements");
        System.out.println("2) Binary search for Strings");
        System.out.println("3) Exit");

        int option = sc.nextInt();

        System.out.println("Enter the array size : ");
        int size = sc.nextInt();

        boolean result;

        switch (option) {

        case 1:

            int[] array1 = new int[size];

            System.out.println("Enter the array items with space between them");
            for (int i = 0; i < size; i++)
                array1[i] = sc.nextInt();

            bubbleSort(array1);

            System.out.println("Enter the key");
            int key1 = sc.nextInt();

            result = findElement(array1, key1);
            System.out.println(result);

            break;

        case 2:
            String[] array2 = new String[size];

            System.out.println("Enter the array items with space between them");
            for (int i = 0; i < size; i++)
                array2[i] = sc.next();

            bubbleSort(array2);

            System.out.println("Enter the key");
            String key2 = sc.next();

            result = findString(array2, key2);
            System.out.println(result);

            break;

        default:
            System.exit(0);
            break;
        }

        sc.close();

    }

    private static boolean findElement(int[] array, int key) {
        return findElement(array, key, 0, array.length - 1);
    }

    private static boolean findString(String[] array, String key) {
        return findString(array, key, 0, array.length - 1);
    }

    private static boolean findElement(int[] array, int key, int low, int high) {

        boolean isFound = false;

        if (low <= high) {

            int mid = (low + high) / 2;

            if (array[mid] == key)
                return true;
            else if (array[mid] > key)
                return isFound || findElement(array, key, low, mid - 1);
            else
                return isFound || findElement(array, key, mid + 1, high);
        }

        return false;
    }

    private static boolean findString(String[] array, String key, int low, int high) {

        boolean isFound = false;

        if (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid].equals(key))
                return true;

            else if (array[mid].compareTo(key) > 0)
                return isFound || findString(array, key, low, mid - 1);
            else
                return isFound || findString(array, key, mid + 1, high);
        }

        return false;
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

    public static void bubbleSort(String[] array) {

        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j].compareTo(array[j + 1]) > 1) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

    }

}
