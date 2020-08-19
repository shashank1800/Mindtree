package Exe_22;

public class Solution {

    public static void main(String[] args) {

        String input = "It Costs 25000rs for 1 LCD Projector.";

        System.out.println(input);

        String result = "";
        for (int index = 0; index < input.length(); index++) {
            if (!isAlphabet(input.charAt(index)))
                result += input.charAt(index);
            else {
                
                int watch = index + 1;
                while (isAlphabet(input.charAt(watch))) {
                    watch++;
                }
                
                String substring = substring(input, index, watch);
                result += reverseString(substring);
                
                index = watch - 1;
            }
        }

        System.out.println(result);

    }

    private static String substring(String input, int index, int watch) {
        String substring = "";

        for (int i = index; i < watch; i++)
            substring += "" + input.charAt(i);

        return substring.toString();
    }

    public static String reverseString(String input) {

        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--)
            reverse += input.charAt(i);

        return reverse.toString();
    }

    public static boolean isAlphabet(int currChar) {

        if (currChar > 'a' && currChar < 'z')
            return true;
        else if (currChar > 'A' && currChar < 'Z')
            return true;

        return false;

    }

}
