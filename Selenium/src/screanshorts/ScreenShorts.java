package screanshorts;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import libraries.Uttile;
public class ScreenShorts {
	public static void main(String[] args) throws IOException 
	{
		String baseUrl="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	    WebDriver driver=Uttile.lonchApplication(1, baseUrl);
	    Uttile.loginPage(driver, "Tester", "test");
		Uttile.screenshort(driver, "login");
		Uttile.getPageTitle(driver);
		Uttile.logout(driver);
		
	}
}