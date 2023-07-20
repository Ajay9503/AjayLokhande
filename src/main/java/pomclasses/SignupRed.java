package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignupRed {
	
	@FindBy(xpath ="(//input[@type='text'])[1]") private WebElement fullname;
	
	@FindBy(xpath ="(//input[@type='text'])[2]") private WebElement id;
	
	@FindBy(xpath ="(//input[@type='password'])[1]") private WebElement pass;
	
	@FindBy(xpath ="(//input[@type='password'])[2]") private WebElement repass;
	
	@FindBy(xpath ="(//input[@type='text'])[3]") private WebElement altid;
	
	@FindBy(xpath ="(//input[@type='text'])[6]") private WebElement mob;
	
	@FindBy(xpath ="(//select[contains(@name,'DOB_')])[1]") private WebElement day;
	
	@FindBy(xpath ="(//select[contains(@name,'DOB_')])[2]") private WebElement month;
	
	@FindBy(xpath ="(//select[contains(@name,'DOB_')])[3]") private WebElement year;
	
	@FindBy(xpath ="(//select[contains(@name,'city')])") private WebElement ct;
	
	public SignupRed (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void fname(String A) {
		fullname.sendKeys(A);
	}
	
	public void eid(String B) {
		id.sendKeys(B);
	}
	
	public void paass(String C) {
		pass.sendKeys(C);
	}
	
	public void reepass(String I) {
		repass.sendKeys(I);
	}
	
	public void alt(String J) {
		altid.sendKeys(J);
	}
	
	public void mobno(String D) {
		mob.sendKeys(D);
	}
	
	public void bday(String E) {
		day.sendKeys(E);
	}
	
	public void bmonth(String F) {
		month.sendKeys(F);
	}
	
	public void byear(String G) {
		year.sendKeys(G);
	}
	
	public void city(String H) {
		ct.sendKeys(H);
	}
	
}


