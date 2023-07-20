package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pomclasses.SaralJeevanBima;

public class TestSaralBima {
	WebDriver driver;
	BaseClass base;
	
	@BeforeClass
	public void lauchbrowser() {
		
		base = new BaseClass();
		driver = base.lauchbrowser();
		
	}
	
	@BeforeMethod
	public void max() {
		
	}
	
	@Test
	public void TC001() throws InterruptedException {
		
		SaralJeevanBima sb = new SaralJeevanBima(driver);
		
		sb.jeevan();
//		Thread.sleep(500);
		
		sb.gender();
//		Thread.sleep(500);
		
		sb.fname("Sudha Aamte");
//		Thread.sleep(500);
		
		sb.dob("27101988");
//		Thread.sleep(500);	
		
		sb.mobno("9595674595");
//		Thread.sleep(500);
		
		sb.viewquotes();
	}
	
	@AfterMethod
	public void refresh() {
		
	}
	
	@AfterClass
	public void closebrowser() {
		
	}

}
