package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	
WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "Product")
	WebElement prd;
	
public String getprodtitle() {
	return driver.getTitle();
	
}

public ProductPage clickOnproductlink() {
	System.out.println("This give text" + prd.getText());
	prd.click();
	
	 
	 return new ProductPage(driver);
	
}
}
