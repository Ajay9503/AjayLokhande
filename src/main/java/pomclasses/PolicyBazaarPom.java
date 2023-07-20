package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarPom {
	
	@FindBy(xpath ="(//div[@class='shadowHandlerBox'])[6]") private WebElement familyHI;
	
	@FindBy(xpath ="(//input[@type='submit'])") private WebElement btnnext;
	
	@FindBy(xpath ="(//div[@class='inputFld'])/select") private WebElement age;
	
	@FindBy(xpath ="(//input[@type='text'])") private WebElement pincode;
	
	@FindBy(xpath ="(//div[@id='divcitylist'])/ul/li[2]") private WebElement clickcity;
	
	@FindBy(xpath="//div[@class='pq_radios']/label[2]") private WebElement gender;
	
	public PolicyBazaarPom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void familyHI() 
	{
		familyHI.click();
	}
	
	public void btnnext() 
	{
		btnnext.click();
	}
	
	public void age1(String A) 
	{
		age.sendKeys(A);
	}
	
	public void pincode(String B) 
	{
		pincode.sendKeys(B);
	}
	
	public void clickcity() 
	{
		clickcity.click();
	}
	
	public void selectgender() 
	{
		gender.click();
	}

}
