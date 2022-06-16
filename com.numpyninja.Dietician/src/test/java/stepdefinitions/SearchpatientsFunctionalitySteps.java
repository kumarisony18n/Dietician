package stepdefinitions;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.*;
import pageObjects.MyPatients;
import qa.factory.DriverFactory;


public class SearchpatientsFunctionalitySteps {
 
	private MyPatients myPatients = new MyPatients(DriverFactory.getDriver());
	boolean  datastatus = false;
	
	@When("User clicks on search with name as {string}  into name filter box.")
	public void user_clicks_on_search_with_name_as_into_name_filter_box(String name) {
	    myPatients.txtName.clear();
		myPatients.txtName.sendKeys(name);
	}

	@Then("Related records for name are shown.")
	public void related_records_for_name_are_shown() {
		
		
		String name = myPatients.txtName.getText();
		assertNotNull(name,"Name can't be empty");
		
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if(value.contains(name)) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Name is not present", datastatus);
	}

	@When("User clicks on search with email as {string} into email address filter.")
	public void user_clicks_on_search_with_email_as_into_email_address_filter(String email) {
	    
		myPatients.txtEmail.clear();
		myPatients.txtEmail.sendKeys(email);
	}

	@Then("Records for email address are shown.")
	public void records_for_email_address_are_shown() {
	    
		  
		String email = myPatients.txtEmail.getText();
		assertNotNull(email,"Email can't be empty");
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if(value.contains(email)) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Email is not present", datastatus);
		
	}

	@When("User clicks on search with phone as {string} into phone number filter.")
	public void user_clicks_on_search_with_phone_as_into_phone_number_filter(String phone) {
	    
		myPatients.txtPhone.clear();
		myPatients.txtPhone.sendKeys(phone);
	}

	@Then("Records for phone are shown.")
	public void records_for_phone_are_shown() {
	    
		String phone = myPatients.txtPhone.getText();
		assertNotNull(phone,"Phone can't be empty");
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if(value.contains(phone)) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Phone is not present", datastatus);
	}

	@When("User clicks on search button with name as {string} into name filter box, phone as {string} into phone number filter")
	public void user_clicks_on_search_button_with_name_as_into_name_filter_box_phone_as_into_phone_number_filter(String name, String phone) {
	    
		myPatients.txtName.clear();
		myPatients.txtName.sendKeys(name);
		myPatients.txtPhone.clear();
		myPatients.txtPhone.sendKeys(phone);
	}

	@Then("Records for name and phone are shown.")
	public void records_for_name_and_phone_are_shown() {
	    
		String name = myPatients.txtName.getText();
		String phone = myPatients.txtPhone.getText();
		assertNotNull(name,"Name can't be empty");
		assertNotNull(phone,"Phone can't be empty");
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if((value.contains(phone) && (value.contains(name)))) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Phone is not present", datastatus);
		assertTrue("Name is not present", datastatus);
		
	}

	@When("User clicks on search button with name as {string} into name filter box, email as {string} into email address filter box")
	public void user_clicks_on_search_button_with_name_as_into_name_filter_box_email_as_into_email_address_filter_box(String name, String email) {
	    
		myPatients.txtName.clear();
		myPatients.txtName.sendKeys(name);
		myPatients.txtEmail.clear();
		myPatients.txtEmail.sendKeys(email);
	}

	@Then("Records for name and email are shown.")
	public void records_for_name_and_email_are_shown() {
	    
		String name = myPatients.txtName.getText();
		String email = myPatients.txtEmail.getText();
		assertNotNull(name,"Name can't be empty");
		assertNotNull(email,"Email can't be empty");
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if((value.contains(name) && (value.contains(email)))) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Name is not present", datastatus);
		assertTrue("Email is not present", datastatus);
		
		
	}

	@When("User clicks on search button with phone as {string} into phone number filter box, email as {string} into email address filter box")
	public void user_clicks_on_search_button_with_phone_as_into_phone_number_filter_box_email_as_into_email_address_filter_box(String phone, String email) {
	    
		myPatients.txtPhone.clear();
		myPatients.txtPhone.sendKeys(phone);
		myPatients.txtEmail.clear();
		myPatients.txtEmail.sendKeys(email);
	}

	@Then("Records for phone and email are shown.")
	public void records_for_phone_and_email_are_shown() {
	    
		String phone = myPatients.txtPhone.getText();
		String email = myPatients.txtEmail.getText();
		assertNotNull(phone,"Phone can't be empty");
		assertNotNull(email,"Email can't be empty");
		for(WebElement ele: myPatients.allData) {
			String value = ele.getText();
			if((value.contains(phone) && (value.contains(email)))) {
				datastatus = true;
				break;
			}
		}
		assertTrue("Phone is not present", datastatus);
		assertTrue("Email is not present", datastatus);
		
	}

}
