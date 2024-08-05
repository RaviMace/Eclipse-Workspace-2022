package com.java.oop.polymorphism;
// Compile time polymorphism
public class MethodOverLoading {
	
	public static int mul(int n1, int n2) {
		int r = n1*n2;
		return r;
	}
	
	public static float mul(float n1, float n2) {
		float r = n1*n2;
		return r;
	}
	
	public static int mul(int n1, int n2, int n3) {
		int r = n1*n2*n3;
		return r;
	}
	
	public static void main(String[] args) {
		System.out.println(mul(40, 10));
		System.out.println(mul(3.5f, 50.34f));
		System.out.println(mul(40, 10, 30));

	}

}
