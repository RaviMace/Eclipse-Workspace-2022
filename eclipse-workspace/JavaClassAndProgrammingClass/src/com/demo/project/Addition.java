package com.demo.project;

public class Addition {

	public static void main(String[] args) {  
		int num=372,arm=0;
		int dig=num;
		while(num>0)
		{
			int digit=num%10;
			arm=(digit*digit*digit)+arm;
			num=num/10;
		}
		if(dig==arm)
		{
			System.out.println("it is Armstrong Number");
		}
		else
		{
			System.out.println("it is not Armstrong number");
		}
	}
}
