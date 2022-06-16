package stepdefinitions;

import org.testng.Assert;

import pageObjects.FeaturedPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class featuTestSteps {
	FeaturedPage featurpage = new FeaturedPage();
	
	@When("User clicks on Featured link")
	public void user_clicks_on_featured_link() {
		featurpage.clickOnfeatur();
	System.out.println(featurpage.gettitleoffeature());
	}

	@Then("User is directed to Featured content page")
	public void user_is_directed_to_featured_content_page() {
		
		Assert.assertSame(featurpage, featurpage);
	    
	}

}
