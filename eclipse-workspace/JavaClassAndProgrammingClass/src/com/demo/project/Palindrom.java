package com.demo.project;

public class Palindrom {

	public static void main(String[] args) 
	{
		int n=1000;
		for (int i=1;i<=n;i++)
		{
			int s=isP(i);
			if(s==i)
				System.out.println(i+" is Palindrome Number");
			//else 
				//System.out.println(i+" is Not Palindrome Number");
		}
	}
	static int isP(int num)
	{
		int sum=0,r;
		while(num!=0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		return sum;
	}
}
