package com.demo.project;

public class Best {
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1 && j==1 || i==2 && j==2 ||i==3 && j==1 ||i==3 && j==3 ||i==4 && j==2 || i==4 && j==4 || i==5 && j==1 ||i==5 && j==3 || i==5 && j==5)
				{
					System.out.print("1");
				}
				else if(i==2 && j==1 || i==3 && j==2 ||i==4 && j==1 ||i==4 && j==3 ||i==5 && j==2 || i==5 && j==4)
				{
					System.out.print("0");
				}
				else 
				{ 
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
