package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class PushNotifications extends BaseTest {

	@Test
	public void PushNotificationsTest() throws IOException {
		
		String username =TestProperties.GetProperties().getProperty("username");
		String password =TestProperties.GetProperties().getProperty("password");
		lp.Login(username,password);		hp.NavigateToPushNotifications();
		pn.createPushNotification();
		String textAlert = pn.validatePushNotification();
		if (textAlert.contains("Alert!\n"
				+ "Message send successfully"))
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
	}
	
}
