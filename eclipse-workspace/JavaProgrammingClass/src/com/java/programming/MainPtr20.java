package com.java.programming;

import java.util.Scanner;

public class MainPtr20 
{
	public static void main(String[] args) 
	{	
		System.out.print("Enter the Value : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
}
