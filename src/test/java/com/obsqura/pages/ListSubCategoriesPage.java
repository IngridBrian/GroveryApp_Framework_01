package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ListSubCategoriesPage extends PageUtility {
	WebDriver driver;

	public ListSubCategoriesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".btn.btn-rounded.btn-danger")
	private WebElement newBtn;

	@FindBy(xpath = "//Select[@id='cat_id']")
	private WebElement category;

	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement subcategory;

	@FindBy(xpath = "//button[@name='create']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertTextBox;
	

	private void ClickNewBtn() {
		ClickElement(newBtn);

	}

	public void createCategory(String date) {
		ClickNewBtn();
		SelectFromStaticDropdown(category, "196");
		SetTextBox(subcategory, "vegetables" + date);
		ClickElement(saveBtn);
	}

	public String ValidateCategoryCreated() {
		String alertText = GetElementText(alertTextBox);
		System.out.println(alertText);
		return alertText;
	}
	
}
