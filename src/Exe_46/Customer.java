package Exe_46;

public class Customer {

    private String customerId;
    private String customerName;
    private String customerMobileNo;
    private String customerDOB;
    private String customerAddress;

    public Customer(String customerId, String customerName, String customerMobileNo, String customerDOB,
            String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerMobileNo = customerMobileNo;
        this.customerDOB = customerDOB;
        this.customerAddress = customerAddress;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return 1;
    }

    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }

    public String getCustomerDOB() {
        return customerDOB;
    }

    public void setCustomerDOB(String customerDOB) {
        this.customerDOB = customerDOB;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer [ " + customerId + ", " + customerName + ", " + customerMobileNo + ", " + customerDOB + ", "
                + customerAddress + "]";
    }

}
