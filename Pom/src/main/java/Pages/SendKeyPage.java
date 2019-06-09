package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Connect.SetupDriver;

public class SendKeyPage extends SetupDriver{

	
	@FindBy(xpath="//*[contains(@name,'firstname')]")
	WebElement Fname;
	@FindBy(xpath="//input[@type='radio' and @value='Male']")
	WebElement radioB;
	
	@FindBy(xpath="//input[@type='checkbox' and @value='Manual Tester' or @value='QTP']")
	WebElement checkB;
	@FindBy(xpath="//input[@type='checkbox' and @value='QTP']")
	WebElement checkB1;
	
	
	public SendKeyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterText() throws InterruptedException {
		Fname.sendKeys("renold");
		Thread.sleep(5000);
		Fname.clear();
	}
	public void checkbox() throws InterruptedException {
		Thread.sleep(2000);
		radioB.click();
		Thread.sleep(2000);
		checkB.click();
		checkB1.click();
		
	}

}
