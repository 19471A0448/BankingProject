package com.amdocs.savings;
import com.amdocs.banking.BankAccount;

public class SavingsAccount extends BankAccount {
	private double interest;

	public SavingsAccount(double amt) {
		super(amt);
	}
	static {
		System.out.println("Savings Account is created");
	
		
	}
	public void deposit(double amt) {
		interest=amt*0.03;
		System.out.println("you got 3% interest on this deposit");
		super.deposit(amt+interest);
	}

	
}
