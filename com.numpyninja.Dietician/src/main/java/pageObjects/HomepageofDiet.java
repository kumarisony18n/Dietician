package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageofDiet {
	WebDriver driver;

	@FindBy(id = "home")
	WebElement hometitle;

	@FindBy( xpath = "//*[id=\"divLogo\"]")
	WebElement logo;

	@FindBy(id = "Product")
	WebElement prd;

	@FindBy(id = "Client")
	WebElement client;

	@FindBy(id = "Diet_Team")
	WebElement diettam;

	@FindBy(id = "contactus")
	WebElement countactus;

	@FindBy(name = "about")
	WebElement abt;
	@FindBy(name = "featured")
	WebElement featu;
	@FindBy(name = "REGISTER")
	WebElement reg;
	@FindBy(id = "Blog")
	WebElement blg;
	@FindBy(id = "searchoption")
	WebElement search;
	@FindBy(xpath = "//button[@class='btn']")
	WebElement signimage;

	
	public HomepageofDiet(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public String getHomepagetitle() {
		hometitle.isDisplayed();
		return driver.getTitle();
	}

	public boolean LogoExist() {
		 logo.isDisplayed();
		
		 return true;
	}

	public boolean Producttext() {
		 prd.getText();
		 return  prd.isDisplayed();
	}

	public boolean clienttext() {
		
		 client.getText();
		 return client.isDisplayed();
	}

	public boolean teamtext() {
		diettam.getText();
		return diettam.isDisplayed();
	}

	public boolean ContctText() {
		countactus.getText();
		 return countactus.isDisplayed();
	}

	public boolean aboutext() {
		abt.getText();
		 return abt.isDisplayed();
	}

	public boolean Featuredtext() {
		featu.getText();
		 return  featu.isDisplayed();
		
	}

	public boolean blogtext() {
		blg.getText();
		 return   blg.isDisplayed();
	}

	public boolean searchbutton() {
		search.getText();
		return search.isDisplayed();
		  
	}

	public boolean imagesymbl() {
		return signimage.isDisplayed();
		 
	}

	// Homepage is redirecting to registerPage
	public RegisterPage registrtionText() {
	System.out.println(reg.isDisplayed());
	System.out.println(reg.getText());
		reg.click();
		System.out.println(reg.getText());
		return new RegisterPage(driver);
	}

}