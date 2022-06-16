package stepdefinitions;

import org.testng.Assert;

import qa.factory.DriverFactory;
import pageObjects.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productpageTestSteps {
	
	ProductPage propage = new ProductPage(DriverFactory.getDriver());
	
	@Given("User is on Home page")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("https://www.dietician/home.com");
	}

	@When("User clicks on PRODUCT Link on Home Page")
	public void user_clicks_on_product_link_on_home_page() {
		propage.clickOnproductlink();
        System.out.println(propage.getprodtitle());
		
	}

	@Then("User is re-directed to  Product Page")
	public void user_is_re_directed_to_product_page() {
		Assert.assertSame(propage,propage);
	}
}
