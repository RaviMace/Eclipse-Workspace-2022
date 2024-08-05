package com.java.programming;

import java.util.Scanner;

public class MainPtr25 
{
	public static void main(String[] args) 
	{	
		System.out.print("Enter the Value : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,c=0;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
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
