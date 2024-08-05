package com.demo.project;

import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("SQL");
		h.add("JAVA");
		h.add("Manual");
		h.add("SQL");
		h.add("Java Script");
		h.add("WEB");
		h.add("WEB");
		for (String s : h) {
			System.out.println(s);
		}
		
	}

}