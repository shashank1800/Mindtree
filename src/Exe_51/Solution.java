package Exe_51;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new Set<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        System.out.println("Enter the size of input array ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the array element with space separated ");
        for (int index = 0; index < size; index++)
            array[index] = sc.nextInt();

        for (int index = 0; index < size; index++)
            if (set.contains(array[index]))
                result.add(array[index]);
            else
                set.add(array[index]);
        

        if (result.size() == 0)
            System.out.println("{-1}");
        else
            System.out.println(result);

        sc.close();

    }

}
