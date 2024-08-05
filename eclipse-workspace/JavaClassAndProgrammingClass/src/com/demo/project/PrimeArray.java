package com.demo.project;

import java.util.Scanner;

class DriverPrime
{
	public static void main(String[] args) 
	{
		PrimeArray p=new PrimeArray();
		int x[]=p.readValue();
		int a=p.checkPrime(x);
		System.out.println(a);
		
	}
}

class PrimeArray 
{
	public int[] readValue()
	{
		System.out.println("Enter the Array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" Values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public int checkPrime(int ar[])
	{
		int count=0;
		for(int j=0;j<ar.length-1;j++)
		{
			if(ar[j]%j==0)
				count++;
		}
		return count;
	}
}

