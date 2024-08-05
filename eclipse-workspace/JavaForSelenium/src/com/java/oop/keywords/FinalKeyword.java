package com.java.oop.keywords;
// Non - Access Modifier
// Final Key Workd
/* Final Variable : To create constant variables
 * Final Methods  : To prevent method overriding
 * Final Class 	  : To prevent Inheritance
 */
public class FinalKeyword {
	// Final instance variable
	final String customerName = "Rama Raju";
	final int SSN = 123456789;
	
	public void display() {
		// instance variable
		//customerName = "Rama Rajalu";
		//SSN = 987654321;
		System.out.println("The customer name is "+customerName);
		System.out.println("The SSN is "+SSN);
	}
	public static void main(String[] args) {
		FinalKeyword ob = new FinalKeyword();
		ob.display();

	}

}
