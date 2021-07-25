package libraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uttile 
{
	public static void screenshort(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;//downcast
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".\\Screenshorts\\"+filename +".png"));
	}
	public static WebDriver lonchApplication(int browser, String baseUrl)
	{
		
		WebDriver driver;
		switch (browser) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		  driver =new ChromeDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
			  driver =new ChromeDriver();
				break;
		}
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		return driver;
	}
	public static void loginPage(WebDriver driver,String loginid,String password)
	{
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(loginid);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}
	public static void logout(WebDriver driver)
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
	public static String getPageTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	}
	


