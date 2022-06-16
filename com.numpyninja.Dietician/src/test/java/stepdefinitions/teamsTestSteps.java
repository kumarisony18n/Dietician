package stepdefinitions;

import org.testng.Assert;

import qa.factory.DriverFactory;
import pageObjects
.TeamsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class teamsTestSteps {
	
	TeamsPage teampage = new TeamsPage(DriverFactory.getDriver());
	
	@When("User clicks on Team Link on Home Page")
	public void user_clicks_on_team_link_on_home_page() {
	    
		teampage.clickOnteamlink();  
	}

	@Then("User is directed to Doctor Team page")
	public void user_is_directed_to_doctor_team_page(String excpectedurl) {
		String actualurl = teampage.getDiettampageulr();
		
		Assert.assertEquals(actualurl, excpectedurl);
	}

	@Given("User is on Dietician Website")
	public void user_is_on_dietician_website() {
	    DriverFactory.getDriver().get("https://www.dietician.com/home/dietteams/");
	}

	@When("User lands on Teams page")
	public void user_lands_on_teams_page() {
		teampage.clickOnteamlink();
	    
	}

	@Then("User sees Doctors name on Doctor team page")
	public void user_sees_doctors_name_on_doctor_team_page() {
      System.out.print(teampage.docterdefaultnames());
      Assert.assertTrue(teampage.docterdefaultnames());
	}

	@Then("User should see {int} default Doctor names on first Page")
	public void user_should_see_default_doctor_names_on_first_page(Integer int1) {
		Assert.assertTrue(teampage.docterdefaultnames());
	}

	@Given("User is on first page of Team")
	public void user_is_on_first_page_of_team() {
		DriverFactory.getDriver().get("https://www.dietician.com/home/dietteams/");
	}

	@When("User clicks on next button\\(>)")
	public void user_clicks_on_next_button() {
	System.out.println(teampage.nextbutton());
	}

	@Then("User should be directed to next Doctor on Team Page")
	public void user_should_be_directed_to_next_doctor_on_team_page(String expected) {
	   String actual=teampage.movetonextpage();
	   
	   Assert.assertEquals(actual, expected);
	}

	@Given("User is on Team page")
	public void user_is_on_team_page() {
		 DriverFactory.getDriver().get("https://www.dietician.com/home/dietteams/");
	}

	@When("User lands on last page of Team")
	public void user_lands_on_last_page_of_team() {
		teampage.clickOnteamlink();
	}

	@Then("Next button should be disabled")
	public void next_button_should_be_disabled() {
	    Assert.assertTrue(teampage.movetonextpagedisplayed());
	}

	@When("User lands on first page of Team")
	public void user_lands_on_first_page_of_team() {
	teampage.movetonextpage();
	}

	@Then("Previous button\\(<)should be disabled")
	public void previous_button_should_be_disabled() {
		 boolean dispaly = teampage.previosbutton();
		 Assert.assertTrue(dispaly);
	}

	@Given("User is on second page of Team")
	public void user_is_on_second_page_of_team() {
		teampage.movetonextpage();
	}

	@When("User clicks on previous button\\(<)")
	public void user_clicks_on_previous_button() {
		teampage.previous();
	}

	@Then("User should be directed to previous page of Team")
	public void user_should_be_directed_to_previous_page_of_team(String Excpected) {
	String Actual=	teampage.movetoPreviousPage();
	Assert.assertEquals(Actual,Excpected);
	
	
	}

}
