package stepdefinitions;

import org.testng.Assert;

import qa.factory.DriverFactory;
import pageObjects.ClientPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClientTestSteps {
	
	ClientPage clientpage = new ClientPage(DriverFactory.getDriver());
	@When("User clicks on Client link on Home Page")
	public void user_clicks_on_client_link_on_home_page() {
		clientpage.clickOnclientlink();
        System.out.println(clientpage.getclienttitle());
	    
	   }

	@Then("User is re-directed to  ClientTestimonialPage")
	public void user_is_re_directed_to_client_testimonial_page() {
		Assert.assertSame(clientpage,clientpage);
	}
}
