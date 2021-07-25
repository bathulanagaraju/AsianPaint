package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class What 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String baseUrl="https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(6000);
		driver.navigate().to("https://web.whatsapp.com/");
		driver.findElement(By.xpath("//span[@title='Sai.m.ItB']")).click();
		driver.findElement(By.xpath("//div[@class='_2A8P4']")).click();
		driver.findElement(By.xpath("//div[@class='_2A8P4']")).sendKeys("using selenium");
		driver.findElement(By.xpath("//div[@class='_2A8P4']")).sendKeys(Keys.ENTER);
		
		
	}

}
