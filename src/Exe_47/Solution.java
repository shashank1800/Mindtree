package Exe_47;

import java.util.Scanner;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    static BankUserList<BankUser> bankUser = new BankUserList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("1) Create Bank User");
            System.out.println("2) Update User Detail");
            System.out.println("3) Delete User Detail");
            System.out.println("4) Display User Detail");
            System.out.println("5) Exit");

            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                createBankUser();
                break;
            case 2:
                updateUserDetail();
                break;
            case 3:
                deleteUserDetail();
                break;
            case 4:
                displayUserDetail();

            default:
                System.exit(0);
            }
        }

    }

    private static void displayUserDetail() {
        while (true) {
            System.out.println("1) Display based on ID");
            System.out.println("2) Display Based on Name");
            System.out.println("3) Display all users Non-Zero balance");
            System.out.println("4) Display sorted user based on address");
            System.out.println("5) Display sorted user based on account number");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.println("Enter account number : ");
                int accNumber = sc.nextInt();

                int ithUser = getBankUser(accNumber);

                if (ithUser == -1)
                    System.out.println("No user found with " + accNumber + " account number.");
                else
                    System.out.println(bankUser.get(ithUser));

                break;

            case 2:
                sc.nextLine();
                System.out.println("Enter name : ");
                String name = sc.nextLine();
                bankUser.displayBasedOnName(bankUser, name);
                break;

            case 3:
                bankUser.displayAllUsersNonZeroBalance(bankUser);
                break;

            case 4:
                bankUser.displaySortedUserBasedOnAddress(bankUser);
                break;

            case 5:
                bankUser.displaySortedUserBasedOnAccountNumber(bankUser);
                break;
            }
        }
    }

    private static void deleteUserDetail() {

        sc.nextLine();
        System.out.println("Enter account number : ");
        int accNumber = sc.nextInt();
        sc.nextLine();

        int ithUser = getBankUser(accNumber);

        if (ithUser == -1)
            System.out.println("No user found with " + accNumber + " account number.");
        else {
            System.out.println("Successfully deleted " + bankUser.get(ithUser));

            bankUser.remove(ithUser);
        }

    }

    private static void updateUserDetail() {

        sc.nextLine();
        System.out.println("Enter account number : ");
        int accNumber = sc.nextInt();
        sc.nextLine();

        int ithUser = getBankUser(accNumber);

        if (ithUser == -1)
            System.out.println("No user found with " + accNumber + " account number.");
        else {
            System.out.println("Enter name : ");
            String name = sc.nextLine();

            System.out.println("Enter address : ");
            String address = sc.nextLine();

            System.out.println("Enter balance : ");
            int balance = sc.nextInt();

            bankUser.get(ithUser).setName(name);
            bankUser.get(ithUser).setAddress(address);
            bankUser.get(ithUser).setBalance(balance);
        }

    }

    private static int getBankUser(int accNumber) {

        for (int i = 0; i < bankUser.size(); i++)
            if (bankUser.get(i).getAccNumber() == accNumber)
                return i;

        return -1;
    }

    private static void createBankUser() {

        System.out.println("Enter account number : ");
        int accNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter type : \n1 - Savings \n2 - Loan \n3 - Current ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter date of birth(\"DD/MM/YYYY\")  : ");
        String dob = sc.nextLine();

        System.out.println("Enter address : ");
        String address = sc.nextLine();

        System.out.println("Enter balance : ");
        int balance = sc.nextInt();

        bankUser.add(new BankUser(name, dob, address, accNumber, type, balance));

    }

}
