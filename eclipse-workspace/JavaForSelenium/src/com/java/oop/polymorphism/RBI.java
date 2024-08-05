package com.java.oop.polymorphism;
// Run time polymorphism
// parent
public class RBI {
	float interest = 6.70f;
	public float getHomeLoan(float interest) {
		System.out.println("Home loan interest = "+interest);
		System.out.println("RBI class(Parent) is executed");
		return interest;
	}
}
