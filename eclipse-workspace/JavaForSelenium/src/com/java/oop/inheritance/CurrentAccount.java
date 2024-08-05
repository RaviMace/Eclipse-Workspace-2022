package com.java.oop.inheritance;

public class CurrentAccount extends Account {
	
	public float getRateOfInterest(float interest) {
		System.out.println("Rate of Interest = "+interest);
		System.out.println("Current Account class is executed");
		return interest;
	}
	
	public static void main(String[] args) {	
		CurrentAccount personThree = new CurrentAccount();
		personThree.deposit();
		personThree.withdrawal(); 
		personThree.getRateOfInterest(9.50f);
	}

}
