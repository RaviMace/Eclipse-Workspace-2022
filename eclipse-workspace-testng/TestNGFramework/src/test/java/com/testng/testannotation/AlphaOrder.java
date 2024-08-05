package com.testng.testannotation;

import org.testng.annotations.Test;

public class AlphaOrder {
  @Test
  public void f() {
	  System.out.println("Method F is executed");
  }
  
  @Test
  public void a() {
	  System.out.println("Method A is executed");
  }
  
  @Test
  public void b() {
	  System.out.println("Method B is executed");
  }
  
  @Test
  public void c() {
	  System.out.println("Method C is executed");
  }
  
  @Test
  public void d() {
	  System.out.println("Method D is executed");
  }
}
