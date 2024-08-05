package com.demo.project;

import java.util.Scanner;

class TwoDimensionalArray1
{
	public static void main(String[] args) 
	{
		int a[][]= {{10,20,30},{80,87,89},{11,22,33},{40,50,60}};
		System.out.println("2D Array Arranging and Assigning Values");
		for(int[]i:a)
		{
			for(int j:i)
			{
				System.out.print(j+" "); 
			}
			System.out.println();
		}	
	}
}


class TwoDimensionalArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("2D Array Arranging and Assigning Values");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt(); 
			}
			System.out.println();
		}
		System.out.println("Arranged Values to be printed");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}

