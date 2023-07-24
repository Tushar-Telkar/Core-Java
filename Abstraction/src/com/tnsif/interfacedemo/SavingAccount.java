//Multiple inheritance using interfaces
package com.tnsif.interfacedemo;

public class SavingAccount extends Customer implements Bank{
	private int accno;
	private float balance;
		

	public SavingAccount(String name, String city, int accno, float balance) {
		super(name, city);
		this.accno = accno;
		this.balance = balance;
	}
	
	
	//getters and setters
	public int getAccno() {
		return accno;
	}



	public void setAccno(int accno) {
		this.accno = accno;
	}



	public float getBalance() {
		return balance;
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}



	@Override
	public void deposite(float amount) {
		if (amount<0 && amount>DEPOSIT_LIMIT)
		{
			System.out.println("Please deposite vaild amount");
		}
		else
		{
			balance+=amount;
			System.out.println("Rs."+amount+" is deposited successfully");
		}
		
	}

	@Override
	public void withdraw(float amount) {
		if(amount<=balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Rs."+amount+" is withdrawal successfully");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
	}


	@Override
	public String toString() {
		return "SavingAccount [accno=" + accno + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	

}
