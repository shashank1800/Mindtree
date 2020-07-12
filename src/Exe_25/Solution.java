package Exe_25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] data = new Integer[] { 1, 2, 3, 4, 5, 7, 9 };
        printTriplet(data);

        sc.close();

    }

    public static void printTriplet(Integer[] data) {

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(data));
        Set<String> resltSet = new HashSet<String>();

        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data.length; j++) {

                int A = data[i] < data[j] ? data[i] : data[j];
                int B = data[i] < data[j] ? data[j] : data[i];
                int C = A + B;

                String pair = "<" + A + "," + B + "," + C + ">";

                if (i != j && set.contains(C) && !resltSet.contains(pair)) {
                    System.out.println(pair);
                    resltSet.add(pair);
                }
            }

    }

}
