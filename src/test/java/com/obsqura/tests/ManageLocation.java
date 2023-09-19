package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class ManageLocation extends BaseTest {
	@Test
	public void MyManageLocationTest() throws IOException  {

		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);		hp.NavigateToManageLocation();
		mp.createLocation();
		String text=mp.ValidateManageLocation();
		if (text.contains("Location Created Successfully")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals(text, "Location Created Successfully");
		}
		
		
	}
}
