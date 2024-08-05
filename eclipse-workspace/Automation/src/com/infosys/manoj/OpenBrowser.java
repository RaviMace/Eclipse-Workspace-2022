package com.infosys.manoj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class OpenBrowser {
	static {
		System.setProperty("webdriver.gecko.driver", "./home/user/Desktop/geckodriver.exe");
	}
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("openBrowser",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		driver.get("http://localhost:8080/application");
		String title = driver.getTitle();
		Reporter.log(title,true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("closeBrowser",true);
	}
}
