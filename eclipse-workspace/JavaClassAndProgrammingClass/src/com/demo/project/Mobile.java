package com.demo.project;

import java.util.HashMap;

public class Mobile {
	public static void main(String[] args) {
		HashMap<String, Object> h1 =  new HashMap<String, Object>();
		h1.put("Color", "Black");
		h1.put("Storage", "8GB");
		h1.put("Battery", "5000mAh");
	}
	String brand;
	double price;
	Mobile(String brand, double price)
	{
		this.brand = brand;
		this.price = price;
	}
	public String toString()
	{
		return "Moblie[brand=" + brand + ", Price = "+ price + " ]";
	}

}


