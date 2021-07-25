package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		/*
		 * WebElement txtUserName =
		 * driver.findElement(By.id("ctl00_MainContent_username"));
		 * txtUserName.sendKeys("Tester");
		 */
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_MainContent_username")).clear();
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_password")).clear();
		
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		/*
		 * driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		 * driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		 */
		
		driver.findElement(By.className("button")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		driver.findElement(By.id("ctl00_logout")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}

}
