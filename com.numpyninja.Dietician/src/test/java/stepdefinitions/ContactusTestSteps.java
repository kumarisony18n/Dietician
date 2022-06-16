package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import qa.factory.DriverFactory;
import pageObjects.ContactUsPage;
import util.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContactusTestSteps {
	public static String title;
	
	ContactUsPage contactpage = new ContactUsPage(DriverFactory.getDriver());
	 ExcelReader reader = new ExcelReader();
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		DriverFactory.getDriver().get("https://www.dietician/home.com");
}

	@When("User clicks on  ContactUs link")
	public void user_clicks_on_contact_us_link() {
		contactpage.clickoncontacuslink();
		 
	}

	@Then("User is directed to ContactUsPage")
	public void user_is_directed_to_contact_us_page(String expectedTitleName) {
		String title = contactpage.getcontacttitle();
	   Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Given("User is on ContactUsPage")
	public void user_is_on_contact_us_page() {
		DriverFactory.getDriver().get("https://www.dietician/home/contactus/.com");
	}

	@When("User enters all valid values in fields and click submit button contactusdata and 1")
	public void user_enters_all_valid_values_in_fields_and_click_submit_button_contactusdata_and_1(String Sheetname, Integer rowNumber ) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
	    List<Map<String,String >> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);
	    //method parameters                        Excelsheet column headings
	    String Firstname = testdata.get(rowNumber).get("Fristname");
	    String LastName = testdata.get(rowNumber).get("LastName");
	    String Email = testdata.get(rowNumber).get("Email");
	    String Subject = testdata.get(rowNumber).get("Subject");
	    String mesgcomments = testdata.get(rowNumber).get("WriteYourMassageHere");
	    
	    contactpage.callallcontacts(Firstname, LastName, Email, Subject, mesgcomments);
	    
	 }

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expectedSuccecMesg) {
		String actualmassge = contactpage.getSuccesmsg();
	   Assert.assertEquals(actualmassge, expectedSuccecMesg);
	}

	@When("User enters first name with some numeric valuescontactusdataand2 and other fields with valid values and clicks submit button")
	public void user_enters_first_name_with_some_numeric_valuescontactusdataand2_and_other_fields_with_valid_values_and_clicks_submit_button(String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		
		    List<Map<String,String >> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);
		   
		    String invFirstname = testdata.get(rowNumber).get("Fristname");
		    String invLastName = testdata.get(rowNumber).get("LastName");
		    String invEmail = testdata.get(rowNumber).get("Email");
		    String invSubject = testdata.get(rowNumber).get("Subject");
		    String invmesgcomments = testdata.get(rowNumber).get("WriteYourMassageHere");
		    
		    contactpage.validateallcontacts(invFirstname, invLastName, invEmail, invSubject, invmesgcomments);
	}

	@When("User enters LastName field with some numeric valuescontactusdataand3 and other fields with valid values and click submit button")
	public void user_enters_last_name_field_with_some_numeric_valuescontactusdataand3_and_other_fields_with_valid_values_and_click_submit_button(String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		 List<Map<String,String >> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);
		   
		    String invFirstname = testdata.get(rowNumber).get("Fristname");
		    String invLastName = testdata.get(rowNumber).get("LastName");
		    String invEmail = testdata.get(rowNumber).get("Email");
		    String invSubject = testdata.get(rowNumber).get("Subject");
		    String invmesgcomments = testdata.get(rowNumber).get("WriteYourMassageHere");
		    
		    contactpage.validateallcontacts(invFirstname, invLastName, invEmail, invSubject, invmesgcomments);
	}

	@When("User enters Email with some image values and other fields with valid values and click submit buttoncontactusdataand4")
	public void user_enters_email_with_some_image_values_and_other_fields_with_valid_values_and_click_submit_buttoncontactusdataand4(String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		 List<Map<String,String >> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);
		   
		    String invFirstname = testdata.get(rowNumber).get("Fristname");
		    String invLastName = testdata.get(rowNumber).get("LastName");
		    String invEmail = testdata.get(rowNumber).get("Email");
		    String invSubject = testdata.get(rowNumber).get("Subject");
		    String invmesgcomments = testdata.get(rowNumber).get("WriteYourMassageHere");
		    
		    contactpage.validateallcontacts(invFirstname, invLastName, invEmail, invSubject, invmesgcomments);
	}

	@When("User enters Subject with some numeric values and other fields with valid values and  click submit buttoncontactusdataand5")
	public void user_enters_subject_with_some_numeric_values_and_other_fields_with_valid_values_and_click_submit_buttoncontactusdataand5(String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		 List<Map<String,String >> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);
		   
		    String invFirstname = testdata.get(rowNumber).get("Fristname");
		    String invLastName = testdata.get(rowNumber).get("LastName");
		    String invEmail = testdata.get(rowNumber).get("Email");
		    String invSubject = testdata.get(rowNumber).get("Subject");
		    String invmesgcomments = testdata.get(rowNumber).get("WriteYourMassageHere");
		    
		    contactpage.validateallcontacts(invFirstname, invLastName, invEmail, invSubject, invmesgcomments);
	}

	@When("User enters Write your Message Here with some numeric values and other fields with valid values and clicks submit buttoncontactusdataand6")
	public void user_enters_write_your_message_here_with_some_numeric_values_and_other_fields_with_valid_values_and_clicks_submit_buttoncontactusdataand6(String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		 List<Map<String,String >> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);
		   
		    String invFirstname = testdata.get(rowNumber).get("Fristname");
		    String invLastName = testdata.get(rowNumber).get("LastName");
		    String invEmail = testdata.get(rowNumber).get("Email");
		    String invSubject = testdata.get(rowNumber).get("Subject");
		    String invmesgcomments = testdata.get(rowNumber).get("WriteYourMassageHere");
		    
		    contactpage.validateallcontacts(invFirstname, invLastName, invEmail, invSubject, invmesgcomments);
	}
//Empty fieldvalues
	@When("User enters submit button with all fields emptycontactusdataand7")
	public void user_enters_submit_button_with_all_fields_emptycontactusdataand7(String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		 List<Map<String,String >> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);
		   
		    String Firstname = testdata.get(rowNumber).get("Fristname");
		    String LastName = testdata.get(rowNumber).get("LastName");
		    String Email = testdata.get(rowNumber).get("Email");
		    String Subject = testdata.get(rowNumber).get("Subject");
		    String mesgcomments = testdata.get(rowNumber).get("WriteYourMassageHere");
		    
		    contactpage.validateallcontacts(Firstname, LastName, Email, Subject, mesgcomments);
	}

	@Then("User should get a message Please fill all fields above")
	public void user_should_get_a_message_please_fill_all_fields_above(String expectedSuccecMesg) {
		String actualmassge = contactpage.GetErrormsg();
		   Assert.assertEquals(actualmassge, expectedSuccecMesg);
		   
		   Assert.assertTrue(contactpage.emptyFieds());
	}


}
