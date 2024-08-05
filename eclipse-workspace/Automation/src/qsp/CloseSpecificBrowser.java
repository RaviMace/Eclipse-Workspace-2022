package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.println("Enter the title of the browser");
		String eTitle = enter.next();
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
			Thread.sleep(3000);
			driver.switchTo().window(wh);
			String aTitle = driver.getTitle();
			if(aTitle.contains(eTitle)) {
				System.out.println(eTitle);
				driver.close();
			}	
		}
	}

}
