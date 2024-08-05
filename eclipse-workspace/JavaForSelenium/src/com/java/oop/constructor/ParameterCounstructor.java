package com.java.oop.constructor;

public class ParameterCounstructor {
	
	String empName;
	int empID;
	
	public ParameterCounstructor(String n, int i) {
		empName = n;
		empID = i;
	}
	
	public static void main(String[] args) {
		ParameterCounstructor ob = new ParameterCounstructor("Ravi", 1008);
		System.out.println(ob.empID+" "+ob.empName);
	}

}
