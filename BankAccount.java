package com.amdocs.banking;
import com.amdocs.current.CurrentAccount;
import com.amdocs.savings.SavingsAccount;

public class BankAccount {
	private double Balance;static {
		System.out.println("Your bank account is created");
	}
	
	public BankAccount(double balance) {
		this.Balance=balance;
		System.out.println("Your account is created with:"+balance);
	}
	public void deposit(double amount) {
		this.Balance=this.Balance+amount;
		System.out.println("Your Balance after deposit "+amount+" is :"+Balance);
	}	
    public void withdraw(double amount) {
         if(this.Balance>=amount) {
        	 this.Balance-=amount;
        	 System.out.println("Your Balance after withdrawl "+amount+" is :"+Balance);
         }
         else {
        	 System.out.println("Your balance is insufficient");
         }
    }
    public double getbalance() {
    	return this.Balance;
    }
    public void checkBalance() {
    	System.out.println("Balance is:"+this.Balance);
    }
    public void transfer(double amt,BankAccount b1) {
    	if(amt<=this.Balance) {
    		this.withdraw(amt);
    		b1.deposit(amt);
    		System.out.println("Amount transferred");
    	}
    	else {
    		System.out.println("Insufficient Balance");
    		
    	}
    }
}
