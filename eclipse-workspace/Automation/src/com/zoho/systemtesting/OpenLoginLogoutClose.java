package com.zoho.systemtesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class OpenLoginLogoutClose {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("openBrowser",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		FileInputStream fis = new FileInputStream("./data/zoho.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		driver.get(url);
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		driver.findElement(By.id("userName")).sendKeys(un);
		driver.findElement(By.id("passWord")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		Reporter.log("login",true);
	}
	@AfterMethod 
	public void logout() {
		driver.findElement(By.xpath("(//a[@class='topLink'])[6]")).click();
		Reporter.log("logout",true); 
	}
}
