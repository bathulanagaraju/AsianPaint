package frame.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandligDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl="E:\\selenu\\codes\\HTML\\test.html";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.switchTo().frame("menu_page");
		driver.findElement(By.linkText("click here new users")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main_page");
		driver.findElement(By.name("cmdSubmit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.name("emailorphone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("bnrrea");
		driver.findElement(By.name("cmdSubmit")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu_page");
		driver.findElement(By.linkText("click here existing users")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main_page");
		driver.findElement(By.name("emailorphone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("bnrrea");
		driver.findElement(By.name("cmdSubmit")).click();
		
		//driver.quit();

	}

}
