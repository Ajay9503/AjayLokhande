package baseclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import configuration.ConfigurationPath;

public class BaseClass {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public WebDriver lauchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.ChromeDriverPath);
		
		driver = new ChromeDriver();
		
		driver.get(ConfigurationPath.DemoRegistration);
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public void press() {
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
	}

}
