package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.TestProperties;

public class CreateDeliveryBoy extends BaseTest {

	@Test
	public void CreateDeliveryBoyTest() throws IOException {
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);		hp.NavigateTo_ManageDeliverBoy();
		String date = DateUtility.GetCurrentDate();
		ldp.CreateDeliveryBoy(date);
		String alertText=ldp.ValidateDeliveryBoyIsCreated();
		if (alertText.contains("Alert!\n"
				+ "Delivery Boy Details Created Successfully")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
	}

}
