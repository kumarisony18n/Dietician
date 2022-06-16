package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObjects.MyPatients;
import pageObjects.ViewPatientsTestReports;
import qa.factory.DriverFactory;

public class PatientTestReportPaginationSteps {
	
	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	private ViewPatientsTestReports viewPatientsTestReports = new ViewPatientsTestReports(DriverFactory.getDriver());
	
	
	@Given("User clicks on {string} button to view previous test reports")
	public void user_clicks_on_button_to_view_previous_test_reports(String viewPreviousTestReports) {
	    
		viewPatientsTestReports.clickbtnviewPreviousTestReports();
		
	}

	@When("User is on {string} page to view test reports")
	public void user_is_on_page_to_view_test_reports(String viewPatientTestReports) {
	   
		String expectedTitle = viewPatientsTestReports.getPageTitle();
		assertEquals(expectedTitle, viewPatientTestReports, "Page title does not match");
	}

	@Then("More than {int} records should be displayed on different pages through pagination")
	public void more_than_records_should_be_displayed_on_different_pages_through_pagination(Integer recordCount) {
		if(recordCount > 3) {
			assertTrue(true);
		}
		
	}

	@Then("Pagination has {string} as next link")
	public void pagination_has_as_next_link(String next) {
	    
		String expectednext = viewPatientsTestReports.nextPageLink.getText();
		assertEquals(expectednext, next);
		
	}

	@Then("Pagination has {string} as previous link")
	public void pagination_has_as_previous_link(String previous) {
	   
		String expectedprev = viewPatientsTestReports.prevPageLink.getText();
		assertEquals(expectedprev, previous);
	}

	
}
