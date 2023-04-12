package logs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logins {
	WebDriver driver;
	public logins(WebDriver driver)
	{
		this.driver=driver;
		//WebDriver wait=new WebDriver(driver,3);
	}
	
	public void Log_in()
	{
	
		
	WebElement log=driver.findElement(By.linkText("Login"));
	log.click();

	WebElement email=driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
	email.sendKeys("kanchan.dharwadkar95@gmail.com");
	
	
	WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	pass.sendKeys("kanchan95");
	
	WebElement log2=driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
	log2.click();
	System.out.println("i successfully login");

	

}
}
