package StepDifination;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimPageStepDef extends BaseClass {
	private static PimPage pimpage;

	@When("User Click on Pim Page")
	public void user_click_on_pim_page() {
		pimpage = new PimPage();
		pimpage.clickOnPimLink();

	}

	@Then("User Click On AddEmpLink")
	public void user_click_on_add_emp_link() {
		pimpage.clickOnAddEmp();
	}

	@Then("User enter firstName and LastName")
	public void user_enter_first_name_and_last_name() {
		pimpage.addEmpPageFuncyionality("Ajit", "Pawar");
	}

	@Then("Click on Save button")
	public void click_on_save_button() {
		pimpage.clickOnSave();
	}

}
