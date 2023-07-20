package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.UtilityClass;
import configuration.ConfigurationPath;
import pomclasses.PomR;

public class PomT {
	
	WebDriver driver;

	@BeforeClass
	public void launchbrowser()
	{
       System.setProperty("webdriver.chrome.driver", ConfigurationPath.ChromeDriverPath);
		
		driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@BeforeMethod
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC001() throws InterruptedException
	{
		PomR acc=new PomR(driver);
		
		acc.name("Ajay Awchar");
		acc.ID("abc07");
		acc.password("Ajay@123");
		acc.number("9860590407");
		acc.bdob("16");
		acc.bmonth("APR");
		acc.byear("1996");
		Thread.sleep(500);
	}
	
	@AfterMethod
	public void Screenshot() throws InterruptedException, IOException
	{
		
	  // driver.navigate().refresh();
	   Thread.sleep(2000);
	   UtilityClass.screenshot(driver);
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}

}