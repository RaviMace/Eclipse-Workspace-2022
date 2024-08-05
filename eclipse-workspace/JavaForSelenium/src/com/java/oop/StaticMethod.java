package com.java.oop;

public class StaticMethod {
	// Static Method
	// Static Method with return type
	public static int add(int n1, int n2)
	{
		int r=n1+n2;
		return r;
	}
	public static int sub(int n1, int n2)
	{
		int r=n1-n2;
		return r;
	}
	public static int mul(int n1, int n2)
	{
		int r=n1*n2;
		return r;
	}
	// Static Method with void type (which has default return type)
	public static void display(int v)
	{
		System.out.println(v);
	}

	public static void main(String[] args) 
	{
		int a = add(50, 20);
		int b = sub(50, 20);
		int c = mul(50, 20);
		display(a);
		display(b);
		display(c);
	}

}
