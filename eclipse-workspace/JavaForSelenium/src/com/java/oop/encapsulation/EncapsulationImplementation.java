package com.java.oop.encapsulation;

public class EncapsulationImplementation {

	public static void main(String[] args) {
		EncapsulationExample ob = new EncapsulationExample();
		
		ob.setName("Ravi");
		ob.setEmpID(1008);
		ob.setAge(28);
		ob.setMobNum(9444660000l);
		
		System.out.println(ob.getName());
		System.out.println(ob.getEmpID());
		System.out.println(ob.getAge());
		System.out.println(ob.getMobNum());

	}

}
