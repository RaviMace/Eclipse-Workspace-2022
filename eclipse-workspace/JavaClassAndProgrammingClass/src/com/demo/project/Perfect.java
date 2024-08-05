package com.demo.project;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value  ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{	
			int s=isP(i);
			if(s==i)
				System.out.println(i+" is Pefect Number");
			else 
				System.out.println(i+" is Not Pefect Number");
		}
	}
	static int isP(int i)
	{
		int sum=0,j=1;
		while(j<=i/2)
		{
			if(i%j==0)
				sum=sum+i;
			j++;
		}
		return sum;
	}
}
