package stepdefinitions;
import pageObjects.DieticianScreensPage;
import org.junit.Assert;
import io.cucumber.java.en.*;
import qa.factory.DriverFactory;


public class DieticianScreens {
	
private DieticianScreensPage dieticianscreenspage = new DieticianScreensPage(DriverFactory.getDriver());
	
	@Given("User is logged in and is on list of screens menu")
	public void user_is_logged_in_and_is_on_list_of_screens_menu() {
		DriverFactory.getDriver().get("https://www.dietician.com");

	}
	
	@When("User clicks on View recent diets link")
	public void user_clicks_on_view_recent_diets_link() {
		dieticianscreenspage.ClickOnViewRecentDietsLink();

	}

	@Then("User should be directed to View recent diets page")
	public void user_should_be_directed_to_view_recent_diets_page() {
		Assert.assertTrue(dieticianscreenspage.isViewRecentDietsLinkExist());

	}

	@When("User clicks on View recent Test reports link")
	public void user_clicks_on_view_recent_test_reports_link() {

		dieticianscreenspage.ClickOnViewRecentTestReportLink();
	}

	@Then("User should be directed to View recent Test reports page")
	public void user_should_be_directed_to_view_recent_test_reports_page() {
		Assert.assertTrue(dieticianscreenspage.isViewRecentTestReportLinkExist());

	}

	@When("User clicks on Add new patient link")
	public void user_clicks_on_add_new_patient_link() {
		dieticianscreenspage.ClickOnAddNewPatientLink();

	}

	@Then("User should be directed to Add new patient page")
	public void user_should_be_directed_to_add_new_patient_page() {
		Assert.assertTrue(dieticianscreenspage.isAddNewPatientLinkExist());

	}

	@When("User clicks on Dietician home link")
	public void user_clicks_on_dietician_home_link() {
		dieticianscreenspage.ClickOnDieticianHomeLink();

	}

	@Then("User should be directed to Dietician home page")
	public void user_should_be_directed_to_dietician_home_page() {
		Assert.assertTrue(dieticianscreenspage.isDieticianHomeLinkExist());

	}

	@When("User clicks on My patients link")
	public void user_clicks_on_my_patients_link() {
		dieticianscreenspage.ClickOnMyPatientsLink();

	}

	@Then("User should be directed to My patients page")
	public void user_should_be_directed_to_my_patients_page() {
		Assert.assertTrue(dieticianscreenspage.isMyPatientsLinkExist());

	}

	@When("User clicks on confirm conditions and create plan link")
	public void user_clicks_on_confirm_conditions_and_create_plan_link() {
		dieticianscreenspage.ClickOnConfirmConditionsAndCreatePlanLink();

	}

	@Then("User should be directed to confirm conditions and create plan page")
	public void user_should_be_directed_to_confirm_conditions_and_create_plan_page() {
		Assert.assertTrue(dieticianscreenspage.isConfirmConditionsAndCreatePlanLinkExist());

	}

	

	             
}
