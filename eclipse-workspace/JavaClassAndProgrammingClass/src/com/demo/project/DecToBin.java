package com.demo.project;

import java.util.Scanner;

public class DecToBin 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value  ");
		int n=scan.nextInt();
		String bin=decToBin(n);
		System.out.println(bin);
	}
	static String decToBin(int dec)
	{
		String bin="";
		do {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}
}
