package TestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.UtilityClass;
import configuration.ConfigurationPath;
import pomclasses.PomFB;

public class FBTest {
	
	WebDriver driver;
	BaseClass base;
	PomFB fb;
	
	@BeforeClass
	public void launchFB()
	{
		base = new BaseClass();
		
		driver = base.lauchbrowser();
		
	}
	
	@BeforeMethod
	public void enteremailid()
	{
		//driver.manage().window().maximize();
	}
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException
	{
		 fb=new PomFB(driver);
		 
		 fb.emailid(UtilityClass.readexcelsheet(1, 0));
//		 UtilityClass.screenshot(driver);
		 
		 fb.password(UtilityClass.readexcelsheet(1, 1));
//		 UtilityClass.screenshot(driver);
		 
		 fb.loginbutton();
		 
//		 fb.emailid("Ajayawchar07@gmail.com");
//		 fb.password("Ajay@123");
//		 fb.loginbutton();
	}
	
	@AfterMethod
	public void Screenshot() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		UtilityClass.screenshot(driver);
	   
	}
	
	@AfterClass
	public void closebrowser()
	{
		//driver.close();
	}

}
