package Exe_46;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1) Register");
            System.out.println("2) Book a ticket");
            System.out.println("3) Display Customers");
            System.out.println("4) Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    bookTicket();
                    break;
                case 3:
                    displayCustomers();
                    break;
                case 4:
                    System.exit(0);

                default:
                    break;
            }
        }

    }

    private static void displayCustomers() {

        System.out.println("1) Display customers based on city name");
        System.out.println("2) Display customers based on id");
        System.out.println("3) Display customers names in sorted order");

        int choice = sc.nextInt();

        sc.nextLine();

        Database instance = Database.getDatabase();

        switch (choice) {
            case 1:
                System.out.println("Enter city name");
                String cityName = sc.nextLine();
                instance.customerList.customersBasedOnCityName(cityName);
                break;
            case 2:
                System.out.println("Enter id");
                String id = sc.nextLine();
                instance.customerList.customersBasedOnID(id);
                break;
            case 3:
                instance.customerList.customersNameInSorted();
                break;

            default:
                break;
        }

    }

    private static void bookTicket() {
        sc.nextLine();

        String id;
        while (true) {
            System.out.println("Enter ID :");
            id = sc.nextLine();
            if (isRegisterdUser(id))
                break;
            else
                System.out.println("You are not registerd \n");
        }

        String mobileNumber;
        while (true) {
            System.out.println("Enter mobile number :");
            mobileNumber = sc.nextLine();
            if (isValidMobileNumber(mobileNumber))
                break;
            else
                System.out.println("Invalid number\n");
        }

        System.out.println("Enter source :");
        String source = sc.nextLine();

        String destination;
        while (true) {
            System.out.println("Enter destination :");
            destination = sc.nextLine();
            if (!source.equals(destination))
                break;
            else
                System.out.println("Source and Destination should not be same\n");
        }

        String date;
        String time;
        while (true) {
            System.out.println("Enter journey date between today and before a month(\"DD/MM/YYYY\") :");
            date = sc.nextLine();

            System.out.println("Enter time (\"HH:MM AM/PM\") :");
            time = sc.nextLine();

            if (isValidDateTime(date, time))
                break;
            else
                System.out.println("Invalid Date \n");
        }

        System.out.println("Ticket Confirmed ");
        System.out.println(source + " -> " + destination + " on " + date + " " + time);

    }

    private static boolean isValidDateTime(String date, String time) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
            Date journeyDate = sdf.parse(date + " " + time);

            Calendar calender = Calendar.getInstance();

            calender.add(Calendar.DATE, 1);

            Date tommorrow = calender.getTime();

            calender.add(Calendar.DATE, 30);
            Date monthLater = calender.getTime();

            if (journeyDate.compareTo(tommorrow) > 0 && journeyDate.compareTo(monthLater) < 0)
                return true;

        } catch (ParseException e) {
            return false;
        }
        return false;

    }

    private static boolean isRegisterdUser(String id) {
        Database instance = Database.getDatabase();
        return instance.checkWhetherIDExist(id);
    }

    private static void register() {

        sc.nextLine();

        String id;
        while (true) {
            System.out.println("Enter ID :");
            id = sc.nextLine();
            if (isValidID(id))
                break;
            else
                System.out.println("ID already exist!. Try again with different id!\n");
        }

        System.out.println("Enter Name :");
        String name = sc.nextLine();

        String mobileNumber;
        while (true) {
            System.out.println("Enter 10 digit mobile number :");
            mobileNumber = sc.nextLine();
            if (isValidMobileNumber(mobileNumber))
                break;
            else
                System.out.println("Invalid number\n");
        }

        String dateOfBirth;
        while (true) {
            System.out.println("Enter date of birth (\"DD/MM/YYYY\") :");
            dateOfBirth = sc.nextLine();
            if (isValidDate(dateOfBirth))
                break;
            else
                System.out.println("Invalid date of birth\n");
        }

        System.out.println("Enter city name :");
        String address = sc.nextLine();

        Customer customer = new Customer(id, name, mobileNumber, dateOfBirth, address);

        Database.getDatabase().registerCustomer(customer);

    }

    private static boolean isValidDate(String date) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            sdf.parse(date);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private static boolean isValidMobileNumber(String mobileNumber) {
        Pattern p = Pattern.compile("[7-9][0-9]{9}");
        Matcher m = p.matcher(mobileNumber);
        return m.find();
    }

    private static boolean isValidID(String id) {
        Database instance = Database.getDatabase();
        if (instance.checkWhetherIDExist(id))
            return false;
        return true;
    }

}
