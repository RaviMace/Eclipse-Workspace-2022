package com.zoho.systemtesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Leads extends OpenLoginLogoutClose {
	@Test
	public void createLeads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Arun Supports");
		driver.findElement(By.xpath("(//select[@class='select'])[3]")).click();
		driver.findElement(By.xpath("//option[@value='Mr.']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Arun");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("Manager");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("arun.kumar@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("0442491675");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("0442491675");
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("94443366765");
		driver.findElement(By.xpath("//select[@name='property(Lead Source)']")).click();
		driver.findElement(By.xpath("//option[@value='Advertisement']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("50");
		driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("10000");
		driver.findElement(By.xpath("//img[@title='Campaign Name Lookup']")).click();
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();
		String parentWindowTab = iterator.next();
		String childWindowTab = iterator.next();
		driver.switchTo().window(childWindowTab);
		driver.findElement(By.xpath("//a[text()='HP laptop']")).click();
		driver.switchTo().window(parentWindowTab);
		driver.findElement(By.xpath("//select[@name='property(Rating)']")).click();
		driver.findElement(By.xpath("//option[@value='Active']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("JP Nagar");
		driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("(//input[@type='text'])[19]")).sendKeys("560076");
		driver.findElement(By.xpath("(//input[@type='text'])[20]")).sendKeys("India");
		//driver.findElement(By.xpath("//input[@value='Save']")).click();
		Reporter.log("createdLeads",true);
	}
}
