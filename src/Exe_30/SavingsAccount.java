package Exe_30;

public class SavingsAccount {
	
	private double balance;
	private int interestRate;
	private int accountNo;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(double balance, int interestRate, int accountNo) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}
	
	public void withDraw(double amount) {
		
		if(amount > this.balance)
			System.out.println("Amount is not sufficient!");
		else {
			this.balance -= amount;
			System.out.println("Successfully withdrawn " + amount);
		}
	}
	
	public void calculateInterest() {
		System.out.println( (balance * 1 * interestRate)/100);
	}
	
	
	

}
