package logs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class free_Register {
WebDriver driver;
public free_Register(WebDriver driver)
{
	this.driver=driver;
}
public void register()
{
		WebElement register=driver.findElement(By.id("register_Layer"));
		register.click();
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Mohit Arjun Bhenwal");
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("mohit1212@gmail.com");
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Mohit89521");
		
		WebElement mob=driver.findElement(By.id("mobile"));
		mob.sendKeys("8975459207");
		
		WebElement status=driver.findElement(By.xpath("//div[@class='focusable optionWrap  ']"));
		status.click();
		
		WebElement upload=driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
		upload.sendKeys("C:\\Users\\Kanchan\\Desktop\\IT-kanchan dharwadkar.docx");
		System.out.println("File uploaded sucessfully");

		WebElement now=driver.findElement(By.xpath("//button[@class='submitbtn resman-btn-primary resman-btn-regular']"));
		now.click();
		System.out.println("I resistered");
	}

}
