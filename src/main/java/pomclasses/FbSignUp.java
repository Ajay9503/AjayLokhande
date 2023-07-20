package pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class FbSignUp {
	
	@FindBy(xpath = "//input[@name='firstname']") private WebElement fname;
	
	@FindBy(xpath = "//input[@name='lastname']") private WebElement lname;
	
	@FindBy(xpath = "//input[@name='reg_email__']") private WebElement email;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']") private WebElement remail;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']") private WebElement npass;
	
	@FindBy(xpath = "//select[@id='day']") private WebElement day;
	
	@FindBy(xpath = "//select[@id='month']") private WebElement month;
	
	@FindBy(xpath = "//select[@id='year']") private WebElement year;
	
	@FindBy(xpath = "//input[@value='2']") private WebElement male;
	
	@FindBy(xpath = "//button[@name='websubmit']") private WebElement submit;
	
	public FbSignUp(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void firstname (String A) {
		fname.sendKeys(A);
	}
	
	public void lastname (String B) {
		lname.sendKeys(B);
	}
	
	public void emailId (String C) {
		email.sendKeys(C);
	}
	
	public void Reemail (String F) {
		remail.sendKeys(F);
	}
	
	public void NewPass (String D) {
		npass.sendKeys(D);
	}
	
	public void bday(String E) {
		
		Select s1 = new Select(day);
		s1.selectByValue(E);
	}
	
	public void bmonth (String F) {
		
		Select s2 = new Select(month);
		s2.selectByVisibleText(F);
	}
	
	public void byear (String G) {
		
		Select s3 = new Select(year); 
		s3.selectByVisibleText(G);
	}
	
	public void gender() {
		male.click();
	}

	
	public void signup()  {
		
		submit.click();
	}
	
	
	
	
	

}
