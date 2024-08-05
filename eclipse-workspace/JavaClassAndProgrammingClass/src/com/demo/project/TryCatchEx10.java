package com.demo.project;

import java.io.*;

public class TryCatchEx10 {

	public static void main(String[] args) throws IOException {
		File f = new File("D://a.java");
		PrintWriter pw = new PrintWriter(f);
		pw.println("Class Student");
		pw.println("ookkk");
		pw.print("I love this class");
		pw.close();
		FileReader obj = new FileReader(f);
		BufferedReader bf = new BufferedReader(obj);
		String s = bf.readLine();
		while (s!=null) {
			System.out.println(s);
			s=bf.readLine();
		}
	}

}
