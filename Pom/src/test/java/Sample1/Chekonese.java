package Sample1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Connect.SetupDriver;
import Pages.Faceboolog;

public class Chekonese extends SetupDriver{
	Faceboolog fbookl;
	@BeforeTest
	public void connect() {
		initial();
		 fbookl=new Faceboolog();
	}

	@Test(priority=1)
	public void qqqq() {
		fbookl.log();
		
	}
	
	@Test(priority=2)
	public void titleq() {
		String fbtitle=fbookl.title();
		Assert.assertEquals(fbtitle, "Facebook – log in or sign up");
	}
	@AfterTest
	public void down() {
		
	}
}
