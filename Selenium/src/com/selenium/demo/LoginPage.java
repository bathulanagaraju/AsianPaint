package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException 
	{
		String baseUrl="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(baseUrl);
		
		            /* // driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	                  	driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
	                 // driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	                  	driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
	                 driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	                  	//driver.findElement(By.name("ctl00_MainContent_login_button")).click();
	                  	
	                  //	driver.findElement(By.id("ctl00_logout")).click();
	                  	driver.findElement(By.linkText("Logout")).click();
	                  */
		     //driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
		    // driver.findElement(By.cssSelector("")).sendKeys("");
		     //driver.findElement(By.className("button")).click();
		//driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("tester");
		driver.findElement(By.xpath("//input[contains(@name,'$username')]")).sendKeys("Tester");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(@id,'_password')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println();
		driver.findElement(By.xpath("//a[@id='ctl00_logout']")).click();
		
		
		
		driver.close();
	}
	

}
