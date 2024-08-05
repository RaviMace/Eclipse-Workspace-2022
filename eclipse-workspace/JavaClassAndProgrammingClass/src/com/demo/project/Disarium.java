package com.demo.project;

public class Disarium {

	public static void main(String[] args) 
	{
		int n=1000;
		for (int i=10;i<=n;i++)
		{
			int s=isP(i);
			if(s==i)
				System.out.println(i+" is Disarium Number");
			//else 
			//System.out.println(i+" is Not Palindrome Number");
		}
	}
	static int isP(int num)
	{
		int sum=0,r=0;
		int l=isL(num);
		while(num>0)
		{
			r=num%10;
			sum=sum+(int)Math.pow(r, l);
			num=num/10;
			l--;
		}
		return sum;
	}
	static int isL(int n)
	{
		int l=0;
		while(n!=0)
		{
			l=l+1;
			n=n/10;
		}
		return l;
	}
}
