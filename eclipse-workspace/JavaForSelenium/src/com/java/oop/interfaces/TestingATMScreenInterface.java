package com.java.oop.interfaces;

public class TestingATMScreenInterface {

	public static void main(String[] args) {
		BankATMScreen obj;
		obj = new RBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		obj = new HDFCBank();
		obj.mobileRegistration();

	}

}
