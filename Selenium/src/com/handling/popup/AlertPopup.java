package com.handling.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl="E:\\selenu\\codes\\HTML\\alert_demo.html";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	// click on the button
		driver.findElement(By.id("cmdClick")).click();;
	// get message from alert	
		String msg=driver.switchTo().alert().getText();
		System.out.println("meassage is : "+msg);
	//accept the alert 	
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	//quite the browser	
		
		

	}

}
