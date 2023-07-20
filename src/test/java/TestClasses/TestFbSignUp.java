package TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.UtilityClass;
import configuration.ConfigurationPath;
import pomclasses.FbSignUp;


public class TestFbSignUp {
	
	WebDriver driver;
	FbSignUp fb;
	
    @BeforeClass
	public void lauchFB() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.ChromeDriverPath);
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
	}
    
    @BeforeMethod
    public void max() {
    	driver.manage().window().maximize();
    }
    
    @Test
    public void TestCase() throws InterruptedException {
    
    	fb =new FbSignUp(driver);
    	
    	fb.firstname("Jethalal");
    	fb.lastname("Gada");
    	fb.emailId("jethalalgada@gmail.com");
    	fb.Reemail("jethalalgada@gmail.com");
    	fb.NewPass("Jetha@123");
    	fb.bday("2");
    	fb.bmonth("Sep");
    	fb.byear("1995");
    	fb.gender();
    	fb.signup();
    	
    }
    
    @AfterMethod
    public void Screenshot() throws IOException  {
    	
    	UtilityClass.screenshot(driver);
    	
    	System.out.println("Screenshot Successfully Taken:  ");
    	
    }
    
    @AfterClass
    public void CloseBrowser() {
    	driver.close();
    }
    
}
