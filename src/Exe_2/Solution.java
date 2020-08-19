package Exe_2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        
        for(int i=1;i<=12;i++)
            System.out.println(""+number+" X "+i+" = "+(number*i));
        
        sc.close();
        
    }

}
