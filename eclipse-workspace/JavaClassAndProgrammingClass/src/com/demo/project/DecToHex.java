package com.demo.project;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value  ");
		int n=scan.nextInt();
		String hex=decToHex(n);
		System.out.println(hex);
	}
	static String decToHex(int dec)
	{
		String hex="";
		while (dec!=0)
		{
			int r=dec%16;
			if(r<10) 
				hex=r+hex;
			else
			{
				hex=((char)(r+55))+hex;
			}
			dec=dec/16;
		}
		return hex;
	}
}
