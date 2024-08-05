package com.java.oop.keywords;

//Super key word used

public class Account {
	// Instance Variable
	String name = "Account Class - Parent";
	// Instance Variable for constructor
	String eName = "Ravi";
	int eID = 1008;
	Account(String eName, int eID) {
		this.eName = eName;
		this.eID = eID;
	}
	
	public void display() {
		System.out.println("Account class(parent) is executed");
		System.out.println("The variable value is "+name);
	}
	/*
	 * public static void main(String[] args) { Account ob = new Account();
	 * ob.display();
	 * 
	 * }
	 */

}
