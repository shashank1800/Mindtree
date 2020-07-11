package Exe_30;

public class Solution {

	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount(1500,10,101);
		savingsAccount.withDraw(10);
		savingsAccount.calculateInterest();
	}

}
