package com.java.oop.keywords;

public class ThisKeyWords {
	
	String empName;
	int empID;
	
	ThisKeyWords(String empName, int empID) {
		this.empName = empName;
		this.empID = empID;
	}
	
	public void display() {
		System.out.println(empName + " " + empID);
	}
	public static void main(String[] args) {
		ThisKeyWords ob = new ThisKeyWords("Ravi", 1007);
		ob.display();
	}

}
