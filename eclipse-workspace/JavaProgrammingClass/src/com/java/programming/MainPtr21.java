package com.java.programming;

import java.util.Scanner;

public class MainPtr21 
{
	public static void main(String[] args) 
	{	
		System.out.print("Enter the Value : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				c=c+1;
				if(c%2==0)
					System.out.print(a+" ");
				else
					System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
