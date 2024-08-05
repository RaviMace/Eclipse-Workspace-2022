//create a class mobile and store mobile object into HashMap
//create constructor in moblic class with 2 arguments brand and price
//override toString method in mobile class
//create another class mobilestore and create HashMap object and add mobile object into the HashMap you created
//Key should be Integer type and value ObjectType
//add 5 objects of moblie
//remove one moblie object
//print values only
//keys only and entries also

package com.demo.project;

import java.util.HashMap;
import java.util.TreeMap;

public class MapEx22 {

	public static void main(String[] args) {
		HashMap<Integer, Mobile> h = new HashMap<Integer, Mobile>();
		h.put(45, new Mobile("Vivo",28000d));
		h.put(16, new Mobile("OnePlus",35000d));
		h.put(78, new Mobile("Iphone",82000d));
		h.put(6, new Mobile("Samsung",45000d));
		System.out.println(h);
		//Converting HashMap into TreeMap
		TreeMap<Integer, Mobile> t = new TreeMap<Integer, Mobile>(h); // passing HashMap object 
		System.out.println("Ascending order"+t);// by default ascending order
		System.out.println("Descending order"+t.descendingMap());//printing in descending order
		t.remove(16);
		System.out.println("After removing one entry "+t.entrySet());
	} 

}
