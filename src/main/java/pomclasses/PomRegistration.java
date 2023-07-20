package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomRegistration {
	
	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement fname;
	
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement lname;
	
	@FindBy(xpath="(//div[@class='col-md-8 col-xs-8 col-sm-8'])/textarea") private WebElement address;
	
	@FindBy(xpath="(//input[@type='email'])") private WebElement email;
	
	@FindBy(xpath="(//input[@type='tel'])") private WebElement phone;
	
	@FindBy(xpath="(//input[@type='radio'])[1]") private WebElement gender;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]") private WebElement hobbies;
	
	@FindBy(xpath="(//div[@id='msdd'])") private WebElement language;
	
	@FindBy(xpath="(//div[@style='display: block;'])/ul/li[8]") private WebElement langClick;
	
	@FindBy(xpath="(//select[@type='text'])[1]") private WebElement skills;
	
	@FindBy(xpath="") private WebElement country;
	
	@FindBy(xpath="") private WebElement selectcountry;
	
	@FindBy(xpath="") private WebElement bday;
	
	@FindBy(xpath="") private WebElement bmonth;
	
	@FindBy(xpath="") private WebElement byear;
	
	@FindBy(xpath="") private WebElement pass;
	
	@FindBy(xpath="") private WebElement confirmpass;
	
	public PomRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fname(String A) 
	{
		fname.sendKeys(A);
	}
	
	public void lname(String B) 
	{
		lname.sendKeys(B);
	}
	
	public void address(String C) 
	{
		address.sendKeys(C);
	}
	
	public void email(String D) 
	{
		email.sendKeys(D);
	}
	
	public void phone(String E) 
	{
		phone.sendKeys(E);
	}
	
	public void gender() 
	{
		gender.click();
	}
	
	public void hobbies() 
	{
		hobbies.click();
	}
	
	public void language() 
	{
		language.click();
		
	}
	
	public void langclick() 
	{
		langClick.click();
		
	}
	
	public void skill(String I) 
	{
		
	}
	
	public void country(String J) 
	{
		
	}
	
	public void selectcountry(String K) 
	{
		
	}
	
	public void bday() 
	{
		
	}
	
	public void bmonth() 
	{
		
	}
	
	public void byear() 
	{
		
	}
	
	public void pass() 
	{
		
	}
	
	public void confirmpass() 
	{
		
	}
	

}
