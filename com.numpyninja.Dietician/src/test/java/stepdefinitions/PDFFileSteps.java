package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageObjects.ViewPatientsTestReports;
import qa.factory.DriverFactory;

public class PDFFileSteps {
	
	private ViewPatientsTestReports viewPatientsTestReports = new ViewPatientsTestReports(DriverFactory.getDriver());
	
	@Given("User is on 'View Patient Test Reports'page")
	public void user_is_on_view_patient_test_reports_page() {
	    
		String expectedTitle = viewPatientsTestReports.getPageTitle();
		assertEquals(expectedTitle, "View Patient Test Reports", "Page title does not match");
	}

	@When("When user clicks on {string}")
	public void when_user_clicks_on(String viewPdf) {
	    
		viewPatientsTestReports.btnViewPDF.click();
		assertEquals("View PDF", viewPdf);
	}

	@Then("PDF is opened in proper readable format")
	public void pdf_is_opened_in_proper_readable_format() throws IOException {
	    
		viewPatientsTestReports.ReadPdf();
	}

	@Given("User has clicked view PDF button")
	public void user_has_clicked_view_pdf_button() {
		viewPatientsTestReports.btnViewPDF.click();
	}

	@When("User is on PDF")
	public void user_is_on_pdf() throws IOException {
		viewPatientsTestReports.ReadPdf();
	}

	@Then("PDF has patients details like {string}, {string}, {string}, {string}, {string}")
	public void pdf_has_patients_details_like(String  patient_ID, String name, String email, String address, String phone) throws IOException {
		String TestTxt = viewPatientsTestReports.ReadPdf();
		assertTrue(TestTxt .contains(patient_ID));
		assertTrue(TestTxt .contains(name));
		assertTrue(TestTxt .contains(email));
		assertTrue(TestTxt .contains(address));
		assertTrue(TestTxt .contains(phone));
	}

	@Then("PDF has doctor details like {string}, {string}, {string}, {string}, {string}")
	public void pdf_has_doctor_details_like(String docID, String DoctorName, String email, String clinicfacilityname, String specialization) throws IOException {
		
		String TestTxt = viewPatientsTestReports.ReadPdf();
		assertTrue(TestTxt .contains(docID));
		assertTrue(TestTxt .contains(DoctorName));
		assertTrue(TestTxt .contains(email));
		assertTrue(TestTxt .contains(clinicfacilityname));
		assertTrue(TestTxt .contains(specialization));
	}

	@Then("PDF shows list of conditions, {string}, {string}")
	public void pdf_shows_list_of_conditions(String preferences, String Comorbidites) throws IOException {
			String TestTxt = viewPatientsTestReports.ReadPdf();
			assertTrue(TestTxt .contains(preferences));
			assertTrue(TestTxt .contains(Comorbidites));
	}

	@Then("PDF shows diet menu for {int} days, any warning and {string} mentioned by doctor.")
	public void pdf_shows_diet_menu_for_days_any_warning_and_mentioned_by_doctor(Integer week, String comments) throws IOException {
		String TestTxt = viewPatientsTestReports.ReadPdf();
		
		assertTrue(TestTxt .contains(comments));
	}
}
