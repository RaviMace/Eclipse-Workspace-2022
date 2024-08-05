// Print Ascii Value

import java.util.Scanner;

class Chara
{
	public char ch(char chr)
	{
		return chr;
	}
}

class AsciiV
{
	public static void main(String[]args)
	{
		Chara ch=new Chara();
		System.out.print("Enter a character: ");  
		Scanner sc = new Scanner(System.in);  
		char chara = sc.next().charAt(0);  
		int asciiValue = chara;  
		System.out.println("ASCII value of " +chara+ " is: "+asciiValue);  
		
	}
}