package com.amdocs.current;
import com.amdocs.banking.BankAccount;

public class CurrentAccount extends BankAccount {
	static {
		System.out.println("Current Account is created");
	}
	public CurrentAccount(double amt) {
		super(amt);
		
	}
	
	public void withdraw(double amt) {
		if(amt<=getbalance()) {
		
		System.out.println("rs 200 is deducted on your each withdrawl");
		super.withdraw(amt
				+200);
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}
		

}
