package ActionApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsDemo {

	public static void main(String[] args) {
		String baseUrl="https://www.flipkart.com";
		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		

	}

}
