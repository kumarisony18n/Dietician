/*     */ package stepdefinitions;
/*     */ 
/*     */ import dietitianPages.CreatePlanPage;
/*     */ import io.cucumber.java.en.Given;
/*     */ import io.cucumber.java.en.Then;
/*     */ import io.cucumber.java.en.When;
/*     */ import org.junit.Assert;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import qa.factory.DriverFactory;
/*     */ 
/*     */ public class UploadBtnCreatePlanStepDef {
/*     */   WebDriver driver;
/*     */   
/*  14 */   String url = "https://www.dietician.com/UploadBtnCreatePlan/";
/*     */   
/*  15 */   CreatePlanPage createPlanPage = new CreatePlanPage();
/*     */   
/*     */   @Given("User is logged on to Dietician website")
/*     */   public void user_is_logged_on_to_dietician_website() {
/*  19 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands on Create Planpage")
/*     */   public void user_lands_on_create_planpage() {
/*  25 */     this.createPlanPage.landingPage();
/*     */   }
/*     */   
/*     */   @Then("User should see a button with name\"Upload\" on the page")
/*     */   public void user_should_see_a_button_with_name_upload_on_the_page() {
/*  30 */     this.createPlanPage.viewUploadButton();
/*     */   }
/*     */   
/*     */   @Given("User is on Create Plan page")
/*     */   public void user_is_on_create_plan_page() {
/*  37 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks the Upload button without selecting a document")
/*     */   public void user_clicks_the_upload_button_without_selecting_a_document() {
/*  42 */     this.createPlanPage.uploadingEmptyFile();
/*     */   }
/*     */   
/*     */   @Then("User should see an error message {string}")
/*     */   public void user_should_see_an_error_message(String string) {
/*  48 */     Assert.assertTrue(this.createPlanPage.displayMessage().contains("Only files with extension .pdf are allowed"));
/*     */   }
/*     */   
/*     */   @Given("User on CreatePlan page")
/*     */   public void user_on_create_plan_page() {
/*  53 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks Upload button by selecting a non-PDF file")
/*     */   public void user_clicks_upload_button_by_selecting_a_non_pdf_file() {
/*  58 */     this.createPlanPage.uploadingNonPdf();
/*     */   }
/*     */   
/*     */   @Then("User can see an error message Only with extension .pdf files allowed")
/*     */   public void user_can_see_an_error_message_only_with_extension_pdf_files_allowed() {
/*  63 */     Assert.assertTrue(this.createPlanPage.displayMessage().contains("Only files with extension .pdf are allowed"));
/*     */   }
/*     */   
/*     */   @Given("User on {string} page")
/*     */   public void user_on_page1(String string) {
/*  69 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks the Upload button by selecting a PDF file of size greater than 2MB")
/*     */   public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_greater_than_2mb() {
/*  74 */     this.createPlanPage.uploadingMaxlimitFile();
/*     */   }
/*     */   
/*     */   @Then("User should view error message Only extension .pdf files allowed")
/*     */   public void user_should_view_error_message_only_extension_pdf_files_allowed() {
/*  81 */     Assert.assertTrue(this.createPlanPage.displayMessage().contains("PDF File exceeding the size limit of 2MB"));
/*     */   }
/*     */   
/*     */   @Given("User is in Create Planpage")
/*     */   public void user_is_in_create_planpage() {
/*  87 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks the Upload button selecting non-pdf filesize greater than 2MB")
/*     */   public void user_clicks_the_upload_button_selecting_non_pdf_filesize_greater_than_2mb() {
/*  92 */     this.createPlanPage.uploadingNonpdfMaxsize();
/*     */   }
/*     */   
/*     */   @Then("User should see an errormessage Only files extension .pdf  will be allowed")
/*     */   public void user_should_see_an_errormessage_only_files_extension_pdf_will_be_allowed() {
/*  98 */     Assert.assertTrue(this.createPlanPage.displayMessage().contains("only pdf files are allowed"));
/*     */   }
/*     */   
/*     */   @Given("User on Create Planpage")
/*     */   public void user_on_create_planpage() {
/* 103 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks the Upload button by selecting a pdf file of size less than 2MB")
/*     */   public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_less_than_2mb() {
/* 109 */     this.createPlanPage.UploadPdf();
/*     */   }
/*     */   
/*     */   @Then("User should see message Fileuploaded succesfully")
/*     */   public void user_should_see_message_fileuploaded_succesfully() {
/* 115 */     Assert.assertTrue(this.createPlanPage.displayMessage().contains("file uploaded successfully"));
/*     */   }
/*     */   
/*     */   @Given("User is logged to Dietician website")
/*     */   public void user_is_logged_to_dietician_website() {
/* 120 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands on the ConfirmHealthconditions and CreatedietPlanpage")
/*     */   public void user_lands_on_the_confirm_healthconditions_and_creatediet_planpage() {
/* 126 */     this.createPlanPage.landingPage();
/*     */   }
/*     */   
/*     */   @Then("User should see option {int} menu to update the health conditions")
/*     */   public void user_should_see_option_menu_to_update_the_health_conditions(Integer int1) {
/* 133 */     Assert.assertTrue(this.createPlanPage.viewOption1());
/*     */   }
/*     */   
/*     */   @Given("User is logged to Dieticianwebsite")
/*     */   public void user_is_logged_to_dieticianwebsite() {
/* 138 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User on the ConfirmHealthconditions and Create Plan page")
/*     */   public void user_on_the_confirm_healthconditions_and_create_plan_page() {
/* 143 */     this.createPlanPage.landingPage();
/*     */   }
/*     */   
/*     */   @Then("User should see a button with text {string} in option {int} menu")
/*     */   public void user_should_see_a_button_with_text_in_option_menu(String string, Integer int1) {
/* 149 */     Assert.assertTrue(this.createPlanPage.viewtextonBtn());
/*     */   }
/*     */   
/*     */   @Given("User is logged into Dietician website")
/*     */   public void user_is_logged_into_dietician_website() {
/* 155 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands on the Page ConfirmHealthconditions and CreatePlan")
/*     */   public void user_lands_on_the_page_confirm_healthconditions_and_create_plan1() {
/* 161 */     this.createPlanPage.landingPage();
/*     */   }
/*     */   
/*     */   @Then("User can update the health conditions in option {int} menu")
/*     */   public void user_can_update_the_health_conditions_in_option_menu(Integer int1) {
/* 167 */     this.createPlanPage.confirmbtn();
/*     */   }
/*     */   
/*     */   @Given("User  on the CreatePlanpage")
/*     */   public void user_on_the_create_planpage() {
/* 173 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks the CONFIRM button in option {int} menu")
/*     */   public void user_clicks_the_confirm_button_in_option_menu(Integer int1) {
/* 179 */     this.createPlanPage.confirmbtn();
/*     */   }
/*     */   
/*     */   @Then("User cannot update health conditions in option {int} menu")
/*     */   public void user_cannot_update_health_conditions_in_option_menu(Integer int1) {
/* 184 */     this.createPlanPage.confirmbtndisable();
/*     */   }
/*     */   
/*     */   @Given("User in CreatePlanpage")
/*     */   public void user_in_create_planpage() {
/* 190 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User can view CreatePlanpage and ConfirmHealthconditions")
/*     */   public void user_can_view_create_planpage_and_confirm_healthconditions() {
/* 196 */     this.createPlanPage.landingPage();
/*     */   }
/*     */   
/*     */   @When("User on the page ConfirmHealthconditions and CreatePlan")
/*     */   public void user_on_the_page_confirm_healthconditions_and_create_plan() {
/* 201 */     this.createPlanPage.landingPage();
/*     */   }
/*     */   
/*     */   @Then("User cannot update healthconditions in option {int} menu")
/*     */   public void user_cannot_update_healthconditions_in_option_menu(Integer int1) {
/* 206 */     this.createPlanPage.confirmbtn();
/* 207 */     this.createPlanPage.displayMessage().contains("user updated sucessfully");
/*     */   }
/*     */   
/*     */   @Given("User is logged in Dietician website")
/*     */   public void user_is_logged_in_dietician_website() {
/* 212 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User lands on thePage Confirm Healthconditions and CreatePlan")
/*     */   public void user_lands_on_the_page_confirm_healthconditions_and_create_plan() {
/* 218 */     this.createPlanPage.landingPage();
/*     */   }
/*     */   
/*     */   @Then("User can update health conditions in option {int} menu")
/*     */   public void user_can_update_health_conditions_in_option_menu(Integer int1) {
/* 224 */     this.createPlanPage.confirmbtn();
/* 225 */     this.createPlanPage.displayMessage().contains("updated sucessfully");
/*     */   }
/*     */   
/*     */   @Given("User is on the CreatePlanpage")
/*     */   public void user_is_on_the_create_planpage() {
/* 230 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User clicks the CONFIRM button in option {int}")
/*     */   public void user_clicks_the_confirm_button_in_option(Integer int1) {
/* 236 */     this.createPlanPage.confirmbtn();
/*     */   }
/*     */   
/*     */   @Then("User cannot update the healthconditions in option {int} menu")
/*     */   public void user_cannot_update_the_healthconditions_in_option_menu(Integer int1) {
/* 240 */     this.createPlanPage.displayMessage().contains("cannot update");
/*     */   }
/*     */ }


/* Location:              D:\DieticianProject_Lakshmi\stepdefinitions.jar!\stepdefinitions\UploadBtnCreatePlanStepDef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */