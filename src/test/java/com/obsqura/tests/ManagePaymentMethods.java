package com.obsqura.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class ManagePaymentMethods extends BaseTest {

	@Test
	public void mangementPaymentTest() throws IOException {
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);		hp.NavigateToManagePayment();
		ep.editPayment();
	}
	
}
