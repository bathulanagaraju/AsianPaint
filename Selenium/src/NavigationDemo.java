
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "http://www.google.com";

		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://www.seleniumhq.org");
				
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.get(driver.getCurrentUrl());
		
		
		driver.quit();
		

	}

}
