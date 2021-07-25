package WebTable;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import libraries.Uttile;

public class WebTableDemo 
{
   public static void main(String[] args) {
	   String baseUrl="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		WebDriver driver=Uttile.lonchApplication(1, baseUrl);
		Uttile.loginPage(driver, "Tester", "test");
		
		
		WebElement web=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody"));
		List<WebElement>  allRows= web.findElements(By.xpath("tr"));
		int rowLenth=allRows.size();
		System.out.println(rowLenth);
		
		List<WebElement>  allColums= web.findElements(By.xpath("tr[1]/th"));
		
	int colume=allColums.size();
	
	System.out.println(colume);
	
	for (WebElement columeName : allColums) {
		System.out.println(columeName.getText());
	}
	
	
	
}
	
	

}
