package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {
	
	WebDriver driver;
	
	public  BlogPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Blog")
	WebElement blg;
public String getbligtitle() {
	return driver.getTitle();
	
}

public BlogPage clickOnBolglink() {
	System.out.println("This give text" + blg.getText());
	blg.click();
	
	 
	 return new BlogPage(driver);
	
}
}
