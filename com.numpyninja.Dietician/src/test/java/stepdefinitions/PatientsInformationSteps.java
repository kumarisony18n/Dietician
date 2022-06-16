package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import pageObjects.ConfirmHealtConditionsandGenerateNewDietPlan;
import pageObjects.MyPatients;
import qa.factory.DriverFactory;

public class PatientsInformationSteps {
	

	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	boolean  datastatus = false;
	
	@Given("User has clicked {string}")
	public void user_has_clicked(String string) {
	    myPatients.searchBtnClick();
	}


	@When("Patients records are being displayed")
	public void patients_records_are_being_displayed() {
	    myPatients.getAllValuesofPatientTable();
	   
	}

	@Then("Customer Id is shown in column {string} column")
	public void customer_id_is_shown_in_column_column(String cust_id) {
		
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if(value.contains(cust_id)) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Cust ID is not present", datastatus);
	}

	@Then("Patient name is displayed in {string} column")
	public void patient_name_is_displayed_in_column(String name) {
	    
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if(value.contains(name)) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Name is not present", datastatus);
	}

	@Then("Details column shows patient {string} or {string} or {string}")
	public void details_column_shows_patient_or_or(String email, String phone, String address) {
	    
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if(value.contains(email) || value.contains(phone)|| value.contains(address)) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Details are not present", datastatus);
	}


	@Then("Last visit date is shown in valid date format")
	public void last_visit_date_is_shown_in_valid_date_format() {
	    
		Boolean isValidLastVisitDate = myPatients.isValidDateFormat();
		assertTrue("Last Visit Date is in invalid format", isValidLastVisitDate);
	}

	@Then("Verify that email address is in valid format in details cloumn.")
	public void verify_that_email_address_is_in_valid_format_in_details_cloumn() {
	    
		
		Boolean isValidEmail = myPatients.isValidEmail();
		assertTrue("Email is in invalid format", isValidEmail);
	}

	@When("User clicks on button {string} to view previous diet plans")
	public void user_clicks_on_button_to_view_previous_diet_plans(String viewPreviousDietPlans) {
	    
	    myPatients.btnViewPreviousDietPlansClick(viewPreviousDietPlans);
	   
	}

	@Then("It redirects user to {string} page")
	public void it_redirects_user_to_page(String generatedDietPlans) {
	    
		myPatients.redirectToGeneratedDietPlans();
	}

	@When("User clicks on button {string} to create new report")
	public void user_clicks_on_button_to_create_new_report(String createNewReport) {
	    
		 myPatients.btnViewPreviousDietPlansClick(createNewReport);
		   
	}

	@When("User clicks on button {string} to view previous test reports")
	public void user_clicks_on_button_to_view_previous_test_reports(String viewPreviousTestReportsClick) {
	   
		myPatients.btnViewPreviousTestReportsClick(viewPreviousTestReportsClick);
	}
}
