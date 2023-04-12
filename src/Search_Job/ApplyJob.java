package Search_Job;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BrowserManager;

public class ApplyJob extends BrowserManager {
	WebDriver driver;
	public ApplyJob(WebDriver driver)
	{
		this.driver=driver;
	}
	By job=By.xpath("//div[.='Jobs']");
	By IT=By.xpath("//div[.='IT jobs']");
		
	public void CheckJob()  
	{
		
		Actions action=new Actions(driver);
		WebElement Menu=driver.findElement(job);
		action.moveToElement(Menu).build().perform();
		
	}
	public void ITjob() 
	{
		driver.findElement(IT).click();
		
		System.out.println("Check Role wise Job");
	}
	
	


}
