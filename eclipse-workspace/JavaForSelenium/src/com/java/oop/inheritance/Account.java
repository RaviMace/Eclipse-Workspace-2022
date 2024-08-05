package com.java.oop.inheritance;

public class Account {
	public void deposit() {
		System.out.println("Amount is deposited");
		System.out.println("Account Class is executed");
	}
	public void withdrawal() {
		System.out.println("Amount is withdrawn");
		System.out.println("Account Class is executed");
	}
	public static void main(String[] args) {
		Account ob = new Account();
		ob.deposit();
		ob.withdrawal();
	}

}
