package com.java.oop.inheritance;

public class PrivilegedAccount extends SavingAccount {
	
	public void cretidCard(long accNum) {
		System.out.println("Credit card dispatched to the custormer "+accNum);
		System.out.println("PrivilegedAccount class is executed");
	}
	
	public static void main(String[] args) {
		PrivilegedAccount personTwo = new PrivilegedAccount();
		personTwo.deposit();
		personTwo.withdrawal();
		personTwo.viewSummary(987654321l);
		personTwo.cretidCard(987654321l);
	
	}

}
