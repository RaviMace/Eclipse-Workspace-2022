package com.java.oop.keywords;

public class SavingAccount extends Account {
	// Instance Variable
	String name = "Saving Account Class - Child";
	// Instance Variable for constructor
	long phNo = 9443660000l;
	SavingAccount(String eName, int eID, long phNo) {
		// super key word for constructor variable
		super(eName, eID);
		this.phNo = phNo;
		System.out.println(eName+" "+eID+" "+phNo);
	}
	
	public void display() {
		System.out.println("Saving Account class(child) is executed");
		System.out.println("The variable value is "+name);
		// super key word for instance variable
		System.out.println("The variable value is "+super.name);
	}
	
	public void show() {
		display();
		// super key word for method
		super.display();
	}
	public static void main(String[] args) {
		SavingAccount ob = new SavingAccount("Raju",007,94446610000l);
		ob.show();
	}

}
