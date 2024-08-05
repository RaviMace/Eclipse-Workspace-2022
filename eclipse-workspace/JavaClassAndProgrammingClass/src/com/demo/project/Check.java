// Positive or Negative or Zero

import java.util.Scanner;

class Num
{
	public double Num1(int a)
	{
		return a;
	}
}

class Check
{
	public static void main(String[]args)
	{
		Num Num1=new Num();
		Scanner in = new Scanner(System.in);
	        System.out.print("Input a number: ");
        	int a = in.nextInt();

        	if (a > 0)
        	{
        		System.out.println("Number is positive");
        	}
        	else if (a < 0)
        	{
        		System.out.println("Number is negative");
        	}
        	else
        	{
        		System.out.println("Number is zero");
       		}		
	}
}