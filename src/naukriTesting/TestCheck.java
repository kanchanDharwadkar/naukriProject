package naukriTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Search_Job.ApplyJob;
import Search_Job.Companies;
import Search_Job.Searchbar;
import Search_Job.searchBar;
import logs.free_Register;
import logs.logins;
import utils.BrowserManager;

import org.testng.Assert;

public class TestCheck extends BrowserManager {
	
	WebDriver driver;
	ApplyJob aj;
	logins log;
	Companies comp;
	free_Register fr;
	
	@BeforeMethod
	public void setUp()
	{
		driver=MyDriver();
	}
	@Test(priority=0)
	public void varifyTitle()
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
	}
	@Test(priority=2)
	public void verifyLogo()
	{
		boolean flag=driver.findElement(By.xpath("//img[@class='fl nLogo']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test(priority=5)
	public void Register()
	{   
		fr=new free_Register(driver);
		fr.register();
	}
	@Test(priority=1)
	public void verifyScreen()
	{
		driver.manage().window().maximize();
		System.out.println("My Screen is now Maximize");
	}
	@Test(priority=3)
	public void Scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("My Screeen now scrolling");
	}
	@Test(priority=6)
	public void VerifyLogin() 
	{
		log=new logins(driver);
		log.Log_in();
	}
	@Test(priority=7)
	public void operationSearch()
	{
		searchBar s=new searchBar(driver);
		s.Search("Software Testing");
		System.out.println("Serching Job In Searchbar");
	}
	@Test(priority=8)
	public void verifyJob()
	{
		aj=new ApplyJob(driver);
		aj.CheckJob();
		aj.ITjob();
	}
	@Test(priority=9)
	public void CompWiseApply()
	{
		comp=new Companies(driver);
		comp.MyCompany();
	}
	@Test(priority=4)
	public void VerifyURL() 
	{
		System.out.println(driver.getCurrentUrl());
	}
	@AfterMethod
	public void Close()
	{
		driver.quit();
	}

}
