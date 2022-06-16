package stepdefinitions;

import org.testng.Assert;

import qa.factory.DriverFactory;
import pageObjects.CreatePlanPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateplanTestSteps {
	CreatePlanPage createpage = new CreatePlanPage(DriverFactory.getDriver());
	
	@Given("User is logged on to Dietician website")
	public void user_is_logged_on_to_dietician_website() {
		DriverFactory.getDriver().get("https://www.dietician.com/home/");
	}

	@When("UserlandsonCreatePlanpage")
	public void userlandsoncreateplanpage() {   
		 DriverFactory.getDriver().get("https://www.dietician.com/home/createpage/");
	}

	@Then("User see the heading {string} on the page")
	public void user_see_the_heading_on_the_page(String expectedvalue) {
	    String actulvalue = createpage.vaidatetheText();
	    Assert.assertEquals(actulvalue, expectedvalue);
	}

	@Then("User should see a button with name \"Browse\"on the page")
	public void user_should_see_a_button_with_name_browse_on_the_page() {
		Assert.assertTrue(createpage.browseBtn());
	}

	@Then("User should see a tool tip {string} for the Browse button")
	public void user_should_see_a_tool_tip_for_the_browse_button(String string) {
		Assert.assertTrue(createpage.textFieldbar());
	}

	@Given("User is on {string} page")
	public void user_is_on_page(String string) {
		 DriverFactory.getDriver().get("https://www.dietician.com/home/createpage/");
	}

	@When("User clicks the Browse button and selects a document")
	public void user_clicks_the_browse_button_and_selects_a_document() {
		createpage.textenterd();
	}

	@When("User should see the selected document in the field next to the Browse button on the page")
	public void user_should_see_the_selected_document_in_the_field_next_to_the_browse_button_on_the_page() {
		Assert.assertTrue(createpage.textFieldbar());
	}



}
