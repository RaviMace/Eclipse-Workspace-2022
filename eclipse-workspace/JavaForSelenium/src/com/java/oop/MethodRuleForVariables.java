package com.java.oop;

public class MethodRuleForVariables {
	int a = 10;
	static int b = 20;
	public static void display() {
		//System.out.println(a); //CTE
		System.out.println(b);
	}
	public void display2() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		display();
		MethodRuleForVariables ob = new MethodRuleForVariables();
		ob.display2();

	}

}
