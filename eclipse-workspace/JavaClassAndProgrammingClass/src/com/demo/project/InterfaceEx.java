package com.demo.project;

import java.util.Scanner;

 class InterfaceEx 
 {
	public static void main(String[] args) 
	{
		System.out.print("Set Your PIN : ");
		Scanner c=new Scanner(System.in);
		int ePin=c.nextInt();
		ICICI ob=new ICICI(ePin,80000d,9443664800l);
		//Scanner sc=new Scanner(System.in);
		do {
			System.out.print("Enter your option 1: Withdraw - 2: Check Balance - 3: Change PIN - 4: RBI Details(Your Account)  ");
			int op=c.nextInt();
			switch(op)
			{
			case 1:ob.withDrawMoney();
			break;
			case 2:ob.checkBalance();
			break;
			case 3:ob.changePin();
			break;
			case 4:ob.guideLines();
				   ob.showLoanInterestRate();
				   ob.showDepositRate();
			break;
			default :System.out.println("Entered Invalid option");
			}
		}while(true);
	}
 }
 abstract class RBI
 {
	 abstract void showLoanInterestRate();
	 abstract void showDepositRate();
	 public void guideLines()
	 {
	 	System.out.println("RBI Guide Lines");
	 }
 }
 interface ATM
 {
	 public void withDrawMoney();
	 public void checkBalance();
	 public void changePin();
 }
 class ICICI extends RBI implements ATM
 {
	int pin;
	double balance;
	long accno;
	ICICI(int pin,double balance,long accno)
	{
		this.pin=pin;
		this.balance=balance;
		this.accno=accno;
	}
	public void showLoanInterestRate()
	{
		System.out.println("Interest rate is 9.2%");
	}
	public void showDepositRate()
	{
		System.out.println("Deposit Rate is 7.1%");
	}
	public void withDrawMoney()
	{
		System.out.print("Enter the PIN : ");
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		if(this.pin==p)
		{
			System.out.print("Enter the Amount : ");
			double amount=s.nextDouble();
			balance=balance-amount;
		}
		else
			System.out.println("Invalid pin");
	}
	public void checkBalance()
	{
		System.out.print("Enter the PIN : ");
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		if(this.pin==p)
		{
			System.out.println("Your Account Balance is : "+balance);
		}
		else
			System.out.println("Invalid pin");
	}
	public void changePin()
	{
		System.out.print("Enter the PIN : ");
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		if(this.pin==p)
		{
			System.out.print("Enter the New Pin : ");
			int newp=s.nextInt();
			this.pin=newp;
			System.out.println("Your Pin is Succesfully updated ");
		}
		else
			System.out.println("Invalid pin");
	}	
 }
