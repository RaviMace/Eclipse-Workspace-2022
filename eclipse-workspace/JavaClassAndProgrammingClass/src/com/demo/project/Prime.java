package com.demo.project;

public class Prime 
{
	public static void main(String[]args)
	{
		int num=100;
		for(int i=1;i<=num;i++)
		{
			boolean p=isP(i);
			if(p==true)
				System.out.println(i+" is Prime number");
			//else
				//System.out.println(i+" is not Prime number");
		}
	}
	static int isC(int i,int Count)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				Count++;
		}
		return Count;
	}
	static boolean isP(int n)
	{
		int p=0;
		int C=isC(n,p);
		return C==2;
	}
}


