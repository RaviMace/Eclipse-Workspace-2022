package com.demo.project;

public class StarPattern 
{

	public static void main(String[] args) 
	{
		int r=0;
		for(int i=1;i<=5;i++)
		{
			if(i<=5)
			{
				r++;
			}
			else 
			{
				r--;
			}
			
			
			for(int j=1;j<=r;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
