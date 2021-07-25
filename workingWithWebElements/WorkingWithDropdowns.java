package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		String baseUrl = "file:///D:/CapGemini/HTML/months.html";		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		Select month = new Select(driver.findElement(By.name("months")));
		month.selectByIndex(6);
		Thread.sleep(1000);
		
		month.selectByValue("May");
		Thread.sleep(1000);
		
		month.selectByVisibleText("October");
		Thread.sleep(1000);

	}

}
