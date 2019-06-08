package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Connect.SetupDriver;

public class Faceboolog extends SetupDriver{
	
	@FindBy(xpath="//input[@type='email' and @class='inputtext']")
	WebElement Fuser;
	
	
	public Faceboolog() {
		PageFactory.initElements(driver, this);
	}

	public Faceboolog log() {
		Fuser.sendKeys("rlreee");
		return new Faceboolog();
	}
	
	public String title() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
}
