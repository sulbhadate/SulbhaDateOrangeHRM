package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='client brand banner']")
	private WebElement Logo;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean Logo() {
		return Logo.isDisplayed();
	}

	public String getCurrenturl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
