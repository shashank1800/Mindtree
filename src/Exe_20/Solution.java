package Exe_20;

import java.util.Scanner;

public class Solution {

    static char[] value;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        char[] anotherString = new char[input2.length()];

        value = new char[input1.length()];

        for (int i = 0; i < input1.length(); i++)
            value[i] = input1.charAt(i);

        for (int i = 0; i < input2.length(); i++)
            anotherString[i] = input2.charAt(i);

        int compareResult = compareTo(anotherString);

        if (compareResult > 0)
            System.out.println(input1 + " comes after " + input2);
        else if (compareResult == 0) {
            System.out.println(input1 + " is same as " + input2);
        } else
            System.out.println(input1 + " comes before " + input2);

        sc.close();
    }

    private static int compareTo(char[] anotherString) {
        int len1 = value.length;
        int len2 = anotherString.length;
        int lim = Math.min(len1, len2);
        char v1[] = value;
        char v2[] = anotherString;

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }

        return len1 - len2;
    }

}
