package Search_Job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchBar {
	WebDriver driver;
	public searchBar(WebDriver driver)
	{
		this.driver=driver;
	}
	By SearchBox=By.xpath("//input[@placeholder='Enter skills / designations / companies']");
	By search_btn=By.xpath("//div[@class='qsbSubmit']");
	public void Search(String searchInput )
	{
		try {

			driver.findElement(SearchBox).sendKeys(searchInput);
			Thread.sleep(1000);
			driver.findElement(search_btn).click();
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
			System.out.println("Exception Caught"+e.getMessage());
			}
	}
	
}
