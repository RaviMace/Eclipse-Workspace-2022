package com.demo.project;

public class StringMethodEx 
{
	
	public static void main(String[] args) 
	{
		String s="ArunachalaPradesh";
		System.out.println(s.length());
		
		System.out.println("// Method 1 - SubSting Method with one index"); 
		System.out.println("// We can directly print"); 
		System.out.println(s.substring(3));
		
		System.out.println("// We can create another object and print"); 
		String sub=s.substring(3);
		System.out.println(sub);						//With Variable name
		System.out.println(s.substring(3));				//directly calling substring method
		
		System.out.println("// Method 2 - Substring Method with two index");
		System.out.println("// We can directly print");
		System.out.println(s.substring(1,5));
		
		System.out.println("// We can create another object and print"); 
		String sub1=s.substring(3);
		System.out.println(sub1);						//With Variable name
		System.out.println(s.substring(1,5));			//directly calling substring method
		
		System.out.println("// Method 3 - Character index");
		System.out.println("// We can create another object and print"); 
		char c=s.charAt(1);
		System.out.println(c);
		
		System.out.println("// We can directly print");
		System.out.println(s.charAt(1));
		
		System.out.println("// Method 4 - Index method of an particular character");
		System.out.println("// We can directly print");
		System.out.println(s.indexOf('n'));
		
		System.out.println("// We can create another object and print");
		int i=s.indexOf('n');
		System.out.println(i);
		
		System.out.println("// Method 5 - Upper class and Lower method of an particular character");
		System.out.println("// We can directly print");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println("// We can create another object and print");
		String u=s.toUpperCase();
		String l=s.toLowerCase();
		System.out.println(u);
		System.out.println(l);
		
		System.out.println("// Method 5 - Equal ignore method using String");
		System.out.println("// We can directly print");
		String t="arunachalapradesh";
		System.out.println(s.equalsIgnoreCase(t));
		
		System.out.println("// We can create another object and print");
		boolean e=s.equalsIgnoreCase(t);
		System.out.println(e);
		
		System.out.println("// Method 5 - Equal method using String");
		System.out.println("// We can directly print");
		System.out.println(s.equals(t));
		
		System.out.println("// We can create another object and print");
		boolean ei=s.equals(t);
		System.out.println(ei);	
		
		
	}

}
