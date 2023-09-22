
package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

import models.Person;

public class ContactUsPage extends PageUtility {

	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@role='button']")
	private WebElement contactEditBtn;

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//textarea[1]")
	private WebElement address;

	@FindBy(xpath = "(//textarea[@id='content'])[2]")
	private WebElement deliveryTime;

	@FindBy(xpath = "//input[@id='del_limit']")
	private WebElement deliveryCharge;

	@FindBy(xpath = "//button[@name='Update']")
	private WebElement updateBtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement ContactUpdateAlert;

	public void ClickEditBtn() {
		ClickElement(contactEditBtn);
	}

	public void EnterDataIntoForm(Person data) {
		ClickEditBtn();
		SetTextBox(phone, Integer.toString(data.phoneNumber));
		SetTextBox(email, data.email);
		SetTextBox(address, data.address);
		SetTextBox(deliveryTime, data.deliveryTime);
		SetTextBox(deliveryCharge, Integer.toString(data.deliveryCharge));
		ScrollUp();
		WaitUntilClickable(updateBtn);
		ClickElement(updateBtn);
	}

	public String GetContaactUpdateAlertText() {
		return GetElementText(ContactUpdateAlert);
	}
}
