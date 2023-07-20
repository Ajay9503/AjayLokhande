package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddiffLN {
	
	@FindBy(xpath = "//input[@name='login']") private WebElement uname;
	
	@FindBy(xpath = "//input[@name='passwd']") private WebElement pass;
	
	@FindBy(xpath = "//input[@type='submit']") private WebElement signin;

    public ReddiffLN (WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public void uname1(String A) {
    	uname.sendKeys(A);	
    }
    
    public void pass1(String B) {
    	pass.sendKeys(B);
    }
    
    public void signin1() {
    	signin.click();
    }
}