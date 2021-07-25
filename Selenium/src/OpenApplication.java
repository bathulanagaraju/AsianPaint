

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) {
		
//		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		String baseUrl = "http://www.seleniumhq.org";
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * Options options = driver.manage(); Window window = options.window();
		 * window.maximize();
		 */
		
		driver.get(baseUrl);
		
		String handle = driver.getWindowHandle();
		System.out.println("Window Handle is: " + handle);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
             
		 if(baseUrl.equals(currentUrl))
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("False");
		 }
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
		System.out.println("----------------------------------------------------------------");
		
		String pageSrc = driver.getPageSource();
		System.out.println("Page Source: " + pageSrc);
		
		driver.close();
		

	}

}
