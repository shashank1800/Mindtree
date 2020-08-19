package Exe_19;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first person name : ");
        String name1 = sc.nextLine();

        System.out.println("Enter second person name : ");
        String name2 = sc.nextLine();

        String[] bothNames = swapLastName(name1, name2);

        System.out.println(bothNames[0]);
        System.out.println(bothNames[1]);

        sc.close();
    }

    public static String[] swapLastName(String name1, String name2) {
        
        String temp1 = "", temp2 = "";
        int i=0;
        for(;i<name1.length();i++)
            if(name1.charAt(i)!=' ')
                temp1 += name1.charAt(i);
            else
                break;
        
        int j=0;
        for(;j<name2.length();j++)
            if(name2.charAt(j)!=' ')
                temp2 += name2.charAt(j);
            else
                break;
        
        temp1 += name2.substring(j);
        temp2 += name1.substring(i);
        
        return new String[] { temp1, temp2};
    }

}
