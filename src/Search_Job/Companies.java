package Search_Job;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import utils.BrowserManager;

public class Companies extends BrowserManager {
	WebDriver driver;
	public Companies(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By comp=By.xpath("//div[.='Companies']");
	
	public void MyCompany()
	{
		
		Actions action=new Actions(driver);
		WebElement list=driver.findElement(comp);
		action.moveToElement(list).build().perform();
		
		System.out.println("Check Comapany wise Category");
		
	}
	
		
		
}

	


