package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObjects.MyPatients;
import pageObjects.ViewPatientsTestReports;
import qa.factory.DriverFactory;

public class PatientsTestReportsSteps {
	
	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	private ViewPatientsTestReports viewPatientsTestReports = new ViewPatientsTestReports(DriverFactory.getDriver());
	
	@Given("User has searched patients after login")
	public void user_has_searched_patients_after_login() {
	    
		myPatients.searchBtnClick();
	}

	@When("User lands on {string} page")
	public void user_lands_on_page(String viewPatientTestReports) {
	   
		String expectedTitle = viewPatientsTestReports.getPageTitle();
		assertEquals(expectedTitle, viewPatientTestReports, "Page title does not match");
	}
	
	/*@Then("My Patients tab is selected\\/highlighted")
	public void my_patients_tab_is_selected_highlighted() {
	    
		Boolean isSelected = viewPatientsTestReports.verifyMyPatientsIsDisplayed();
		assertTrue("My Patients tab is not selected",isSelected);
	}*/
	
	@Then("It shows breadcrubs as Dietician Software\\/View Recent Test Reports")
	public void it_shows_breadcrubs_as_dietician_software_view_recent_test_reports() {
	    
		Boolean isDisplayed = viewPatientsTestReports.verifyDieticianSoftwareViewRecentTestReportsIsDisplayed();
		assertTrue(isDisplayed);
		}

	@Then("Title is displayed as {string}")
	public void title_is_displayed_as(String viewPatientTestReports) {
	    
		String expectedTitle = viewPatientsTestReports.getPageTitle();
		assertEquals(expectedTitle, viewPatientTestReports, "Page title does not match");
	}

	@Given("User clicks on button {string}")
	public void user_clicks_on_button(String string) {
		viewPatientsTestReports.clickbtnviewPreviousTestReports();
	}

	@Then("It displays primary information like patient Id  number, name, email address, Phone number, Address")
	public void it_displays_primary_information_like_patient_id_number_name_email_address_phone_number_address() {
	    
		Boolean isDisplayed = viewPatientsTestReports.verifyPatientsPrimaryInfo();
		assertTrue(isDisplayed);
	}

	@Then("It displays patient's old and latest test reports")
	public void it_displays_patient_s_old_and_latest_test_reports() {
		viewPatientsTestReports.getAllValuesofTestReportTable();
	    
	}

	@Then("It shows column heading as Record number, Doc-ID, File Uploaded time, File\\/Report name, Identified health conditions")
	public void it_shows_column_heading_as_record_number_doc_id_file_uploaded_time_file_report_name_identified_health_conditions() {
	    
		viewPatientsTestReports.getTableHeaders();
	}
}
