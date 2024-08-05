package com.zoho.systemtesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Potentials extends OpenLoginLogoutClose {
	@Test
	public void createLeads() {
		driver.findElement(By.xpath("//a[text()='Potentials']")).click();
		driver.findElement(By.xpath("//input[@value='New Potential']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("100000");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Amar Gowda");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("11/11/2022");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("25");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Rate Negotiation");
		driver.findElement(By.xpath("//img[@title='Account Name Lookup']")).click();
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();
		String parentWindowTab = iterator.next();
		String childWindowTab = iterator.next();
		driver.switchTo().window(childWindowTab);
		driver.findElement(By.xpath("(//a[@class='link'])[21]")).click();
		driver.findElement(By.xpath("//a[text()='Arun Supports']")).click();
		driver.switchTo().window(parentWindowTab);
		driver.findElement(By.xpath("//select[@name='property(Stage)']")).click();
		driver.findElement(By.xpath("//option[@value='25:Needs Analysis']")).click();
		driver.findElement(By.xpath("//select[@name='property(Type)']")).click();
		driver.findElement(By.xpath("//option[@value='Existing Business']")).click();
		driver.findElement(By.xpath("//select[@name='property(Lead Source)']")).click();
		driver.findElement(By.xpath("//option[@value='Advertisement']")).click();
		driver.findElement(By.xpath("//img[@title='Campaign Name Lookup']")).click();
		Set<String> windowId1 = driver.getWindowHandles();
		Iterator<String> iterator1 = windowId1.iterator();
		String parentWindowTab1 = iterator1.next();
		String childWindowTab1 = iterator1.next();
		driver.switchTo().window(childWindowTab1);
		driver.findElement(By.xpath("//a[text()='HP laptop']")).click();
		driver.switchTo().window(parentWindowTab1);
		//driver.findElement(By.xpath("//input[@value='Save']")).click();
		Reporter.log("createdPotentials",true);
	}
}
