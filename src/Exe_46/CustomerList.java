package Exe_46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerList<T> extends ArrayList<T> {

    public void customersBasedOnCityName(String cityName) {
        Database instance = Database.getDatabase();
        int count = 0;
        for (Customer customer : instance.customerList)
            if (customer.getCustomerAddress().equals(cityName)) {
                System.out.println(customer);
                count++;
            }

        if (count == 0)
            System.out.println("No customer found");
    }

    public void customersBasedOnID(String id) {
        Database instance = Database.getDatabase();

        for (Customer customer : instance.customerList)
            if (customer.getCustomerId().equals(id)) {
                System.out.println(customer);
                return;
            }

        System.out.println("No customer found");
    }

    public void customersNameInSorted() {
        Database instance = Database.getDatabase();

        Collections.sort(instance.customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getCustomerName().compareTo(o2.getCustomerName());
            }

        });

        for (Customer customer : instance.customerList)
            System.out.println(customer);
        System.out.println();
    }

}
