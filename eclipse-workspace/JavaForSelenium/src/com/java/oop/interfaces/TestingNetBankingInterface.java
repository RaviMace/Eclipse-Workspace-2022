package com.java.oop.interfaces;

public class TestingNetBankingInterface {

	public static void main(String[] args) {
		NetbankingScreen obj;
		
		obj = new RBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		obj = new HDFCBank();
		obj.mobileRegistration();
		obj.moneyTransfer();
		
		
	}

}
