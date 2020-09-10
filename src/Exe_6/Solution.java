package Exe_6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        greetUser(name);

        sc.close();
    }

    private static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

}
