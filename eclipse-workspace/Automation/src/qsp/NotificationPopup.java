package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("__disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com");
	}

}
