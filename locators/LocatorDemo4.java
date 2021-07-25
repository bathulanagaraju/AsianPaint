package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4 {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		String labelText = driver.findElement(By.xpath("//input[@type='text']/preceding::label")).getText();
		System.out.println(labelText);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']/parent::*"));
		String tag = element.getTagName();
		System.out.println("Parent Tag = " + tag);
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tester");
//		driver.findElement(By.xpath("//input[@type='text'][@class='txt']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type='text' and @class='txt']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//a[@id='ctl00_logout']")).click();
		driver.quit();

	}

}
