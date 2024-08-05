// Circle

import java.util.Scanner;

class Area2
{
	public double area(int r)
	{
		double area = 3.14*r*r;
		return area;
	}
}

class Circle
{
	public static void main(String[]args)
	{
		Area2 area=new Area2();
		Scanner sc=new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Area of the Circle "+area.area(r));
	}
}