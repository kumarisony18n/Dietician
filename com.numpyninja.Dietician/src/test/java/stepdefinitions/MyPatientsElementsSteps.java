package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.MyPatients;
import qa.factory.DriverFactory;

public class MyPatientsElementsSteps {
	
	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	
	@Given("User is on any page after login")
	public void user_is_on_any_page_after_login() {
	    boolean isDietianNameDisplayed = myPatients.isDieticianNameDisplayed();
		assertTrue("Dietician not logged in", isDietianNameDisplayed);
	}


	@When("User clicks on {string} tab")
	public void user_clicks_on_tab(String string) {
	    
		myPatients.clickMyPatientsTab();
		
	}

	@Then("My Patients tab is selected\\/highlighted")
	public void my_patients_tab_is_selected_highlighted() {
	   
		boolean isSelected = myPatients.isMyPatientsSelected();
		assertTrue(isSelected);
	}

	@Then("It shows breadcrubs as Dietician Software\\/MyPatients")
	public void it_shows_breadcrubs_as_dietician_software_my_patients() {
	    
		boolean isdisplayed = myPatients.myPatientsBreadcrumb();
		assertTrue("Dietician Software/ MyPatients is not displayed", isdisplayed);
	}

	@Then("Page title is displayed as {string}")
	public void page_title_is_displayed_as(String string) {
	    
		String pageTitle = myPatients.getpageTitle();
		assertEquals("Wrong Page title is displayed","My Patients", pageTitle);
	}

}
