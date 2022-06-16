/*     */ package stepdefinitions;
/*     */ 
/*     */ import util.ExcelReader;
/*     */ import dietitianPages.AddNewPatientPage;
/*     */ import io.cucumber.java.PendingException;
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
/*     */ public class AddNewPatientStepDef {
/*  20 */   ExcelReader reader = new ExcelReader();
/*     */   
/*     */   WebDriver driver;
/*     */   
/*  22 */   AddNewPatientPage addNewPatientPage = new AddNewPatientPage();
/*     */   
/*  23 */   String url = "https://www.dietician.com/Addnewpatient/";
/*     */   
/*     */   @Given("User is on the Add New Patient Page")
/*     */   public void user_is_on_the_add_new_patient_page1() {
/*  27 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User wants to enter New Patient details")
/*     */   public void user_wants_to_enter_new_patient_details() {
/*  32 */     this.addNewPatientPage.AddNewPatientHeadertext();
/*     */   }
/*     */   
/*     */   @Then("Patient Data From is visible")
/*     */   public void patient_data_from_is_visible() {
/*  37 */     Assert.assertTrue(this.addNewPatientPage.Addnewpatientvisible());
/*     */   }
/*     */   
/*     */   @Given("User is on the Add New Patient page")
/*     */   public void user_is_on_the_add_new_patient_page() {
/*  42 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to submit the form without filling up mandatory fields")
/*     */   public void user_attempts_to_submit_the_form_without_filling_up_mandatory_fields() {
/*  47 */     Assert.assertTrue(this.addNewPatientPage.checkEmptyfields());
/*     */   }
/*     */   
/*     */   @Then("Unable to update and show Please fillup all the mandatory fields error message")
/*     */   public void unable_to_update_and_show_please_fillup_all_the_mandatory_fields_error_message() {
/*  54 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please fillup all the mandatory fields"));
/*     */   }
/*     */   
/*     */   @Then("Unable to update and show {string} error message")
/*     */   public void unable_to_update_and_show_error_message(String string) {}
/*     */   
/*     */   @Given("User is on Add NewPatient page")
/*     */   public void user_is_on_add_new_patient_page() {
/*  71 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User does not put space in between  First Name and Last Name  for Full Name field values from excel <sheetname> and <rownumber>")
/*     */   public void user_does_not_put_space_in_between_first_name_and_last_name_for_full_name_field_values_from_excel_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/*  77 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/*  78 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/*  79 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/*  80 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/*  81 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/*  82 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/*  83 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/*  84 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/*  85 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/*  86 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/*  87 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show First and Last Name should have space in between error message is displayed")
/*     */   public void unable_to_enter_and_show_first_and_last_name_should_have_space_in_between_error_message_is_displayed() {
/*  94 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("First and last name shouldhave space inbetween"));
/*     */   }
/*     */   
/*     */   @Given("User on  AddNewPatient page")
/*     */   public void user_on_add_new_patient_page() {
/* 100 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to submit the form without filling up Full Name field from<sheetname> and <rownumber>")
/*     */   public void user_attempts_to_submit_the_form_without_filling_up_full_name_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 106 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 107 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 108 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 109 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 110 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 111 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 112 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 113 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 114 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 115 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 116 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please enter Full Name error message")
/*     */   public void unable_to_enter_and_show_please_enter_full_name_error_message() {
/* 121 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please enter FullName"));
/*     */   }
/*     */   
/*     */   @Given("User is on the Add New Patientpage")
/*     */   public void user_is_on_the_add_new_patientpage() {
/* 128 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User does not enter any value in Addess line {int} field from <sheetname> and <rownumber>")
/*     */   public void user_does_not_enter_any_value_in_addess_line_field_from_sheetname_and_rownumber(Integer int1, int rownum) throws InvalidFormatException, IOException {
/* 137 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 138 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 139 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 140 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 141 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 142 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 143 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 144 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 145 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 146 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 147 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please enter Addess line {int} error message")
/*     */   public void unable_to_enter_and_show_please_enter_addess_line_error_message(Integer int1) {
/* 152 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please Enter AddressLine1"));
/*     */   }
/*     */   
/*     */   @Given("User on the Add NewPatient page")
/*     */   public void user_on_the_add_new_patient_page() {
/* 157 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to submit the form without selecting any value for Country field from<sheetname>and <rownumber>")
/*     */   public void user_attempts_to_submit_the_form_without_selecting_any_value_for_country_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 164 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 165 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 166 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 167 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 168 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 169 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 170 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 171 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 172 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 173 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 174 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please select Country from dropdown error message")
/*     */   public void unable_to_enter_and_show_please_select_country_from_dropdown_error_message() {
/* 179 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please select country from dropdown"));
/*     */   }
/*     */   
/*     */   @Given("User is on Add New Patientpage")
/*     */   public void user_is_on_add_new_patientpage() {
/* 185 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to put numeric value in City field from <sheetname> and <rownumber>")
/*     */   public void user_attempts_to_put_numeric_value_in_city_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 191 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 192 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 193 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 194 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 195 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 196 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 197 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 198 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 199 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 200 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 201 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Only characters are allowed error message")
/*     */   public void unable_to_enter_and_show_only_characters_are_allowed_error_message() {
/* 206 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("only chars are allowed"));
/*     */   }
/*     */   
/*     */   @Given("User on AddNew Patientpage")
/*     */   public void user_on_add_new_patientpage() {
/* 212 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to submit the form without filling up City field from <sheetname> and <rownumber>")
/*     */   public void user_attempts_to_submit_the_form_without_filling_up_city_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 220 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 221 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 222 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 223 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 224 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 225 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 226 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 227 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 228 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 229 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 230 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please enter City error message")
/*     */   public void unable_to_enter_and_show_please_enter_city_error_message() {
/* 235 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please enter city"));
/*     */   }
/*     */   
/*     */   @Given("User is in the Add New Patient page")
/*     */   public void user_is_in_the_add_new_patient_page() {
/* 242 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to put numeric value in State province or region field from<sheetname> and<rownumber>")
/*     */   public void user_attempts_to_put_numeric_value_in_state_province_or_region_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 249 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 250 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 251 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 252 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 253 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 254 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 255 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 256 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 257 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 258 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 259 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please enter State province or region error message")
/*     */   public void unable_to_enter_and_show_please_enter_state_province_or_region_error_message() {
/* 264 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please enter State"));
/*     */   }
/*     */   
/*     */   @Given("User is in AddnewPatientPage")
/*     */   public void user_is_in_addnew_patient_page() {
/* 271 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to submit form without filling State province or region field from<sheetname> and8")
/*     */   public void user_attempts_to_submit_form_without_filling_state_province_or_region_field_from_sheetname_and8(int rownum) throws InvalidFormatException, IOException {
/* 278 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 279 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 280 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 281 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 282 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 283 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 284 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 285 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 286 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 287 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 288 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter show error message Please enter Stateprovince or region")
/*     */   public void unable_to_enter_show_error_message_please_enter_stateprovince_or_region() {
/* 293 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please enter State"));
/*     */   }
/*     */   
/*     */   @Given("User is on Add NewPatientpage")
/*     */   public void user_is_on_add_new_patientpage1() {
/* 299 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to submit the form without filling up Postal code field from <sheetname> and {int}")
/*     */   public void user_attempts_to_submit_the_form_without_filling_up_postal_code_field_from_sheetname_and(Integer int1, int rownum) throws InvalidFormatException, IOException {
/* 306 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 307 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 308 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 309 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 310 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 311 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 312 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 313 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 314 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 315 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 316 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please enter Postal code error message")
/*     */   public void unable_to_enter_and_show_please_enter_postal_code_error_message() {
/* 321 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Please enter postalcode"));
/*     */   }
/*     */   
/*     */   @Given("User is in Add NewPatientpage")
/*     */   public void user_is_in_add_new_patientpage() {
/* 328 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User entered not supported data format in Postal code field from<sheetname> and {int}")
/*     */   public void user_entered_not_supported_data_format_in_postal_code_field_from_sheetname_and(Integer int1, int rownum) throws InvalidFormatException, IOException {
/* 337 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 338 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 339 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 340 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 341 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 342 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 343 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 344 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 345 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 346 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 347 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Invalid Postal code format error message")
/*     */   public void unable_to_enter_and_show_invalid_postal_code_format_error_message() {
/* 352 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Invalid Postal Code"));
/*     */   }
/*     */   
/*     */   @Given("User on the Page Add New Patient")
/*     */   public void user_on_the_page_add_new_patient() {
/* 359 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User does not enter any value in Email field from<sheetname> and <rownumber>")
/*     */   public void user_does_not_enter_any_value_in_email_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 366 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 367 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 368 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 369 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 370 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 371 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 372 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 373 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 374 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 375 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 376 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please enter Email error message")
/*     */   public void unable_to_enter_and_show_please_enter_email_error_message() {
/* 381 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("please enter email"));
/*     */   }
/*     */   
/*     */   @Given("User is on thePage Add New Patient")
/*     */   public void user_is_on_the_page_add_new_patient() {
/* 386 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User entered not supported data format in Email field from <sheetname> and <rownumber>")
/*     */   public void user_entered_not_supported_data_format_in_email_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 392 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 393 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 394 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 395 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 396 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 397 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 398 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 399 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 400 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 401 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 402 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Invalid email format error message")
/*     */   public void unable_to_enter_and_show_invalid_email_format_error_message() {
/* 407 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Invalid format error"));
/*     */   }
/*     */   
/*     */   @Given("User on Page Add NewPatient")
/*     */   public void user_on_page_add_new_patient() {
/* 412 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to put characters in Phone number field from<sheetname>and <rownumber>")
/*     */   public void user_attempts_to_put_characters_in_phone_number_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 418 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 419 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 420 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 421 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 422 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 423 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 424 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 425 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 426 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 427 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 428 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Only Numeric values are allowed error message")
/*     */   public void unable_to_enter_and_show_only_numeric_values_are_allowed_error_message() {
/* 433 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("Invalid format error"));
/*     */   }
/*     */   
/*     */   @Given("User on the AddNewPatient page")
/*     */   public void user_on_the_add_new_patient_page1() {
/* 438 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User attempts to submit the form without filling up Phone number field from <sheetname> and <rownumber>")
/*     */   public void user_attempts_to_submit_the_form_without_filling_up_phone_number_field_from_sheetname_and_rownumber(int rownum) throws InvalidFormatException, IOException {
/* 444 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 445 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 446 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 447 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 448 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 449 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 450 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 451 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 452 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 453 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 454 */     this.addNewPatientPage.invalidFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("Unable to enter and show Please enter Phone number error message")
/*     */   public void unable_to_enter_and_show_please_enter_phone_number_error_message() {
/* 459 */     Assert.assertTrue(this.addNewPatientPage.displayMessage().contains("please enter Phone number error message"));
/*     */   }
/*     */   
/*     */   @Given("User is on thepage Add New Patient")
/*     */   public void user_is_on_thepage_add_new_patient() {
/* 464 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User fills up the form with Valid Data Inputs from <sheetname> and from {int}")
/*     */   public void user_fills_up_the_form_with_valid_data_inputs_from_sheetname_and_from(Integer int1, int rownum) throws InvalidFormatException, IOException {
/* 471 */     List<Map<String, String>> testdata = this.reader.getData("src/test/resources/ExcelData/ExceldataDieticianhackathon.xlsx", "AddNewPatient");
/* 472 */     String FullName = (String)((Map)testdata.get(rownum)).get("Full name");
/* 473 */     String Addressline1 = (String)((Map)testdata.get(rownum)).get("Addressline1");
/* 474 */     String Addressline2 = (String)((Map)testdata.get(rownum)).get("Addressline2");
/* 475 */     String country = (String)((Map)testdata.get(rownum)).get("Country");
/* 476 */     String city = (String)((Map)testdata.get(rownum)).get("city");
/* 477 */     String State = (String)((Map)testdata.get(rownum)).get("state");
/* 478 */     String postalcode = (String)((Map)testdata.get(rownum)).get("postalcode");
/* 479 */     String email = (String)((Map)testdata.get(rownum)).get("email");
/* 480 */     String phonenumber = (String)((Map)testdata.get(rownum)).get("phonenumber");
/* 481 */     this.addNewPatientPage.validFields(FullName, Addressline1, Addressline2, country, city, State, postalcode, email, phonenumber);
/*     */   }
/*     */   
/*     */   @Then("User can see Add New Patient button")
/*     */   public void user_can_see_add_new_patient_button() {
/* 486 */     Assert.assertTrue(this.addNewPatientPage.viewAddnewPatientBtn());
/*     */   }
/*     */   
/*     */   @Given("Useron thepage  of Add New Patient")
/*     */   public void useron_thepage_of_add_new_patient() {
/* 491 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks on the  Add New Patient button after entering valid Patient data from <sheetname> and <rownumber>")
/*     */   public void user_clicks_on_the_add_new_patient_button_after_entering_valid_patient_data_from_sheetname_and_rownumber() {
/* 498 */     throw new PendingException();
/*     */   }
/*     */   
/*     */   @Then("User lands on My Patients page with the New Patient details displayed")
/*     */   public void user_lands_on_my_patients_page_with_the_new_patient_details_displayed() {}
/*     */ }


/* Location:              D:\DieticianProject_Lakshmi\stepdefinitions.jar!\stepdefinitions\AddNewPatientStepDef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */