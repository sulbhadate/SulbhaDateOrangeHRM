package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {
	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginbtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginFunctionality(String Uname, String Password) {
		UtilsClass.sendKeys(username, Uname);
		UtilsClass.sendKeys(password, Password);

	}

	public void clickOnLogin() {
		UtilsClass.click(loginbtn);
	}

}
