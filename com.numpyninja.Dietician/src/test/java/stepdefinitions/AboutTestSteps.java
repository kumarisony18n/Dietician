package stepdefinitions;

import org.testng.Assert;

import qa.factory.DriverFactory;
import pageObjects.Aboutpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutTestSteps {
	Aboutpage about = new Aboutpage(DriverFactory.getDriver());
	
	@When("User clicks on About Link on Home page")
	public void user_clicks_on_about_link_on_home_page() {
		about.clickOnaboutlink();
        System.out.println(about.getabouttitle());
	}

	@Then("User is directed to About Page")
	public void user_is_directed_to_about_page() {
		Assert.assertSame(about,about);
	}
}

