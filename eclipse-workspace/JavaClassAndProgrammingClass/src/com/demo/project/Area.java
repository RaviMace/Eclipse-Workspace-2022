import java.util.Scanner;

class Area1
{
	public int area(int l, int b)
	{
		int area = l*b;
		return area;	
	}
}

class Recta
{
	public static void main(String[]args)
	{
		Area1 area=new Area1();
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Area of Rectange is "+area.area(l,b));
	}
}