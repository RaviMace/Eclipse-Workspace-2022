package com.demo.project;

public class TryCatchEx2 {

	public static void main(String[] args) {
		int a[] = {11,22,33,44,55};
		
		try {
			int c=a[5];
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Java Programming Language");

	}

}
