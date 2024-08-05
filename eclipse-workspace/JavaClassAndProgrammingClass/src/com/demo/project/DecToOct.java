package com.demo.project;

import java.util.Scanner;

public class DecToOct {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value  ");
		int n=scan.nextInt();
		String oct=decToOct(n);
		System.out.println(oct);
	}
	static String decToOct(int dec)
	{
		String oct="";
		do {
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		}while(dec!=0);
		return oct;
	}

}
