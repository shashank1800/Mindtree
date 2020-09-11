package Exe_26;

import java.util.Scanner;

public class Solution {
    
    static Scanner sc = new Scanner(System.in);

    static String[] itemName = new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
    static int[] itemId = new int[] { 5001, 5002, 5003, 5004, 5005 };
    static int[] itemPrice = new int[] { 40, 20, 60, 30, 10 };
    
    static ItemList<Item> itemList = new ItemList<Item>();
    static ItemList<Item> purchaseList = new ItemList<Item>();

    public static void main(String[] args) {
     
        populateItemList();

        boolean notCheckout = true;

        while (notCheckout) {

            printMenu();
            
            Item buyItem = itemList.contains(sc.nextInt());
            
            if (buyItem!=null) {

                System.out.println("Enter quantity : ");
                int qunatity = sc.nextInt();
                
                buyItem.setItemQuantity(qunatity);
                purchaseList.add(buyItem);
            } else 
                notCheckout = false;
            
        }

        purchaseList.checkout();

        sc.close();
    }

    private static void populateItemList() {
        for(int i=0;i<itemId.length;i++)
            itemList.add(new Item(itemId[i], itemName[i], itemPrice[i], 0));
    }

    private static void printMenu() {
        System.out.println("-------------------------");
        System.out.println("Id\tName    Price  ");
        System.out.println("-------------------------");
        for (int i = 0; i < itemId.length; i++)
            System.out.println(itemId[i] + "\t" + itemName[i] + "\t" + itemPrice[i]);
        System.out.println("Other   Checkout");
        System.out.println("\nEnter product ID :\n");
    }

}
