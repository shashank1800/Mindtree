package Exe_25;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] data = new Integer[] { 1, 2, 3, 4, 5, 7, 9 };
        printTriplet(data);

        sc.close();

    }

    public static void printTriplet(Integer[] data) {

        String[] resultSet = new String[100];
        int index = 0;

        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data.length; j++)
                for (int k = 0; k < data.length; k++) {
                    if (i != j && j != k && i != k && data[i] + data[j] == data[k]) {

                        int A = data[i] < data[j] ? data[i] : data[j];
                        int B = data[i] < data[j] ? data[j] : data[i];
                        int C = A + B;

                        String pair = "<" + A + "," + B + "," + C + ">";

                        if (!isContains(resultSet, pair, index)) {
                            System.out.println(pair);
                            resultSet[index] = pair;
                            index++;
                        }
                    }
                }

    }

    private static boolean isContains(String[] resultSet, String pair, int size) {

        for (int i = 0; i < size ; i++) {
            if (resultSet[i].equals(pair)) {
                return true;
            }
        }
        
        return false;
    }

}
