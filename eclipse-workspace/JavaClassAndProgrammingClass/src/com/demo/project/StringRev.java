package com.demo.project;

public class StringRev 
{
	public static void main(String[]args)
	{
		String st="";
		for(int i=1;i<=5;i++)
		{
			st=st+i;
		}
		System.out.println(st);
		String sc="";
		for(int j=1;j<=5;j++)
		{
			sc=j+sc;
		}
		System.out.println(sc);
	}
}
