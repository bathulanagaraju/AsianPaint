

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDemo1 {

	public static void main(String[] args) {
		
		String baseUrl = "file:///D:/CapGemini/HTML/numbers.html";
		int ctr = 0;

		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select/child::option"));
		System.out.println(allOptions.size());
		
		for (WebElement option : allOptions) {
			
			String val = option.getText();
			
			if (val.equals("one")) {
				ctr++;
			}
		}
		
		System.out.println("No. of times one appears in the drop down = " + ctr);
		
		driver.quit();

	}

}
