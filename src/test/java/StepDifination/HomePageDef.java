package StepDifination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageDef extends BaseClass {
	public static HomePage home;

	@When("user valiadate HomePage Logo")
	public void user_valiadate_home_page_logo() {
		home = new HomePage();
		boolean a = home.Logo();
		Assert.assertEquals(a, true);

	}

	@Then("user validate HomePage url")
	public void user_validate_home_page_url() {
		Assert.assertEquals(home.getCurrenturl().contains("hrm"), true);

	}

	@Then("user validate HomePage title")
	public void user_validate_home_page_title() {
		Assert.assertEquals(home.getTitle(), "OrangeHRM");
	}
}
