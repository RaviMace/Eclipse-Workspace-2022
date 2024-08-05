package com.java.oop.polymorphism;
// child
public class HDFC extends RBI {
	
	public float getHomeLoan(float interest) {
		System.out.println("Home loan interest = "+interest);
		System.out.println("HDFC class(Child) is executed");
		return interest;
	}

	public static void main(String[] args) {
		HDFC ob= new HDFC();
		ob.getHomeLoan(7.80f);
	}

}
