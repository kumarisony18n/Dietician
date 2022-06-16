package stepdefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObjects.MyPatients;
import qa.factory.DriverFactory;

public class PatientsInfoPaginationSteps {
	
	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	
	@Given("Patients records are displayed")
	public void patients_records_are_displayed() {
	    myPatients.getAllValuesofPatientTable();
	}

	@When("Records are more than {int}")
	public void records_are_more_than(Integer recordCount) {
	   
		if(recordCount > 10) {
			assertTrue(true);
		}
	}

	@Then("It must show pagination links")
	public void it_must_show_pagination_links() {
	   Boolean PrevLink = myPatients.prevPageLink.isDisplayed();
	   Boolean NextLink = myPatients.nextPageLink.isDisplayed();
	   assertTrue(PrevLink);
	   assertTrue(NextLink);
	}

	@When("User clicks on next pagination link")
	public void user_clicks_on_next_pagination_link() {
	    
		myPatients.nextPageLink.click();
	}

	@Then("It goes to next page and shows different pat")
	public void it_goes_to_next_page_and_shows_different_pat() {
		myPatients.pagination_check();
	}

	@When("User clicks on previous pagination link")
	public void user_clicks_on_previous_pagination_link() {
	    myPatients.prevPageLink.click();
	}

	@Then("It goes to previous page")
	public void it_goes_to_previous_page() {
		myPatients.pagination_check();
	}

}
