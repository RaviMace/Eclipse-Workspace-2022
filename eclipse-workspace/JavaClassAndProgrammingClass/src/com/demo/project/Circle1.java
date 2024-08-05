// Circumference

import java.util.Scanner;

class Area3
{
	public double Circum(int r)
	{
		double Circum = 2*3.14*r;
		return Circum;
	}
}

class Circle1
{
	public static void main(String[]args)
	{
		Area3 Circum=new Area3();
		Scanner sc=new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Circumference of the Circle "+Circum.Circum(r));
	}
}