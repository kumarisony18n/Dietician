package stepdefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObjects.MyPatients;
import qa.factory.DriverFactory;

public class FetchPatientsWithInvalidDataSteps {
	
	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	
	@Given("User is on my patients page")
	public void user_is_on_my_patients_page() {
	    
		String title = myPatients.getpageTitle();
		assertTrue(title.contains("My Patients"));
	}

	@When("User types in invalid input as {string} in phone number field")
	public void user_types_in_invalid_input_as_in_phone_number_field(String invalidPhone) {
	   
		myPatients.txtPhone.sendKeys(invalidPhone);
	}
	
	@Then("It must throw error message for invalid phone and discontinue search action.")
	public void it_must_throw_error_message_for_invalid_phone_and_discontinue_search_action() {
	    
		Boolean isValidPhone = myPatients.isValidPhone();
		assertTrue("Invalid Phone number", isValidPhone);
		
	}

	@When("User types in anything other valid character as {string} in email address field")
	public void user_types_in_anything_other_valid_character_as_in_email_address_field(String invalidEmail) {
	   
		myPatients.txtEmail.sendKeys(invalidEmail);
	}
	
	@Then("It must throw error message for invalid email and discontinue search action.")
	public void it_must_throw_error_message_for_invalid_email_and_discontinue_search_action() {
	    
		Boolean isValidEmail = myPatients.isValidEmail();
		assertTrue("Invalid Email", isValidEmail);
	}
	
	@When("User types in anything other alphabets {string} in name field")
	public void user_types_in_anything_other_alphabets_in_name_field(String invalidName) {
	   
		myPatients.txtName.sendKeys(invalidName);
	}
	
	@Then("It must throw error message for invalid name and discontinue search action.")
	public void it_must_throw_error_message_for_invalid_name_and_discontinue_search_action() {
		Boolean isValidName = myPatients.isValidName();
		assertTrue("Invalid Name", isValidName);
	}
}
