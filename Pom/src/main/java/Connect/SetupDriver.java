package Connect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	
	public static WebDriver driver;
	public static Properties prop;
	public SetupDriver() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("E:\\Challanges\\MakeMyTrip\\Capsulecrm\\src\\main\\java\\com\\Capsule\\qa\\config\\PropertyFile");
			
			prop.load(ip);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	public static void initial() {
		String Browsername="chrome";
		
		if(Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\renold\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("https://www.toolsqa.com/automation-practice-form");
		driver.get("https://www.facebook.com/");
		
	}
	

}
