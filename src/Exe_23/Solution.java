package Exe_23;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        printConsecutiveCharacters(input);

        sc.close();

    }

    public static void printConsecutiveCharacters(String input) {

        String[] consecutive = new String[100];
        int[] count = new int[100];
        int position = 0;

        for (int i = 0; i < input.length() - 1; i++) {

            char currChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);

            if (!isAlphabet(currChar))
                continue;

            else {
                if (!isUpperCase(currChar))
                    currChar = (char) (currChar - 32);
                if (!isUpperCase(nextChar))
                    nextChar = (char) (nextChar - 32);
            }

            if ((nextChar - currChar) == 1) {

                String bothAttached = "" + currChar + nextChar;

                int where = isInArray(consecutive, bothAttached, position);

                if (where != -1) {
                    consecutive[where] = bothAttached;
                    count[where] += 1;
                } else {
                    consecutive[position] = bothAttached;
                    count[position] = 1;
                    position++;
                }
                i++;
            }
        }

        for (int i = 0; i < position; i++)
            System.out.println(consecutive[i] + " " + count[i]);

    }

    private static int isInArray(String[] consec, String bothAttached, int size) {

        for (int i = 0; i < size; i++)
            if (consec[i].equals(bothAttached)) {
                return i;
            }
        return -1;
    }

    public static boolean isAlphabet(int currChar) {

        if (currChar > 'a' && currChar < 'z')
            return true;
        else if (currChar > 'A' && currChar < 'Z')
            return true;

        return false;

    }

    public static boolean isUpperCase(int currChar) {
        if (currChar > 'A' && currChar < 'Z')
            return true;
        return false;
    }

}
