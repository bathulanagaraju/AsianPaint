package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitDemo {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "https://sites.google.com/a/chromium.org/chromedriver/";

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
