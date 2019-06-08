package Sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Connect.SetupDriver;
import Pages.Faceboolog;
import Pages.LoginPage;


public class CheckBox_RadioButton extends SetupDriver{
	LoginPage loginpage;
	Faceboolog fbook;
	
	
	
	@BeforeTest
	public void setup() {
		initial();
		//loginpage =new LoginPage();
		Faceboolog fbook=new Faceboolog();
	}
	
	/*@Test
	public void logintest() {
		
		//login=new LoginPage();
		//loginpage.loginpageCheck();
		//loginpage.checkbox();
		List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
				for ( WebElement el : check ) {
				    if ( !el.isSelected() ) {
				        el.click();
			}

		}

		loginpage.facebook();
		
	}*/
	
	
	
	@Test
	public void test123() {
		System.out.println(driver.getTitle());
		/*String fbtitle=fbook.title();
		Assert.assertEquals(fbtitle, "Facebook – log in or sign up");*/
		fbook.log();
	}
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
