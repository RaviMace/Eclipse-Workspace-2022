package com.demo.project;

import java.util.Scanner;

public class TryCatchEx9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		try {
			check(password);
		} catch (PasswordException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void check(String p) throws PasswordException {
		Scanner s = new Scanner(System.in);
		int l=p.length();
		String c;

		if (l<8) {
			throw new PasswordException("Password shoud minimum 8 char");
		}
		else {
			System.out.println("Enter the password again");
			c = s.next();
		}
		if(p.equals(c)) {
			System.out.println("Ok");
		}
		else
			System.out.println("No");


	}
}

