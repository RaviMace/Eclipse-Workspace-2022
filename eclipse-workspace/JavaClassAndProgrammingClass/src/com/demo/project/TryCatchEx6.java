package com.demo.project;

import java.util.Scanner;

public class TryCatchEx6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner string = new Scanner(System.in);
		String s = string.next();
		int i = string.nextInt();
		//String s= "QSPIDER";
		try {
			char c = s.charAt(i);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NullPointerException n) {
			System.out.println(n);
		}
	}

}
