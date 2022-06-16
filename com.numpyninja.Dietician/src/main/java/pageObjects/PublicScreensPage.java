package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PublicScreensPage {
	private WebDriver driver;
	
	public PublicScreensPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By userSignInLink = By.linkText("User Sign In");
	private By registerLink = By.linkText("Register");
	private By teamLink = By.linkText("Team");
	private By testiLink = By.linkText("Testimonials");
	private By forgotPwdLink = By.linkText("Forgot Password");
	private By productFeaLink = By.linkText("Product Features");
	private By contactLink = By.linkText("Contact");
	private By blogsLink = By.linkText("Blogs");
	private By featuredContLink = By.linkText("Featured Content");
	private By homeLink = By.linkText("Home");

	public boolean isUserSignInLinkExist() {
	return	driver.findElement(userSignInLink).isSelected();
	}
	public boolean isRegiisterLinkExist() {
	return	driver.findElement(registerLink).isSelected();
	}
	public boolean isTeamLinkExist() {
	return	driver.findElement(teamLink).isSelected();
	}
	public boolean isTestimonialsLinkExist() {
	return	driver.findElement(testiLink).isSelected();
	}
	public boolean isForgotPwdLinkExist() {
	return	driver.findElement(forgotPwdLink).isSelected();
	}
	public boolean isProductFeatureLinkExist() {
	return	driver.findElement(productFeaLink).isSelected();
	}
	public boolean isContactLinkExist() {
	return	driver.findElement(contactLink).isSelected();
	}
	public boolean isBlogsLinkExist() {
	return	driver.findElement(blogsLink).isSelected();	
	}
	public boolean isFeaturedContentLinkExist() {
	return	driver.findElement(featuredContLink).isSelected();
	}
	public boolean isHomeLinkExist() {
	return	driver.findElement(homeLink).isSelected();
	}
	public void ClickOnUserSignIn() {	
		driver.findElement(userSignInLink).click();
	}
	public void ClickOnRegisterLink() {	
		driver.findElement(registerLink).click();
	}
	public void ClickOnTeamLink() {	
		driver.findElement(teamLink).click();
	}
	public void ClickOnTestimonialsLink() {	
		driver.findElement(testiLink).click();
	}
	public void ClickOnForgotPwdLink() {	
		driver.findElement(forgotPwdLink).click();
	}
	public void ClickOnProductFeaturesLink() {	
		driver.findElement(productFeaLink).click();
	}
	public void ClickOnContactLink() {	
		driver.findElement(contactLink).click();
	}
	public void ClickOnBlogsLink() {	
		driver.findElement(blogsLink).click();
	}
	public void ClickOnFeaturedContentLink() {	
		driver.findElement(featuredContLink).click();
	}
	public void ClickOnHomeLink() {	
		driver.findElement(homeLink).click();
	}
}