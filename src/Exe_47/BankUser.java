package Exe_47;

public class BankUser {
    
    private String name, dob, address;
    private int accNumber,type, balance;
    
    
    public BankUser(String name, String dob, String address, int accNumber, int type, int balance) {
        super();
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.accNumber = accNumber;
        this.type = type;
        this.balance = balance;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankUser [name=" + name + ", dob=" + dob + ", address=" + address + ", accNumber=" + accNumber
                + ", type=" + type + ", balance=" + balance + "]";
    }
    
    

}
