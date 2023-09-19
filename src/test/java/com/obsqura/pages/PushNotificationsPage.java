package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obsqura.utilities.PageUtility;

public class PushNotificationsPage extends PageUtility {
	WebDriver driver;

	public PushNotificationsPage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	private WebElement title;

	@FindBy(css = "input[placeholder='Enter Description']")
	private WebElement description;

	@FindBy(css = ".btn.btn-block-sm.btn-info")
	private WebElement sendbtn;

	
	@FindBy(css = ".alert.alert-success.alert-dismissible")
	private WebElement AddAlertText;

	public void createPushNotification() {
		SetTextBox(title, "7gsupermart");
		SetTextBox(description, "selected product is still in your cart, check out now");
		ClickElement(sendbtn);
	}

	public String validatePushNotification() {
		// TODO Auto-generated method stub
		String textAlert = GetElementText(AddAlertText);
		System.out.println(textAlert);
		return textAlert;

}
}