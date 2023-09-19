package com.obsqura.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.TestProperties;

public class LoginTest extends BaseTest {

	@Test
	public void MyLoginTest() throws IOException {

		LoginPage lp = new LoginPage(driver);
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);

	}
}
