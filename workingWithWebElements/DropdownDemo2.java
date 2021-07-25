package workingWithWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		String baseUrl = "file:///D:/CapGemini/HTML/multiselect.html";
		int ctr = 0;

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		Select cars = new Select(driver.findElement(By.id("cars")));
		cars.selectByVisibleText("Volvo");
		cars.selectByVisibleText("BMW");
		cars.selectByVisibleText("Audi");
		cars.selectByVisibleText("Mercedes");
		
		Thread.sleep(2000);
		
		cars.deselectAll();
		
		cars.selectByVisibleText("Volvo");
		cars.selectByVisibleText("BMW");
		cars.selectByVisibleText("Audi");
		cars.selectByVisibleText("Mercedes");
		
		Thread.sleep(2000);
		
		cars.deselectByIndex(0);
		Thread.sleep(500);
		
		cars.deselectByValue("bm");
		Thread.sleep(500);
		
		cars.deselectByVisibleText("Audi");
		Thread.sleep(500);
		
		
		driver.quit();

	}

}
