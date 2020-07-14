package Exe_1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        double number = sc.nextInt();
        
        double res = fact(number);
        
        System.out.println(Math.round(res));
        
        sc.close();
        
    }

    private static double fact(double number) {
        
        if(number==0 || number==1)
            return 1;
        
        return number * fact(number-1);
    }

}
