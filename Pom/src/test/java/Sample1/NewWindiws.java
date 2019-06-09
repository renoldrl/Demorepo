package Sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class NewWindiws {
	public static WebDriver driver;
	@Test
	public void chromenew() {
		System.setProperty("webdriver.chrome.driver", "E:\\renold\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(capabilities);
		driver.get("https://www.facebook.com/");
		
	}

}
