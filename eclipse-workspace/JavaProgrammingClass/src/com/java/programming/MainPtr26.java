package com.java.programming;

import java.util.Scanner;

public class MainPtr26 
{
	public static void main(String[] args) 
	{	
		System.out.print("Enter the Value : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int b=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b+" ");
				b=b+n-j;
			}
			System.out.println();
		}
	}
}
