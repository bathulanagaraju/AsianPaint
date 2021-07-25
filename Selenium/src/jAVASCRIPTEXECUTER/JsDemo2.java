package jAVASCRIPTEXECUTER;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo2 {

	public static void main(String[] args) throws InterruptedException
	{
		String baseUrl="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
        JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		WebElement textUserName=driver.findElement(By.id("ctl00_MainContent_username"));
		WebElement textPassword=driver.findElement(By.id("ctl00_MainContent_password"));
		WebElement buttion=driver.findElement(By.id("ctl00_MainContent_login_button"));
		js.executeScript("alert('ssssssssssss')");
		js.executeScript("argument[0].value='Tester';argument[1].value='test';argument[2].click();", textUserName,textPassword,buttion);
		String title=js.executeScript("return doument.title;").toString();
		System.out.println(title);
		js.executeScript("alert('ssssssssssss')");
        js.executeScript("document.getElementById('ct100_logout').click();");
        Thread.sleep(6000);
        driver.quit();
        
        
		

	}

}
