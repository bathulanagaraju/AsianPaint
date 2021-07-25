package Waites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.Uttile;

public class DemoOfWaites {

	public static void main(String[] args) 
	{
		 String baseUrl="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		 WebDriver driver=Uttile.lonchApplication(1, baseUrl);
		Uttile.loginPage(driver, "Tester", "test"); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	  
	
	}
	

}
