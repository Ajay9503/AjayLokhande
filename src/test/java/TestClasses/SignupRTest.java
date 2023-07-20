package TestClasses;

import java.io.IOException;

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
import pomclasses.SignupRed;

public class SignupRTest {
	
	WebDriver driver;
	BaseClass base;
	@BeforeClass
	public void lauchbrowser() {
		
		base =new BaseClass();
		
		driver = base.lauchbrowser();
		
	}
	
	@BeforeMethod
	public void maximiz() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	}
	
	@Test
	public void TC01() throws InterruptedException {
		
		SignupRed r = new SignupRed(driver);
		
		r.fname("Rupesh Misal");
		r.eid("rupeshmisal07");
		r.paass("Rupesh@123");
		r.reepass("Rupesh@123");
		r.alt("abc@gmail.com");
		r.mobno("9122334455");
		r.bday("25");
		r.bmonth("Feb");
		r.byear("1998");
		r.city("Goa");
		
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
    public void Screenshot() throws IOException {
//	    driver.navigate().refresh();
		
		UtilityClass.screenshot(driver);
		
    }
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}
		
}
