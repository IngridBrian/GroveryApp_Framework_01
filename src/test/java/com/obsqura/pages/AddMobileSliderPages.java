package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.obsqura.utilities.PageUtility;

public class AddMobileSliderPages extends PageUtility {
	WebDriver driver;

	public AddMobileSliderPages(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}
	@FindBy(xpath = "//a[contains(text(),'New')]")
	WebElement newButton;
	
	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement username;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement saveButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertTextBox;
	
	public void ClickNewBtn() {
		ClickElement(newButton);
	}

	public void AddMobileSlider() {
		SelectFromStaticDropdown(username, "167");
		ClickElement(saveButton);

	}

	
	public String ValidateMobileSliderCreated() {
		String alertText = GetElementText(alertTextBox);
		System.out.println(alertText);
		return alertText;
	}
	
	
}
