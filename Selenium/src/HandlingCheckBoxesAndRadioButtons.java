

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxesAndRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		
		
		String baseUrl = "E:\\selenu\\codes\\HTML\\checkboxdemo.html";
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		boolean status = driver.findElement(By.id("vehicle2")).isSelected();
		System.out.println(status);
		
		
		
		
		driver.findElement(By.id("vehicle1")).click();
		Thread.sleep(500);
	
		
		driver.findElement(By.id("vehicle3")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("male")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("female")).click();
		Thread.sleep(500);
		driver.navigate().refresh();

	}

}
