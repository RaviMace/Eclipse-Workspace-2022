package com.demo.project;

public class Armstrong {

	public static void main(String[]args) 
	{
		int n=999;
		for (int i=100;i<=n;i++)
		{
			int s=isP(i);
			if(s==i)
				System.out.println(i+" is Armstrong Number");
			//else 
			//System.out.println(i+" is Not Palindrome Number");
		}
	}
	static int isP(int num)
	{
		int sum=0,r;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		return sum;
	}

}

