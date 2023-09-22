package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocation extends BaseTest {
	@Test
	public void MyManageLocationTest() throws IOException {
		lp.Login();
		hp.NavigateToManageLocation();
		mp.createLocation();
		String text = mp.ValidateManageLocation();
		if (text.contains("Location Created Successfully")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(text, "Location Created Successfully");
		}

	}
}
