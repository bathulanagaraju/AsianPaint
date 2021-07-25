package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
//		driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[name*='ent$user']")).sendKeys("Tester");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[type$='ord']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[type^='sub']")).click();
//		driver.findElement(By.cssSelector("input.button[value='Login']")).click();
				
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}

}
