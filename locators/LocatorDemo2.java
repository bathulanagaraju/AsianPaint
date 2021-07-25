package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "file:///D:/CapGemini/HTML/links_demo.html";
//		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
//		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		
//		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
//		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		/*
		 * driver.findElement(By.partialLinkText("eck A")).click(); Thread.sleep(2000);
		 * driver.findElement(By.partialLinkText("eck A")).click();
		 */

		
		/*
		 * driver.findElement(By.linkText("Hotmail")).click();
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.navigate().back();
		 * 
		 * driver.findElement(By.linkText("Google")).click();
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.navigate().back();
		 */
		
		/*
		 * driver.findElement(By.partialLinkText("go to Sel")).click();
		 * System.out.println(driver.getTitle()); driver.navigate().back();
		 */
		
		//getting no. of links on the page
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int noOfLinks = allLinks.size();
		System.out.println("No. of Links on page = " + noOfLinks);
		
		for (WebElement link : allLinks) {
			String linkText = link.getText();
			String value = link.getAttribute("href");
			System.out.println("For the link " + linkText + " the href attribute value is: " + value);
		}
		
		driver.quit();

	}

}
