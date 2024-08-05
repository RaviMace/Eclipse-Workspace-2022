package com.demo.project;

import java.util.Scanner;

public class InterfaceDimondProblem 
{
	public static void main(String[] args) 
	{
		Zomato ob=new Zomato(12345678910l,1212,1000d,"RaviM",9443668000l,4958);
		ob.view();
		GoogleMap.locationAccess();
		
	}

}

//parent class 1
interface GoogleMap
{
	void view();
	static void locationAccess()
	{
		System.out.println("Check your order in the Map");
	}
}

//parent class 2
abstract class PhonePe
{
	long accno;
	int zpin;
	double balance;
	PhonePe(long accno, int zpin, double balance)
	{
		this.accno=accno;
		this.zpin=zpin;
		this.balance=balance;
	}
	abstract void view();
}

//child class
class Zomato extends PhonePe implements GoogleMap
{
	String username;
	long contact;
	int phonePePin;
	double t=0;
	Zomato(long accno, int zpin, double balance, String username, long contact, int phonePePin) 
	{
		super(accno, zpin, balance);
		this.username=username;
		this.contact=contact;
		this.phonePePin=phonePePin;
	}

	void payment()
	{
		System.out.println("Check in Your Order in cart");
		Scanner sc=new Scanner(System.in);
		double cb1=sc.nextDouble();
		double ti=2*cb1;
		System.out.println("Totally 2 Chicken Briyani   "+ti);
		double dc=2*31d;
		System.out.println("Delivery charges 		"+dc);
		double rc=(ti*(8d/100d));
		System.out.println("Restaurant charges  		"+rc);
		double tx=(ti*(5d/100d));
		System.out.println("Tax for your order  		"+tx);
		t=ti+dc+rc+tx;
		System.out.println("Total Amount to be Paid     	"+t);
	}
	public void view() 
	{
		payment();
		System.out.println("Enter the PIN to do the payment in PhonePe");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		if(this.phonePePin==pin)
		{
			System.out.println("Check your amount above"+t);
			System.out.println("Your Payment has been done for the Zomato order");
		}
		else
			System.out.println("Invalid PIN");
	}
}