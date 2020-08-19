package Exe_17;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        String initials = "";
        for (int i = 0; i < name.length(); i++)
            if (name.charAt(i) >= 65 && name.charAt(i) < 90)
                initials += name.charAt(i);

        System.out.println(initials);

        sc.close();
    }

}
