package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import configuration.ConfigurationPath;
import pomclasses.ReddiffLN;

public class TestReddiff {
	
	WebDriver driver;
	BaseClass base;
	
	@BeforeClass
	public void lauchBrowser() {
		
		base = new BaseClass();
		
		driver = base.lauchbrowser();
		
		
	}
	
	@BeforeMethod
	public void max() {
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void TestCase01() {
		
		ReddiffLN rn = new ReddiffLN(driver);
		
		rn.uname1("Raju@gmail.com");
		rn.pass1("Raju@123");
		rn.signin1();
		
	}
	
	@AfterMethod
	public void refresh() {
		
	}
	
	@AfterClass
	public void CloseBrowser() {
		
	}

}
