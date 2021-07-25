package com.selenium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.selenium.dev/");
		
		String handlnumber=driver.getWindowHandle();
		System.out.println(handlnumber);
		
		String title=driver.getTitle();
		System.out.println("title is "+ title);
		
		String source=driver.getPageSource();//socurce code of page
		System.out.println("page sorcecode is "+source);
		
	    driver.findElement(By.linkText("Downloads")).click();
	    Thread.sleep(3000);
	    
	    String source1=driver.getPageSource();
		System.out.println("page sorcecode is "+source1);
	  
	    driver.close();//only close the parent browser not closing pop ups
	   // driver.quit(); close the antire application and childern pop ups also
		

	}

}
