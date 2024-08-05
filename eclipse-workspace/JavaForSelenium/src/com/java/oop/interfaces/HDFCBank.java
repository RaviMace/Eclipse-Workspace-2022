package com.java.oop.interfaces;

public class HDFCBank implements BankATMScreen, NetbankingScreen {

	@Override
	public void deposit() {
		
	}

	@Override
	public void withdrawal() {
		
	}

	@Override
	public void balance() {
		
	}

	@Override
	public void pinChange() {
		
	}

	@Override
	public void mobileRegistration() {
		System.out.println("Mobile registration method is executed");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("Money Transfer method is executed");
	}

}
