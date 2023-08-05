package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class PimPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PimLink;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement AddEmp;

	@FindBy(name = "firstName")
	private WebElement Fname;

	@FindBy(name = "lastName")
	private WebElement Lname;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save;

	public PimPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPimLink() {
		UtilsClass.click(PimLink);

	}

	public void clickOnAddEmp() {
		UtilsClass.click(AddEmp);
	}

	public void addEmpPageFuncyionality(String fname, String lname) {
		UtilsClass.sendKeys(Fname, fname);
		UtilsClass.sendKeys(Lname, lname);
	}

	public void clickOnSave() {
		UtilsClass.click(save);
	}

}
