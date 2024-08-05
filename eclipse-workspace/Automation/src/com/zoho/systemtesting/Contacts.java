package com.zoho.systemtesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Contacts extends OpenLoginLogoutClose {
	@Test
	public void createLeads() {
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//input[@value='New Contact']")).click();
		driver.findElement(By.xpath("//select[@name='property(Lead Source)']")).click();
		driver.findElement(By.xpath("//option[@value='Advertisement']")).click();
		driver.findElement(By.xpath("//select[@name='property(saltName)']")).click();
		driver.findElement(By.xpath("//option[@value='Mr.']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Amar");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Gowda");
		driver.findElement(By.xpath("//img[@title='Account Name Lookup']")).click();
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();
		String parentWindowTab = iterator.next();
		String childWindowTab = iterator.next();
		driver.switchTo().window(childWindowTab);
		driver.findElement(By.xpath("(//a[@class='link'])[21]")).click();
		driver.findElement(By.xpath("//a[text()='Arun Supports']")).click();
		driver.switchTo().window(parentWindowTab);
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("amar.gowda@arunsupports.com");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Genral Manager");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Purchase Department");
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("94443366765");
		driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("94443366765");
		driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("03/01/1975");
		driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("Sai Gowda");
		driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys("9044433777");
		driver.findElement(By.xpath("(//input[@type='text'])[19]")).sendKeys("Genral Manager");
		driver.findElement(By.xpath("(//input[@type='text'])[20]")).sendKeys("JP Nagar");
		driver.findElement(By.xpath("(//input[@type='text'])[22]")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("(//input[@type='text'])[24]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("(//input[@type='text'])[26]")).sendKeys("560076");
		driver.findElement(By.xpath("(//input[@type='text'])[28]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='copyAddress']")).click();
		driver.findElement(By.xpath("//td[text()='Mailing to Other']")).click();
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Reporter.log("createdContacts",true);
	}
}
