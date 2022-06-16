package stepdefinitions;

import org.junit.Assert;

import pageObjects.PublicScreensPage;

import io.cucumber.java.en.*;

import qa.factory.DriverFactory;

public class PublicScreens {
	
private PublicScreensPage publicscreenspage = new PublicScreensPage(DriverFactory.getDriver());
	
	@Given("User is on list of screens menu")
	public void user_is_on_list_of_screens_menu() {
	  DriverFactory.getDriver().get("https://www.dietician.com");
	}

	@When("User clicks on User Sign In link")
	public void user_clicks_on_user_sign_in_link() {
	   publicscreenspage.ClickOnUserSignIn();
	}

	@Then("User should be directed to Sign In page")
	public void user_should_be_directed_to_sign_in_page() {
	    Assert.assertTrue(publicscreenspage.isUserSignInLinkExist());
	}

	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
	    publicscreenspage.ClickOnRegisterLink();
	}

	@Then("User should be directed to Register page")
	public void user_should_be_directed_to_register_page() {
Assert.assertTrue(publicscreenspage.isRegiisterLinkExist());

	}

	@When("User clicks on Team link")
	public void user_clicks_on_team_link() {
publicscreenspage.ClickOnTeamLink();

	}

	@Then("User should be directed to Team page")
	public void user_should_be_directed_to_team_page() {
Assert.assertTrue(publicscreenspage.isTeamLinkExist());

	}

	@When("User clicks on Testimonials link")
	public void user_clicks_on_testimonials_link() {
publicscreenspage.ClickOnTestimonialsLink();

	}

	@Then("User should be directed to Testimonials page")
	public void user_should_be_directed_to_testimonials_page() {

Assert.assertTrue(publicscreenspage.isTestimonialsLinkExist());
	}

	@When("User clicks on Forgot Password link")
	public void user_clicks_on_forgot_password_link() {
publicscreenspage.ClickOnForgotPwdLink();

	}

	@Then("User should be directed to Forgot Password page")
	public void user_should_be_directed_to_forgot_password_page() {

Assert.assertTrue(publicscreenspage.isForgotPwdLinkExist());
	}

	@When("User clicks on product features link")
	public void user_clicks_on_product_features_link() {
publicscreenspage.ClickOnProductFeaturesLink();

	}

	@Then("User should be directed to product features page")
	public void user_should_be_directed_to_product_features_page() {
Assert.assertTrue(publicscreenspage.isProductFeatureLinkExist());

	}

	@When("User clicks on Contact link")
	public void user_clicks_on_contact_link() {
publicscreenspage.ClickOnContactLink();

	}

	@Then("User should be directed to Contact page")
	public void user_should_be_directed_to_contact_page() {
Assert.assertTrue(publicscreenspage.isContactLinkExist());

	}

	@When("User clicks on Blogs link")
	public void user_clicks_on_blogs_link() {
publicscreenspage.ClickOnBlogsLink();

	}

	@Then("User should be directed to Blogs page")
	public void user_should_be_directed_to_blogs_page() {

Assert.assertTrue(publicscreenspage.isBlogsLinkExist());
	}

	@When("User clicks on Featured content link")
	public void user_clicks_on_featured_content_link() {
publicscreenspage.ClickOnFeaturedContentLink();

	}

	@Then("User should be directed to featured content page")
	public void user_should_be_directed_to_featured_content_page() {
Assert.assertTrue(publicscreenspage.isFeaturedContentLinkExist());

	}

	@When("User clicks on Home link")
	public void user_clicks_on_home_link() {
publicscreenspage.ClickOnHomeLink();

	}

	@Then("User should be directed to Home page")
	public void user_should_be_directed_to_home_page() {
Assert.assertTrue(publicscreenspage.isHomeLinkExist());

	}

}
