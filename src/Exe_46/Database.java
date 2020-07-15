package Exe_46;

public class Database {

    public static Database instance;

    public CustomerList<Customer> customerList;

    // private constructor avoids creating instance outside the class
    private Database() {
        customerList = new CustomerList<Customer>();
    }

    public synchronized static Database getDatabase() {
        if (instance == null) {
            instance = new Database();

            instance.customerList
                    .add(new Customer("shashank_1800", "Shashank Bhat", "1234567890", "01/07/1998", "Karnataka"));
            instance.customerList.add(new Customer("raj_98", "Rajkumar V", "9980232323", "11/01/1998", "Delhi"));
            instance.customerList.add(new Customer("ganesh123", "Ganesh Hegde", "8787701012", "14/10/1998", "India"));

        }
        return instance;
    }

    public void registerCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Registered Successfully!!");
        System.out.println();
    }

    public boolean checkWhetherIDExist(String id) {

        for (Customer customer : customerList)
            if (customer.getCustomerId().equals(id))
                return true;
        return false;

    }

}
