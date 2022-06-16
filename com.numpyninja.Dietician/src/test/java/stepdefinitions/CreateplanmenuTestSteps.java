package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObjects.DietPlans;
import pageObjects.MyPatients;
import qa.factory.DriverFactory;

public class CreateplanmenuTestSteps {
	
	private DietPlans dietPlans = new DietPlans(DriverFactory.getDriver());

	@Given("User is logged on to Dietician website")
	public void user_is_logged_on_to_dietician_website() {
		Boolean isDisplayed = dietPlans.isDieticianNameDisplayed();
		assertTrue(isDisplayed);
	}

	@When("User is on {string} page")
	public void user_is_on_page(String confirmconditionsandCreatePlan) {
	    
		String pageTitle= dietPlans.getPageTitle();
		assertEquals(pageTitle, confirmconditionsandCreatePlan);
	}

	@Then("User should see a button with text {string}  at the bottom of the page")
	public void user_should_see_a_button_with_text_at_the_bottom_of_the_page(String generateMenu) {
	    
		String btnText = dietPlans.btngenerateMenugetText();
		assertEquals(btnText, generateMenu);
	}

	@Given("User is on CreatePlanpage")
	public void user_is_on_create_planpage() {
	    
		String CreatePlantext = dietPlans.getCreatePlantext();
		assertEquals(CreatePlantext, "Confirm Health Conditions and Generate a new Diet Plan");
	}

	@When("User clicks the GENERATE MENU button")
	public void user_clicks_the_generate_menu_button() {
	    
		dietPlans.btngenerateMenu.click();
	}

	@Then("New Diet plan should be generated with the latest confirmed Health conditions")
	public void new_diet_plan_should_be_generated_with_the_latest_confirmed_health_conditions() {
	    
		dietPlans.getAllValuesofDietPlanTable();
	}

	@Then("User should land on {string} page")
	public void user_should_land_on_page(String viewRecentDiets) {
	    
		dietPlans.redirecttoViewRecentDietsPage();
	}

	@When("User is on DietPlanpage")
	public void user_is_on_diet_planpage() {
	    
		dietPlans.getPageTitle();
	}

	@Then("User should see the heading {string} on the page")
	public void user_should_see_the_heading_on_the_page(String GeneratedDietPlans) {
	     String GeneratedDietPlansDisplayed = dietPlans.getGeneratedDietPlansText();
	     assertEquals(GeneratedDietPlansDisplayed, GeneratedDietPlans);
		
	}

	@Then("User should see that Diet Plans tab on the menu bar is selected")
	public void user_should_see_that_diet_plans_tab_on_the_menu_bar_is_selected() {
	    
		dietPlans.isDietPlanSelected();
	}

}
