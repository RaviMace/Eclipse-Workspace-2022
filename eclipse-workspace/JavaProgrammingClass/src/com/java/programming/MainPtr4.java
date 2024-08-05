package com.java.programming;

import java.util.Scanner;

public class MainPtr4 
{
	public static void main(String[] args) 
	{	
		System.out.print("Enter the Value : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}

}


