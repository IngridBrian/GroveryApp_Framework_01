package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class SearchProductTest extends BaseTest {

	@Test
	public void MySearchProductTest() throws IOException {

		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);		hp.NavigateToManageProduct();
		pp.ClickSearchBtn();
		String productName = TestProperties.GetProperties().getProperty("productName");
		String text = pp.ValidateSearchProduct(productName);

		if (text.contains(productName)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}
