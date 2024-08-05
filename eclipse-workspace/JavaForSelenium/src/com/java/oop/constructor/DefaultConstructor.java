package com.java.oop.constructor;

public class DefaultConstructor {
	String  empName;
	int empID;
	
	public DefaultConstructor() {
		System.out.println("Constructor is executed first");
	}
	
	public static void main(String[] args) {
		DefaultConstructor ob = new DefaultConstructor();
		System.out.println(ob.empName);
		System.out.println(ob.empID);

	}

}
