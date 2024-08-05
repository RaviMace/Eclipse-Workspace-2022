package com.java.programming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedArrayList 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("SQL");
		l.add("JAVA");
		l.add("WEB");
		l.add("Manual Testing");
		l.add("Java Script");
		
		for (String s : l) 
		{
			System.out.println(s);
		}
		l.add(2, "Selenium");
		System.out.println("After Adding one more element");
		for (String st : l) 
		{
			System.out.println(st);
		}
		
		System.out.println();
		System.out.println("Array List and Iterator");
		ArrayList<Object>ob = new ArrayList<Object>();
		ob.add("SQL");
		ob.add("JAVA");
		ob.add("WEB");
		ob.add("Manual Testing");
		ob.add("Java Script");
		ListIterator<Object> a = ob.listIterator();
		while (a.hasNext()) {
			Object b = a.next();
			if (b.equals("JAVA")) {
				a.remove();
			}
			
		}
		System.out.println("After Removing one more element");
		for(Object k:ob)
		{
			System.out.println(k);
		}

	}

}
