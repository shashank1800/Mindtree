package Exe_14;

import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1) Binary search for Integer elements");
        System.out.println("2) Binary search for Strings");
        System.out.println("3) Exit");

        int option = sc.nextInt();

        System.out.println("Enter the array size : ");
        int N = sc.nextInt();

        boolean res;

        switch (option) {
            case 1:
                TreeSet<Integer> array1 = new TreeSet<Integer>();

                System.out.println("Enter the array items with space between them");
                for (int i = 0; i < N; i++)
                    array1.add(sc.nextInt());

                System.out.println("Enter the key");
                int key1 = sc.nextInt();

                res = findElement(array1.toArray(new Integer[array1.size()]), key1);
                System.out.println(res);

                break;

            case 2:
                TreeSet<String> array2 = new TreeSet<String>();

                System.out.println("Enter the array items with space between them");
                for (int i = 0; i < N; i++)
                    array2.add(sc.next());

                System.out.println("Enter the key");
                String key2 = sc.next();

                res = findString(array2.toArray(new String[array2.size()]), key2);
                System.out.println(res);

                break;

            default:
                System.exit(0);
                break;
        }

        sc.close();

    }

    private static boolean findElement(Integer[] array, int key) {
        return findElement(array, key, 0, array.length - 1);
    }

    private static boolean findString(String[] array, String key) {
        return findString(array, key, 0, array.length - 1);
    }

    private static boolean findElement(Integer[] array, int key, int low, int high) {

        boolean isFound = false;

        if (low <= high) {

            int mid = Math.round((low + high) / 2);

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
            int mid = Math.round((low + high) / 2);

            if (array[mid].equals(key))
                return true;

            else if (array[mid].compareTo(key) > 0)
                return isFound || findString(array, key, low, mid - 1);
            else
                return isFound || findString(array, key, mid + 1, high);
        }

        return false;
    }

}
