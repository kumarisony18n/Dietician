package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageObjects.ViewRecentDiets;
import qa.factory.DriverFactory;

public class ViewPDF {
	private ViewRecentDiets viewRecentDiets = new ViewRecentDiets(DriverFactory.getDriver());
	
	@Given("User logged on to the Dietician website")
	public void user_logged_on_to_the_dietician_website() {
	   
		Boolean status = viewRecentDiets.isDieticianNameDisplayed();
		assertTrue(status);
	}

	@When("User is on View Recent DietsPage")
	public void user_is_on_view_recent_diets_page() {
	    String title = viewRecentDiets.getpageTitle();
	    assertEquals(title, "View Recent Diets page");
	}

	@Then("View PDF option is available for the generated diet plans")
	public void view_pdf_option_is_available_for_the_generated_diet_plans() {
	    
		viewRecentDiets.btnviewpdf.isDisplayed();
	}
	
	@Given("User is on page View Recent Diets")
	public void user_is_on_page_view_recent_diets() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User selects the View PDF button for a generated diet plan")
	public void user_selects_the_view_pdf_button_for_a_generated_diet_plan() {
	    
		viewRecentDiets.btnviewpdf.click();
	}

	@Then("User should see the information in the pdf")
	public void user_should_see_the_information_in_the_pdf() throws IOException {
	    
		 viewRecentDiets.ReadPdf();
	}


}
