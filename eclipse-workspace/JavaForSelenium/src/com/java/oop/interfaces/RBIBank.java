package com.java.oop.interfaces;

public class RBIBank implements BankATMScreen,NetbankingScreen{
	
	public void deposit() {
		System.out.println("Deposit method is executed");
	}

	public void withdrawal() {
		System.out.println("Withdrawal method is executed");
	}

	public void balance() {
		System.out.println("Balance method is executed");
	}

	public void pinChange() {
		System.out.println("Pin Change method is executed");
	}

	public void mobileRegistration() {
		
	}

	public void moneyTransfer() {
		
	}

}
