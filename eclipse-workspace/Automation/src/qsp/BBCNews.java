package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com");
		List<WebElement> LatestNews = driver.findElements(By.xpath("//ul[@class='top-list__list']"));
		int count = LatestNews.size();
		for (int i = 0; i < count; i++) {
			String text = LatestNews.get(i).getText();
			System.out.println(text);
		}
	}
}
