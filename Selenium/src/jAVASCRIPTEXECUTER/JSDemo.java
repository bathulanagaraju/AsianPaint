package jAVASCRIPTEXECUTER;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class JSDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://www.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
        JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();

		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));

		Actions actions = new Actions(driver);
		Action moveToFashion = actions.moveToElement(fashion).build();
		moveToFashion.perform();

		WebElement menFootwear = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		Action moveToFootwear = actions.moveToElement(menFootwear).build();
		moveToFootwear.perform();

		WebElement sportsShoes = driver.findElement(
				By.xpath("//span[text()='more in Men Footwear']/following-sibling::a[contains(@href,'sports-shoes')]"));
		Action moveToSportsShoes = actions.moveToElement(sportsShoes).click().build();
		moveToSportsShoes.perform();
		Thread.sleep(5000);

		Thread.sleep(5000);
		
		js.executeScript("scrollBy(0,900);");
		Thread.sleep(2000);
		
		js.executeScript("scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		
		js.executeScript("scrollBy(0,-document.body.scrollHeight);");
		
		WebElement shoes= driver.findElement(By.xpath("//img[contains(@src,'aadi-black-original-imafmzfcjcjytgcf.jpeg')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",shoes);
		shoes.click();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
