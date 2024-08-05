package com.demo.project;

public class Test {
	public static void main(String[] args) 
	{
		for(int i=3;i<=7;i=i+2)
		{
			for (int j=4;j<=8;j=j+2)
			{	
				if (i==3 && j==4)
				{
					System.out.println("Good Morning");
				}
				else if (i==5 && j==6)
				{
					System.out.println("Good Afternoon");
				}
				else if (i==7 && j==8)
				{
					System.out.println("Good Evening");
				}	
				else
				{
					System.out.println("Good Night");
				}
			}	
		}
	}
}
