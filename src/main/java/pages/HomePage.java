package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@class='jsx-124524553 button'])[1]")
	WebElement autoProductElement ;
	@FindBy(xpath = "//input[@id='quote-zipCode-input']")
	WebElement zipCodElement;
	@FindBy(xpath = "Get my price")
	WebElement getMyPricElement;
	
	public void autoStep() {
		CommonActions.click(autoProductElement);
		CommonActions.input(zipCodElement, "11368");
		CommonActions.click(autoProductElement);
	}

}
