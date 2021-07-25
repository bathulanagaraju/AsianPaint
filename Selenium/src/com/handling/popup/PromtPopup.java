/**
 * 
 */
package com.handling.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PromtPopup {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl="E:\\selenu\\codes\\HTML\\prompt_demo.html";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.id("cmdClickMe")).click();
		Thread.sleep(4000);
         driver.switchTo().alert().sendKeys("Naga Raju Bathula");
         driver.switchTo().alert().accept();
         Thread.sleep(3000);
         String msg = driver.findElement(By.id("demo")).getText();
         System.out.println("mag "+ msg);
         driver.close();
	}

}
