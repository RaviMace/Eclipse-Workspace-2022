package com.demo.project;

import java.util.Scanner;

public class Bit {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value  ");
		int n=scan.nextInt();
		int bit=decToHex(n);
		System.out.println(bit);
	}
	static int decToHex(int dec)
	{
		int c=0;
		while (dec!=0)
		{
			int r=dec%2;
			if(r==1) 
				c++;
			dec=dec/2;
		}
		return c;
	}

}
