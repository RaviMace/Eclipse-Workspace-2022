package com.demo.project;

import java.util.Scanner;

public class TryCatchEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int n = sc.nextInt();
		try {
			test(n);
		} catch (NumberException e) {
			System.out.println(e);
		}
		System.out.println("Done");
	}
	public static void test(int n) {
		if(n>120)
			throw new NumberException("Invalid");
	}

}
