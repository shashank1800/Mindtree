package Exe_5;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] dInputArray1 = new double[] { 10, 20, 30 };
        double[] dInputArray2 = new double[] { 20, 50, 30, 70, 80 };

        double[] iSumArray;

        if (dInputArray1.length < dInputArray2.length)
            iSumArray = sumArray(dInputArray1, dInputArray2);
        else
            iSumArray = sumArray(dInputArray2, dInputArray1);

        for (int i = 0; i < iSumArray.length; i++)
            System.out.print(iSumArray[i] + "  ");

        sc.close();
    }

    private static double[] sumArray(double[] dInputArray1, double[] dInputArray2) {

        int index;
        double[] iSumArray = new double[dInputArray2.length];

        for (index = 0; index < dInputArray1.length; index++)
            iSumArray[index] = dInputArray1[index] + dInputArray2[index];

        for (; index < dInputArray2.length; index++)
            iSumArray[index] = dInputArray2[index];

        return iSumArray;
    }
}
