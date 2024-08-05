package com.java.programming;

import java.util.Scanner;

public class MainPtr18 
{
	public static void main(String[] args) 
	{	
		System.out.print("Enter the Value : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(k<10)
					System.out.print(k++ +" ");
				else
				{
					k=1;
					System.out.print(k+" ");
					k++;
				}
			}
			System.out.println();
		}
	}
}
