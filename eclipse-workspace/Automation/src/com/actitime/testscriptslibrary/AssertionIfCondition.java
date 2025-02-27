package com.actitime.testscriptslibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionIfCondition {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String eTitle = "Soogle";
		String aTitle = driver.getTitle();
		if (aTitle.equals(eTitle)) {
			System.out.println("title is matching and pass");
		} else {
			System.out.println("title is not matching and pass");
		}
		driver.close();
	}
}
