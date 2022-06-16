package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Aboutpage {
	
	WebDriver driver;
	
	public Aboutpage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	
	@FindBy(name = "about")
	WebElement abt;
	
	public String getabouttitle() {
		return driver.getTitle();
		
	}

	public Aboutpage clickOnaboutlink() {
		abt.getText();
		abt.click();
		 return new Aboutpage(driver);

}
}
