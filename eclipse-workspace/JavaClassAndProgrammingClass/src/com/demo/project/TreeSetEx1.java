package com.demo.project;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(50);
		t.add(100);
		t.add(5);
		t.add(9);
		for (Integer i : t) {
			System.out.println(i);
		}
		System.out.println("Printing in descending order "+t.descendingSet());
	}

}
