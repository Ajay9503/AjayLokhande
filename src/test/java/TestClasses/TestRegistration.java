package TestClasses;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pomclasses.PomRegistration;



public class TestRegistration {
	
	WebDriver driver;
	BaseClass base;
	
    @BeforeClass
	public void Registration() 
	{
		base = new BaseClass();
		driver=base.lauchbrowser();
		
	}
	
	@BeforeMethod
	public void info() 
	{
		
	}
	
	@Test
	public void TC001() 
	{
		PomRegistration pr = new PomRegistration(driver);
		
		pr.fname("Raj");
		pr.lname("Shirke");
		pr.address("Near Khav Galli, Chinchpokli, Mumbai");
		pr.email("rajshirke@gmail.com");
		pr.phone("9988123400");
		pr.gender();
		pr.hobbies();
		pr.language();
		pr.langclick();
		
	}
	
	@AfterMethod
	public void refresh() 
	{
		
	}
	
	@AfterClass
	public void close() 
	{
		
	}

}
