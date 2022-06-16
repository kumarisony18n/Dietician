package stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import io.cucumber.java.en.*;
import pageObjects.DietPlans;
import pageObjects.ViewRecentDiets;
import qa.factory.DriverFactory;

public class PaginationonViewRecentDietPlansSteps {
	
	private DietPlans dietPlans = new DietPlans(DriverFactory.getDriver());
	private ViewRecentDiets viewRecentDiets = new ViewRecentDiets(DriverFactory.getDriver());
	
	@Given("User logged on to Dietician website")
	public void user_logged_on_to_dietician_website() {
	    
		Boolean isDisplayed = dietPlans.isDieticianNameDisplayed();
		assertTrue(isDisplayed);
	}
	
	
	@When("User on the  View Recent DietsPage")
	public void user_on_the_view_recent_diets_page() {
		viewRecentDiets.lblViewRecentDiets.isDisplayed();
	}
	

	@Then("User should see {int} records per page")
	public void user_should_see_records_per_page(Integer recordcount) {
	    
		viewRecentDiets.getAllValuesofPatientTable();
	}


	@When("More than one page of records are displayed and User is on firstpage")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_firstpage() {
		viewRecentDiets.getAllValuesofPatientTable();
	}

	@Then("Next Page button \\(>) is enabled")
	public void next_page_button_is_enabled() {
	    viewRecentDiets.btnnextPageLink.isEnabled();
	}

	@Given("User is on View Recent DietsPage and more than one page of records are displayed and User is on first page")
	public void user_is_on_view_recent_diets_page_and_more_than_one_page_of_records_are_displayed_and_user_is_on_first_page() {
	    
		viewRecentDiets.lblViewRecentDiets.isDisplayed();
		viewRecentDiets.getAllValuesofPatientTable();
	}

	@When("User selects the next page button \\(>)")
	public void user_selects_the_next_page_button() {
	    
		viewRecentDiets.btnnextPageLink.isSelected();
	}

	@Then("User should see the second page")
	public void user_should_see_the_second_page() {
	    
		viewRecentDiets.btnsecondPageLink.isDisplayed();
	}

	@When("More than one page of records are displayed and User is on last page")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_last_page() {
	    
		viewRecentDiets.getAllValuesofPatientTable();
	}

	@Then("Next Page button \\(>) disabled")
	public void next_page_button_disabled() {
	    Boolean status = false;
		status = viewRecentDiets.btnnextPageLink.isEnabled();
		assertTrue(status);
	}

	

	@When("One page of records are displayed")
	public void one_page_of_records_are_displayed() {
		viewRecentDiets.getAllValuesofPatientTable();
	}

	@Then("Next Page button \\(>) is disabled")
	public void next_page_button_is_disabled() {
	    
		 Boolean status = false;
			status = viewRecentDiets.btnnextPageLink.isEnabled();
			assertTrue(status);
	}

	@When("More than one page of records are displayed and User is on the last page")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_the_last_page() {
	   
		viewRecentDiets.getAllValuesofPatientTable();
	}

	@Then("Previous Page button \\(<) is enabled")
	public void previous_page_button_is_enabled() {
	    
		viewRecentDiets.btnprevPageLink.isEnabled();
	}

	@Given("User is on View Recent DietsPage and more than one page of records are displayed and User is on second page")
	public void user_is_on_view_recent_diets_page_and_more_than_one_page_of_records_are_displayed_and_user_is_on_second_page() {
	   
		viewRecentDiets.getAllValuesofPatientTable();
	}

	@When("User selects the previous page button \\(<)")
	public void user_selects_the_previous_page_button() {
	    viewRecentDiets.btnprevPageLink.isSelected();
	}

	@Then("User should see the first page")
	public void user_should_see_the_first_page() {
	    
		viewRecentDiets.btnfirstPageLink.isDisplayed();
	}


	@When("More than one page of records are displayed and User is on first page")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_first_page() {
	   
		viewRecentDiets.getAllValuesofPatientTable();
	}

	@Then("Previous Page button \\(>) is disabled")
	public void previous_page_button_is_disabled() {
	    
		Boolean status = false;
		 status = viewRecentDiets.btnprevPageLink.isEnabled();
		 assertTrue(status);
	}


}
