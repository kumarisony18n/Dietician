package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedPage {

	WebDriver driver;
	
	public  FeaturedPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "featured")
	WebElement featu;
	
public String gettitleoffeature() {
	return  driver.getTitle();
}

//This method will navigate to feature page
public FeaturedPage clickOnfeatur() {
	
	featu.click();
	System.out.println("This give text" + featu.getText());
	
	 return new FeaturedPage();
	
}}