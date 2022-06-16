 package stepdefinitions;
 
import util.ExcelReader;
/*     */ import dietitianPages.SigninPage;
/*     */ import io.cucumber.java.en.Given;
/*     */ import io.cucumber.java.en.Then;
/*     */ import io.cucumber.java.en.When;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
/*     */ import org.junit.Assert;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import qa.factory.DriverFactory;
/*     */ 
/*     */ public class SignInPageStepdefinition {
/*  19 */   ExcelReader reader = new ExcelReader();
/*     */   
/*     */   WebDriver driver;
/*     */   
/*  23 */   SigninPage signInPage = new SigninPage();
/*     */   
/*  24 */   String url = "https://www.dietician.com/SignInPage/";
/*     */   
/*     */   @Given("User is on Dietecian Website")
/*     */   public void user_is_on_dietecian_website() {
/*  29 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User click on icon symbol on Sign In Page")
/*     */   public void user_click_on_icon_symbol_on_sign_in_page() {
/*  35 */     this.signInPage.SignInPageTitle();
/*     */   }
/*     */   
/*     */   @Then("User should see the title of the page as SignIn")
/*     */   public void user_should_see_the_title_of_the_page_as_sign_in() {
/*  41 */     String actualTitle = this.driver.getTitle();
/*  42 */     Assert.assertTrue(actualTitle.contains("Sign In"));
/*     */   }
/*     */   
/*     */   @Given("User is on Dietician website")
/*     */   public void user_is_on_dietician_website() {
/*  49 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User is on Sign In Page")
/*     */   public void user_is_on_sign_in_page1() {
/*  56 */     this.signInPage.MandatoryFieldsvisible();
/*     */   }
/*     */   
/*     */   @Then("User should see all mandatory flields")
/*     */   public void user_should_see_all_mandatory_flields() {
/*  64 */     Assert.assertTrue(this.signInPage.verifyingMandatoryFeilds());
/*  65 */     Assert.assertTrue(this.signInPage.alertMessage().contains("please fill MandatoryFeilds"));
/*     */   }
/*     */   
/*     */   @Given("User is on Dietician website Page")
/*     */   public void user_is_on_dietician_website_page() {
/*  71 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands on SignIn page")
/*     */   public void user_lands_on_sign_in_page() {
/*  76 */     this.signInPage.MandatoryFieldsvisible();
/*     */   }
/*     */   
/*     */   @Then("User should see a form with heading SignIn form to signIn using Username")
/*     */   public void user_should_see_a_form_with_heading_sign_in_form_to_sign_in_using_username() {
/*  82 */     String actualText = this.signInPage.headingText();
/*  83 */     Assert.assertTrue(actualText.contains("Sign In"));
/*     */   }
/*     */   
/*     */   @Given("User is on the Dietician website Page")
/*     */   public void user_is_on_the_dietician_website_page() {
/*  89 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands on the SignIn page")
/*     */   public void user_lands_on_the_sign_in_page() {
/*  97 */     this.signInPage.MandatoryFieldsvisible();
/*     */   }
/*     */   
/*     */   @Then("User should see a button with text SIGNIN in the Sign In form")
/*     */   public void user_should_see_a_button_with_text_signin_in_the_sign_in_form() {
/* 104 */     Assert.assertTrue(this.signInPage.ButtonVisible());
/*     */   }
/*     */   
/*     */   @Given("User is on SignIn Page")
/*     */   public void user_is_on_sign_in_page() {
/* 110 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks SignIn button in the SignIn form with all fields empty")
/*     */   public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty() {
/* 118 */     Assert.assertTrue(this.signInPage.EmptyFields());
/*     */   }
/*     */   
/*     */   @Then("User should get error message Please fill out the fields")
/*     */   public void user_should_get_error_message_please_fill_out_the_fields() {
/* 124 */     String errormesg = this.signInPage.alertMessage();
/* 125 */     Assert.assertTrue(errormesg.contains("please fill the empty fields"));
/*     */   }
/*     */   
/*     */   @Given("User is on the SignIn Page")
/*     */   public void user_is_on_the_sign_in_page() {
/* 130 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks SignIn button entering numeric values for Username fromSignInData and valid values for password from1")
/*     */   public void user_clicks_sign_in_button_entering_numeric_values_for_username_from_sign_in_data_and_valid_values_for_password_from1(int rownum, Object username) throws InvalidFormatException, IOException {
/* 137 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "SignInData");
/* 138 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 139 */     String password = (String)((Map)testdata.get(rownum)).get("password");
/* 140 */     this.signInPage.invalidsignIn(usernam, password);
/* 141 */     this.signInPage.clickSigninbutton();
/*     */   }
/*     */   
/*     */   @Then("User should get a message Invalid entry for first field")
/*     */   public void user_should_get_a_message_invalid_entry_for_first_field() {
/* 147 */     String errormesg = this.signInPage.alertMessage();
/* 148 */     Assert.assertTrue(errormesg.contains("Invalid Entry"));
/*     */   }
/*     */   
/*     */   @Given("User is in SignIn Page")
/*     */   public void user_is_in_sign_in_page() {
/* 154 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks SignIn button entering data from SignInDataand value from2")
/*     */   public void user_clicks_sign_in_button_entering_data_from_sign_in_dataand_value_from2(int rownum) throws InvalidFormatException, IOException {
/* 160 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelDAATA/exceldataDieticianhackthon.xlsx", "SignInData");
/* 161 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 162 */     String password = (String)((Map)testdata.get(rownum)).get("password");
/* 163 */     this.signInPage.invalidsignIn(usernam, password);
/* 164 */     this.signInPage.clickSigninbutton();
/*     */   }
/*     */   
/*     */   @Then("User should get a message Invalid entry for password field")
/*     */   public void user_should_get_a_message_invalid_entry_for_password_field() {
/* 170 */     String errormesg = this.signInPage.alertMessage();
/* 171 */     Assert.assertTrue(errormesg.contains("Invalid Password Entry"));
/*     */   }
/*     */   
/*     */   @Given("User is on SignIn Page form")
/*     */   public void user_is_on_sign_in_page_form() {
/* 177 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks SignIn button entering data from SignInDataand values from3")
/*     */   public void user_clicks_sign_in_button_entering_data_from_sign_in_dataand_values_from3(String username, String password, int rownum) throws InvalidFormatException, IOException {
/* 184 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelDAATA/exceldataDieticianhackthon.xlsx", "SignInData");
/* 185 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 186 */     String password1 = (String)((Map)testdata.get(rownum)).get("password");
/* 187 */     this.signInPage.invalidsignIn(usernam, password1);
/* 188 */     this.signInPage.clickSigninbutton();
/*     */   }
/*     */   
/*     */   @Then("User should get error message Invalid login credentials")
/*     */   public void user_should_get_error_message_invalid_login_credentials() {
/* 194 */     String errormesg = this.signInPage.alertMessage();
/* 195 */     Assert.assertTrue(errormesg.contains("Invalid login credentials"));
/*     */   }
/*     */   
/*     */   @Given("User is in  SignIn Page")
/*     */   public void user_is_in_sign_in_page1() {
/* 200 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks on Forgot Password button")
/*     */   public void user_clicks_on_forgot_password_button() {
/* 207 */     this.signInPage.clickforgotPassword();
/*     */   }
/*     */   
/*     */   @Then("User should be directed to  Reset password link")
/*     */   public void user_should_be_directed_to_reset_password_link() {
/* 214 */     Assert.assertTrue(this.signInPage.resetPwdlink());
/*     */   }
/*     */   
/*     */   @Given("User is on the SignIn form page")
/*     */   public void user_is_on_the_sign_in_form_page() {
/* 219 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks on not member yet button")
/*     */   public void user_clicks_on_not_member_yet_button() {
/* 226 */     this.signInPage.clickNotMembr();
/*     */   }
/*     */   
/*     */   @Then("User will land on Register Page")
/*     */   public void user_will_land_on_register_page() {
/* 231 */     Assert.assertFalse(this.signInPage.CheckRegisterPage(), false);
/*     */   }
/*     */   
/*     */   @Given("User is on the SignIn Page form")
/*     */   public void user_is_on_the_sign_in_page_form() {
/* 235 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks Sign In with data from SignInData and values from {int}")
/*     */   public void user_clicks_sign_in_with_data_from_sign_in_data_and_values_from(Integer int1, int rownum) throws InvalidFormatException, IOException {
/* 242 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelDAATA/exceldataDieticianhackthon.xlsx", "SignInData");
/* 243 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 244 */     String password = (String)((Map)testdata.get(rownum)).get("password");
/* 245 */     this.signInPage.invalidsignIn(usernam, password);
/* 246 */     this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "SignInData");
/* 247 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User logged in successfully")
/*     */   public void user_logged_in_successfully() {
/* 253 */     String message = this.signInPage.alertMessage();
/* 254 */     Assert.assertTrue(message.contains("logged in sucessfully"));
/*     */   }
/*     */   
/*     */   @Given("User is on the Dietician website page")
/*     */   public void user_is_on_the_dietician_website_page1() {
/* 258 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands on the SignIn page form")
/*     */   public void user_lands_on_the_sign_in_page_form() {
/* 264 */     this.signInPage.MandatoryFieldsvisible();
/*     */   }
/*     */   
/*     */   @Then("User should see a form with heading Log in with your email form to signIn using email")
/*     */   public void user_should_see_a_form_with_heading_log_in_with_your_email_form_to_sign_in_using_email() {
/* 271 */     String actualText = this.signInPage.LoginHeading();
/* 272 */     Assert.assertTrue(actualText.contains("Log In with your email"));
/*     */   }
/*     */   
/*     */   @Given("User is on  Dietician website page")
/*     */   public void user_is_on_dietician_website_page1() {
/* 278 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands in SignIn page")
/*     */   public void user_lands_in_sign_in_page() {
/* 285 */     this.signInPage.MandatoryFieldsvisible();
/*     */   }
/*     */   
/*     */   @Then("User should see a button with text Login in the SignIn form")
/*     */   public void user_should_see_a_button_with_text_login_in_the_sign_in_form() {
/* 292 */     Assert.assertTrue(this.signInPage.CheckLoginButton());
/*     */   }
/*     */   
/*     */   @Given("User lands in the SignIn Page")
/*     */   public void user_lands_in_the_sign_in_page() {
/* 297 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks LogIn button with all fields empty")
/*     */   public void user_clicks_log_in_button_with_all_fields_empty() {
/* 304 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User gets  error message Please fill out fields in textbox")
/*     */   public void user_gets_error_message_please_fill_out_fields_in_textbox() {
/* 310 */     String errormsg = this.signInPage.LoginHeading();
/* 311 */     Assert.assertTrue(errormsg.contains("Please fill out fields in textbox"));
/*     */   }
/*     */   
/*     */   @Given("User lands on the SignIn Page")
/*     */   public void user_lands_on_the_sign_in_page1() {
/* 317 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks LogIn button with values from LoginwithEmail and data from3")
/*     */   public void user_clicks_log_in_button_with_values_from_loginwith_email_and_data_from3(int rownum) throws InvalidFormatException, IOException {
/* 325 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelDAATA/exceldataDieticianhackthon.xlsx", "SignInData");
/* 326 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 327 */     String password = (String)((Map)testdata.get(rownum)).get("password");
/* 328 */     this.signInPage.invalidsignIn(usernam, password);
/* 329 */     this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "LoginwithEmail");
/* 330 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User should see message Please fill with valid email id")
/*     */   public void user_should_see_message_please_fill_with_valid_email_id() {
/* 336 */     String errormsg = this.signInPage.alertMessage();
/* 337 */     Assert.assertTrue(errormsg.contains("Please fil with valid email id"));
/*     */   }
/*     */   
/*     */   @Given("User is in SignInPage form")
/*     */   public void user_is_in_sign_in_page_form() {
/* 341 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks LogIn button with from LoginwithEmail and values from1")
/*     */   public void user_clicks_log_in_button_with_from_loginwith_email_and_values_from1(int rownum) throws InvalidFormatException, IOException {
/* 349 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelDAATA/exceldataDieticianhackthon.xlsx", "LoginwithEmail");
/* 350 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 351 */     String password = (String)((Map)testdata.get(rownum)).get("password");
/* 352 */     this.signInPage.invalidsignIn(usernam, password);
/* 353 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User gets a message Invalid Password Please try again")
/*     */   public void user_gets_a_message_invalid_password_please_try_again() {
/* 359 */     String errormsg = this.signInPage.alertMessage();
/* 360 */     Assert.assertTrue(errormsg.contains("Invalid please try again"));
/*     */   }
/*     */   
/*     */   @Given("User is in SignIn form Page")
/*     */   public void user_is_in_sign_in_form_page() {
/* 364 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks LogIn button with data from LoginwithEmail and {int}")
/*     */   public void user_clicks_log_in_button_with_data_from_loginwith_email_and(Integer int1, String username, String password) {
/* 371 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User gets a message Please fill the password")
/*     */   public void user_gets_a_message_please_fill_the_password() {
/* 380 */     String errormsg = this.signInPage.alertMessage();
/* 381 */     Assert.assertTrue(errormsg.contains("please fill the  password"));
/*     */   }
/*     */   
/*     */   @Given("User on SignIn Page")
/*     */   public void user_on_sign_in_page() {
/* 385 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks Log In with both invalid email and password from LoginwithEmail and {int}")
/*     */   public void user_clicks_log_in_with_both_invalid_email_and_password_from_loginwith_email_and(Integer int1, int rownum) throws InvalidFormatException, IOException {
/* 394 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelDAATA/exceldataDieticianhackthon.xlsx", "SignInData");
/* 395 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 396 */     String password = (String)((Map)testdata.get(rownum)).get("password");
/* 397 */     this.signInPage.invalidsignIn(usernam, password);
/* 398 */     this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "LoginwithEmail");
/* 399 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User gets error message message Invalid Login credentials")
/*     */   public void user_gets_error_message_message_invalid_login_credentials() {
/* 405 */     String errormsg = this.signInPage.alertMessage();
/* 406 */     Assert.assertTrue(errormsg.contains("invalid login credentials"));
/*     */   }
/*     */   
/*     */   @Given("User is on  the SignInPage")
/*     */   public void user_is_on_the_sign_in_page1() {
/* 410 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks LogIn with values from LoginwithEmail and {int}")
/*     */   public void user_clicks_log_in_with_values_from_loginwith_email_and(Integer int1, int rownum) throws InvalidFormatException, IOException {
/* 417 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelDAATA/exceldataDieticianhackthon.xlsx", "SignInData");
/* 418 */     String usernam = (String)((Map)testdata.get(rownum)).get("username");
/* 419 */     String password = (String)((Map)testdata.get(rownum)).get("password");
/* 420 */     this.signInPage.invalidsignIn(usernam, password);
/* 421 */     this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "LoginwithEmail");
/* 422 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User gets a message logged in successfully with signout button")
/*     */   public void user_gets_a_message_logged_in_successfully_with_signout_button() {
/* 427 */     String errormsg = this.signInPage.alertMessage();
/* 428 */     Assert.assertTrue(errormsg.contains("logged in successfully with signout button"));
/*     */   }
/*     */   
/*     */   @Given("User on the SignInPage")
/*     */   public void user_on_the_sign_in_page() {
/* 432 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks on ForgotPassword button")
/*     */   public void user_clicks_on_forgot_password_button1() {
/* 439 */     this.signInPage.clickforgotPassword();
/*     */   }
/*     */   
/*     */   @Then("User is redirected to reset password link")
/*     */   public void user_is_redirected_to_reset_password_link() {
/* 443 */     Assert.assertTrue(this.signInPage.resetPwdlink());
/*     */   }
/*     */   
/*     */   @Given("User on SignInPage")
/*     */   public void user_on_sign_in_page1() {
/* 448 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks Facebook button to login")
/*     */   public void user_clicks_facebook_button_to_login() {
/* 453 */     this.signInPage.clickLogin();
/*     */   }
/*     */   
/*     */   @Then("User is redirected to Facebook login Page")
/*     */   public void user_is_redirected_to_facebook_login_page() {
/* 458 */     Assert.assertEquals("Facebook login page", Boolean.valueOf(this.signInPage.checkFbPage()));
/*     */   }
/*     */   
/*     */   @Given("User is on SignInPage form")
/*     */   public void user_is_on_sign_in_page_form1() {
/* 463 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks Googlebutton to login")
/*     */   public void user_clicks_googlebutton_to_login() {
/* 470 */     this.signInPage.clickgglLogin();
/*     */   }
/*     */   
/*     */   @Then("User is redirected to Google logIn page")
/*     */   public void user_is_redirected_to_google_log_in_page() {
/* 476 */     Assert.assertEquals("google login page", Boolean.valueOf(this.signInPage.checkGgleButton()));
/*     */   }
/*     */   
/*     */   @Given("User on the SignInPage form")
/*     */   public void user_on_the_sign_in_page_form() {
/* 481 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks sign up link")
/*     */   public void user_clicks_sign_up_link() {
/* 487 */     this.signInPage.clickSignup();
/*     */   }
/*     */   
/*     */   @Then("User is redirected to Register Page")
/*     */   public void user_is_redirected_to_register_page() {
/* 492 */     Assert.assertEquals("Register page", this.signInPage.checkRegPage());
/*     */   }
/*     */ }


/* Location:              D:\DieticianProject_Lakshmi\stepdefinitions.jar!\stepdefinitions\SignInPageStepdefinition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */