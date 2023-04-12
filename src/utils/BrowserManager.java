package utils;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserManager {

	

	public WebDriver MyDriver() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kanchan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		return driver;
	}
	
}
