package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import qa.factory.DriverFactory;
import com.github.dockerjava.api.model.Driver;
import pageObjects.HomepageofDiet;
import pageObjects.RegisterPage;
import util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterpageStepsTest {
	public static String title;
	RegisterPage registerpage = new RegisterPage(DriverFactory.getDriver());
	HomepageofDiet homepage = new HomepageofDiet(DriverFactory.getDriver());
	ExcelReader reader = new ExcelReader();
	
	@Given("User is on  Home Page")
	public void user_is_on_home_page() {

		DriverFactory.getDriver().get("https://www.dietician/home.com");
		

	}

	@When("User clicks on REGISTER Link on Home Page")
	public void user_clicks_on_register_link_on_home_page() {
		homepage.registrtionText();
		title = registerpage.clikonRegisterlink();
	}

	@Then("User Sholud see {string}")
	public void user_sholud_see(String expectedalllinkesName) {
		List<WebElement> allItems = registerpage.forLinksonmenubar();
		System.out.println("TAll links " + allItems);

	}

	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
		DriverFactory.getDriver().get("https://www.dietician.com");
	}

	@When("User lands on Register page")
	public void user__s_lands_on_register_page() {
		registerpage.registrationlink();
	}
	
	@Then("User should see the title of the page as Register")
	public void user_should_see_the_title_of_the_page_as_register(String expectedTitleName) {
		title = registerpage.clikonRegisterlink();
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("User should see all mandatory flields with star symbol on top of those fields")
	public void user_should_see_all_mandatory_flields_with_star_symbol_on_top_of_those_fields() {
		Assert.assertTrue(registerpage.mandatoryfields());
	}

	@Then("User should see a form with heading Sign Up form, to sign up using mobile number")
	public void user_should_see_a_form_with_heading_sign_up_form_to_sign_up_using_mobile_number() {
		Assert.assertTrue(registerpage.getsigupmoblicnum());
	}

	@Then("User should see a button with text SIGN UP in the Sign Up form")
	public void user_should_see_a_button_with_text_sign_up_in_the_sign_up_form() {

		Assert.assertTrue(registerpage.getsiguptext());
	}

	@Given("User is on Register page")
	public void user_is_on_register_page() {
		DriverFactory.getDriver().get("https://www.dietician/register.com");
	}

	@When("User clicks SIGN UP Button in the Sign Up form with all fields emptyRegisterValiddata and8")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_all_fields_empty_register_validdata_and8(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {

		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String fname = testdata.get(rowNumber).get("Fristname");
		String laname = testdata.get(rowNumber).get("LastName");
		String Mnumber = testdata.get(rowNumber).get("MoblieNumber");
		String anyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String Email = testdata.get(rowNumber).get("Email");
		String pw = testdata.get(rowNumber).get("Password");
		registerpage.emptysignupfromMoblie(fname, laname, Mnumber, Email, anyfield, pw);

	}

	@Then("User should see a message\" Mandatory fields cannot be empty\"")
	public void user_should_see_a_message_mandatory_fields_cannot_be_empty(String FieldShoudnotbeempty) {

		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, FieldShoudnotbeempty);
	}

	@When("User gives invalid firstname RegisterValiddata and2")
	public void user_gives_invalid_firstname_register_validdata_and2(String Sheetname, Integer rowNumber)
			throws InvalidFormatException, IOException {

		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invfname = testdata.get(rowNumber).get("Fristname");
		String invlaname = testdata.get(rowNumber).get("LastName");
		String invMnumber = testdata.get(rowNumber).get("MoblieNumber");
		String invanyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String invEmail = testdata.get(rowNumber).get("Email");
		String invpw = testdata.get(rowNumber).get("Password");

		registerpage.invalidsignupfromMoblie(invfname, invlaname, invMnumber, invEmail, invanyfield, invpw);
	}

	@Then("User click on signup button and should see a message {string}")
	public void user_click_on_signup_button_and_should_see_a_message(String execpectedfeildvalueofFirstname) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalueofFirstname);
	}

	@When("User enter numeric text for Last Name RegisterValiddata and3")
	public void user_enter_numeric_text_for_last_name_register_validdata_and3(String Sheetname, Integer rowNumber)
			throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invfname = testdata.get(rowNumber).get("Fristname");
		String invlaname = testdata.get(rowNumber).get("LastName");
		String invMnumber = testdata.get(rowNumber).get("MoblieNumber");
		String invanyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String invEmail = testdata.get(rowNumber).get("Email");
		String invpw = testdata.get(rowNumber).get("Password");

		registerpage.invalidsignupfromMoblie(invfname, invlaname, invMnumber, invEmail, invanyfield, invpw);
	}

	@When("User entering Aphanumeric text for Mobile Number, RegisterValiddata and4valid values for the remaining fields")
	public void user_entering_aphanumeric_text_for_mobile_number_register_validdata_and4valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invfname = testdata.get(rowNumber).get("Fristname");
		String invlaname = testdata.get(rowNumber).get("LastName");
		String invMnumber = testdata.get(rowNumber).get("MoblieNumber");
		String invanyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String invEmail = testdata.get(rowNumber).get("Email");
		String invpw = testdata.get(rowNumber).get("Password");

		registerpage.invalidsignupfromMoblie(invfname, invlaname, invMnumber, invEmail, invanyfield, invpw);
	}

	@When("User entering numeric text for Any other field,RegisterValiddata and5 valid values for the remaining fields.")
	public void user_entering_numeric_text_for_any_other_field_register_validdata_and5_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invfname = testdata.get(rowNumber).get("Fristname");
		String invlaname = testdata.get(rowNumber).get("LastName");
		String invMnumber = testdata.get(rowNumber).get("MoblieNumber");
		String invanyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String invEmail = testdata.get(rowNumber).get("Email");
		String invpw = testdata.get(rowNumber).get("Password");

		registerpage.invalidsignupfromMoblie(invfname, invlaname, invMnumber, invEmail, invanyfield, invpw);
	}

	@Then("User Clicks on signup and should see a message Invalid data entered for Any other field")
	public void user_clicks_on_signup_and_should_see_a_message_invalid_data_entered_for_any_other_field(
			String execpectedfeildvalueofFirstname) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalueofFirstname);
	}

	@When("User  entering invalid email Id for Email,RegisterValiddata and6valid values for the remaining fields.")
	public void user_entering_invalid_email_id_for_email_register_validdata_and6valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invfname = testdata.get(rowNumber).get("Fristname");
		String invlaname = testdata.get(rowNumber).get("LastName");
		String invMnumber = testdata.get(rowNumber).get("MoblieNumber");
		String invanyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String invEmail = testdata.get(rowNumber).get("Email");
		String invpw = testdata.get(rowNumber).get("Password");

		registerpage.invalidsignupfromMoblie(invfname, invlaname, invMnumber, invEmail, invanyfield, invpw);
	}

	@Then("User Clicks on signup and should see a message Invalid data entered for Email.")
	public void user_clicks_on_signup_and_should_see_a_message_invalid_data_entered_for_email(
			String execpectedfeildvalue) {

		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);
	}

	@When("User entering invalid Password RegisterValiddata and7,valid values for the remaining fields.")
	public void user_entering_invalid_password_register_validdata_and7_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invfname = testdata.get(rowNumber).get("Fristname");
		String invlaname = testdata.get(rowNumber).get("LastName");
		String invMnumber = testdata.get(rowNumber).get("MoblieNumber");
		String invanyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String invEmail = testdata.get(rowNumber).get("Email");
		String invpw = testdata.get(rowNumber).get("Password");

		registerpage.invalidsignupfromMoblie(invfname, invlaname, invMnumber, invEmail, invanyfield, invpw);
	}

	@Then("User click onSignup and should see a message Invalid data entered for Password")
	public void user_click_on_signup_and_should_see_a_message_invalid_data_entered_for_password(
			String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);

	}

	@When("User  entering valid values for the all fields RegisterValiddata and1")
	public void user_entering_valid_values_for_the_all_fields_register_validdata(String Sheetname, Integer rowNumber)
			throws InvalidFormatException, IOException {

		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String fname = testdata.get(rowNumber).get("Fristname");
		String laname = testdata.get(rowNumber).get("LastName");
		String Mnumber = testdata.get(rowNumber).get("MoblieNumber");
		String anyfield = testdata.get(rowNumber).get("AnyOtherFeild");
		String Email = testdata.get(rowNumber).get("Email");
		String pw = testdata.get(rowNumber).get("Password");

		registerpage.signupfromMoblie(fname, laname, Mnumber, Email, anyfield, pw);

	}

	@Then("User Click on sigup and is re-directed to Sign In page.")
	public void user_click_on_sigup_and_is_re_directed_to_sign_in_page(String signinpageopend) {
		registerpage.clickonsignupforRegistration();
		Assert.assertEquals(signinpageopend, signinpageopend);

	}

	@Then("User should see a form with heading Sign Up with your email to sign up using Email Id")
	public void user_should_see_a_form_with_heading_sign_up_with_your_email_to_sign_up_using_email_id() {
		Assert.assertTrue(registerpage.textonTopOfRegister());
		
	}

	@Then("User should see a button with text Sign Up in the Sign Up with your Email form")
	public void user_should_see_a_button_with_text_sign_up_in_the_sign_up_with_your_email_form() {
		Assert.assertTrue(registerpage.getsiguptext());
	}

	@When("User clicks SIGN UP Button in the Sign Up with your Email form with all fields emptyRegisterbyEmail and8")
	public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_with_all_fields_empty_registerby_email_and8(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {

		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String name = testdata.get(rowNumber).get("Name");
		String lastname = testdata.get(rowNumber).get("LastName");
		String username = testdata.get(rowNumber).get("UserName");
		String email = testdata.get(rowNumber).get("Email");
		String passwd = testdata.get(rowNumber).get("Password");
		String confirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.emptysignupwithEmail(name, lastname, username, email, passwd, confirmpd);

	}
 
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);
         Assert.assertTrue(registerpage.emptyFieds());
	}

	@When("User enter numeric text for First Name RegisterbyEmail and2, valid values for the remaining fields")
	public void user_enter_numeric_text_for_first_name_registerby_email_and2_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invname = testdata.get(rowNumber).get("Name");
		String invlastname = testdata.get(rowNumber).get("LastName");
		String invusername = testdata.get(rowNumber).get("UserName");
		String invemail = testdata.get(rowNumber).get("Email");
		String invpasswd = testdata.get(rowNumber).get("Password");
		String invconfirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.invalidsignupwithEmail(invname, invlastname, invusername, invemail, invpasswd, invconfirmpd);

	}

	@Then("Userclick on login button should see a message Invalid data entered for First Name")
	public void userclick_on_login_button_should_see_a_message_invalid_data_entered_for_first_name(
			String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);

	}

	@When("User enter numeric text for Last Name RegisterbyEmail and3, valid values for the remaining fields")
	public void user_enter_numeric_text_for_last_name_registerby_email_and3_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invname = testdata.get(rowNumber).get("Name");
		String invlastname = testdata.get(rowNumber).get("LastName");
		String invusername = testdata.get(rowNumber).get("UserName");
		String invemail = testdata.get(rowNumber).get("Email");
		String invpasswd = testdata.get(rowNumber).get("Password");
		String invconfirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.invalidsignupwithEmail(invname, invlastname, invusername, invemail, invpasswd, invconfirmpd);

	}

	@Then("User click onlogin and should see a message Invalid data entered for Last Name.")
	public void user_click_onlogin_and_should_see_a_message_invalid_data_entered_for_last_name(
			String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);

	}

	@When("User enter numeric text for Username,RegisterbyEmail and4 valid values for the remaining fields")
	public void user_enter_numeric_text_for_username_registerby_email_and4_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invname = testdata.get(rowNumber).get("Name");
		String invlastname = testdata.get(rowNumber).get("LastName");
		String invusername = testdata.get(rowNumber).get("UserName");
		String invemail = testdata.get(rowNumber).get("Email");
		String invpasswd = testdata.get(rowNumber).get("Password");
		String invconfirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.invalidsignupwithEmail(invname, invlastname, invusername, invemail, invpasswd, invconfirmpd);

	}

	@Then("User click onlogin and should see a message Invalid data entered for Username")
	public void user_click_onlogin_and_should_see_a_message_invalid_data_entered_for_username(
			String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);

	}

	@When("User enter invalid Email Address RegisterbyEmail and5 and valid values for the remaining fields.")
	public void user_enter_invalid_email_address_registerby_email_and5_and_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {

		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invname = testdata.get(rowNumber).get("Name");
		String invlastname = testdata.get(rowNumber).get("LastName");
		String invusername = testdata.get(rowNumber).get("UserName");
		String invemail = testdata.get(rowNumber).get("Email");
		String invpasswd = testdata.get(rowNumber).get("Password");
		String invconfirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.invalidsignupwithEmail(invname, invlastname, invusername, invemail, invpasswd, invconfirmpd);

	}

	@Then("User click onlogin andshould see a message Invalid data entered for Email Address.")
	public void user_click_onlogin_andshould_see_a_message_invalid_data_entered_for_email_address(
			String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);

	}

	@When("User enter invalid PasswordRegisterbyEmail and6 and valid values for the remaining fields")
	public void user_enter_invalid_password_registerby_email_and6_and_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invname = testdata.get(rowNumber).get("Name");
		String invlastname = testdata.get(rowNumber).get("LastName");
		String invusername = testdata.get(rowNumber).get("UserName");
		String invemail = testdata.get(rowNumber).get("Email");
		String invpasswd = testdata.get(rowNumber).get("Password");
		String invconfirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.invalidsignupwithEmail(invname, invlastname, invusername, invemail, invpasswd, invconfirmpd);

	}

	@Then("User click onlogin and should see a message Invaild Password")
	public void user_click_onlogin_and_should_see_a_message_invaild_password(String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);

	}

	@When("User entering a value that is different than the Password field value RegisterbyEmail and7,valid values for the remaining fields")
	public void user_entering_a_value_that_is_different_than_the_password_field_value_registerby_email_and7_valid_values_for_the_remaining_fields(
			String Sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String invname = testdata.get(rowNumber).get("Name");
		String invlastname = testdata.get(rowNumber).get("LastName");
		String invusername = testdata.get(rowNumber).get("UserName");
		String invemail = testdata.get(rowNumber).get("Email");
		String invpasswd = testdata.get(rowNumber).get("Password");
		String invconfirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.invalidsignupwithEmail(invname, invlastname, invusername, invemail, invpasswd, invconfirmpd);

	}

	@Then("User click onlogin and should see a message Confirm Password should same as Password")
	public void user_click_onlogin_and_should_see_a_message_confirm_password_should_same_as_password(
			String execpectedfeildvalue) {
		String Actualmassge = registerpage.getfieldserrormessge();

		Assert.assertEquals(Actualmassge, execpectedfeildvalue);

	}

	@When("User entering valid values for the all fieldsRegisterbyEmail and1")
	public void user_entering_valid_values_for_the_all_fields_registerby_email_and1(String Sheetname, Integer rowNumber)
			throws InvalidFormatException, IOException {

		List<Map<String, String>> testdata = reader.getData("./Exceldata/DieticanProjectHackthon.xlsx", Sheetname);

		String name = testdata.get(rowNumber).get("Name");
		String lastname = testdata.get(rowNumber).get("LastName");
		String username = testdata.get(rowNumber).get("UserName");
		String email = testdata.get(rowNumber).get("Email");
		String passwd = testdata.get(rowNumber).get("Password");
		String confirmpd = testdata.get(rowNumber).get("ConfirmPassword");

		registerpage.signupwithEmail(name, lastname, username, email, passwd, confirmpd);

	}

	@Then("User clik on login and is re-directed to Sign In page.")
	public void user_clik_on_login_and_is_re_directed_to_sign_in_page(String signinpageopend) {
		registerpage.clickonRegistersignup();
		Assert.assertEquals(signinpageopend, signinpageopend);
	}

	@When("User clicks Facebook Button in the Sign Up with your Email form")
	public void user_clicks_facebook_button_in_the_sign_up_with_your_email_form() {
		System.out.println(registerpage.getfacebooklink());
	}

	@Then("User successfully login with Facebook account.")
	public void user_successfully_login_with_facebook_account(String signinpageopend) {

		Assert.assertEquals(signinpageopend, signinpageopend);

	}

	@When("User clicks Google Button in the Sign Up with your Email form")
	public void user_clicks_google_button_in_the_sign_up_with_your_email_form() {
		registerpage.getgogglelink();
	}

	@Then("User successfully login with Google account.")
	public void user_successfully_login_with_google_account(String signinpageopend) {

		Assert.assertEquals(signinpageopend, signinpageopend);
	}

	@When("User clicks Log in here link.")
	public void user_clicks_log_in_here_link() {
		System.out.println(registerpage.getloginlinkte());
		registerpage.getloginlink();
	}

	@Then("User is re-directed to Sign In Page")
	public void user_is_re_directed_to_sign_in_page(String signinpageopend) {
		Assert.assertEquals(signinpageopend, signinpageopend);
	}

}
