package com.java.programming;

import java.util.Scanner;

public class MainPtr22 
{
	public static void main(String[] args) 
	{	
		System.out.print("Enter the Value : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
