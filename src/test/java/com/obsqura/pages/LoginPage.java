package com.obsqura.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.TestProperties;

public class LoginPage extends PageUtility {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This @FindsBy technique is called PageFactory Concept
	 */

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement Username;


	@FindBy(css ="input[placeholder='Password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	
	public void Login() throws IOException {
//		SetTextBox(username, "admin");
//		SetTextBox(password, "admin");
//		ClickElement(submitBtn);
//		
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		Username.sendKeys(username);
		Password.sendKeys(password);
		ClickElement(submitBtn);

	}


	
	
	


}
