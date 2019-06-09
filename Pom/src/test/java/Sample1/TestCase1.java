package Sample1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Connect.SetupDriver;
import Pages.SendKeyPage;

public class TestCase1 extends SetupDriver{
	SendKeyPage sendkeypage;
	
	@BeforeTest
	public void connect() {
		initial();
		 sendkeypage=new SendKeyPage();
	}

	@Test()
	public void test1() throws InterruptedException {
		sendkeypage.EnterText();
	}
	@Test(dependsOnMethods= {"test1"})
	public void test2checkbox() throws InterruptedException {
		sendkeypage.checkbox();
	}
}
