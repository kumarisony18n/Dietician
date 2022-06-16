package stepdefinitions;

import org.junit.Assert;

import qa.factory.DriverFactory;
import pageObjects.BlogPage;
import pageObjects.HomepageofDiet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTestSteps {
	
	public static String title;
	HomepageofDiet homepage = new HomepageofDiet(DriverFactory.getDriver());

	@Given("user is on the browser")
	public void user_is_on__browser() {
		DriverFactory.getDriver().get("https://www.dietician/home.com");

	}

	@When("User opens the Dietician Website")
	public void user_opens_the_dietician_website() {
		title = homepage.getHomepagetitle();

		System.out.println("homepage title" + title);
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		DriverFactory.getDriver().get("https://www.dietician/home.com");
	}

	@Then("User should see a logo image with the company name on the Home Page")
	public void user_should_see_a_logo_image_with_the_company_name_on_the_home_page() {
		Assert.assertTrue(homepage.LogoExist());
	}

	@Then("User should see a tab with text PRODUCT CLIENTS,TEAM, REGISTER,About,Featured,Blog,Contactus,searchoption,Signinimage on the top menu bar of the Home page")
	public void user_should_see_a_tab_with_text_product_clients_team_register_about_featured_blog_contactus_searchoption_signinimage_on_the_top_menu_bar_of_the_home_page() {

		Assert.assertTrue(homepage.Producttext());
		Assert.assertTrue(homepage.clienttext());
		Assert.assertTrue(homepage.teamtext());
		Assert.assertTrue(homepage.ContctText());
		Assert.assertTrue(homepage.aboutext());
		Assert.assertTrue(homepage.Featuredtext());
		Assert.assertTrue(homepage.blogtext());
		Assert.assertTrue(homepage.searchbutton());
		Assert.assertTrue(homepage.imagesymbl());

		homepage.registrtionText();

	}
}