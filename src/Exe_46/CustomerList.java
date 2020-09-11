package Exe_46;


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
        
        for (int i = 0; i < size() - 1; i++) {
            for (int j = 0; j < size() - i - 1; j++) {

                String name1 = ((Customer)get(j)).getCustomerName();
                String name2 = ((Customer)get(j+1)).getCustomerName();

                if (name1.compareTo(name2) > 0)
                    swap(j, j + 1);

            }
        }

        for (Customer customer : instance.customerList)
            System.out.println(customer);
        System.out.println();
    }

}
