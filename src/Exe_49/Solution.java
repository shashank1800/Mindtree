package Exe_49;

import java.util.Scanner;

public class Solution {

    public static String set[] = new String[100];
    public static int setSize = 0;

    public static void main(String[] args) {

        int[] array = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size ");
        int size = sc.nextInt();

        System.out.println("Enter the array values ");
        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        System.out.println("Enter the sum ");
        int sum = sc.nextInt();
        sumOfSubset(new int[100], -1, array, size, sum);

        for (int i = 0; i < setSize; i++)
            System.out.println(set[i]);

        sc.close();

    }

    private static void sumOfSubset(int[] subset, int index, int[] array, int size, int sum) {

        if (size == -1 || arraySum(subset, index + 1) > sum)
            return;

        if (arraySum(subset, index + 1) == sum) {
            addToSet(subset, index + 1);
            return;
        }

        for (int i = size - 1; i >= 0; i--) {
            sumOfSubset(subset, index, array, size - 1, sum);
            subset[index + 1] = array[i];
            int[] temp = arrayPop(array, i, size);
            sumOfSubset(subset, index + 1, temp, size - 1, sum);
        }

    }

    private static int[] arrayPop(int[] array, int popIndex, int size) {

        int[] temp = new int[100];

        int index;
        for (index = 0; index < popIndex; index++)
            temp[index] = array[index];

        for (index = popIndex; index < size - 1; index++)
            temp[index] = array[index + 1];

        return temp;
    }

    public static void addToSet(int[] array, int size) {

        boolean isContains = false;

        int[] sortedArray = bubbleSort(array, size);

        String arrayString = printArray(sortedArray, size);

        for (int i = 0; i < setSize; i++)
            if (set[i].compareTo(arrayString) == 0) {
                isContains = true;
                break;
            }

        if (!isContains) {
            set[setSize] = arrayString;
            setSize++;
        }

    }

    public static int[] bubbleSort(int[] array, int size) {

        int[] copyArray = array.clone();

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (copyArray[j] > copyArray[j + 1]) {
                    int temp = copyArray[j];
                    copyArray[j] = copyArray[j + 1];
                    copyArray[j + 1] = temp;
                }

        return copyArray;
    }

    private static String printArray(int[] subset, int size) {
        String arrayString = "[ ";

        for (int i = 0; i < size; i++)
            arrayString += subset[i] + " ";
        arrayString += "]";

        return arrayString;
    }

    private static int arraySum(int[] subset, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum += subset[i];
        return sum;
    }

}
