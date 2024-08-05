package com.java.oop.inheritance;

public class SavingAccount extends Account {
	
	public long viewSummary(long accNum) {
		System.out.println("The account summary is displayed for "+accNum);
		System.out.println("Saving Account Class is executed");
		return accNum;
	}
	
	public static void main(String[] args) {
		SavingAccount personOne = new SavingAccount();
		personOne.deposit();
		personOne.withdrawal();
		personOne.viewSummary(987654321l);
	}

}
