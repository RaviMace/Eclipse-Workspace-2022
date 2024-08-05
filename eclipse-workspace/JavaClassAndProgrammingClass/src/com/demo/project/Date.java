package com.demo.project;

import java.util.Scanner;

public class Date 
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Values  ");
			int dd=sc.nextInt();
			System.out.print("Enter the Values  ");
			int mm=sc.nextInt();
			System.out.print("Enter the Values  ");
			int yy=sc.nextInt();
			String str = getD(dd,mm,yy);
			System.out.println("Date is "+str);
		}
	}
	static String getD(int d,int m,int y) 
	{
		if(d<1 || m<1 || y<1 || d>31 || m>12)
			return "Invalid";
		else if((m==4 || m==6 || m==9 || m==11) && d>30)
			return "Invalid";
		else if(m==2 && d>29)
			return "Invalid";
		else if((y%4==0 && y%100!=0 || y%400==0)==false && m==2 && d>28)
			return "Invalid";
		else 
			return "Valid";

	}
}

