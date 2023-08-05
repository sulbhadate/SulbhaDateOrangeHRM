package StepDifination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDef extends BaseClass {

	public static LoginPage loginpage;

	@Given("User on LoginPage")
	public void user_on_login_page() {
		initialization();

	}

	@When("User enter valida Username and Password")
	public void user_enter_valida_username_and_password() {
		loginpage = new LoginPage();

		loginpage.loginFunctionality(prop.getProperty("uname"), prop.getProperty("password"));

	}

	@Then("User Click on Login button")
	public void user_click_on_login_button() {
		loginpage.clickOnLogin();

	}

}
