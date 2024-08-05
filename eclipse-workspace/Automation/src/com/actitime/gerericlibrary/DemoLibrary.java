package com.actitime.gerericlibrary;

import java.io.IOException;

public class DemoLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f = new FileLib();
		String url = f.getProperty("url");
		System.out.println(url);
		f.setExcelData("Customers", 1, 4, "Skipped");
		String data = f.getExcelData("Customers", 1, 4);
		System.out.println(data);
	}

}
