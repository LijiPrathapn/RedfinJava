package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.SearchPage;
public class TC1_Search extends BaseClass{
	 @Test
	 public void SearchTest() throws InterruptedException
	 {
		driver.get(baseURL); 
		SearchPage sp = new SearchPage(driver);
		sp.setLocation(place);
		sp.clickSearch();
		Thread.sleep(3000);
		sp.priceSubmit();
		
	 } }




