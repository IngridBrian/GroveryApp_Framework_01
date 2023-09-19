package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManagePaymentPage extends PageUtility {

	WebDriver driver;

	public ManagePaymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	private WebElement editBtn;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement titleBox;

	@FindBy(xpath = "//input[@id='limit']")
	private WebElement payLimit;

	@FindBy(xpath = "//button[@name='Update']")
	private WebElement update;

	public void ClickNewBtn() {
		ClickElement(editBtn);
	}
	
	public void editPayment() {
		ClickNewBtn();
		SetTextBox(titleBox, "AOA");
		SetTextBox(payLimit, "100");
		ClickElement(update);
	}

}
