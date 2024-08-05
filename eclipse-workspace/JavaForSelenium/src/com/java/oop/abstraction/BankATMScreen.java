package com.java.oop.abstraction;

public abstract class BankATMScreen {

	 abstract void deposit();
	 
	 abstract void withdrawal();
	 
	 abstract void balance();
	 
	 abstract void pinChange();
	 
	 abstract void mobileRegistration();
	 
	 void minimumStatment() {
		 System.out.println("Minimum statement method is executed");
	 }

}
