package com.java.oop.abstraction;

public class TestingAbstractClassATMScreen {

	public static void main(String[] args) {
		// Object needs to be created for each back
		
		BankATMScreen obj;
		obj = new RBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		obj = new HDFCBank();
		obj.mobileRegistration();
		
		obj.minimumStatment();

	}

}
