package com.demo.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(8);
		a.add(2);
		a.add(17);
		a.add(21);
		a.add(80);
		
		Iterator<Integer> i =a.iterator();
		/*
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		ListIterator<Integer> l= a.listIterator();
		while (l.hasNext()) 
		{
			System.out.println(l.next());
		}
		
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
	}

}
