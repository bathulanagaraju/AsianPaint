package ActionApi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrageAndDrop
{

	public static void main(String[] args) throws InterruptedException
	{
		String baseUrl ="https://jqueryui.com/droppable/";
	       
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
       
        JavascriptExecutor js = (JavascriptExecutor)driver;
       
        js.executeScript("scrollBy(0,300);");
       
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
       
        WebElement dragable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
       
        Actions actions = new Actions(driver);
       
        org.openqa.selenium.interactions.Action dragAndDrop = actions.dragAndDrop(dragable, droppable).build();
        dragAndDrop.perform();
        Thread.sleep(5000);
       
        driver.quit();
		
	}
}
