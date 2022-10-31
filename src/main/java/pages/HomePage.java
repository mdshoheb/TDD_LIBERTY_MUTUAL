package pages;

import static common.CommonActions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;
import common.CommonWaits;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='jsx-124524553 button'])[1]")
	WebElement autoProductElement;
	@FindBy(xpath = "//input[@id='quote-zipCode-input']")
	WebElement zipCodElement;
	@FindBy(xpath = "//button[text()='Get my price']")
	WebElement getMyPricElement;
	@FindBy(xpath = "//button[text()='OK, thanks!']")
	WebElement okThanksElement;

	public void autoStep() {
		//click(autoProductElement);
		input(zipCodElement, "11368");
		click(getMyPricElement);

		waits.waitUntilVisible(okThanksElement);
		if (isPresent(okThanksElement) && isDisplayed(okThanksElement)) {
			click(okThanksElement);
		}
	}

}
