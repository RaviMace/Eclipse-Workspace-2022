package com.demo.project;

import java.util.ArrayList;

public class ArrayListEx1 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> ob=new ArrayList<Object>();
		ob.add(100);
		ob.add("BTM");
		ob.add('A');
		ob.add(false);
		ob.add(12.5f);
		
		
		ArrayList<Object> ob1=new ArrayList<Object>();
		ob1.addAll(ob);
		ob1.add(899);
		ob1.add("Java");
		
		//ob1.contains(ob);
		//ob1.containsAll(ob);
		
		for (Object i : ob1) 
		{
			System.out.println(i);
		}	
	}
}
