package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObjects.MyPatients;
import qa.factory.DriverFactory;

public class SeacrhPatientsUISteps {
	
	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	  
		boolean isDietianNameDisplayed = myPatients.isDieticianNameDisplayed();
		assertTrue("Dietician not logged in", isDietianNameDisplayed);
	}

	@When("User is on My Patients")
	public void user_is_on_my_patients() {
	   
		myPatients.clickMyPatientsTab();
	}

	@Then("Name, email and phone number filter options and search button are displayed.")
	public void name_email_and_phone_number_filter_options_and_search_button_are_displayed() {
	    
		Boolean  isTextBoxesDisplayed = myPatients.isTextBoxesDisplayed();
		assertTrue("Textboxes for name, email, phone and search button not diplayed", isTextBoxesDisplayed);
	}


	@Then("button used for search has text as {string}")
	public void button_used_for_search_has_text_as(String string) {
	    
		String searchTxt = myPatients.getSearchTxt();
		assertEquals("Search", searchTxt);
	}

	@When("User starts typing inside name filter box")
	public void user_starts_typing_inside_name_filter_box() {
	    
		myPatients.txtName.click();
	}

	@Then("Text inside name filter box should disappear")
	public void text_inside_name_filter_box_should_disappear() {
	    
		myPatients.txtName.clear();
	}

	@When("User starts typing inside email address filter box")
	public void user_starts_typing_inside_email_address_filter_box() {
	    
		myPatients.txtEmail.click();
	}

	@Then("Text inside email address filter box should disappear")
	public void text_inside_email_address_filter_box_should_disappear() {
	   
		myPatients.txtEmail.clear();
	}

	@When("User starts typing inside phone number filter box")
	public void user_starts_typing_inside_phone_number_filter_box() {
	    
		myPatients.txtPhone.click();
	}

	@Then("Text inside phone number filter box should disappear")
	public void text_inside_phone_number_filter_box_should_disappear() {
	    
		myPatients.txtPhone.clear();
	}

}
