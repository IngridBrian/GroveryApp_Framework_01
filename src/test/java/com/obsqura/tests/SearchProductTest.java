package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class SearchProductTest extends BaseTest {

	@Test
	public void MySearchProductTest() throws IOException {

		lp.Login();
		hp.NavigateToManageProduct();
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
