package com.java.programming;

import java.util.Scanner;

public class MainPtr17 
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
				if(i%2==0)
				{	
					int a=j+1;
					System.out.print(a%2+" ");//01010
				}
				else
					System.out.print(j%2+" ");//10101
			}
			System.out.println();
		}
	}
}
