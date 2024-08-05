package com.demo.project;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, Object> h = new HashMap<String, Object>();
		h.put("Name", "Ravi");
		h.put("Age", 28);
		h.put("Place", "Tamil Nadu");
		h.put("Phone Number", "9999988888");
		System.out.println(h.values());
		System.out.println(h.entrySet());
		System.out.println(h.keySet());
	}

}
