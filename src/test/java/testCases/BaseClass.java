package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseClass {
	public String baseURL="https://www.redfin.com/";
	public String place="Sunnyvale,CA,USA";
	public static WebDriver driver;
	public String Minimum ="800k";
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lijin\\eclipse-workspace\\Redfin\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

}