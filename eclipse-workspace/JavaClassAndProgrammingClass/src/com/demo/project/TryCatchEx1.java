package com.demo.project;

public class TryCatchEx1 {

	public static void main(String[] args) {
		String s = "Java";
		char c='a';
		try {
			c = s.charAt(4);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println(s.toUpperCase());
		System.out.println("Java Programming Language");
	}

}
