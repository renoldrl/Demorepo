package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Connect.SetupDriver;


public class LoginPage extends SetupDriver{
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement userName;
	
	@FindBy(name="lastname")
	WebElement password;

	@FindBy(xpath="//input[@type='checkbox']")
	List<WebElement> check;
	
	@FindBy(xpath="//input[@type='email' and @class='inputtext']")
	WebElement Fuser;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginpageCheck() {
		userName.sendKeys("rlrenold");
		//password.sendKeys("seumma");
	}
	public void checkbox() {
		//List<WebElement> chkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement el : check ) {
		    if ( !el.isSelected() ) {
		        el.click();
	}

}
	}
	
	public void facebook() {
		Fuser.sendKeys("renold");
	}
	
}
