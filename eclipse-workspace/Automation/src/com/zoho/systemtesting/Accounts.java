package com.zoho.systemtesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Accounts extends OpenLoginLogoutClose {
	@Test
	public void createLeads() {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//input[@value='New Account']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Arun Supports");
		driver.findElement(By.xpath("//select[@name='property(Rating)']")).click();
		driver.findElement(By.xpath("//option[@value='Acquired']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("94443366765");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("JP Nagar");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("0442491675");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("www.arunsupports.com");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("1025180");
		driver.findElement(By.xpath("//select[@name='property(Account Type)']")).click();
		driver.findElement(By.xpath("//option[@value='Customer']")).click();
		driver.findElement(By.xpath("//select[@name='property(Ownership)']")).click();
		driver.findElement(By.xpath("//option[@value='Private']")).click();
		driver.findElement(By.xpath("//select[@name='property(Industry)']")).click();
		driver.findElement(By.xpath("//option[@value='Service Provider']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("100");
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("100000");
		driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("8080");
		driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("JP Nagar");
		driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("(//input[@type='text'])[19]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("(//input[@type='text'])[21]")).sendKeys("560076");
		driver.findElement(By.xpath("(//input[@type='text'])[23]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='copyAddress']")).click();
		driver.findElement(By.xpath("//td[text()='Billing to Shipping']")).click();
		//driver.findElement(By.xpath("//input[@value='Save']")).click();
		Reporter.log("createdAccounts",true);
	}
}
