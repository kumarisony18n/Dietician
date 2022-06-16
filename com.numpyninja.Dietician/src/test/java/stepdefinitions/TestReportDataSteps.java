package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import pageObjects.ViewPatientsTestReports;
import qa.factory.DriverFactory;

public class TestReportDataSteps {
	
	private ViewPatientsTestReports viewPatientsTestReports = new ViewPatientsTestReports(DriverFactory.getDriver());
	
	@Given("User clicks on {string} button")
	public void user_clicks_on_button(String viewPreviousTestReports) {
	   
		viewPatientsTestReports.clickbtnviewPreviousTestReports();
		assertEquals(viewPatientsTestReports.btnviewPreviousTestReports.getText(), viewPreviousTestReports);
	}

	@When("User is on {string} button page")
	public void user_is_on_button_page(String string) {
		viewPatientsTestReports.lblviewPatientTestReports.click();
	}

	@Then("Every record shows {string} option")
	public void every_record_shows_option(String pdf) {
	    
		viewPatientsTestReports.btnViewPdfClick();
		assertEquals(viewPatientsTestReports.btnviewPdffile.getText(), pdf);
	}

	@Then("Every report has Doc Id")
	public void every_report_has_doc_id() {
	    
		viewPatientsTestReports.getAllValuesofTestReportTable();
	}

	@Then("Every report shows file upload time")
	public void every_report_shows_file_upload_time() {
	    
		viewPatientsTestReports.getAllValuesofTestReportTable();
	}

	@Then("File uploaded time is shown in correct date and time format")
	public void file_uploaded_time_is_shown_in_correct_date_and_time_format() {
	    
		viewPatientsTestReports.getAllValuesofTestReportTable();
	}

	@Then("Uploaded time field shows age of file upload in seconds\\/minutes\\/hour\\/days\\/months\\/years")
	public void uploaded_time_field_shows_age_of_file_upload_in_seconds_minutes_hour_days_months_years() {
	    
		viewPatientsTestReports.getAllValuesofTestReportTable();
	}

	@Then("Every report has its name")
	public void every_report_has_its_name() {
	   
		viewPatientsTestReports.getAllValuesofTestReportTable();
	}

	@Then("Every report shows identified conditions from its test report file")
	public void every_report_shows_identified_conditions_from_its_test_report_file() {
		viewPatientsTestReports.getAllValuesofTestReportTable();
	}
}
