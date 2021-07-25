

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String baseUrl = "https://www.naukri.com/";

		System.setProperty("webdriver.chrome.driver", "E:\\softwere\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(baseUrl);
		
		Thread.sleep(3000);
		
		Set<String> allHandles = driver.getWindowHandles();
		
		System.out.println("No. of handle value = " + allHandles.size());
		
		for (String handle : allHandles) {
			System.out.println(handle);
			
			driver.switchTo().window(handle);
			String title =  driver.getTitle();
			System.out.println("Window with handle value " + handle + " represents window with title " + title);
			
			if (!title.equals("Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com")) {
				driver.close();
			}
			
			
		}
		
	//driver.quit();

	}

}
