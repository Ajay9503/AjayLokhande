package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaralJeevanBima {
	
	@FindBy(xpath="(//div[@class='shadowHandlerBox'])[9]") private WebElement jeevanbima;
	
	@FindBy(xpath="(//div[@class='fieldsets fieldsets1'])/label[2]") private WebElement gen;
	
	@FindBy(xpath="(//input[@type='text'])") private WebElement name;
	
	@FindBy(xpath="(//input[@id='dob'])") private WebElement dob;
	
	@FindBy(xpath="(//input[@id='mobileNo'])") private WebElement mobno;
	
	@FindBy(xpath="(//button[@id='submitButton'])/span") private WebElement viewquotes;
	
	public SaralJeevanBima(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void jeevan() 
	{
		jeevanbima.click();
	}
	
	public void gender() 
	{
		gen.click();
	}
	
	public void fname(String B) 
	{
		name.sendKeys(B);	
	}
	
	public void dob(String C) 
	{
		dob.sendKeys(C);
	}
	
	public void mobno(String D) 
	{
		mobno.sendKeys(D);	
	}
	
	public void viewquotes() 
	{
		viewquotes.click();
	}
	
	
	
	


}
