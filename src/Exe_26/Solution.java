package Exe_26;

import java.util.Scanner;

public class Solution {

    public static String[] itemName = new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
    public static int[] itemId = new int[] { 5001, 5002, 5003, 5004, 5005 };
    public static int[] itemPrice = new int[] { 40, 20, 60, 30, 10 };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ItemList<Item> itemList = new ItemList<Item>();

        boolean notCheckout = true;

        while (notCheckout) {

            printMenu();
            int id = sc.nextInt() - 1;
            
            if (id != itemId.length) {

                System.out.println("Enter quantity : ");
                int qunatity = sc.nextInt();

                itemList.add(new Item(itemId[id], itemName[id], itemPrice[id], qunatity));
            } else 
                notCheckout = false;
            
        }

        itemList.checkout(itemList);

        sc.close();
    }

    private static void printMenu() {
        System.out.println("\tId\tName    Price  ");
        for (int i = 0; i < itemId.length; i++)
            System.out.println(i + 1 + " \t" + itemId[i] + "\t" + itemName[i] + "\t" + itemPrice[i]);
        System.out.println(itemId.length + 1 + ") Checkout");
        System.out.println("\nEnter number to buy or go for checkout : \n");
    }

}
