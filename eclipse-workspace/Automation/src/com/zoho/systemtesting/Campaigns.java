package com.zoho.systemtesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Campaigns extends OpenLoginLogoutClose {
	@Test
	public void createLeads() {
		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
		driver.findElement(By.xpath("//input[@name='property(Campaign Name)']")).sendKeys("HP laptop");
		driver.findElement(By.xpath("//select[@name='property(Type)']")).click();
		driver.findElement(By.xpath("//option[@value='Advertisement']")).click();
		driver.findElement(By.xpath("//select[@name='property(Status)']")).click();
		driver.findElement(By.xpath("//option[@value='Active']")).click();
		driver.findElement(By.xpath("//input[@name='property(Start Date)']")).sendKeys("10/31/2022");
		driver.findElement(By.xpath("//input[@name='property(End Date)']")).sendKeys("11/10/2022");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("100000");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("20000");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("10000");
		//driver.findElement(By.xpath("//input[@value='Save']")).click();
		Reporter.log("createdCampaigns",true);
	}
}
