package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	WebDriver driver;
	
	public ClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Client")
	WebElement client;
	
	
	//It will give the tiltle of the page
	public String getclienttitle() {
		return driver.getTitle();
		
	}
	
//   once you click on the link it navigates to clienttestimonialpage
	public ClientTestimonialPage clickOnclientlink() {
		client.getText();
		client.click();
		 return new ClientTestimonialPage(driver);

}
}