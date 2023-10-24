package com.amdocs.tester;

import com.amdocs.savings.SavingsAccount;
import com.amdocs.banking.BankAccount;
import com.amdocs.current.CurrentAccount;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1=new BankAccount(4000);
		b1.deposit(2000);
		b1.checkBalance();
        SavingsAccount s1=new SavingsAccount(5000);
        s1.deposit(300);
    
        CurrentAccount c1=new CurrentAccount(3000);
        c1.withdraw(2000);
        s1.checkBalance();
        c1.transfer(400,s1);
        s1.transfer(1000,c1);
  
    
	}

}
