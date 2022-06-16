/*     */ package stepdefinitions;
/*     */ 
/*     */ import dietitianPages.DieticianHomePage;
/*     */ import io.cucumber.java.en.Given;
/*     */ import io.cucumber.java.en.Then;
/*     */ import io.cucumber.java.en.When;
/*     */ import org.junit.Assert;
/*     */ import qa.factory.DriverFactory;
/*     */ 
/*     */ public class DietitianHomePageStepDefinition {
/*  13 */   DieticianHomePage dieticianPage = new DieticianHomePage();
/*     */   
/*  14 */   String url = "https://www.dietician.com/DieiticanHomepage/";
/*     */   
/*     */   @Given("User is on the Dietician website")
/*     */   public void user_is_on_the_dietician_website() {
/*  18 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User loggedin successfully to the Dietician website")
/*     */   public void user_loggedin_successfully_to_the_dietician_website() {
/*  25 */     this.dieticianPage.ChkforDieticianHomePage();
/*     */   }
/*     */   
/*     */   @Then("User can see the Home button on header menu")
/*     */   public void user_can_see_the_home_button_on_header_menu() {
/*  31 */     Assert.assertTrue(this.dieticianPage.checkforHomebutton());
/*     */   }
/*     */   
/*     */   @Given("User on the Dietician website")
/*     */   public void user_on_the_dietician_website() {
/*  36 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User logged in successfully to the Dietician website")
/*     */   public void user_logged_in_successfully_to_the_dietician_website() {
/*  41 */     this.dieticianPage.ChkforDieticianHomePage();
/*     */   }
/*     */   
/*     */   @Then("User can see the NewPatient tab from  headermenu")
/*     */   public void user_can_see_the_new_patient_tab_from_headermenu() {
/*  47 */     Assert.assertTrue(this.dieticianPage.checkforNewPatient());
/*     */   }
/*     */   
/*     */   @Given("User is on the Dietician Home page")
/*     */   public void user_is_on_the_dietician_home_page() {
/*  53 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User selects New patient button")
/*     */   public void user_selects_new_patient_button() {
/*  59 */     this.dieticianPage.selectNewPatient();
/*     */   }
/*     */   
/*     */   @Then("User lands on New Patient page")
/*     */   public void user_lands_on_new_patient_page() {
/*  65 */     Assert.assertTrue(this.dieticianPage.NewPatientPagevisible());
/*     */   }
/*     */   
/*     */   @Given("User is on Dieticianwebsite")
/*     */   public void user_is_on_dieticianwebsite() {
/*  70 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User selects My Patient button")
/*     */   public void user_selects_my_patient_button1() {
/*  75 */     this.dieticianPage.selectMyPatientbtn();
/*     */   }
/*     */   
/*     */   @Then("User can see the My Patient tab at header menu")
/*     */   public void user_can_see_the_my_patient_tab_at_header_menu() {
/*  80 */     Assert.assertTrue(this.dieticianPage.dietPlanVisible());
/*     */   }
/*     */   
/*     */   @Given("User on the Dietician Homepage")
/*     */   public void user_on_the_dietician_homepage() {
/*  84 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User selects MyPatient button")
/*     */   public void user_selects_my_patient_button() {
/*  89 */     this.dieticianPage.selectMyPatientbtn();
/*     */   }
/*     */   
/*     */   @Then("User lands on My Patient page")
/*     */   public void user_lands_on_my_patient_page() {
/*  94 */     Assert.assertTrue(this.dieticianPage.chkMypatientheader());
/*     */   }
/*     */   
/*     */   @Then("User can see the DietPlans tab from  headermenu")
/*     */   public void user_can_see_the_diet_plans_tab_from_headermenu() {
/*  99 */     Assert.assertTrue(this.dieticianPage.dietPlanVisible());
/*     */   }
/*     */   
/*     */   @Given("User on Dietician Homepage")
/*     */   public void user_on_dietician_homepage() {
/* 104 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User selects Diet Plans button")
/*     */   public void user_selects_diet_plans_button() {
/* 110 */     this.dieticianPage.selectDietPlan();
/*     */   }
/*     */   
/*     */   @Then("User lands on Diet Plans page")
/*     */   public void user_lands_on_diet_plans_page() {
/* 116 */     Assert.assertTrue(this.dieticianPage.dietPlanVisible());
/*     */   }
/*     */   
/*     */   @Given("User on Dietician website")
/*     */   public void user_on_dietician_website() {
/* 120 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User loggedin successfully to Dietician website")
/*     */   public void user_loggedin_successfully_to_dietician_website() {
/* 124 */     this.dieticianPage.ChkforDieticianHomePage();
/*     */   }
/*     */   
/*     */   @Then("User can see Banner or Announcements section in right side bar")
/*     */   public void user_can_see_banner_or_announcements_section_in_right_side_bar() {
/* 129 */     Assert.assertTrue(this.dieticianPage.dietPlanVisible());
/*     */   }
/*     */   
/*     */   @Given("User is in the Dietician website")
/*     */   public void user_is_in_the_dietician_website() {
/* 135 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User loggedin successfully to the Dieticianwebsite")
/*     */   public void user_loggedin_successfully_to_the_dieticianwebsite() {
/* 139 */     this.dieticianPage.ChkforDieticianHomePage();
/*     */   }
/*     */   
/*     */   @Then("User can see Loggedin as Dietician name message in top of right side bar")
/*     */   public void user_can_see_loggedin_as_dietician_name_message_in_top_of_right_side_bar() {
/* 146 */     Assert.assertTrue(this.dieticianPage.checkLoggedinUser());
/*     */   }
/*     */   
/*     */   @Given("User on Dieticianwebsite")
/*     */   public void user_on_dieticianwebsite() {
/* 150 */     DriverFactory.getDriver().get(this.url);
/*     */   }
/*     */   
/*     */   @When("User loggedin successfully Dietician website")
/*     */   public void user_loggedin_successfully_dietician_website() {
/* 155 */     this.dieticianPage.ChkforDieticianHomePage();
/*     */   }
/*     */   
/*     */   @Then("User can read Dietician Home page image and content")
/*     */   public void user_can_read_dietician_home_page_image_and_content() {
/* 161 */     Assert.assertTrue(this.dieticianPage.checkHomePagecontent());
/*     */   }
/*     */ }


/* Location:              D:\DieticianProject_Lakshmi\stepdefinitions.jar!\stepdefinitions\DietitianHomePageStepDefinition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */