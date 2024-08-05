package com.java.oop;

public class InstanceMethod {
	// Non Static Method
	// Method with return type
	public int add(int n1, int n2)
	{
		int r=n1+n2;
		return r;
	}
	public int sub(int n1, int n2)
	{
		int r=n1-n2;
		return r;
	}
	public int mul(int n1, int n2)
	{
		int r=n1*n2;
		return r;
	}
	// Method with void type (which has default return type)
	public void display(int v)
	{
		System.out.println(v);
	}
	
	public static void main(String[] args) 
	{
		InstanceMethod ob = new InstanceMethod();
		int a =ob.add(50, 20);
		int b = ob.sub(50, 20);
		int c = ob.mul(50, 20);
		ob.display(a);
		ob.display(b);
		ob.display(c);
	}

}
