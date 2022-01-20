package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

		public WebDriver ldriver;

	    public SearchPage(WebDriver rdriver) {
	    
	        ldriver=rdriver;
	        PageFactory.initElements(rdriver, this);
	    }
	    
		@FindBy(xpath ="//div[@class='searchInputNode']//input[@class='search-input-box']")
	    WebElement txtSearch;
		
		@FindBy(xpath="//div[@class='searchInputNode']//button[@type='submit']")
		WebElement Searchclick;
		
		@FindBy(xpath="//span[@data-content='Price']")
		WebElement ClickPrice;


	    public void setLocation(String place) {

	        txtSearch.sendKeys(place);
	    }
	    public void clickSearch() {

	        Searchclick.click();
	    }
	    public void priceSubmit() {

	       ClickPrice.click();
	    }
	    
		}




