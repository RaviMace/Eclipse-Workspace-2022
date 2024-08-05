package com.demo.project;

class Area
{
	void Input(int l,int b)
	{
		System.out.println("Length is "+l);
		System.out.println("Breath is "+b);
	}
	static int InputR(int l,int b)
	{
		return l*b;
	}
	
}

class Rect 
{
	public static void main(String[] args) 
	{
		Area ob=new Area();
		ob.Input(2,3);
		System.out.println("Area of the Rectange is "+Area.InputR(2, 3));		
	}

}
