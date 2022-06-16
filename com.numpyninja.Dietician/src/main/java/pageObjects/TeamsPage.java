package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamsPage {
	WebDriver driver;
	
	public TeamsPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	
	@FindBy(id = "Diet_Team")
	WebElement diettam;
	
	@FindBy(css= "//a[@href='image@']")WebElement image1;
	@FindBy(css= "//a[@href='doct1' and 'image@']")WebElement image2;
	@FindBy(css= "//a[@href='name' and 'image@']")WebElement image3;
	@FindBy(id = "previous<")WebElement buttonprevious;
	@FindBy(id = "previous>")WebElement buttonnext;
	
	@FindBy(xpath="#exxmple_page>span>a")WebElement page;
	@FindBy(xpath ="//input[@type='next']")WebElement nxtpage;
	@FindBy(id = "last_page")WebElement lastpage;
	
	
	public String nextbutton() {
		buttonnext.click();
	return	buttonnext.getAttribute("value");
	}
	
	public String getteamstitle() {
		return driver.getTitle();
		
	}
	public boolean  docterdefaultnames() {
		image1.isDisplayed();
		image2.isDisplayed();
		image3.isDisplayed();
		return true;
	}
	
	public boolean previous() {
		buttonprevious.click();
		return true;
	}
	
	public boolean previosbutton() {
		 buttonprevious.isDisplayed();
		 return true;
	}
	
	public String lastpage() {
		return lastpage.getTagName();
	}
	public String movetonextpage() {
	return	nxtpage.getText();
		
	}
	public boolean movetonextpagedisplayed() {
			nxtpage.isDisplayed();
			return true;
			
		}
	public DietTeamPage clickOnteamlink() {
		diettam.getText();
		diettam.click();
		diettam.getText();
		 return new DietTeamPage(driver);
}
	public String getDiettampageulr() {
		return driver.getTitle();
	}

	public String movetoPreviousPage() {
		return driver.getTitle();
		
	}
	
	
}
