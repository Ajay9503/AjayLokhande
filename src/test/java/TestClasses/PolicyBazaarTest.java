package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pomclasses.PolicyBazaarPom;

public class PolicyBazaarTest {
	
	WebDriver driver;      // Not Run Female xpath
	BaseClass base;
	
	@BeforeClass
	public void lauchBrowser() {
		
		base = new BaseClass();
		
		driver =base.lauchbrowser();
		
	}
	
	@BeforeMethod
	public void max() {
		
	}
	
	@Test
	public void TC001() {
		
		PolicyBazaarPom pb =new PolicyBazaarPom(driver);
		
		pb.familyHI();
		
		pb.btnnext();
		
		pb.age1("39");
		
		pb.btnnext();
		
		pb.pincode("403001");
		
		pb.clickcity();
		
		pb.btnnext();
		
		pb.selectgender();
		
		
		
	}
	
	@AfterMethod
	public void refresh() {
//		driver.navigate().refresh();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
