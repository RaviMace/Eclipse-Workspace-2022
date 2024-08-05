package com.demo.project;

import java.util.HashSet;
import java.util.Iterator;

public class HashClass {

	public static void main(String[] args) {
		HashSet<Object> ob= new HashSet<Object>();
		ob.add(new StudentString(1007,"Ram"));
		ob.add(new StudentString(1010,"Rama"));
		ob.add(new StudentString(1012,"Rama Raja"));
		ob.add(new StudentString(1013,"Ramu Raja"));
		ob.add(new StudentString(1011,"Ramki"));
		System.out.println("Printing "+ob);
		Iterator<Object> l = ob.iterator();
		
		
		while (l.hasNext()) {
			Object o = l.next();
			if (o.equals("BTM")) {
				l.remove();
			}
			System.out.println(l.next());
		}
		System.out.println("Printing using Loop");
		for (Object k : ob) {
			System.out.println(k);
		}
	}

}
