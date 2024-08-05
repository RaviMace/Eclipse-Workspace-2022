package com.java.oop.polymorphism;

public class RelienceCapital extends RBI {

	public float getHomeLoan(float interest) {
		System.out.println("Home loan interest = "+interest);
		System.out.println("Relience Capital class(Child) is executed");
		return interest;
	}

	public static void main(String[] args) {
		HDFC ob= new HDFC();
		ob.getHomeLoan(8.80f);
		RBI ob1 = new RBI();
		ob1.getHomeLoan(6.40f);
		RelienceCapital ob2 = new RelienceCapital();
		ob2.getHomeLoan(11.50f);
	}

}
